package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class For_Loops_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        System.out.println( "****Well Come To Time Table****");
        System.out.println( "Please Enter your First Number:");
        num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + num * i);

        System.out.println( "****Thank You****");

        }
    }
}