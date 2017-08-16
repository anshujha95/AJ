/******************************************************************************
*  Compilation:  javac -d bin com/bridgelabz/util/GamlingSimulator.java
*  Execution:    java -cp bin com.bridgelabz.util.GamlingSimulator
*  
*  Purpose: To find Number of wins, Percent Win and Avg number of bets made.
*
*  @author  Anshu Jha
*  @version 1.0
*  @since   16-08-2017
*
******************************************************************************/

package com.bridgelabz.util;

public class GamlingSimulator
 { 
  
  /*
   * stake, goal, trials stores the value accepted from gambler
   * cash stores the value of the stake 
   * bets stores the count of bets made
   * win stores the count of winning game
   */
  static int stake,goal,trials,cash,bets=0,wins=0;
  
  /*
   * random stores the value of Math.random function
   */
  static double random;
  /*
   * winpercent stores the calculated value of winning percentage
   * avgbetsmade stores the calculated average of bets made
   */
  static float winpercent, avgbetsmade;
  
  public static void main(String[] args)
 {
stake  = Integer.parseInt(args[0]);
    goal   = Integer.parseInt(args[1]);   
    trials = Integer.parseInt(args[2]);   

    for (int i = 0; i < trials; i++) 
{
      cash = stake;
     while (cash > 0 && cash < goal) 
{
       bets++;
   random = Math.random();
        if (random > 0.5) cash++;
        if (random < 0.5) cash--;
     }
     if (cash == goal) wins++;       
    }
// print no. of times won, win percentage and average no. of bets made 
    System.out.println("Won " +wins + " times ");
winpercent = 100* wins/(float)trials;
    System.out.println("Win percentage = " +winpercent);
avgbetsmade = bets/(float)trials;
    System.out.println("Avg bets made = " +avgbetsmade);
    }

}
