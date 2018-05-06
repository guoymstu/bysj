package com.gym.commons.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class QueryParmFormat {
    public static Map<String, String> Format( Map<String, String[]> parms){
        Map<String, String> map=new HashMap<>();
        for (Entry<String, String[]> entry : parms.entrySet()) {
            String[] array=entry.getValue();
            String value="";
            for (int i = 0; i <array.length; i++) {
                value+=array[i]+",";
            }
            map.put(entry.getKey(), value.substring(0,value.length()-1));
        }
        return map;
    }
    public static Map<String, Object> FormatToObject( Map<String, String[]> parms){
        Map<String, Object> map=new HashMap<String, Object>();
        for (Entry<String, String[]> entry : parms.entrySet()) {
            String[] array=entry.getValue();
            String value="";
            for (int i = 0; i <array.length; i++) {
                value+=array[i]+",";
            }
            if (value.length()>1) {
                map.put(entry.getKey(), value.substring(0,value.length()-1));
            }

        }
        return map;
    }
}
