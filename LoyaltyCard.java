
/**
 * Abstract class LoyaltyCard - write a description of the class here
 *
 * @author (Mateus Goncalves De Ouro)
 * @version (02/03/2019)
 */
public abstract class LoyaltyCard
{   /** 
     * creates variables carNumber
     * 
     * creates variable name of instanceof class Name
     *
     *   creates variable points 
     */
    String cardNumber ;

    Name name ;

    int points ;

    /**
     * constructor for LoyaltyCard an abstract class it initiates all objects
     * so they can later be used 
     * @param title 
     * @param firstName 
     * @param lastName
     * @param cardNumber
     * 
     */
    public LoyaltyCard(String title , String firstName , String lastName, String cardNumber)
    {

        title = title ;

        firstName = firstName ; 

        lastName = lastName ;

        name = new  Name ( title, firstName, lastName) ; 

        this.cardNumber = cardNumber;
        this.points = 0 ;
    }

    /**
     *  @param title 
     * @param firstName 
     * @param lastName
     * @param cardNumber
     *  @param points 
     */
    public LoyaltyCard(String title , String firstName , String lastName , String cardNumber, int points)
    {

        title = title ;

        firstName = firstName ; 

        lastName = lastName ;

        name = new  Name ( title, firstName, lastName) ; 

        this.cardNumber = cardNumber;
        this.points = points;
    }

    /**
     * allows us to add points to card
     * 
     * @param numberOfPoints
     */
    public void addPoints(int numberOfPoints)
    {

        this.points = points + numberOfPoints ; 

        System.out.println("you now have " + points + " " + " available" );
    }

    /**
     * 
     * retrieves card number 
     */

    public String getCardNumber()
    {
        return  cardNumber;   
    }

    /**
     * returns full name by using variable which is an instance of class Name
     * hence allows us to use the class's existing methods 
     * 
     */

    public String getFullName()
    {

        return name.toString() ;

    }

    /**
     * returns number of points 
     */

    public int getPoints()
    {

        return  points  ;   

    }

    /**
     * allows us to deduct points 
     */

    public  void reducePoints(int numberOfPoints)
    {
        if (points != 0 )
        {
            points = points - numberOfPoints;

            System.out.println(" You have   " + points + "  " + "available ");
        }

        if ( points < 0 )
        {
            System.out.println("transaction has been refused only" + "  " +
                points +" " + " are available ");
        }

        if ( points == 0 )
        {
            System.out.println(" you have 0 points this is  not possible");   
        }
    }

    /**
     * allows us to set a title for user of loyalty card
     * 
     * @param title 
     */

    public void setTitle(String title)
    {

        name.setTitle( title ) ;
    }

    /**
     * allows us to set a first name for user of loyalty card
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName)
    {

        name.setFirstName( firstName ) ;
    }

    /**
     * allows us to set a last name for user of loyalty card
     * 
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        name.setLastName( lastName ) ; 
    }

    /**
     * 
     *  returns all info on loyalty card user that is stored in loyaltyCard 
     */
    public String toString()
    {

        return getFullName() + " \n  " + "your cardnumber: " + getCardNumber() 

        + " \n Points Available: " + getPoints()  ;

    }

    /**
     * 
     * prints all info on user of loyalty card
     */
    public void printHolderDetails()
    {

        System.out.println( toString() ) ;

    }

}
