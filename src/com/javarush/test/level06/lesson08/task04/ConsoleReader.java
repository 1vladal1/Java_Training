package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }

    public static void readLn() throws Exception
    {
        while (!ConsoleReader.readString().isEmpty())
        {
        }
    }

    public static void main(String[] args) throws Exception
    {
        //System.out.println(ConsoleReader.readString());
        //System.out.println(ConsoleReader.readInt());
        //System.out.println(ConsoleReader.readDouble());
        ConsoleReader.readString();
        ConsoleReader.readInt();
        ConsoleReader.readDouble();
        ConsoleReader.readLn();

    }
}
