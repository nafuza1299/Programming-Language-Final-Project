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

public class Vehicle {
    String type;//vehicle type
    long stay=0;//time of staying
    long time;//Vehicle coming time
    Random random=new Random();//

    
    Vehicle(long currentTimeMillis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    public int get_stay()//get time of stay /15 minutes scale
    {
        int i=(int) (this.stay/500*1);//convert to int
        return i;
    }
    
    public void out(long time,ParkingSlot slot,Valet valet1)//method for leaving car
    {
        int fare=1000;
        if (time==(this.time+this.stay))
            {
                System.out.println(this.type+" in slot "+ slot.number+" is going out");
                valet1.income+=this.get_stay()*fare;
                System.out.println(this.type+" is paying: "+this.get_stay()*fare);
                slot.set_vacant();
                
            }
    }
    public void print_description()
    {
        System.out.println("car is coming");
    }
    public void set_stay()
    {
        int stay_range=random.nextInt(10);
        if (stay_range<=3)
        {
            this.stay=this.stay=random.nextInt(24)*500;//500= time scale in the simulator
        }
        else if(stay_range>=4 && stay_range<=8)
        {
            this.stay=this.stay=random.nextInt(48)*500;//500= time scale in the simulator
        }
        else
        {
            this.stay=this.stay=random.nextInt(72)*500;//500= time scale in the simulator
        }
    }
    
    Vehicle(long time,String type)
    {
        this.set_stay();
        this.print_description();
        this.time=time;
        this.type=type;
    }

}
