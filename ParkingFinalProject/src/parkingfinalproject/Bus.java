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
public class Bus extends Vehicle{
    
    public Bus(long time,String type) {
        super(time,type);
    }
    public void print_description()
    {
        System.out.println("Bus is coming");
    }
    public void out(long time,ParkingSlot slot,Valet valet1)//method for leaving car including fare counting
    {
        int fare=3000;
        if (time==(this.time+this.stay))
            {
                System.out.println(this.type+" in slot "+ slot.number+" is going out");
                valet1.income+=this.get_stay()*fare;
                System.out.println(this.type+" is paying: "+this.get_stay()*fare);
                slot.set_vacant();
                
            }
    }
    
    
}
