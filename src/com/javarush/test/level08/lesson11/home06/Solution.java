package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {


        Human child1 = new Human("Child1", false, 10, new ArrayList<Human>());
        Human child2 = new Human("Child2", true, 11, new ArrayList<Human>());
        Human child3 = new Human("Child3", false, 5, new ArrayList<Human>());

        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human father = new Human("Father", true, 35, childs);
        Human mother = new Human("Mother", false, 33, childs);

        childs = new ArrayList<Human>();
        childs.add(father);
        Human grandPa1 = new Human("GrandPa1", true, 80, childs);
        Human grandMa1 = new Human("grandMa1", false, 79, childs);

        childs = new ArrayList<Human>();
        childs.add(mother);
        Human grandPa2 = new Human("GrandPa2", true, 77, childs);
        Human grandMa2 = new Human("GrandMa2", true , 77, childs);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
