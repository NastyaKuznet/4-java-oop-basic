package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(5,5);
        Line line = new Line(p1, p2);
        System.out.println(line.isCollinearLine(new Point(2,3)));
        System.out.println(line.isCollinearLine(new Point(3,3)));
    }
}
