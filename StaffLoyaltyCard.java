
/**
 * Write a description of class StaffLoyaltyCard here.
 *
 * @author (Mateus Goncalves De Ouro)
 * @version (13/03/2019)
 */
public class StaffLoyaltyCard extends LoyaltyCard
{
    /**
     *  initiates variables location
     *  
     *  initiates variable staffNumber
     */

    String location ;

    String staffNumber ;

    /**
     * constructor for StaffLoyaltyCard  class it initiates all objects
     * so they can later be used 
     * @param title 
     * @param firstName 
     * @param lastName
     * @param cardNumber
     * @param staffNumber
     * @param location
     * 
     */
    public StaffLoyaltyCard(String title, String firstName, String lastName, 
    String cardNumber, String staffNumber, String location)
    {
        super( title ,  firstName , lastName, cardNumber) ; 

        this.cardNumber = cardNumber ;

        this.staffNumber = staffNumber ;

        this.location = location ;

        points = 0 ;

    }

    /**
     * constructor for StaffLoyaltyCard  class it initiates all objects
     * so they can later be used 
     * @param title 
     * @param firstName 
     * @param lastName
     * @param cardNumber
     * @param staffNumber
     * @param location
     * @param points
     */
    public StaffLoyaltyCard(String title, String firstName, String lastName, 
    String cardNumber, String staffNumber, String location, int points)
    {
        super( title ,  firstName , lastName, cardNumber, points) ; 


        this.cardNumber = cardNumber ;

        this.staffNumber = staffNumber ;

        this.location = location ;

        this.points = points;

    }

    /**
     *  returns location
     */
    public String getLocation()
    {
        return location ;
    }

    /**
     *  returns staff number 
     */
    public String getStaffNumber()
    {
        return staffNumber;   
    }

    /**
     *  allows us to set location
     *  
     * @param location
     */
    public void setLocation(String location)
    {

        this.location = location ;

    }

    /**
     * retrieves all info on staff loyalty card user
     * 
     */
    public String toString() 
    {
        return  super.toString() + "  \n " + getStaffNumber() + " \n " + getLocation() ; 
    }

    /** 
     * prints all info on staff loyalty card user
     * 
     */
    public void print()
    {

        System.out.println( toString() ) ;
    }
}
