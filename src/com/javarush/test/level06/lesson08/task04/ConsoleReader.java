package com.javarush.test.level06.lesson08.task04;

import sun.util.BuddhistCalendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine();//напишите тут ваш код
        return s;

    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int b = Integer.parseInt(s);
        return b;//напишите тут ваш код

    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double b = Double.parseDouble(s);
        return b;//напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (Boolean.parseBoolean(reader.readLine())) return true;
        else return false;
    }

    public static void main (String[] args)
    {

    }

}
