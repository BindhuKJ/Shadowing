package org.capgemini.shadowing.ws;
public class StudentApp {
    public static void main(String[] args){
        Student S1 = new Student();
        S1.setData("rama", 18, 5.5f);
        System.out.println(S1.name);
        System.out.println(S1.age);
        System.out.println(S1.height);


    }
}
