package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        //System.out.print(abcArray[1]);

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

     // System.out.print(alphabet.get(0));
        //ввод строк
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        String conString = null;
        for(int i = 0; i<list.size();i++){
            conString = conString == null ? list.get(i) : conString + list.get(i);
        }
        System.out.println(conString);

       // String a = list.get(0);
      //  String q = list.get(1);
      //  String r = list.get(2);
      //  String h = list.get(3);
      //  String f = list.get(4);
      //  String n = list.get(5);
      //  String i = list.get(6);
     //   String t = list.get(7);
     //   String e = list.get(8);
      //  String d = list.get(9);
      //  String m = a+q+r+h+f+n+i+t+e+d;

      //  for (int i = 0; i < list.size(); i++)
       // {
        //   String a = list.get(i);
       //    b = b + a;
      //  }


        char[] abcArray1 = conString.toCharArray();


        ArrayList<Character> alphabet1 = new ArrayList<Character>();
        for (int l = 0; l < abcArray1.length; l++)
        {
            alphabet1.add(abcArray1[l]);
        }

        //System.out.print(alphabet1);

       // HashMap<Character, Integer> ops = new HashMap<>();

        for (int x = 0; x < alphabet.size(); x ++)
        {
            int z = Collections.frequency(alphabet1, alphabet.get(x));
            System.out.println(alphabet.get(x)+" "+z);
        }




     //   for (Map.Entry<Character, Integer> pair : ops.entrySet())
      //  {
      //      System.out.println(pair.getKey() + " " + pair.getValue());
      //  }


        //напишите тут ваш код
    }

}
