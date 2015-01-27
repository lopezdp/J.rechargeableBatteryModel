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

public class Battery {

    private double maxCapacity;
    private double currentCapacity;
    
    public Battery(double capacity)
    {
        maxCapacity = capacity;
        currentCapacity = maxCapacity;
    }
    
    public void drain(double amount)
    {
        currentCapacity -= amount;
    }
    
    public void charge()
    {
        currentCapacity = maxCapacity;
    }
    
    public double getRemainingCapacity()
    {
        return currentCapacity;
    }
}
