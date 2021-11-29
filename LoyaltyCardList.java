import java.util.ArrayList ;
/**
 * Write a description of class LoyaltyCardList here.
 *
 * @author (Mateus Goncalves De Ouro)
 * @version (13/03/2019)
 */
public class LoyaltyCardList
{
    // array list is declared 
    public ArrayList <LoyaltyCard> loyaltyCards ;

    /**
     * constructor for LoyaltyCardList initiates a new array
     */
    public LoyaltyCardList()
    {

        loyaltyCards = new ArrayList <LoyaltyCard>();

    }

    /**
     * allows us to add a loyaltyCard object to our loyaltyCards array list
     * 
     * @param loyaltyCard
     */
    public void addLoyaltyCard( LoyaltyCard loyaltyCard) 
    {

        loyaltyCards.add(loyaltyCard);

    }

    /**
     *  retrieves all loyaltycards within the array list  loyaltyCards 
     *  and displays them 
     */
    public void getAllLoyaltyCards()
    {

        for(LoyaltyCard loyaltyCard : loyaltyCards)
        {

            loyaltyCard.printHolderDetails()   ;

        }

    }

    /**
     * retrieves loyalty card within loyaltyCards array list through using 
     * the variable cardNumber 
     * 
     * @param cardNumber
     */
    public boolean getLoyaltyCard (String cardNumber   )
    {
        int index = 0 ;

        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {
                loyaltyCard.printHolderDetails();
                return true;
            }
            else 
            {
                System.out.println("The following cardnumber has not been found:" + "  " + cardNumber );   
            }
            index++;
        }
        return false;

    }

    /**
     *  returns size of array list loyaltyCards
     */
    public int getNumberOfLoyaltyCards()
    {

        return loyaltyCards.size() ;

    }

    /**
     *  retrieves number of staff loyaltycards within array list loyaltyCards
     */
    public int getNumberOfStaffLoyaltyCards()
    {
        int NumberOfStaffLoyaltyCards = 0 ; 

        for (LoyaltyCard loyaltyCard : loyaltyCards)
        { 

            if( loyaltyCard instanceof StaffLoyaltyCard)
            {
                NumberOfStaffLoyaltyCards++;

            }

        } 
        return NumberOfStaffLoyaltyCards;
    }

    /**
     *  retrieves number of student loyaltycards within array list loyaltyCards
     */
    public int getNumberOfStudentLoyaltyCards()
    {
        int NumberOfStudentLoyaltyCards = 0 ; 

        for (LoyaltyCard loyaltyCard : loyaltyCards)
        {

            if( loyaltyCard instanceof StudentLoyaltyCard)
            {
                NumberOfStudentLoyaltyCards++;

            }

        } 
        return  NumberOfStudentLoyaltyCards ;
    }
    
    /**
     * allows us to search for loyalty card based on variable cardNumber
     * and once found a match allows us to remove loyaltyCard from
     * loyaltyCards array list
     *  @param cardNumber
     */
    public boolean removeLoyaltyCard ( String cardNumber ) 
    {

        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {
                loyaltyCards.remove(loyaltyCard);
                return true;

            }

        }
        return false;

    }

}
