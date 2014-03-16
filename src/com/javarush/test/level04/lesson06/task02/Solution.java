package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[4];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(maximum(ints));

    }

    private static int maximum(int[] ints)
    {
        int max = Integer.MIN_VALUE;
        for (int i : ints)
            if (i > max) {
                max = i;
            }
        return max;
    }
}
