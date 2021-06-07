/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizza = scan.nextInt();
        System.out.println("How many slices per pizza?");
        int slice = scan.nextInt();

        int totalSlice = pizza * slice;
        int leftover;

        if(totalSlice % people == 0)
        {
            leftover = 0;
            System.out.println("Each person gets " + (totalSlice/people) +" pieces of pizza.");
            System.out.println("There are 0 leftover pieces.");
        }
        else{
            leftover = totalSlice % people;
            System.out.println("Each person gets " + (totalSlice/people) +"pieces of pizza.");
            System.out.println("There are" + leftover + "leftover pieces.");
        }
    }
}
