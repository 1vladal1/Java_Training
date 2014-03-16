package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String str = "";

        int i = 0;
        boolean flag = false;
        while (i < s.length())
        {
            if (s.charAt(i) != ' ' && !flag)
            {
                str += ("" + s.charAt(i)).toUpperCase();
                flag = true;
            }
            else if (s.charAt(i) != ' ' && flag)
                str += "" + s.charAt(i);
            else
            {
                str += "" + s.charAt(i);
                flag = false;
            }
            i++;

        }
        System.out.println(str);


    }


}
