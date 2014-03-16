package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12/*высота, см, 5 /*длина хвоста, см )
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat("Tom", 3, 10);
        Dog spikeDog = new Dog("Spike", 10, 10);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int speed;
        int age;

        public Cat(String name, int age, int speed)
        {
            this.name = name;
            this.age = age;
            this.speed = speed;
        }
    }

    public static class Dog
    {
        String name;
        int strength;
        int speed;

        public Dog(String name, int strength, int speed)
        {
            this.name = name;
            this.strength = strength;
            this.speed = speed;
        }
    }

}
