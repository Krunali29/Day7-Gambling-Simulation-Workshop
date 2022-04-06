package com.bridgelabz;

public class GamblingSimulator
{
    public static final int STAKE=100;
    public static final int BET=1;

    public static void main(String[] args) {
        int totalStake=STAKE;

        System.out.println("Welcome to the Gambler Game");

        int game=(int) (Math.random() * 10) % 2;
        if(game==1){
            totalStake=totalStake+BET;
            System.out.println("Gambler won the bet and have total stake:"  +totalStake);
        }else{
            totalStake=totalStake-BET;
            System.out.println("Gambler lost the bet and have total stake:" +totalStake);
        }
    }
}

