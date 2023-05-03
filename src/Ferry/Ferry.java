/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package Ferry;

import Transportation.Transportation;

/**
 * Ferry class creates Ferry objects with maximum speed of a ferry and maximum load a ferry can support
 * @author raniam
 * @version 1.0
 *
 */
public class Ferry extends Transportation {
    private double maxspeed;
    private double maxload;

    /**
     * getMaxspeed() returns maximum speed of a ferry
     * @return maximum speed of a ferry
     */
    public double getMaxspeed() {
        return maxspeed;
    }

    /**
     * setMaxspeed() sets maximum speed of a ferry  to the parameter value
     *
     * @param maxspeed passed maximum speed value
     */
    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    /**
     * getMaxload() returns maximum load a ferry can support
     * @return returns maximum load a ferry can support
     */
    public double getMaxload() {
        return maxload;
    }

    /**
     * setMaxload() sets maximum load a ferry can support to the parameter value
     *
     * @param maxload passed maximum supported load value
     */
    public void setMaxload(double maxload) {
        this.maxload = maxload;
    }

    /**
     * Ferry()
     * Default constructor that sets maximum speed and load of a ferry to default values
     */
    public Ferry()
    {
        maxspeed=13;
        maxload=1300;

    }
    /**
     * Ferry()
     * Parameter constructor that sets maximum speed and load of a ferry to passed values
     *  @param maxspeed maximum speed of ferry
     * @param maxload maximum load of ferry
     */
    public Ferry(double maxspeed,double maxload)
    {
        this.maxspeed=maxspeed;
        this.maxload=maxload;
    }

    /**
     * Ferry()
     * Copy constructor sets a ferry's attributes to another ferry's attributes, by first calling the parent copy constructor
     * @param obj ferry object
     */
    public Ferry(Ferry obj)
    {
        this.maxspeed=obj.maxspeed;
        this.maxload=obj.maxload;
    }
    /**
     * equals() returns a boolean value, true if two ferry objects have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
     * @param obj Abstract object can be an object form any class
     * @return true or false
     * */
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        else return(this.maxload==((Ferry) obj).maxload && this.maxspeed==((Ferry) obj).maxspeed);

    }

    /**
     * toString() returns a string describing attributes of a ferry object
     * @return string
     */
    public String toString() {
        return "This Ferry has a maximum speed of "+maxspeed+" knots, and has a maximum load of "+maxload+" tons.";
    }
}


