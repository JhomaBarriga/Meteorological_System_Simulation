/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorological_system_simulation1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Meteorological_System_Simulation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------------------------------");
        System.out.println("【ⓂⒺⓉⒺⓄⓇⓄⓁⓄⒼⒾⒸⒶⓁ ⓈⓎⓈⓉⒺⓂ】 ");
        System.out.println("---------------------------------------- \n");
        System.out.println("If you are planning to do a road trip in "
                + "Simon Bolívar Avenue");
        System.out.println("You must check some meteorological "
                + "conditions to avoid a crash \n");
        
        Scanner data = new Scanner (System.in);
        int option;
        
        
        System.out.println("YOUR UBICATION \n");
        System.out.println("❶ ➙ Carapungo until International University");
        System.out.println("❷ ➙ International University until Puengasi");
        System.out.println("❸ ➙ Puegasi until South Quicenter");
        System.out.println("❹ ➙ Exit ✘ \n");
        System.out.printf("Enter your menu option about your ubication ➙ ");
            option = data.nextInt();
            System.out.println();
            switch(option){
                case 1:
                    System.out.println("We know your ubication ☑, continue please...");
                    break;
                case 2:
                    System.out.println("We know your ubication ☑, continue please...");
                    break;
                case 3:
                    System.out.println("We know your ubication ☑, continue please...");
                    break;
                case 4:
                    System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾) "
                            + "COME BACK SOON...");
                    System.exit(0);
                     break;
                default:
                    System.out.println("ERROR!!!");
                    System.exit(0);
                     break;
            }

             System.out.println();
        int option1;
        System.out.println("WEATHER");
        System.out.println("❶ ➙ Sunny day ☀");
        System.out.println("❷ ➙ Cloudy day ☁");
        System.out.println("❸ ➙ Rainy day ☂");
        System.out.println("❹ ➙ Exit ✘ \n");
        System.out.printf("Enter your menu option about the weater ➙ ");
                option1 = data.nextInt();
                System.out.println();
            switch(option1){
                case 1:
                    System.out.println("Wait a moment please... \n");
                    break;
                case 2:
                    System.out.println("Wait a moment please... \n");
                    break;
                case 3:
                    System.out.println("Wait a moment please... \n");
                    break;
                case 4:
                    System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾)"
                            + "COME BACK SOON...");
                    System.exit(0);
                     break;
                default:
                    System.out.println("ERROR!!!");
                    System.exit(0);
                     break;
            }



    }
    
}
