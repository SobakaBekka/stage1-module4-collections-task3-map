package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (swappedMap.containsKey(value)) {
                // If the value is already present in the map, compare keys and keep the smallest one
                if (key < swappedMap.get(value)) {
                    swappedMap.put(value, key);
                }
            } else {
                swappedMap.put(value, key);
            }
        }

        return swappedMap;
    }
}
