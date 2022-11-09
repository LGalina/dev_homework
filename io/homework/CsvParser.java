package com.io.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class CsvParser {

    public static List<CsvStore> getRecodrsFromCsv(File file, List<String> keys) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<CsvStore> records = new ArrayList<>();
        boolean isHeader = true;
        String line = null;
        while ((line = br.readLine()) != null) {
            if (isHeader) {
                isHeader = false;
                continue;
            }
            CsvStore record = new CsvStore(file.getName());
            String[] lineSplit = line.split(",");
            for (int i = 0; i < lineSplit.length; i++) {
                record.put(keys.get(i), lineSplit[i]);
            }
            records.add(record);
        }
        br.close();
        return records;
    }
    public static List<String> getHeadersFromCsv(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> headers = null;
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] lineSplit = line.split(",");
            headers = new ArrayList<>(Arrays.asList(lineSplit));
            break;
        }
        br.close();
        return headers;
    }
    public static void writeToCsv(final File file, final Set<String> headers, final List<CsvStore> records) throws IOException {
        FileWriter csvWriter = new FileWriter(file);
        String[] headersArr = headers.toArray(new String[0]);
        String separator = "";
        for (String header : headersArr) {
            csvWriter.append(separator);
            csvWriter.append(header);
            separator = " , ";
        }
        csvWriter.append("\n");

        for (CsvStore record : records) {
            separator = "";
            for (String s : headersArr) {
                csvWriter.append(separator);
                csvWriter.append(record.get(s));
                separator = ",";
            }
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }
}
