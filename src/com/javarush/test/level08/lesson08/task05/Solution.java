package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
        {
            map.put("Family" + i, "Name" + rand.nextInt(6));
        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashSet<String> set = new HashSet<String>();
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> entry : copy.entrySet())
        {
            if (set.contains(entry.getValue()))
                removeItemFromMapByValue(map, entry.getValue());
            else
                set.add(entry.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (String key : map.keySet())
        {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
