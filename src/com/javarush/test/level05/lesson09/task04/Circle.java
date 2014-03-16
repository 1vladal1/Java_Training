package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius  width, color
*/

public class Circle
{
    private int centerX;
    private int centerY;
    private double radius;
    private int width;
    private String color;

    public Circle(int x, int y, double radius)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
    }
    public Circle(int x, int y, double radius, int width)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
        this.width = width;
    }
    public Circle(int x, int y, double radius, int width, String color)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}
