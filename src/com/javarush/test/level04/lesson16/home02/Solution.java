package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        for (int i = 0; i < 3; i++)
            num[i] = Integer.parseInt(reader.readLine());

        System.out.println(avg(num));

    }
    private static int avg(int... ints)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int avg = 0;
        for (int i : ints)
        {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        for (int i : ints)
            if (i != min && i !=max)
            {
                avg = i;
                break;
            }
        return avg;
    }

}
