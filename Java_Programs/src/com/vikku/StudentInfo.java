package com.vikku;

class student_3 {
 String name;
 int age;

 student_3(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

public class StudentInfo {
 public static void main(String[] args) {
     student_3 student1 = new student_3("Vikku", 18);
     student_3 student2 = new student_3("Neha", 19);

     System.out.println("Student 1 Details:");
     student1.displayDetails();

     System.out.println("\nStudent 2 Details:");
     student2.displayDetails();
 }
}

