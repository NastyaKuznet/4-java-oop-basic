package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){}

    public Point(int x0, int y0) {
        x = x0;
        y = y0;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int pastX = x;
        x = y * -1;
        y = pastX * -1;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
