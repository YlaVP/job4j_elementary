package ru.job4j;

public class ArgMethod {
    public static void hello(String name, int age) {
      
        System.out.println("Hello, " + name + " " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";       

        int age = 33;

        ArgMethod.hello(null);

        ArgMethod.hello(name);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }

    private static void hello(String name, String name1, String name2) {
    }

    private static void hello(Object o) {
    }
}


   