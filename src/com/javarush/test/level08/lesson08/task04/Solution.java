package com.javarush.test.level08.lesson08.task04;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        for (int i = 0; i < 9; i++)
        {
            Date date = new Date();
            date.setMonth(i);
            map.put("Name" + i, date);
        }
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashSet<String> set = new HashSet<String>();
        for (String key : map.keySet())
        {
            if (map.get(key).getMonth() > 4 && map.get(key).getMonth() < 8)
                set.add(key);
        }
        for (String key : set)
        {
            map.remove(key);
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (String key : map.keySet())
        {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
