
/**
 * Write a description of class Crew here.
 * 
 * @author Khan,Md Kabir  
 * @version CW2
 */
public class Crew extends Passenger
{
    public static final String CAPTAIN = "Captain";
    public static final String FIRST_OFFICER = "First Officer";
    public static final String CABIN_CREW = "Cabin Crew";
    private String position;

    /**
     * Constructor for objects of class Crew
     */
    public Crew(String pos, String firstName, String lastName, double weight){
        super(firstName, lastName, weight, 0);
        
        if
           (pos == "Captain") 
              {
                 position = pos;
              }
        else if 
            (pos == "First Officer")
               {
                  position = pos;
               }
        else if 
            (pos == "Cabin Crew")
               {
                  position = pos;
               }
        else 
               {
                  System.out.println("Invalid Position!");
               }  
        
    }
    
    public String toString(){
        return super.toString() + "; Crew position: "+position;
    }
    
}    