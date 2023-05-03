/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package TrainAndTram;
import Metro.Metro;

/**
 * Tram class creates Tram objects with number of wheels, maximum speed, number of vehicles,starting and destination stations ,number of stations between them  and year of creation attributes
 * @author raniam
 * @version 1.0
 *
 */
public class Tram extends Metro {
    private int year_of_creation;

    /**
     * getYear_of_creation() returns year of creation
     * @return year of creation
     */
    public int getYear_of_creation() {
        return year_of_creation;
    }

    /**
     * setTotal_num_of_stops(() sets year of creation to the parameter value
     *
     * @param year_of_creation year of creation
     */
    public void setYear_of_creation(int year_of_creation) {
        this.year_of_creation = year_of_creation;
    }

    /**
     * Tram()
     * Default constructor that calls the parent default constructor, then sets year of creation to default value
     */
    public Tram(){
        super();
        year_of_creation=2021;
    }

    /**
     *Tram()
     * Parameter constructor that sets number of wheels, maximum speed, number of vehicles,starting and destination stations and number of stops between them by calling parent parameter constructor, then it sets the year of creation attribute to passed value
     * @param wheels number of wheels
     * @param maxspeed maximum speed of tram
     * @param number_of_vehicles number of vehicles of tram
     * @param starting_station starting station of tram
     * @param destination_station destination station of tram
     * @param total_num_of_stops number of stops between starting and destination stations
     * @param year_of_creation year of creation of tram
     */
    public Tram(int wheels,double maxspeed, int number_of_vehicles,String starting_station,String destination_station,int total_num_of_stops,int year_of_creation)
    {
        super(wheels,maxspeed, number_of_vehicles,starting_station,destination_station,total_num_of_stops);

        this.year_of_creation=year_of_creation;
    }

    /**
     * Tram()
     * Copy constructor that sets a tram's attributes to another tram's attributes, by first calling the parent copy constructor
     * @param obj tram object
     */
    public Tram(Tram obj)
    {
        super(obj);
        this.year_of_creation=obj.year_of_creation;
    }

    /**
     * equals() returns a boolean value, true if two tram objects have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
     * @param obj Abstract object can be an object form any class
     * @return true or false
     * */
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        else return (super.equals(obj) && this.year_of_creation==((Tram) obj).year_of_creation);


    }
    /**
     * toString() returns a string describing attributes of a tram object
     * @return string
     */
    public String toString() {
        return "This Tram which was created in year "+year_of_creation+", has "+wheels+" wheels, has a maximum speed of "+maxspeed+" km/h. " +
                "It has "+number_of_vehicles+" vehicles and its starting and destination stations are "+starting_station+" and "+destination_station+
                ". There are "+total_num_of_stops+" stops between both stations.";
    }
}
