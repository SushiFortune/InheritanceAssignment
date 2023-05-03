/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package Aircrafts;

import Transportation.Transportation;
/**
 * Aircraft class creates Aircraft objects with price and maximum elevation attributes
 * @author raniam
 * @version 1.0
 *
 */
public class Aircraft extends Transportation {
    protected double price;
    protected double maxelevation;

    /**
     * getMaxelevation() returns maximum elevation of an aircraft
     * @return maximum elevation of an aircraft
     */
    public double getMaxelevation() {
        return maxelevation;
    }
    /**
     * setMaxelevation() sets maximum elevation of an aircraft to the parameter value
     *
     * @param maxelevation passed maximum elevation value
     */
    public void setMaxelevation(double maxelevation) {
        this.maxelevation = maxelevation;
    }
    /**
     * setPrice() sets price of an aircraft to the parameter value
     *
     * @param price passed price value
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * getPrice() returns price of an aircraft
     * @return  price of an aircraft
     */
    public double getPrice() {
        return price;
    }

    /**
     * Aircraft()
     * Default constructor that sets price and maximum elevation of an aircraft to default values
     */
    public Aircraft(){
        price=100000;
        maxelevation=10000;
    }
    /**
     * Aircraft()
     * Parameter constructor that sets price and maximum elevation of an aircraft to passed values
     * @param price price of aircraft
     * @param maxelevation maximum elevation of aircraft
     */
    public Aircraft(double price,double maxelevation)
    {
        this.price=price;
        this.maxelevation=maxelevation;
    }

    /**
     * Aircraft()
     * Copy constructor that sets an aircraft 's attributes to another aircraft's attributes
     * @param obj Aircraft object
     */
    public Aircraft(Aircraft obj)
    {
        this.price=obj.price;
        this.maxelevation=obj.maxelevation;
    }
    /**
     * equals() returns a boolean value, true if two aircraft objects have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
     * @param obj Abstract object can be an object form any class
     * @return true or false
     * */
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        else return(this.price==((Aircraft) obj).price && this.maxelevation==((Aircraft) obj).maxelevation);

    }
    /**
     * toString() returns a string describing attributes of an aircraft object
     * @return string
     */
    public String toString() {
        return "This Aircraft is worth "+price+"$, and has a maximum elevation of "+maxelevation+" ft.";
    }
}
