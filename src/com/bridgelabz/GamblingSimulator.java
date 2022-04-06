package com.bridgelabz;

public class GamblingSimulator
{
    public static final  int INITIAL_STAKE = 100;
    public static final int STAKE_BET = 1;
    public static int stake = 0;

    public static void winOrLose()
    {
        if(Math.random()<0.5) {
            stake++;
            System.out.println("Win");;
        }
        else {
            stake --;
            System.out.println("Lose");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome To Gambler Simulation");
        System.out.println("Initial Stake is " +INITIAL_STAKE +"$");
        System.out.println("Stake Bet is " +STAKE_BET+"$");
    }
}

