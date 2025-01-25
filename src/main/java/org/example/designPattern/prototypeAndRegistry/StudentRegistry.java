package org.example.designPattern.prototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, StudentProto> registry = new HashMap<>();

    public StudentRegistry(){
        registry.put("DEFAULT", new StudentProto("IIT","ketu",100));
    }
    public void register(String key, StudentProto studentProto) {
        registry.put(key, studentProto);
    }

    public StudentProto get(String key) {
        return registry.get(key).clone();
    }
}
