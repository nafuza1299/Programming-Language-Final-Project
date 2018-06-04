/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingfinalproject;
import java.util.*;
/**
 *
 * @author DUMAC REVANO
 */
public class Phasecontrol {
    
    long time  = System.currentTimeMillis();
    long end= this.time + 48000;
    Queue<Vehicle> varr = new LinkedList<>();
    ParkingField Field1 = new ParkingField();
    Random random=new Random();
    int number=0;
    int rejected=0;
    int no_of_bus=0;
    int no_of_car=0;
    
    
    
    Phasecontrol(){};
    
    void Start_day(int random_range,int divisor)
    {   
        int randnum1;
        int ranum;
        while(System.currentTimeMillis()<=this.end)
        {
            for (int i=0;i<Field1.parkfield1.length;i++)
            {   
                
                if(!Field1.parkfield1[i].availability)
                {
                    Field1.parkfield1[i].InSlot.out(System.currentTimeMillis(),Field1.parkfield1[i],Field1.valet1);
                }
            }
            
            
            int count = 0;
            ranum=random.nextInt(random_range);
            randnum1=random.nextInt(4);
            if (ranum%divisor==0)
            {     
                this.number+=1;
                if (randnum1==1)
                {
                    varr.add(new Bus(System.currentTimeMillis(),"bus"));
                    no_of_bus+=1;
                }
                else
                {
                    varr.add(new Vehicle(System.currentTimeMillis(),"car"));
                    no_of_car+=1;
                }
                
                if (Field1.valet1.carin(varr.remove(), Field1.parkfield1))
                {
             
                }
                else
                {
                    this.rejected+=1;
                }
            }
        }
    }
    
    public void end_day(){
        System.out.println("number of coming Vehicle = "+this.number);
        System.out.println("number of coming Bus="+this.no_of_bus);
        System.out.println("Number of coming car="+this.no_of_car);
        System.out.println("recjected Vehicle = "+this.rejected);
        System.out.println("Income of the day = "+Field1.valet1.income);
    }
}

