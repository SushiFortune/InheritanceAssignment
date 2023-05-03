/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package Aircrafts;

/**
 * WW2Airplane class creates WW2Airplane objects with price, maximum elevation and whether it has a twin engine attributes
 * @author raniam
 * @version 1.0
 *
 */
public class WW2Airplane extends Aircraft {
    private boolean twin_engine;

    /**
     * getTwin_engine() returns twin engine boolean value
     * @return  twin engine boolean value
     */
    public boolean getTwin_engine() {
        return twin_engine;
    }

    /**
     * setTwin_engine() sets twin engine boolean value  to the parameter value
     *
     * @param twin_engine twin engine boolean value
     */
    public void setTwin_engine(boolean twin_engine) {
        this.twin_engine = twin_engine;
    }

    public boolean isTwin_engine() {
        return twin_engine;
    }

    /**
     * WW2Airplane()
     * Default constructor that calls the parent default constructor, then sets twin engine boolean value to default value
     */
    public WW2Airplane()
    {
        super();
        twin_engine=false;
    }
    /**
     * WW2Airplane()
     * Parameter constructor that sets price and maximum elevation of an aircraft by calling parent parameter constructor, then it sets the twin_engine attribute to passed value
     * @param price price of WW2 airplane
     * @param maxelevation maximum elevation of WW2 airplane
     * @param twin_engine boolean value for if WW2 airplane has a twin engine or not
     */
    public WW2Airplane(double price,double maxelevation,boolean twin_engine)
    {
        super(price,maxelevation);
        this.twin_engine=twin_engine;
    }

    /**
     * WW2Airplane()
     * Copy constructor that sets a WW2 airplane's attributes to another WW2 airplane's attributes, by first calling the parent copy constructor
     * @param obj WW2Airplane( World War 2 airplane) object
     */
    public WW2Airplane(WW2Airplane obj)
    {
        super(obj);
        this.twin_engine=obj.twin_engine;
    }

    /**
     * equals() returns a boolean value, true if two WW2 airplane objects have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
     * @param obj Abstract object can be an object form any class
     * @return true or false
     * */

    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        else return (super.equals(obj) && this.twin_engine==((WW2Airplane) obj).twin_engine );

    }

    /**
         * toString() returns a string describing attributes of a WW2 airplane object, depending on if it has a twin engine or not
     * @return string
     */
    public String toString() {
        if (isTwin_engine()==true)
        return "This World War II Airplane is worth "+price+"$,has a maximum elevation of "+maxelevation+" ft, and has a twin engine.";
        else
            return "This World War II Airplane is worth "+price+" $,has a maximum elevation of "+maxelevation+"ft, and has no twin engine.";
    }
}
