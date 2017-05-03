package controllers;

import java.util.Scanner;
import java.lang.Math;


/**
 * Created by Paul on 4/17/2017.
 */
public class Play {

    public static int rollBall(int remaining){
        double randomRoll = Math.random();
        randomRoll = randomRoll * remaining;
        randomRoll = randomRoll + 1;
        int randomRollInt = (int) randomRoll;
        return randomRollInt;

    }

    public static void main(String[] args) {

        int frame = 1;
        int rollOne = 0;
        int rollTwo = 0;
        int bonus = 0;
        int score = 0;
        int remaining = 10;


        while (frame < 11){

            Scanner input = new Scanner(System.in);

            System.out.println("Current Frame: " + frame + " Current score: " + score);
            System.out.println("Enter First Roll of this Frame:");
            int roll = rollBall(remaining);
            if(frame == 10){
                if(roll < 10){
                    rollOne += roll;
                    remaining = remaining - rollOne;
                    System.out.println("Enter Second Roll of this Frame:");
                    int secondRoll = rollBall(remaining);
                    rollTwo += secondRoll;
                    score += rollOne + rollTwo;
                    if(roll + secondRoll == 10){
                        remaining = 10;
                        System.out.println("Enter Third Roll of this Frame:");
                        int thirdRoll = rollBall(remaining);
                        score += thirdRoll;
                    }

                }else if(roll == 10) {
                    remaining = 10;
                    score += roll;
                    System.out.println("Enter Second Roll of this Frame:");
                    int secondRoll = rollBall(remaining);
                    score += secondRoll;
                    if(secondRoll == 10){
                        remaining = 10;
                    }else{
                        remaining = remaining - secondRoll;
                    }
                    System.out.println("Enter Third Roll of this Frame:");
                    int thirdRoll = rollBall(remaining);
                    score += thirdRoll;
                }
                    frame++;
            } else if(roll == 10){
                bonus += 10;
                score += roll + bonus;
                bonus = 0;
                frame++;
            }
            else {

                if (roll < 10) {
                    rollOne += roll;
                    remaining = remaining - rollOne;
                    System.out.println("Enter Second Roll of this Frame:");
                    int secondRoll = rollBall(remaining);
                    rollTwo += secondRoll;
                    remaining = 10;
                    if (roll + secondRoll == 10) {
                        bonus += 5;
                    }
                    score += rollOne + rollTwo + bonus;
                    rollOne = 0;
                    rollTwo = 0;
                    bonus = 0;
                    frame++;
                }
            }

        }
        int finalScore = score;
        System.out.println("Your Final score is: " + finalScore);
    }
}

