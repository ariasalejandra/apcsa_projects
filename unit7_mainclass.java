import java.util.*;
public class bank_Account
{
    public static void main(String args[])
      {
        int y = 1;
        int numAccount = 0;
        Scanner scanLine = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        informations acc1[] = new informations[10];
        for (int a = 0; a < y; a++)
         {
           System.out.println("1. Create an Account");
           System.out.println("2. Deposit into Checking Account");
           System.out.println("3. Deposit into Savings Account");
           System.out.println("4. Withdrawal from Checking Account");
           System.out.println("5. Withdrawal from Savings Account");
           System.out.println("6. Print out Bank Statement");
           System.out.println("0. Quit");
           System.out.print("What would you like to do: ");
           int input = scanInt.nextInt();
           if (input == 1){
               System.out.println("What is the name on the account: ");
               String name = scanLine.nextLine();
               acc1[numAccount] = new informations(name, 50, 0, 0);
               numAccount++;
           } else if (input == 2){
                for (int x = 0; x < acc1.length; x++){
                    if(acc1[x] != null)
                        System.out.println(acc1[x]);
                }
                System.out.print("What Account number: ");
                int accNum = scanInt.nextInt();
                for (int x = 0; x < acc1.length; x++){
                if(acc1[x] != null){
                if(accNum == acc1[x].getAccNum()){  
                System.out.print("How much: ");
                int acc = scanInt.nextInt();
                acc1[x].depositChecking(acc);
                }
               }
             }
           } else if (input == 3){
                for (int x = 0; x < acc1.length; x++){
                    if(acc1[x] != null)
                    System.out.println(acc1[x]);
                }
                System.out.print("What Account number: ");
                int accNum = scanInt.nextInt();
                 for (int x = 0; x < acc1.length; x++){
                if(acc1[x] != null){
                 if(accNum == acc1[x].getAccNum()){ 
                System.out.print("How much: ");
                int acc4 = scanInt.nextInt();
                acc1[x].depositSavings(acc4);
               }
              }
             }
           } else if(input == 4){
                for (int x = 0; x < acc1.length; x++){
                    if(acc1[x] != null)
                    System.out.println(acc1[x]);
                }
                System.out.print("What Account number: ");
                int accNum = scanInt.nextInt();
                   for (int x = 0; x < acc1.length; x++){
                if(acc1[x] != null){
                if(accNum == acc1[x].getAccNum()){ 
                 System.out.print("How much: ");
                 int acc2 = scanInt.nextInt();
                 if (acc2 < acc1[x].getcheckAcc()){
                  acc1[x].withdrawChecking(acc2);
                 } else {
                     acc1[x].withdrawChecking((int)acc1[x].getcheckAcc());
                    }
                }
              }
            }
           } else if (input == 5){
                for (int x = 0; x < acc1.length; x++){
                    if(acc1[x] != null)
                    System.out.println(acc1[x]);
                }
                System.out.print("What Account number: ");
                int accNum = scanInt.nextInt();
                for (int x = 0; x < acc1.length; x++){
                if(acc1[x] != null){
                if(accNum == acc1[x].getAccNum()){ 
                System.out.print("How much: ");
                int acc3 = scanInt.nextInt();
                if (acc3 < acc1[x].getsavAcc()){
                 acc1[x].withdrawSavings(acc3);
                  } else {
                      acc1[x].withdrawSavings((int)acc1[x].getsavAcc());
                    }
                }
               }
              }
           } else if (input == 6){
             for (int x = 0; x < acc1.length; x++){
                    if(acc1[x] != null)
                        System.out.println(acc1[x]);
                }
                System.out.print("What Account number: ");
                int accNum = scanInt.nextInt();
                for (int x = 0; x < acc1.length; x++){
                if(acc1[x] != null){
                if(accNum == acc1[x].getAccNum()){  
                  System.out.println("Name: "+ acc1[x].getName());
                  System.out.println("Accont Number: "+ acc1[x].getAccNum());
                  System.out.println("Checking Account: $"+ acc1[x].getcheckAcc());
                  System.out.println("Savings Account: $"+ acc1[x].getsavAcc());
                }
               }
             }
               
           }
           if (input == 0){
               y = a;
           } else {
               y++;
               
           }

      }   
    }
}

