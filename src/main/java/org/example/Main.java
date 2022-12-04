package org.example;

import java.util.Scanner;

public class Main {
    public static int breadth;
    public static int height;
    public static Scanner sc = new Scanner(System.in);
    static{
        breadth= sc.nextInt();
        height = sc.nextInt();
    }
    public static void main(String[] args) {
        if(breadth > 0 && height > 0)
        {
            System.out.println(breadth*height);
        }
        else {
            System.out.println("java.lang.Exception: Breath and height must be positive");
        }
    }
}