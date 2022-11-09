package com.io.homework;

import java.util.HashMap;
import java.util.Map;

public class CsvStore {

    private Map<String, String> keyVal;
    public CsvStore(String id) {
        keyVal = new HashMap<>();
    }

    public Map<String, String> getKeyVal() {
        return keyVal;
    }
    public void setKeyVal(Map<String, String> keyVal) {
        this.keyVal = keyVal;
    }
    public void put(String key, String val) {
        keyVal.put(key, val);
    }
    public String get(String key) {
        return keyVal.get(key);
    }
}
