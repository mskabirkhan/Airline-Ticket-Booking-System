
/**
 * Write a description of class FirstClassPassenger here.
 * 
 * @author Khan, Md Kabir 
 *
 * @version CW2
 */
public class FirstClassPassenger extends PayingPassenger implements FirstClass
{
    private double Additionalluggage;
    private double weight;
    private double Luggage;
    
 
    /**
     * Constructor for objects of class FirstClassPassenger
     */
    public FirstClassPassenger(String firstName, String lastName, double weight, double baseFare , String FFC)
    {
        super(firstName, lastName, weight, FirstClass.START_NUMBER, baseFare, FirstClass.TYPE_CHARGE , FFC);
        Additionalluggage=0 ;
        this.weight=weight;
        this.Luggage=Luggage;
    }
    
    public double getAdditionalluggage(){
        return Additionalluggage;
    }
    
    public void setAdditionalLuggage(double Additionalluggage){
        this.Additionalluggage = Additionalluggage;
    }
    
    public double getAdditionalLuggage(){
        return Additionalluggage;
    }
    
    
}
