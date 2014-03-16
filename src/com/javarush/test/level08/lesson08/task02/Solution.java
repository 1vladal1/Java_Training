package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
            set.add(i);

        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {
        HashSet<Integer> rm = new HashSet<Integer>();
        for (Integer integer : set)
        {
            if (integer > 10)
                rm.add(integer);
        }
        set.removeAll(rm);
        return set;

    }

    public static void main(String[] args)
    {
        HashSet<Integer> set = createSet();
        removeAllNumbersMoreThen10(set);
        for (Integer integer : set)
        {
            System.out.println(integer);
        }
    }
}
