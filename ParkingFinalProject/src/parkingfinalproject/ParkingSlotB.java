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

public class ParkingSlotB extends ParkingSlot//For Big size Vehicle
{
    String Type;
    
    public ParkingSlotB(int numb,String type) {
        super(numb,type);
        this.Type="Bus";
    }
    public void print_cons()
    {
        System.out.println("Parking slot b constructed");
    }
    
    
}
