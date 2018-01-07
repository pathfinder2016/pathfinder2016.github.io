package week_51_TDD.impl;

import java.util.HashMap;
import java.util.Map;

public class WordProcessor {

    private String s;

    public WordProcessor(String s) {
        this.s = s;
    }

    public String split() {
        s = s.trim();
        String[] strWithoutSpace = s.split(" ");

        for(int i=0; i<strWithoutSpace.length;  i++){
            strWithoutSpace[i] = strWithoutSpace[i].trim();
        }

        Map<String, Integer> strCountMap = new HashMap<>();
        for(int i=0; i<strWithoutSpace.length; i++){
            if(strCountMap.get(strWithoutSpace[i]) == null){
                strCountMap.put(strWithoutSpace[i], 1);
            }else{
                int currentCount = strCountMap.get(strWithoutSpace[i]);
                strCountMap.put(strWithoutSpace[i], currentCount+1);
            }
        }

        //format println

        String result = "";
        int count = 0;
        for (String key : strCountMap.keySet()) {
            count++;
            if(count > 0){
                result = "\n" + result;
            }
            result = key+" "+strCountMap.get(key);
        }



        //1. guolv
        // 2. tongji
        // 3. printer
        return result;
    }
}