
/**
 * Write a description of class StudentLoyaltyCard here.
 *
 * @author (Mateus Goncalves De Ouro)
 * @version (13/03/2019)
 */
public class StudentLoyaltyCard extends LoyaltyCard
{   
    /**
     * initiates studentId variable
     * 
     * initiates termAddress variable which is an instance of class Address
     */

    String studentID ;
    Address termAddress ;
    /**
     * constructor for StudentLoyaltyCard class it initiates all objects
     * so they can later be used 
     * @param title 
     * @param firstName 
     * @param lastName
     * @param cardNumber
     * @param street 
     * @param town 
     * @param postcode
     * @param studentId
     */
    public  StudentLoyaltyCard(String title, String firstName , String lastName ,String cardNumber,String street , String town , String postcode,String studentID) 
    {                  
        super( title ,  firstName , lastName , cardNumber) ;

        this.cardNumber = cardNumber ;

        street = street ;

        town = town ;

        postcode = postcode;

        this.termAddress = new Address( street , town , postcode ) ;

        
        this.studentID = studentID ;

        this.points = 0 ;
    }

    /**
     * constructor for StudentLoyaltyCard class it initiates all objects
     * so they can later be used 
     * @param title 
     * @param firstName 
     * @param lastName
     * @param cardNumber
     * @param street 
     * @param town 
     * @param postcode
     * @param studentId
     * @param points
     */
    public  StudentLoyaltyCard(String title, String firstName , String lastName ,String cardNumber,String street , String town , String postcode,String studentID, int points) 
    {                  
        super( title ,  firstName , lastName, cardNumber, points) ;    

        this.cardNumber = cardNumber ;

        street = street ;

        town = town ;

        postcode = postcode;

        this.termAddress = new Address(street , town , postcode ) ;

        
        this.studentID = studentID ;

        this.points = points ;
    }

    /**
     * allows us to set an address for the student
     * @param street 
     * @param town 
     * @param postcode
     */
    public void amendTermAddress(String street, String town, String postcode)
    {
        termAddress.setFullAddress( street , town ,  postcode);
    }

    /**
     *  returns the students address
     */
    public String getTermAddress()
    {

        return termAddress.toString() ;
    }

    /**
     *  returns student id 
     */
    public String getID()
    {

        return studentID ;

    }

    /**
     *  retrieves all info on student loyalty card user by calling back methods
     *  from superclass LoyaltyCard 
     */
    public String toString()
    {
        return super.toString() + " \n  " + getID() + " \n " + getTermAddress() ;

    }

    /**
     *  prints all info on student 
     */
    public void print()
    {

        System.out.println( toString() ) ;
    }
}
