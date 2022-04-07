package com.bridgelabz;

public class GamblingSimulator
{
    public static final int STAKE=100;
    public static final int BET=1;
    public static final int PERCENTAGE_50_STAKE=(STAKE/100)*50; 
    public static final int HIGH_LIMIT=STAKE+PERCENTAGE_50_STAKE;
    public static final int LOW_LIMIT=STAKE-PERCENTAGE_50_STAKE;
    public static final int START_DAY=1;
    public static final int DAYS_IN_MONTH=30;
    public static final int STAKES_PER_DAY=50;
    public static final int START_DOLLARS=0;


    public static void main(String[] args)
    {
        System.out.println("Welcome to the Gambler Game");

        int days = START_DAY;
        int totalDollars = START_DOLLARS;
        int count=0;
        int wonCount=0;
        int lostCount=0;
        int maxWonCount=0;
        int maxLostCount=0;

        for (days = START_DAY; days <= DAYS_IN_MONTH; days++)
        {
            int totalStake = STAKE;
            while (totalStake < HIGH_LIMIT && totalStake > LOW_LIMIT)
            {
                int luck = (int) (Math.random() * 10) % 2;
                if (luck == 1) {
                    totalStake += BET;
                    wonCount++;
                    if(maxWonCount<wonCount){
                        maxWonCount=wonCount;
                    }
                } else {
                    totalStake -= BET;
                    lostCount++;
                    if(maxLostCount<lostCount){
                        maxLostCount=lostCount;
                    }
                }
                count++;
            }
            if (totalStake == HIGH_LIMIT) {
                totalDollars += STAKES_PER_DAY;
                System.out.println("Gambler won by " +totalDollars+" dollars on day "+days);
            } else {
                totalDollars -= STAKES_PER_DAY;
                System.out.println("Gambler lost by " +totalDollars+" dollars on day "+days);
            }
        }
        if(totalDollars>START_DOLLARS){
            System.out.println("Gambler won " +totalDollars+" and luckiest "+maxWonCount+" times maximum won and and unluckiest "+maxLostCount+" times maximum lost out of "+count);
        } else {
            System.out.println("Gambler lost " + totalDollars+" and unluckiest "+maxLostCount+" times maximum lost and luckiest "+maxWonCount+" times maximum won out of "+count);
        }
    }
}

