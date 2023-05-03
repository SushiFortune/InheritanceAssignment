/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package WheeledTransp;

import Transportation.Transportation;

/**
 * WheeledTransportation class creates WheeledTransportation objects with number of wheels and maximum speed attributes
 * @author raniam
 * @version 1.0
 *
 */
public class WheeledTransportation extends Transportation {
    protected int wheels;
    protected double maxspeed;

    /**
     * getWheels() returns number of wheels of a wheeled transportation
     * @return number of wheels of a wheeled transportation
     */
    public int getWheels() {
        return wheels;
    }
    /**
     * getMaxspeed() returns maximum speed s of a wheeled transportation
     * @return maximum speed of a wheeled transportation
     */
    public double getMaxspeed() {
        return maxspeed;
    }

    /**
     * setWheels() sets number of wheels of a wheeled transportation to the parameter value
     *
     * @param wheels passed number of wheels
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    /**
     * setMaxspeed() sets maximum speed of a wheeled transportation to the parameter value
     *
     * @param maxspeed passed maximum speed value
     */
    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    /**
     * WheeledTransportation()
     * Default constructor that sets number of wheels and maximum speed of a wheeled transportation to default values
     */
    public WheeledTransportation()
    {
        wheels=4;
        maxspeed=200;
    }

    /**
     * WheeledTransportation()
     * Parameter constructor that sets number of wheels and maximum speed of a wheeled transportation to passed values
     *  @param wheels number of wheels of wheeled transportation
     * @param maxspeed maximum speed of  wheeled transportation
     */
    public WheeledTransportation(int wheels,double maxspeed)
    {

        this.wheels=wheels;
        this.maxspeed=maxspeed;
    }

    /**
     * WheeledTransportation()
     * Copy constructor that sets a wheeled transportation's attributes to another wheeled transportation's attributes
     * @param obj wheeled transportation object
     */
    public WheeledTransportation(WheeledTransportation obj)
    {
        this.wheels=obj.wheels;
        this.maxspeed=obj.maxspeed;
    }

    /**
     * equals() returns a boolean value, true if two wheeled transportation objects have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
     * @param obj Abstract object can be an object form any class
     * @return true or false
     * */
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        else return (this.maxspeed==((WheeledTransportation) obj).maxspeed && this.wheels== ((WheeledTransportation) obj).wheels);

    }

    /**
     * toString() returns a string describing attributes of a wheeled transportation object
     * @return string
     */
    public String toString() {
        return "This WheeledTransportation has "+wheels+" wheels, has a maximum speed of "+maxspeed+" km/h.";
    }
}
