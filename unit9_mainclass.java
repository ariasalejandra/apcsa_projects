import java.util.*;
public class battle {
    public static void main(String args[]){
       Scanner scanLine = new Scanner(System.in); 
       Scanner scanInt = new Scanner(System.in);
       ArrayList<battleInfo> player = new ArrayList<battleInfo>();
       int y = 1;
       int w = 1;
       for (int x = 0; x < y; x++){
           System.out.print("What is the player's name?");
           String nameInput = scanLine.nextLine();
           System.out.print("What is the player's Health Points?(100 min, 300 max)");
           int hpInput = scanInt.nextInt();
           System.out.print("What is the player's Defense?(1500 min, 5000 max)");
           int defInput = scanInt.nextInt();
           player.add (new battleInfo(nameInput, hpInput, defInput));
           System.out.println("What would you like to do?");
           System.out.println("1. Add another player");
           System.out.println("2. Change player's name");
           System.out.println("3. Change player's health points");
           System.out.println("4. Change player's defense");
           System.out.println("5. Print every playerc");
           System.out.println("0. Quit");
           int input = scanInt.nextInt();
           if (input == 4){
               y++;
            } else if(input == 0) {
                y = x;
            } else if(input == 1){
                System.out.print("Which name would you like to change?");
                String nameChange = scanLine.nextLine();
                System.out.print("What would you like to change their name to?");
                String change = scanLine.nextLine();
                for(int namech = 0; namech < player.size(); namech++){
                    if (player.get(namech).getName().equals(nameChange)){
                        player.get(namech).changeName(change);
                    }
                }
                y++;
           } else if (input == 2){
               System.out.print("Which player would you like to change HP?");
               String nameChange = scanLine.nextLine();
               System.out.print("What would you like to change the HP to?");
               int change = scanInt.nextInt();
               for(int namech = 0; namech < player.size(); namech++){
                   if (player.get(namech).getName().equals(nameChange)){
                        player.get(namech).changeHealth(change);
                   }
               }
               y++;
            } else if (input == 3){
               System.out.print("Which player would you like to change Defense?");
               String nameChange = scanLine.nextLine();
               System.out.print("What would you like to change the Defense to?");
               int change = scanInt.nextInt();
               for(int namech = 0; namech < player.size(); namech++){
                   if (player.get(namech).getName().equals(nameChange)){
                        player.get(namech).changeDefense(change);
                   }
                }
               y++;
            } else if (input == 5){
               for(int namech = 0; namech < player.size(); namech++){
                   System.out.println("Name: "+player.get(namech).getName() + "\tHP: "+player.get(namech).getHealth()+"\tDef: "+
                                        player.get(namech).getDefense());
                }
               y++;
            }
       }
       for( int z = 0; z < w; z++){
           System.out.println("Time to determine if a player has enough health points!");
           System.out.print("What's the name of the player you'd like to find?");
           String userName = scanLine.nextLine();
           for (int loop = 0; loop < player.size(); loop++){
               if (player.get(loop).getName().equals(userName)){
                if(player.get(loop).getHealth() >= 150){
                     System.out.println("You survived!");
                } else {
                  System.out.println("You did not survive!");
                }
              } 
            }
        }
    }
}
