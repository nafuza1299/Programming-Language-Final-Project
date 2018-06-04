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

public class ParkingField {
    ParkingSlot[] parkfield1= new ParkingSlot[100];
    Valet valet1=new Valet(1);
    ParkingField(){
        System.out.println("Parking field constructed");
        for(int i=0;i<100;i++)
        {
            if (i<75)
            {
                parkfield1[i]=new ParkingSlot(i+1,"car");//Parking slot Object Created
            }
            else
            {
                parkfield1[i]=new ParkingSlotB(i+1,"bus");//Parking SlotB object created
            }
        }
    };    
}
