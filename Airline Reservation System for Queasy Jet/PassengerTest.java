
/**
 * Write a description of class PassengerTest here.
 * 
 * @author Khan, Md Shahriar Kabir
 * @version CW2
 */
public class PassengerTest
{
    public static void main(){
        EconomyPassenger economyPassenger = new EconomyPassenger("Khan", "Kabir", 135, 21);
        System.out.println(economyPassenger);
        economyPassenger.setWeight(115);
        economyPassenger.setLuggage(46);
        System.out.println(economyPassenger);
        
        Crew crewPassenger = new Crew(Crew.CAPTAIN, "Zak", "Roni", 198);
        System.out.println(crewPassenger);
        crewPassenger.setWeight(48);
        crewPassenger.setLuggage(185);
        System.out.println(crewPassenger);
    }
}
