package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        for (int i : sort(ints))
            System.out.println(i);

    }

    private static int[] sort(int[] ints)
    {
        for (int i = 0; i < ints.length-1; i++)
            for (int j = i + 1; j < ints.length; j++)
            {
                if (ints[i] < ints[j])
                {
                    int tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }

            }
        return ints;
    }
}
