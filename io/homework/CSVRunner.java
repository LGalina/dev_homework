
package com.io.homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static java.nio.file.Files.lines;

public class CSVRunner {
    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("items-price.csv");
        lines(Path.of(String.valueOf(path1)))
                .skip(1)
                .map(CSVRunner::getPrice)
                .close();

        Path path2 = Path.of("items-name.csv");
        lines(Path.of(String.valueOf(path2)))
                .skip(1)
                .map(CSVRunner::getName)
                .close();


        File csv1 = new File(String.valueOf(path1));
        File csv2 = new File(String.valueOf(path2));
        List<String> csv1Headers = CsvParser.getHeadersFromCsv(csv1);
        List<String> csv2Headers = CsvParser.getHeadersFromCsv(csv2);

        List<String> allCsvHeaders = new ArrayList<>();
        allCsvHeaders.addAll(csv1Headers);
        allCsvHeaders.addAll(csv2Headers);

        Set<String> uniqueHeaders = new HashSet<>(allCsvHeaders);

        List<CsvStore> csv1Records = CsvParser.getRecodrsFromCsv(csv1, csv1Headers);
        List<CsvStore> csv2Records = CsvParser.getRecodrsFromCsv(csv2, csv2Headers);
        List<CsvStore> allCsvRecords = new ArrayList<>();
        String key = "ID";
        getUniqueRecordsForKey(key, csv1Records, csv2Records,allCsvRecords);

        Path path3 = Path.of("result.csv");
        CsvParser.writeToCsv(new File(String.valueOf(path3)), uniqueHeaders, allCsvRecords);
    }

    private static void getUniqueRecordsForKey(String key, List<CsvStore> csv1Records, List<CsvStore> csv2Records, List<CsvStore> allCsvRecords) {

        for (CsvStore record1: csv1Records){
            for(CsvStore record2: csv2Records){
                if( !record1.getKeyVal().get(key).isEmpty() && record1.getKeyVal().get(key).equals(record2.getKeyVal().get(key))){
                    HashMap<String ,String> mergedMap = new HashMap<>();
                    CsvStore mergedRecord = new CsvStore(record2.getKeyVal().get(key));
                    mergeRecords(mergedMap, record1,record2);
                    mergedRecord.setKeyVal(mergedMap);
                    csv2Records.remove(record2);
                    allCsvRecords.add(mergedRecord);
                    break;
                }
            }
        }
    }

    private static void mergeRecords(HashMap<String, String> mergedMap, CsvStore record1, CsvStore record2 ){
        mergedMap.putAll(record1.getKeyVal());
        mergedMap.putAll(record2.getKeyVal());
    }

    private static Name getName(String line) {
        String[] fields = line.split(",");
        if (fields.length != 3){
            throw new RuntimeException("Invalid CVS line - " + line);
        }
        return new Name(Integer.parseInt(fields[0]), fields[1], fields[2]);
    }

    private static Price getPrice(String line) {
        String[] fields = line.split(",");
        if (fields.length != 2){
            throw new RuntimeException("Invalid CVS line - " + line);
        }
        return new Price(Integer.parseInt(fields[0]), Double.parseDouble(fields[1]));
    }

}
