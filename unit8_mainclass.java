import java.util.*;
public class Farm
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many rows of acres in your farm: ");
        int rows = scan.nextInt();
        System.out.print("How many columns of acres in your farm: ");
        int columns = scan.nextInt();
        farmInfo farm[][] = new farmInfo[rows][columns];
       for (int x = 0; x < rows; x++){
            for (int y = 0; y < columns; y++){
                System.out.println("1. Corn");
                System.out.println("2. Potatoes");
                System.out.println("3. Soybeans");
                System.out.println("4. Wheat");
                System.out.println("5. Tree Nuts");
                System.out.println("0. Not an area we can grow crops");
                System.out.print("What would you like to grow in row "+(x+1)+", column "+(y+1)+":");
                int input = scan.nextInt();
                if (input == 1){
                    farm[x][y] = new farmInfo("Corn", 153, 103, 60, true);
                } else if (input == 2){
                    farm[x][y] = new farmInfo("Potatoes", 485, 336, 70, true);
                } else if (input == 3){
                    farm[x][y] = new farmInfo("Soybeans", 9.64, 3.78, 45, true);
                } else if (input == 4){
                    farm[x][y] = new farmInfo("Wheat", 827, 170, 240, true);
                } else if (input == 5){
                    farm[x][y] = new farmInfo("Tree Nuts", 7200, 5800, 365, true);
                } else if (input == 0){
                    farm[x][y] = new farmInfo();
                }
            }
       }
       int r = 1;
       int c = 1;
       for(int x = 0; x < r; x++){
          for(int y = 0; y < c; y++){
             System.out.println("1. Print all crops");
             System.out.println("2. Count acres of a crop: ");
             System.out.println("3. Change an acre to bad");
             System.out.println("4. Check what crops will harvest in a number of days");
             System.out.println("5. Income per harvest");
             System.out.println("6. Total income per crop over a number of days");
             System.out.println("9. Quit");
             System.out.println("What would you like to do: ");
             int userInput = scan.nextInt();
             if (userInput == 1){
                 for (int a = 0; a < rows; a++){
                    for (int b = 0; b < columns; b++){
                     if(farm[a][b].getCrop().equals("No Crops")){
                         System.out.println("Row: "+(a+1)+" Column: "+(b+1)+"\tNo Crops");
                     } else{
                         System.out.println("Row: "+(a+1)+" Column: "+(b+1)+"\tCrop: "+ farm[a][b].getCrop()+
                                   "  Sell Price: $"+farm[a][b].getSell()+"  Cost: $"+farm[a][b].getCost()+
                                   "  Days to Harvest: "+farm[a][b].getDays());
                     }
                  }
                  r++;
                  c++;
                }
              } else if (userInput == 2){
                System.out.println("1. Corn");
                System.out.println("2. Potatoes");
                System.out.println("3. Soybeans");
                System.out.println("4. Wheat");
                System.out.println("5. Tree Nuts");
                System.out.println("0. Not an area we can grow crops");
                System.out.print("Which crop would you like to count: ");
                int count = scan.nextInt();
                String crops = "No Crops";
                int acres = 0;
                
                for (int a = 0; a < rows; a++){
                    for (int b = 0; b < columns; b++){
                     if (count == 1){
                       crops = "Corn";
                     } else if (count == 2){
                       crops = "Potatoes";
                     } else if (count == 3){
                       crops = "Soybeans";
                     } else if (count == 4){
                       crops = "Wheat";
                     } else if (count == 5){
                       crops = "Tree Nuts";
                     } else if (count == 0){
                       crops = "No Crops";
                     }
                     if (crops.equals(farm[a][b].getCrop())){
                        acres++;
                     } 
                 }
                }
                System.out.println(crops+" is planted in "+acres+" acres");
                r++;
                c++;
            }
            else if (userInput == 3){
                for (int a = 0; a < rows; a++){
                    for (int b = 0; b < columns; b++){
                     if(farm[a][b].getCrop().equals("No Crops")){
                       System.out.println("Row: "+(a+1)+" Column: "+(b+1)+"\tCrop: "+ farm[a][b].getCrop()+
                                   "  Sell Price: $"+farm[a][b].getSell()+"  Cost: $"+farm[a][b].getCost()+
                                   "  Days to Harvest: "+farm[a][b].getDays());
                     } else{
                         System.out.println("Row: "+(a+1)+" Column: "+(b+1)+"\tNo Crops");
                     }
                  }
                }
                System.out.println("What row and column went bad?");
                System.out.print("Row: ");
                int rowInput = scan.nextInt();
                System.out.print("Column: ");
                int columnInput = scan.nextInt();
                farm[rowInput - 1][columnInput - 1].changeCrop("No Crops");
                farm[rowInput - 1][columnInput - 1].changeSell(0);
                farm[rowInput - 1][columnInput - 1].changeCost(0);
                farm[rowInput - 1][columnInput - 1].changeDays(0);
                farm[rowInput - 1][columnInput - 1].changeBool(false);
                r++;
                c++;
            }
             else if (userInput == 4){
                System.out.print("How many days: ");
                int dayInput = scan.nextInt();
                for(int a = 0; a < rows; a++){
                    for (int b = 0; b < columns; b++){
                        
                         if (farm[a][b].enoughDays(dayInput) == 1){
                           System.out.println("Row: "+(a+1)+" Column: "+(b+1)+"\t"+farm[a][b].getCrop()+
                                          " will harvest in "+dayInput+" days");
                        }  else if (farm[a][b].enoughDays(dayInput) == 0) {
                            System.out.println("Row: "+(a+1)+" Column: "+(b+1)+"\t"+farm[a][b].getCrop()+
                                             " will NOT harvest in "+dayInput+" days");
                        }
                    }
                }
                r++;
                c++;
            } else if (userInput == 5){
                for (int a = 0; a < rows; a++){
                    for (int b = 0; b < columns; b++){
                     System.out.println("Row: "+(a+1)+" Column: "+(b+1)+"\t"+ farm[a][b].getCrop()+
                                   " will make $"+(double)farm[a][b].income());
                  }
                }
                r++;
                c++;
            } else if (userInput == 6){
                System.out.print("How many days: ");
                int incomeDay = scan.nextInt();
                for (int a = 0; a < rows; a++){
                    for (int b = 0; b < columns; b++){
                     System.out.println("Row: "+(a+1)+"Column: "+(b+1)+"\t"+ farm[a][b].getCrop()+
                                   " will make $"+farm[a][b].income(incomeDay));
                  }
                }
                r++;
                c++;
            } else if (userInput == 9){
                x = r;
                y = c;
            }
          }
       }
    }
}




