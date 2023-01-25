package org.capgemini.shadowing.wos;

public class StudentApp {

    public static void main(String[] args){
        Student s1 = new Student();
        s1.setData("rama", 18,5);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);


    }
}
