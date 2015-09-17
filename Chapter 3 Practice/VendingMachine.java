

/**
 * The class VendingMachine has a certain number of cans and a certain number of tokens. 
 * Cans may be added to a VendingMachine, 
 * and tokens may be inserted into a VendingMachine in exchange for cans.
 * 
 * @author Justin Huang
 * @version 17 September 2015
 */
public class VendingMachine
{
    /** Specifies the number of cans in the vending machine */
    private int canCount;
    
    /** Specifies the number of tokens in the vending machine */
    private int tokenCount;

    /**
     * Constructor for objects of class VendingMachine.
     */
    public VendingMachine()
    {
        this.canCount = 10;
        this.tokenCount = 0;
    }
    
    /**
     * Constructor for objects of class VendingMachine.
     */
    public VendingMachine(int cans)
    {
        this.canCount = cans;
        this.tokenCount = 0;
    }

    /**
     * Simulates adding the specified number of cans to the vending machine.
     *
     * @pre     The specified number of cans is greater than 0.
     * 
     * @post    The number of cans in the vending machine is increased by the specified number of cans.
     * 
     * @param   numCans    The number of cans to be added to the vending machine.
     * 
     */
    public void fillUp(int cans)
    {
        this.canCount += cans;
    }

    /**
     * Simulates inserting a token into the vending machine and getting a can in exchange.
     *
     * @pre     The number of cans in the vending machine is greater than 0.
     * 
     * @post    The number of tokens in the vending machine is increased by 1.
     *          The number of cans in the vending machine is decreased by 1.
     * 
     */
    public void insertToken()
    {
        this.tokenCount += 1;
        this.canCount -= 1;
    }

    /**
     * Returns the number of cans in the vending machine.
     *
     * @return  The number of cans in the vending machine.
     */
    public int getCanCount()
    {
        return this.canCount;
    }

    /**
     * Returns the number of tokens in the vending machine.
     *
     * @return  The number of tokens in the vending machine.
     */
    public int getTokenCount()
    {
        return this.tokenCount;
    }
}
