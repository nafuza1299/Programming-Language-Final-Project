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


public class Valet implements Operator{
    int valet_id;
    int income=0;
    int car_fare;
    int bus_fare;
    
    
    Valet(int number){
        
        this.valet_id=number;
        System.out.println("A valet is created");
         
    }
    public boolean check_slot(ParkingSlot[] park)//this method is implemented from Operator interface
    {
       for (int x = 0; x<park.length;x++)
       {
           if(park[x].check_ava())
           {
               return true;
           }
       }
       return false;
    }
    
    public boolean carin(Vehicle car,ParkingSlot[] park)//used to check car 
    {       
        if (this.check_slot(park))
        {
            for (int x=0;x<park.length;x++)
            {  
                if(park[x].check_ava()&&park[x].accepted_type==car.type)//change here if want to set certain type of vehicle to specific slot
                {
                 park[x].set_hired();
                 System.out.println(car.type+" is occupying slot:"+park[x].number);//parking slot not full
                 park[x].Car_in(car);//insert car into parking slot
                 
                 break;
                }   
            }
            return true;
        }
        else
        {
            System.out.println("No parking Slot, Car rejected");
            return false;
        }
    }
    
    
    
}
