
/**
 * Class to test Homework 2
 * 
 * @author Alan Maughan
 * @version 01
 */
public class ExecuteHW2
{    
    private String name, id;
    private LoyaltyCardList loyaltyCards;
    private StudentLoyaltyCard student1, student2;
    private StaffLoyaltyCard staff1, staff2;
    private int mark;
    private int numberOfCardsCreated;

    /**
     * Constructor for objects of class HW2Test
     * 
     * @param name the student's name
     * @param id the student's id
     */
    public ExecuteHW2(String yourName, String yourId)
    {
        name = yourName;
        id = yourId;
        mark = 0;
        numberOfCardsCreated = 0;
        loyaltyCards = new LoyaltyCardList();        
        runTests();
    }

    /**
     * Run the various tests
     */

    public void runTests()
    {
        // print header
        System.out.println("Name: " + name + "\tID: " + id + "\n");

        testAddStudentLoyaltyCardNoPoints();
        testAddStudentLoyaltyCardWithPoints();
        testAddStaffLoyaltyCardNoPoints();
        testAddStaffLoyaltyCardWithPoints();  
        testRemoveValidLoyaltyCard();
        testRemoveInvalidLoyaltyCard();
        testGetNumberOfLoyaltyCards();
        testGetNumberOfStaffLoyaltyCards();
        testGetNumberOfStudentLoyaltyCards();

        System.out.println("Program complete."); 

    }

    //Create 2 student loyalty loyaltyCards  

    public void testAddStudentLoyaltyCardNoPoints()
    {
        try
        { 
            // student with no initial points
            student1 = new StudentLoyaltyCard ("Mr", "Adam", "Adamant",
                "stu00001", "1 Arcadia Avenue", "Alnwick", 
                "AA1 1AA","18111111");
            loyaltyCards.addLoyaltyCard(student1);
            System.out.println(student1); 
            numberOfCardsCreated++;
            System.out.println("Student 1 added. Mark so far: " + (++mark) +"\n");
        }
        catch (Exception e)
        {
            System.out.println("An exception was raised in " 
                + "testAddStudentLoyaltyCardNoPoints.");
        }
    }

        
    public void testAddStudentLoyaltyCardWithPoints()
    {
        try
        {
            // student with initial points            
            student2 = new StudentLoyaltyCard ("Ms", "Betty", "Boothroyd",
                "stu00002", "2 Boston Boulevard", "Boston",
                "BB2 2BB", "18111112", 5);
            loyaltyCards.addLoyaltyCard(student2);
            System.out.println(student2);    
            numberOfCardsCreated++;
            System.out.println("Student 2 added. Mark so far: " + (++mark) +"\n");
        }
        catch (Exception e)
        {
            System.out.println("An exception was raised in "
                + "testAddStudentLoyaltyCardWithPoints.");
        }
    }

    // Create 2 staff loyalty loyaltyCards     
    public void testAddStaffLoyaltyCardNoPoints()
    {
        try
        {
            // staff loyaltyCard with no initial points
            staff1 = new StaffLoyaltyCard ("Dr", "Carol", "Channing", 
                "sta00003", "1111","CIS303");

            loyaltyCards.addLoyaltyCard(staff1);                    
            System.out.println(staff1);  
            numberOfCardsCreated++;
            System.out.println("Staff 1 added. Mark so far: " + (++mark) +"\n");

        }
        catch (Exception e)
        {
            System.out.println("An exception was raised "
                + "in testAddStaffLoyaltyCardNoPoints.");
        }
    }

    public void testAddStaffLoyaltyCardWithPoints()
    {
        try
        {
            // staff loyaltyCard with initial ponts

            staff2 = new StaffLoyaltyCard ("Prof", "Doris", "Day","1112", 
                "sta00004","CIS304",4);
            loyaltyCards.addLoyaltyCard(staff2);                   
            System.out.println(staff2);
            numberOfCardsCreated++;
            System.out.println("Staff 2 added. Mark so far: " + (++mark) +"\n");
        }
        catch (Exception e)
        {
            System.out.println("An exception was raised "
                + "in testAddStaffLoyaltyCards.");
        }
    }

    public void testGetNumberOfLoyaltyCards()
    {
        try
        {
            int number = loyaltyCards.getNumberOfLoyaltyCards();
            if (number == 3)
            {
                System.out.println("Correct number of loyalty cards. Mark so far: " + (++mark) +"\n");
            }
            else
            {
                System.out.println("Incorrect number of loyalty cards.");
            }
        }
        catch (Exception e)
        {
            System.out.println("An exception was raised "
                + "in testGetNumberOfLoyaltyCards.");
        }                
    }

    public void testGetNumberOfStaffLoyaltyCards()
    {
        try
        {
            int number = loyaltyCards.getNumberOfStaffLoyaltyCards();
            if (number == 1)
            {
                System.out.println("Correct number of staff loyalty cards. Mark so far: " + (++mark) +"\n");
            }
            else
            {
                System.out.println("Incorrect number of staff loyalty cards.");
            }
        }
        catch (Exception e)
        {
            System.out.println("An exception was raised "
                + "in testGetNumberOfStaffLoyaltyCards.");
        }         
    }

  
    public void testGetNumberOfStudentLoyaltyCards()
    {
        try
        {
            int number = loyaltyCards.getNumberOfStudentLoyaltyCards();
            if (number == 2)
            {
                System.out.println("Correct number of studentloyalty Cards. Mark so far: " + (++mark) +"\n");
            }
            else
            {
                System.out.println("Incorrect number of student loyalty cards.");
            }
        }
        catch (Exception e)
        {
            System.out.println("An exception was raised "
                + "in testGetNumberOfStudentLoyaltyCards.");
        }                
    }    

    /**
     * Test removal of a valid loyalty card
     */

    public void testRemoveValidLoyaltyCard()
    {
        try
        {
            loyaltyCards.removeLoyaltyCard("sta00003");
            System.out.println("TestRemoveValidLoyaltyCard - Number of loyalty loyaltyCards now:" 
                + loyaltyCards.getNumberOfLoyaltyCards());        
            if(loyaltyCards.getNumberOfLoyaltyCards() == numberOfCardsCreated -1)
            { 
                System.out.println("Removal suceeded. Mark so far: " + (++mark));
                numberOfCardsCreated--;
            }
            else
            {
                System.out.println("removal incorrect. No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testRemoveValidLoyaltyCard. "
                + "Current mark ="+mark);
        }
    }

    /**
     * Test removal of an invalid loyalty card
     */

    public void testRemoveInvalidLoyaltyCard()
    {
        try
        {
            System.out.println("\ntestRemoveInvalidLoyaltyCard:");
            loyaltyCards.removeLoyaltyCard("999");

            if(loyaltyCards.getNumberOfLoyaltyCards() == numberOfCardsCreated)
            { 

                System.out.println("Number of loyaltyCards still:" 
                    + loyaltyCards.getNumberOfLoyaltyCards()
                    +". Mark so far: " + (++mark));
            }
            else
            {
                System.out.println("removal incorrect. No Mark!");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception was raised in testRemoveInvalidLoyaltyCard. "
                + "Current mark ="+mark);
        }
    }

} 