package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        int intMonth = 0;
        String[] dfs = new DateFormatSymbols(Locale.ENGLISH).getMonths();
        for (String df : dfs)
        {
            intMonth++;
            if (df.equals(month))
            {
                System.out.println(month + " is " + intMonth + " month");
                break;
            }
        }

    }

}
