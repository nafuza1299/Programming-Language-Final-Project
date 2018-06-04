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
import java.util.Random;

public class ParkingSlot 
{
    boolean availability; //slot availability
    public int number; // slot number
    public Vehicle InSlot=null;
    Random random=new Random();
    String accepted_type;
    
    ParkingSlot(int numb,String type)
    {   
        print_cons();
        this.number=numb;
        this.availability=true;
        this.accepted_type=type;
    };
 
    public void set_vacant()
    {
        this.availability=true;
    }
    public void set_hired()
    {
        this.availability=false;
    }
    public void print_cons()
    {
        System.out.println("Parking slot a constructed");
    }
    public boolean check_ava()
    {
     return this.availability;   
    }
    public void Car_in(Vehicle car)//set car in the slot to a car in parameter
    {
        
        System.out.println(car.type+" is in the "+this.number+" slot");
        this.InSlot=car;
    }
}
