package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> set = new HashSet<String>();
        String[] str = "арбуз банан вишня груша дыня ежевика жень-шень земляника ирис картофель".split(" ");
        for (String s : str)
        {
            set.add(s);
        }
        for (String s : set)
        {
            System.out.println(s);
        }

    }
}
