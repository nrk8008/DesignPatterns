package com.lld.designpatterns.prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    static Map<String, Student> map = new HashMap<String, Student>();

    static void register(String key, Student student) {
        map.put(key, student);

    }

    public Student get(String key) {
        return map.get(key);
    }
}
