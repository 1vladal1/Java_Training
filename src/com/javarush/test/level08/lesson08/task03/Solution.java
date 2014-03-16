package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        String basicName = "Name";
        String basicSurname = "Surname";
        for (int i = 0; i < 10; i++)
        {
            map.put(basicSurname + i, basicName + i);
        }
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        for (String value : map.values())
        {
            if (value.equals(name))
                i++;
        }
        return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int i = 0;
        for (String key : map.keySet())
        {
            if (key.equals(familiya))
                i++;
        }
        return i;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Name0"));
        System.out.println(getCountTheSameLastName(map, "Surname0"));
    }
}
