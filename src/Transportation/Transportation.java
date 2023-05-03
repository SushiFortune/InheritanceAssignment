/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package Transportation;

/**
 * Transportation class creates Transportation objects with 0 attributes, it is the main parent class
 * @author raniam
 * @version 1.0
 *
 */
public class Transportation {

    /**
     * Transportation()
     * Default constructor
     */
    public Transportation() {

    }

    /**
     * Transportation()
     * Copy constructor that sets a Transportation object's attributes to another transportation object's attributes
     * @param o transportation object
     */
    public Transportation(Transportation o) {
    }

    /**
     * toString() returns a string saying the Transportation object is used for transportation
     * @return string
     */
    @Override
    public String toString() {
        return "This is used for Transportation";
    }
}

