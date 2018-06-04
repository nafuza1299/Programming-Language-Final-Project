/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingfinalproject;

/**
 *
 * @author DUMAC REVANO
 */
import java.util.Scanner;
import java.io.IOException;
public class ParkingFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void run(int range,int divisor)//this 2 parameter is used to determine car rate later
    {
        Phasecontrol env1 = new Phasecontrol();
        env1.Start_day(range,divisor);//starting day
        env1.end_day();//report of the day
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("WELCOME TO PARKING SIMULATION");
        
        while(true)
        {
            System.out.println("1.Simulate Parking field in a shopping centre during holidays ");
            System.out.println("2.Simulate Parking field in a shopping centre during workdays ");
            System.out.println("any number to exit");
            try
            {
                Scanner scan = new Scanner(System.in);//scanner created
                int input;
                input=scan.nextInt();//get the input
                if (input==1)
                {
                    run(5000000,500000);//average number of coming vehicle is higher
                }
                else if (input==2)
                {
                    run(5000000,750000);//average number of coming vehicle is less than the works day
                }
                else
                {
                    break;
                }

            }
            catch(Exception e)//catch exception
            {
                System.out.println("Please Input only Number");
            }
        }
    }
    
}
