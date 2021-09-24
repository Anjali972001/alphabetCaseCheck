package Anjali;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word ");
        String word =  input.next();
        System.out.println(word.charAt(0));//only print the ch which is at index 0
    }
}
