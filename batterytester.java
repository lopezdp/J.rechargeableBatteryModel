/*
 * David P. Lopez
 * COP2800
 * Battery App that models a rechargeable battery
 */

package batterytester;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */

public class batteryTester {
    
    public static void main(String[] args)
    {
        Battery tonkaTruck = new Battery(3000); 
        
        System.out.println(tonkaTruck.getRemainingCapacity());
        
        tonkaTruck.drain(125.6);
        System.out.println(tonkaTruck.getRemainingCapacity());
        
        tonkaTruck.drain(875.1);       
        System.out.println(tonkaTruck.getRemainingCapacity());
        
        tonkaTruck.drain(458.7);       
        System.out.println(tonkaTruck.getRemainingCapacity());
        
        tonkaTruck.drain(87.3);
        System.out.println(tonkaTruck.getRemainingCapacity());
        
        tonkaTruck.charge();
        System.out.println(tonkaTruck.getRemainingCapacity());
        
        tonkaTruck.drain(2999.999);
        System.out.println(tonkaTruck.getRemainingCapacity());      
    }    
}
