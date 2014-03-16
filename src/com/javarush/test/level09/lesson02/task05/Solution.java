package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину её стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса –
количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //for (StackTraceElement element : elements)
        //    System.out.println(element.getMethodName());
        return elements.length;
    }

    public static void main(String[] args)
    {
        //System.out.println(getStackTraceDeep());
        getStackTraceDeep();
    }
}
