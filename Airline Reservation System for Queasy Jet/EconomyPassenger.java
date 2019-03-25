
/**
 * Write a description of class EconomyPassenger here.
 * 
 * @author Khan, Md Kabir  
 * @version CW2
 */
public class EconomyPassenger extends PayingPassenger implements Economy
{
    /**
     * Constructor for objects of class EconomyPassenger
     */
    public EconomyPassenger(String firstName, String lastName, double weight, double baseFare)
    {
        super(firstName, lastName, weight, Economy.START_NUMBER, baseFare, Economy.TYPE_CHARGE, FrequentFlyerCode);
    }
    
    /**
     * toString method overridden
     */
    public String toString(){
                String prettyLine = "---------------------------" + "\n\n";    
        
                return "Economy Class\n" + prettyLine + super.toString();
    }
    
}
