package com.collection.homework.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<Chat> list = new ArrayList<>();
        list.add(new Chat("qwr", new User(1, "Vasilii", 25)));
        list.add(new Chat("def", new User(2, "Ivan", 23)));
        list.add(new Chat("abc", new User(3, "Konstantin", 15)));
        list.add(new Chat("abc", new User(4, "Anna", 20)));
        list.add(new Chat("qwr", new User(5, "Nikolai", 20)));
        list.add(new Chat("qwr", new User(6, "Valentina", 17)));
        System.out.println("Initial chat: \n" + list + "\n");

        List<User> usersList = new ArrayList<>();
        int age = 18;
        Iterator<Chat> userIterator = list.iterator();
        while (userIterator.hasNext()) {
            Chat current = userIterator.next();
            if (current.getUser().getAge() > age) {
                usersList.add(current.getUser());
            }
        }
        System.out.println("User list:\n" + usersList + "\n");
        System.out.println(" average age is: " + calculateAverageAge(usersList));

    }

    public static int calculateAverageAge(List userList) {
        int count = 0;
        int sum = 0;
        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            User current = userIterator.next();
            if (current.getAge() > 18) {
                count++;
                sum += current.getAge();
            }
        }
        return sum / count;
    }
}
