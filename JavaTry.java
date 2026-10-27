import java.util.Scanner;


public class JavaTry {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // Variables //
        int MenuChoice; // Menu Choice
        int FirstChoice; // First Destination
        int SecondChoice; // Second Destination
        String again; // For the loop asking if the user wants to search again
        
        // do loop for the entire program
        do {

                
            //First Menu//
            System.out.println("--------------------------------------------------");
            System.out.println("| WELCOME TO JEEPNEY FARE GUIDE FOR AUF STUDENTS |");
            System.out.println("--------------------------------------------------");
            System.out.println("");
            System.out.println("==================================================");    
            System.out.println("|        PRESS 1 TO START THE APPLICATION        |");    
            System.out.println("==================================================");    

        // do while loop for starting the program
        // if the user input other choice or number it will stop the program
                do {
            MenuChoice = sc.nextInt();

                if (MenuChoice != 1) {
                        System.out.println("========================================================"); 
                        System.out.println("| You've entered a wrong input. The program will stop. |");
                        System.out.println("========================================================"); 
                        sc.close();
                        return;
                }
        } while (MenuChoice != 1);


        // Second Menu //
        System.out.println("=================================================");
        System.out.println("|      LET'S GET YOU TO YOUR DESTIONATION <3    |");
        System.out.println("================================================="); 
            
            System.out.println("-------------------------------------------------");
            System.out.println("| Instructions for this program                 |");
            System.out.println("| Type the number for your destination          |");
            System.out.println("|                                               |");
            System.out.println("| 1. for Angeles                                |");
            System.out.println("| 2. for Clark                                  |");
            System.out.println("| 3. for Telabastagan                           |");
            System.out.println("| 4. for Dau                                    |");
            System.out.println("| 5. for Pandan                                 |");
            System.out.println("| 6. for Balibago                               |");
            System.out.println("-------------------------------------------------");
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("| Type your destination |");
            System.out.println("-------------------------");

        // Menu after picking a destination on the first menu //
        FirstChoice = sc.nextInt();
            System.out.println("----------------------");
            System.out.println("| You have chosen: " + FirstChoice + " |");
            System.out.println("----------------------");


        // THIS IS THE MAIN BODY & THE START FOR THE IF ELSE STATEMENTS //

                    System.out.println("------------------------------------");
                if (FirstChoice == 1) {
                    System.out.println("| Your destination is Angeles      |");
                    System.out.println("------------------------------------");
                    System.out.println("| Type your desired destionation   |");
                    System.out.println("| 1 for Nepo                       |");
                    System.out.println("| 2 for Holy Angel University      |");
                    System.out.println("| 3 for Pisamban Maragul           |");
                    System.out.println("| 4 for Nepo Quad                  |");
                    System.out.println("| 5 for Marquee                    |");
                    System.out.println("------------------------------------");

                        SecondChoice = sc.nextInt();
                            System.out.println("----------------------");
                            System.out.println("| You have chosen: " + SecondChoice + " |");
                            System.out.println("----------------------");
                        if (SecondChoice == 1) {
                                System.out.println("------------------------------------");
                                System.out.println("| Your destination is NEPO         |");
                                System.out.println("------------------------------------");
                                        // Total Fare Calculation //
                                        int TotalPass;
                                        int RegFare = 15;
                                        int DisFare = 13;
                                        // Total Passenger //
                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        //Computation for Fares //
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare);
                                
                                // Output for all the computation //
                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Green                   |");
                                System.out.println("| Place to wait : Main Entrance of AUF       |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else if (SecondChoice == 2) {
                                System.out.println("---------------------------------------------");
                                System.out.println("| Your destination is Holy Angel University |");
                                System.out.println("---------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 15;
                                        int DisFare = 13;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare);

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Green or Purple         |");
                                System.out.println("| Place to wait : Main Entrance of AUF       |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("---------------------------------------------");
                        } else if (SecondChoice == 3) {
                                System.out.println("------------------------------------------");
                                System.out.println("| Your destination is Pisamban Maragul   |");
                                System.out.println("------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 15;
                                        int DisFare = 13;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare);

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Green or Purple         |");
                                System.out.println("| Place to wait : Main Entrance of AUF       |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else if (SecondChoice == 4) {
                                System.out.println("------------------------------------------");
                                System.out.println("| Your destination is Nepo Quad          |");
                                System.out.println("------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 15;
                                        int DisFare = 13;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Green                   |");
                                System.out.println("| Place to wait : Main Entrance of AUF       |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else if (SecondChoice == 5) {
                                System.out.println("------------------------------------------");
                                System.out.println("| Your destination is Marquee            |");
                                System.out.println("------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 25;
                                        int DisFare = 22;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Blue                    |");
                                System.out.println("| Place to wait : Rotonda & Caltex           |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else {
                                System.out.println("==========================================");
                                System.out.println("|         NO KNOWN DESTINATION           |");
                                System.out.println("==========================================");
                        }


                // CLARK 
                } else if (FirstChoice == 2) {
                    System.out.println("| Your destination is Clark        |");
                    System.out.println("------------------------------------");
                    System.out.println("-------------------------------------------");
                    System.out.println("| Type your desired destionation          |");
                    System.out.println("| 1 for SM City Clark                     |");
                    System.out.println("| 2 for Bayanihan Park (Clark Astro Park) |");
                    System.out.println("| 3 for Clark Cityfront                   |");
                    System.out.println("| 4 for Clark International Airport       |");
                    System.out.println("| 5 for Dau Terminal                      |");
                    System.out.println("-------------------------------------------");
                         
                         SecondChoice = sc.nextInt();
                            System.out.println("----------------------");
                            System.out.println("| You have chosen: " + SecondChoice + " |");
                            System.out.println("----------------------");
                        if (SecondChoice == 1) {
                                System.out.println("------------------------------------------");
                                System.out.println("|   Your destination is SM City Clark    |");
                                System.out.println("------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 14;
                                        int DisFare = 12;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 


                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Green                   |");
                                System.out.println("| Place to wait : Main Entrance of AUF       |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else if (SecondChoice == 2) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("| Your destination is Bayanihan Park (Clark Astro Park) |");
                                System.out.println("---------------------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 14;
                                        int DisFare = 12;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 


                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Green                   |");
                                System.out.println("| Place to wait : Main Entrance of AUF       |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else if (SecondChoice == 3) {
                                System.out.println("------------------------------------------");
                                System.out.println("| Your destination is Clark Cityfront    |");
                                System.out.println("------------------------------------------");
                                        int TotalPass;
                                        int RegFare = 14;
                                        int DisFare = 12;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 


                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Green                   |");
                                System.out.println("| Place to wait : Main Entrance of AUF       |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else if (SecondChoice == 4) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("|      Your destination is Clark International Airport  |");
                                System.out.println("---------------------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 25;
                                        int DisFare = 20;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("---------------------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE                         |");
                                System.out.println("|                                                       |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                                 |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                              |");
                                System.out.println("| Color of jeepney : Any Color                          |");
                                System.out.println("| Place to wait : SM City Clark Jeep Terminal           |");
                                System.out.println("|                                                       |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + "            |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "           |" );
                                System.out.println("|                                                       |");
                                System.out.println("---------------------------------------------------------");
                        } else if (SecondChoice == 5) {
                                System.out.println("-------------------------------------------");
                                System.out.println("|      Your destination is Dau Terminal   |");
                                  System.out.println("-----------------------------------------");

                                        int TotalPass;
                                        int RegFare = 28;
                                        int DisFare = 22;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Yellow or Grey          |");
                                System.out.println("| Place to wait : Main Gate                  |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                        } else {
                                System.out.println("==========================================");
                                System.out.println("|         NO KNOWN DESTINATION           |");
                                System.out.println("==========================================");
                        }

                // TELABASTAGAN //
                } else if (FirstChoice == 3) {
                    System.out.println("| Your destination is Telabastagan |");
                    System.out.println("------------------------------------"); 















                // DAU 
                } else if (FirstChoice == 4) {
                            System.out.println("| Your destination is Dau          |");
                            System.out.println("------------------------------------"); 
                            System.out.println("-------------------------------------------");
                            System.out.println("| Type your desired destionation          |");
                            System.out.println("| 1 for Mabiga (Mabalacat)                |");
                            System.out.println("| 2 for San Fernando                      |");
                            System.out.println("| 3 for Mabalacat Town Proper             |");
                            System.out.println("| 4 for Magalang                          |");
                            System.out.println("| 5 for Balibago                          |");
                            System.out.println("-------------------------------------------");
                         
                    SecondChoice = sc.nextInt();
                            System.out.println("----------------------");
                            System.out.println("| You have chosen: " + SecondChoice + " |");
                            System.out.println("----------------------");
                    if (SecondChoice == 1) {
                                System.out.println("--------------------------------------------");
                                System.out.println("|   Your destination is Mabiga (Mabalacat) |");
                                System.out.println("--------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 25;
                                        int DisFare = 20;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Silver or Purple        |");
                                System.out.println("| Place to wait : Astro Area                 |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                    } else if (SecondChoice == 2) {
                                System.out.println("---------------------------------------------");
                                System.out.println("|      Your destination is San Fernando     |");
                                System.out.println("---------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 25;
                                        int DisFare = 20;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Yellow                  |");
                                System.out.println("| Place to wait : Villa Pampang              |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                    } else if (SecondChoice == 3) {
                                System.out.println("----------------------------------------------");
                                System.out.println("| Your destination is Mabalacat Town Proper  |");
                                System.out.println("----------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 25;
                                        int DisFare = 20;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE              |");
                                System.out.println("|                                            |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                      |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                   |");
                                System.out.println("| Color of jeepney : Purple or Gray          |");
                                System.out.println("| Place to wait : Clark Astro Park           |");
                                System.out.println("|                                            |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + " |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "|" );
                                System.out.println("|                                            |");
                                System.out.println("----------------------------------------------");
                    } else if (SecondChoice == 4) {
                                System.out.println("------------------------------------------------------");
                                System.out.println("|             Your destination is Magalang           |");
                                System.out.println("------------------------------------------------------");

                                        int TotalPass;
                                        int RegFare = 25;
                                        int DisFare = 20;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("------------------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE                      |");
                                System.out.println("|                                                    |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                              |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                           |");
                                System.out.println("| Color of jeepney : Orange Roof Top                 |");
                                System.out.println("| Place to wait : Marquee Mall Terminal              |");
                                System.out.println("|                                                    |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + "         |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + "        |" );
                                System.out.println("|                                                    |");
                                System.out.println("------------------------------------------------------");
                    } else if (SecondChoice == 5) {
                                System.out.println("-------------------------------------------");
                                System.out.println("|      Your destination is Balibago       |");
                                  System.out.println("-----------------------------------------");

                                        int TotalPass;
                                        int RegFare = 25;
                                        int DisFare = 20;

                                        System.out.println("----------------------------------");
                                        System.out.println("|      How many passengers?      |");
                                        System.out.println("----------------------------------");

                                        
                                        TotalPass = sc.nextInt();
                                         int CalcuRegFare = (TotalPass * RegFare);
                                         int CalcuDisFare = (TotalPass * DisFare); 

                                System.out.println("-----------------------------------------------");
                                System.out.println("|       YOUR JEEPNEY FARE GUIDE               |");
                                System.out.println("|                                             |");
                                System.out.println("| Regular Fare : " + CalcuRegFare + " PHP                       |");
                                System.out.println("| Discounted Fare : " + CalcuDisFare + " PHP                    |");
                                System.out.println("| Color of jeepney : Blue or Purple           |");
                                System.out.println("| Place to wait : Main Entrance of AUF        |");
                                System.out.println("|                                             |");
                                System.out.println("| Price Breakdown Regular Fare = " + RegFare + " * " + TotalPass + " = " +  CalcuRegFare + "  |" );
                                System.out.println("| Price Breakdown Discount Fare = " + DisFare + " * " + TotalPass + " = " +  CalcuDisFare + " |" );
                                System.out.println("|                                             |");
                                System.out.println("-----------------------------------------------");
                    } else {
                                System.out.println("==========================================");
                                System.out.println("|         NO KNOWN DESTINATION           |");
                                System.out.println("==========================================");
                        }















                // PANDAN //      
                } else if (FirstChoice == 5) {
                    System.out.println("| Your destination is Pandan       |");
                    System.out.println("------------------------------------"); 
                
                
                




















                // BALIBAGO //
                } else if (FirstChoice == 6) {
                    System.out.println("| Your destination is Balibago     |");
                    System.out.println("------------------------------------"); 
                } 
                
                
                
                
                // If the user input a wrong input for First Choice //
                else {
                                System.out.println("==========================================");
                                System.out.println("|         NO KNOWN DESTINATION           |");
                                System.out.println("==========================================");
                        }

                // User input if the user wants to search again or no //
                // Do-While loop //
                do {
                    System.out.println("==========================");
                    System.out.println("| Search again? (yes/no) |");
                    System.out.println("==========================");
                    again = sc.next();
                
                // If statement if the user input a wrong word //
                    if (!again.equalsIgnoreCase("yes") && !again.equalsIgnoreCase("no")) {
                        System.out.println("Please enter only Yes or No.");
                    }
                } while (!again.equalsIgnoreCase("yes") && !again.equalsIgnoreCase("no"));

        // do-while loop. this will let the user return to the First Menu only when the answer is yes //
        } while (again.equalsIgnoreCase("yes"));

                        // Display the thank-you message after the user chooses not to continue //
                        System.out.println("==========================================");
                        System.out.println("| THANK YOU FOR USING JEEPNEY FARE GUIDE |");
                        System.out.println("==========================================");

        sc.close(); // For Closing the program //
    }

    
} 