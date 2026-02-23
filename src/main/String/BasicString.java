package main.String;

public class BasicString {
    public static void main(String[] args)
    {
        String s ="hello This is Java";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.contains("Java"));
        System.out.println(s.substring(0,4));
        System.out.println(s.replace('h','P'));

    }
}
