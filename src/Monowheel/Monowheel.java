/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package Monowheel;

import WheeledTransp.WheeledTransportation;

/**
 * Monowheel class creates Monowheel objects with number of wheels, maximum speed and maximum weight the monowheel can support attributes
 * @author raniam
 * @version 1.0
 *
 */
public class Monowheel extends WheeledTransportation {


    private double max_weight;
    /**
     * getMax_weight() returns maximum weight the monowheel can support
     * @return maximum weight the monowheel can support
     */
    public double getMax_weight() {
        return max_weight;
    }

    /**
     * setMax_weight() sets maximum weight the monowheel can support  to the parameter value
     *
     * @param max_weight passed maximum weight the monowheel can support
     */
    public void setMax_weight(double max_weight) {
        this.max_weight = max_weight;
    }

    /**
     * Monowheel()
     * Default constructor that calls the parent default constructor, then sets the maximum weight the monowheel can support to default value
     */
    public Monowheel()
    {super();
        setWheels(1);
    max_weight=900;}

    /**
     * Monowheel()
     * Parameter constructor that sets number of wheels, maximum speed, by calling the parent parameter constructor, then sets the maximum weight the monowheel can support
     */
    public Monowheel(int wheels,double maxspeed,double max_weight)
    {
        super(wheels, maxspeed);
        this.max_weight=max_weight;
    }
    /**
     * Monowheel()
     * Copy constructor that sets a monowheel's attributes to another monowheel's attributes, by first calling the parent copy constructor
     * @param obj monowheel object
     */
    public Monowheel(Monowheel obj)
    {
        super(obj);
        this.max_weight=obj.max_weight;
    }

    /**
     * equals() returns a boolean value, true if two monowheel objects have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
     * @param obj Abstract object can be an object form any class
     * @return true or false
     * */
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        else return(super.equals(obj) && this.max_weight==((Monowheel) obj).max_weight);

    }

    /**
     * toString() returns a string describing attributes of a monowheel object
     * @return string
     */
    public String toString() {
        return "This Monowheel has "+wheels+" wheel, has a maximum speed of "+maxspeed+" km/h and support a maximum weight of "+max_weight+".";
    }
}
