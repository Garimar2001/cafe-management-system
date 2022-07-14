/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mynewcafe;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Garima Rawat
 */
public class SuperClass {
    public double vegBurger;
    public double chickenBurger;
    public double vegPizza;
    public double pasta;
    public double frenchFries;
    public double chickenRoll;
    public double peproniPizza;
    
    public double chocoShake;
    public double mangoShake;
    public double oreoShake;
    public double bananaShake;
    public double vanillaShake;
    public double coffee;
    public double coldCoffee;
    
    public double meals;
    public double drinks;
    public double totalofMD;
    
    public double allTotal;
    
    public double getAmount()
    {
        meals = vegBurger + chickenBurger + vegPizza + pasta + frenchFries + chickenRoll + peproniPizza;
        drinks = chocoShake + mangoShake + oreoShake + bananaShake + vanillaShake + coffee + coldCoffee;
        totalofMD = meals + drinks;
        allTotal = totalofMD;
        return allTotal;

    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Cafe Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    public double pvegBurger = 50.0;
    public double pchickenBurger = 60.0;
    public double pvegPizza = 60.0;
    public double ppasta = 40.0;
    public double pfrenchFries = 30.0;
    public double pchickenRoll = 70.0;
    public double ppeproniPizza = 100.0;
    
    public double pchocoShake = 50.0;
    public double pmangoShake = 40.0;
    public double poreoShake = 40.0;
    public double pbananaShake = 35.0;
    public double pvanillaShake = 30.0;
    public double pcoffee = 20.0;
    public double pcoldCoffee = 30.0;
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmt)
    {
        cAmt = cAmt - (cAmt * mcTax);
        return cAmt;
    }
    
    
}
