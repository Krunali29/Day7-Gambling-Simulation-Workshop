package com.bridgelabz;

public class GamblingSimulator
{
    public static final int STAKE=100;
    public static final int BET=1;
    public static final int PERCENTAGE_50_STAKE=(STAKE/100)*50;
    public static final int HIGH_LIMIT=STAKE+PERCENTAGE_50_STAKE;
    public static final int LOW_LIMIT=STAKE-PERCENTAGE_50_STAKE;

    public static void main(String[] args) {
        System.out.println("Welcome to the Gambler Game");
        int totalStake = STAKE;

        while (totalStake < HIGH_LIMIT && totalStake > LOW_LIMIT)
        {
            int game = (int) (Math.random() * 10) % 2;
            if (game == 1) {
                totalStake = totalStake + BET;
                System.out.println("Gambler won the bet and having total stack " + totalStake);
            } else {
                totalStake = totalStake - BET;
                System.out.println("Gambler lost the bet and having total stack " + totalStake);
            }
        }
        if(totalStake==HIGH_LIMIT){
            System.out.println("Gambler won by "+totalStake);
        } else
        {
            System.out.println("Gambler lost by "+totalStake);
        }
    }
}

