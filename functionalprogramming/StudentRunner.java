package com.functionalprograming;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StudentRunner {
    public static void main(String[] args) {

        List<Student> studentList = List.of(
                new Student("aStuden1", "aaStuden1", 1, List.of(5, 4, 5, 4, 3)),
                new Student("bStuden2", "bbStuden2", 1, List.of(2, 5)),
                new Student("cStuden3", "ccStuden3", 1, List.of(5, 5, 5, 4, 3)),
                new Student("dStuden4", "ddStuden4", 2, List.of(3, 4, 4, 3)),
                new Student("eStuden5", "eeStuden5", 3, List.of(3, 4, 4, 3)),
                new Student("fStuden6", "ffStuden6", 1, List.of(4, 3)),
                new Student("gStuden7", "ggStuden7", 3, List.of(5, 5, 3)),
                new Student("hStuden8", "hhStuden8", 2, List.of(3, 4, 4, 3))
        );
        Map<Integer, List<Student>> studentMap = studentList.stream()
                .filter(list -> list.getGrades().size() > 3)
                .collect(Collectors.groupingBy(Student::getNumberCourses));

        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            OptionalDouble average = entry.getValue().stream()
                    .flatMap(s->s.getGrades().stream())
                    .mapToInt(Integer::intValue)
                    .average();
            average.ifPresent(System.out::println);
        }

        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            String list = entry.getValue().stream()
                    .map(s->s.getFirstName() + " " + s.getLastName())
                    .sorted()
                    .collect(Collectors.joining(", "));
            System.out.println(entry.getKey() + " " + list);
        }
        Map<Integer, List<String>> map = studentList.stream()
                .collect(Collectors.groupingBy(Student::getNumberCourses,
                        Collectors.averagingDouble(student-> student.getGrades().stream()
                                .collect(Collectors.averagingInt(Integer::intValue))),
                        Collectors.mapping(Student::getFullName, Collectors.toList())));

        System.out.println(map);
    }
}
