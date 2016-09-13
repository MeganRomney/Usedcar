package usedcar;

import java.util.*;



public class UsedCar 
{


    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);
       
       char response;
       do
       {
           System.out.println("Brand of car");
           String brand = input.nextLine();
           System.out.println("Colour of car");
           String colour = input.nextLine();
           System.out.println("Model of car");
           String model = input.nextLine();
           System.out.println("Milage");
           String Milage = input.nextLine();         
           System.out.println("Car added."); 
           System.out.println("Would you like to enter another car into the system?");
           response = input.next().charAt(0);
           input.nextLine(); 
       }
     while (response == 'y');
    }
    
}
 