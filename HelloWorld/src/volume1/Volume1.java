/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume1;

/**
 *
 * @author Owner
 */
public class Volume1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int cansPerPack = 6;
        final double CAN_VOLUME = 0.355; // Liters in a 12-ounce can
        double totalVolume = cansPerPack * CAN_VOLUME;
        
        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(totalVolume);
        System.out.println(" liters.");
        
        final double BOTTLE_VOLUME = 2; // Two-liter bottle
                
        totalVolume = totalVolume + BOTTLE_VOLUME;
        
        System.out.print("A six-pack and a two-liter bottle contain ");
        System.out.print(totalVolume);
        System.out.println(" liters.");
        
    }
    
}
