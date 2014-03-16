package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке,
числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> digits = new ArrayList<String>();
        ArrayList<String> strings =new ArrayList<String>();

        for (String str : array)
        {
            if (isNumber(str))
                digits.add(str);
            else
                strings.add(str);
        }

        for (int i = 0; i < strings.size() - 1; i++)
            for (int j = i + 1; j < strings.size(); j++)
                if (isGreaterThen(strings.get(i), strings.get(j)))
                {
                    String tmp = strings.get(j);
                    strings.set(j, strings.get(i));
                    strings.set(i, tmp);
                }

        for (int i = 0; i < digits.size() - 1; i++)
            for (int j = i + 1; j < digits.size(); j++)
                if (isGreaterThen(digits.get(j), digits.get(i)))
                {
                    String tmp = digits.get(i);
                    strings.set(i, strings.get(j));
                    strings.set(j, tmp);
                }

        int max = digits.size() > strings.size() ? digits.size() : strings.size();
        for (int i = 0; i < max; i++)
        {
            if (i < strings.size())
                list.add(strings.get(i));
            if (i < digits.size())
                list.add(digits.get(i));
        }
        array = list.toArray(new String[list.size()]);
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        for (char c : s.toCharArray())
        {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}
