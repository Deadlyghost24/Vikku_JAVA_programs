package com.vikku;

public class OverloadExample {

    void display(int num) {
        System.out.println("Integer value: " + num);
    }

    void display(double num) {
        System.out.println("Double value: " + num);
    }

    void display(String text) {
        System.out.println("String value: " + text);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.display(10);         
        obj.display(3.14);        
    }
}

