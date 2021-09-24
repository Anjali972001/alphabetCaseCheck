package Anjali;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print the character. ");
        char ch = input.next().trim().charAt(1);
        if(ch >='a' && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case ");
        }

    }
}
