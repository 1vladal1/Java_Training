package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – овощ
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        String str = "арбуз–ягода,банан–трава,вишня–ягода,груша–фрукт,дыня–овощ,ежевика–куст,жень-шень–корень,земляника–ягода,ирис–цветок,картофель–клубень";
        String[] strPairs = str.split(",");
        for (String strPair : strPairs)
        {
            String[] pair = strPair.split("–");
            map.put(pair[0], pair[1]);
        }

        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
