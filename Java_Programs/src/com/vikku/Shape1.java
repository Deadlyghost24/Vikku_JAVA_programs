package com.vikku;

interface Shape {
 void draw();
}

class Circle implements Shape {
 public void draw() {
     System.out.println("Drawing a circle");
 }
}

public class Shape1 {
 public static void main(String[] args) {
     Shape myShape = new Circle(); 
     myShape.draw();             
 }
}

