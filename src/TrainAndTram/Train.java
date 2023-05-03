/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package TrainAndTram;

import WheeledTransp.WheeledTransportation;

/**
 * Train class creates Train objects with number of wheels, maximum speed, number of vehicles, starting and destination stations attributes
 * @author raniam
 * @version 1.0
 *
 */
public class Train extends WheeledTransportation {
    protected int number_of_vehicles;
    protected String starting_station;
    protected String destination_station;

    /**
     * getNumber_of_vehicles() returns number of vehicles
     * @return number of vehicles
     */
    public int getNumber_of_vehicles() {
        return number_of_vehicles;
    }

    /**
     * setNumber_of_vehicles() sets number of vehicles  to the parameter value
     *
     * @param number_of_vehicles passed number of vehicles
     */
    public void setNumber_of_vehicles(int number_of_vehicles) {
        this.number_of_vehicles = number_of_vehicles;
    }
    /**
     * getStarting_station() returns the starting station
     * @return the starting station
     */
    public String getStarting_station() {
        return starting_station;
    }

    /**
     * setStarting_station() sets the starting station to the parameter value
     *
     * @param starting_station passed the starting station
     */
    public void setStarting_station(String starting_station) {
        this.starting_station = starting_station;
    }
    /**
     * getDestination_station() returns destination station
     * @return the destination station
     */
    public String getDestination_station() {
        return destination_station;
    }

    /**
     * setdestination_station() sets the destination station to the parameter value
     *
     * @param destination_station passed the destination station
     */
    public void setDestination_station(String destination_station) {
        this.destination_station = destination_station;
    }

    /**
     * Train()
     * Default constructor that calls the parent default constructor, then sets number of vehicles, the starting and destination stations and number of stops between stations to default values
     */
    public Train()
    {
        super();
        this.number_of_vehicles=6;
        this.starting_station="Montreal";
        this.destination_station="New York";
    }

    /**
     *Train()
     * Parameter constructor that sets number of wheels, maximum speed,by calling the parent parameter constructor, then it sets the attributes of number of vehicles,starting and destination station to passed values
     * @param wheels number of wheels
     * @param maxspeed maximum speed of train
     * @param number_of_vehicles number of vehicles of train
     * @param starting_station starting station of train
     * @param destination_station destination station of train
     */
    public Train(int wheels,double maxspeed, int number_of_vehicles,String starting_station,String destination_station)
    {
        super(wheels,maxspeed);
        this.number_of_vehicles=number_of_vehicles;
        this.starting_station=starting_station;
        this.destination_station=destination_station;
    }

    /**
     * Train()
     * Copy constructor that sets a train's attributes to another train's attributes, by first calling the parent copy constructor
     * @param obj train object
     */
    public Train(Train obj)
    {
        super(obj);
        this.number_of_vehicles=obj.number_of_vehicles;
        this.starting_station= obj.starting_station;
        this.destination_station=obj.destination_station;
    }

    /**
     * equals() returns a boolean value, true if two train objects have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
     * @param obj Abstract object can be an object form any class
     * @return true or false
     * */
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        else
            return (super.equals(obj) && this.number_of_vehicles == ((Train) obj).number_of_vehicles && this.destination_station == ((Train) obj).destination_station && this.starting_station == ((Train) obj).starting_station);
    }

    /**
     * toString() returns a string describing attributes of a train object
     * @return string
     */
    public String toString() {
        return "This train has "+wheels+" wheels, has a maximum speed of "+maxspeed+"km/h. " +
                "It has "+number_of_vehicles+" vehicles and its starting and destination stations are "+starting_station+" and "+destination_station;
    }
}
