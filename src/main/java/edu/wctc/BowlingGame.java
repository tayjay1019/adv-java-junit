package edu.wctc;

import java.util.ArrayList;
import java.util.Scanner;

public class BowlingGame {
    public static void main(String[] args) {
        ArrayList<Frame> frames = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0 ; i < 10; i++)
        {
            int frameNumber = i + 1;
            if(frameNumber < 10) {
                System.out.println("Please enter your first attempt for frame: " + frameNumber);
                int score1 = Integer.parseInt(keyboard.nextLine());
                System.out.println("Please enter your second attempt");
                int score2 = Integer.parseInt(keyboard.nextLine());

                Frame frame = new Frame(score1, score2);
                frames.add(frame);
            }
            else if(frameNumber == 10){
                System.out.println("Please enter your first attempt for frame: " + frameNumber);
                int score1 = Integer.parseInt(keyboard.nextLine());
                System.out.println("Please enter your second attempt");
                int score2 = Integer.parseInt(keyboard.nextLine());
                System.out.println("Please enter your third attempt");
                int score3 = Integer.parseInt(keyboard.nextLine());

                Frame frame = new Frame(score1, score2, score3);
                frames.add(frame);
            }

        }
        //insert calculator here
        int strikeScore;
        for (Frame f : frames){
            if (f.getAtpt1() == 10){

            }// else if ()
        }
        System.out.println("your total score for the game is: ");

    }


}
