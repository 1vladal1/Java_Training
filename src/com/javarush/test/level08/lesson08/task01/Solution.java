package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        String basic = "Basic";
        for (int i = 0; i < 20; i++)
            set.add("Л" + basic + i);

        return set;
    }

    public static void main(String[] args)
    {
        for (String str : createSet())
        {
            System.out.println(str);
        }
    }
}
