package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст: семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета разделяй пробелом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        String[] rainbow = "красный оранжевый желтый зеленый голубой синий фиолетовый".split(" ");

        int i =0;
        for (String s : rainbow)
        {
            System.out.print(s + " ");
            i++;
            if (i == 3)
            {
                i = 0;
                System.out.println();
            }
        }

    }
}