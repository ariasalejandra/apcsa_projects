
//subclass


import java.util.*;
  public class informations
{
      private String name;
      private double checkAcc;
      private double savAcc;
      private int accNum;
      public informations(String name1, double check, double save, int num){
          num = (int)(Math.random() * 9000 + 1000); 
          name = name1;
          checkAcc = check;
          savAcc = save;
          accNum = num;
      }
      public void depositChecking(int ch){
            checkAcc+=ch;
      }
      public void depositSavings(int sg){
            savAcc+=sg;
      }
      public void withdrawChecking(int d){
         checkAcc-=d;
      }
      public void withdrawSavings(int g){
         savAcc-=g; 
      }
      public int getAccNum(){
          return accNum;
      }
      public String getName(){
          return name;
      }
      public double getcheckAcc(){
          return checkAcc;
      }
      public double getsavAcc(){
          return savAcc;
      }
      public String toString(){
         return "Name: "+name+"\tAccount Number: "+ accNum;
      }
}

