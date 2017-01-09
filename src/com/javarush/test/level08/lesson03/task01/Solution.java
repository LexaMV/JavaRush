package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> Set = new HashSet<>();
        Set.add("арбуз");
        Set.add("банан");
        Set.add("вишня");
        Set.add("груша");
        Set.add("дыня");
        Set.add("ежевика");
        Set.add("жень-шень");
        Set.add("земляника");
        Set.add("ирис");
        Set.add("картофель");

        for (String text : Set)
        {
            System.out.println(text);
        }




        //напишите тут ваш код

    }
}
