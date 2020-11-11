package com.quizapplication;
import java.util.Scanner;

public class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score;

    public void getDetails()
    {
        System.out.println("Enter the player name: ");
        name=sc.next();

    }


}
