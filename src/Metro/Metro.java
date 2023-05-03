/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

package Metro;
import TrainAndTram.Train;

/**
 * Metro class creates Metro objects with number of wheels, maximum speed, number of vehicles,starting and destination stations, and number of stations between them attributes
 * @author raniam
 * @version 1.0
 *
 */
 public class Metro extends Train{
    protected int total_num_of_stops;

     /**
      * getTotal_num_of_stops() returns number of stops between starting and destination stations
      * @return number of stops between stations
      */

     public int getTotal_num_of_stops() {
         return total_num_of_stops;
     }
     /**
      * setTotal_num_of_stops(() sets number of stops between starting and destination stations to the parameter value
      *@param total_num_of_stops number of stops between stations
      */
     public void setTotal_num_of_stops(int total_num_of_stops) {
         this.total_num_of_stops = total_num_of_stops;
     }


     /**
      * Metro()
      * Default constructor that calls the parent default constructor, then sets number of stops between starting and destination stations to default value
      */
     public Metro(){
        super();
        total_num_of_stops=2;
    }

     /**
      *Metro()
      * Parameter constructor that sets number of wheels, maximum speed, number of vehicles,starting and destination stations by calling parent parameter constructor, then it sets the number of stops between stations to passed value
      * @param wheels number of wheels
      * @param maxspeed maximum speed of metro
      * @param number_of_vehicles number of vehicles of metro
      * @param starting_station starting station of metro
      * @param destination_station destination station of metro
      * @param total_num_of_stops number of stops between starting and destination stations
      */
    public Metro(int wheels,double maxspeed, int number_of_vehicles,String starting_station,String destination_station,int total_num_of_stops)
    {
        super(wheels,maxspeed, number_of_vehicles,starting_station,destination_station);
        this.total_num_of_stops=total_num_of_stops;
    }
     /**
      * Metro()
      * Copy constructor sets a metro's attributes to another metro's attributes, by first calling the parent copy constructor
      * @param obj metro object
      */
    public Metro(Metro obj)
    {
        super(obj);
        this.total_num_of_stops=obj.total_num_of_stops;
    }

     /**
      * equals() returns a boolean value, true if two metro objects  have the same attributes; and false if they either don't have the same attributes, or the passed object is not from the same class or is null
      * @param obj Abstract object can be an object form any class
      * @return true or false
      * */
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        else return (super.equals(obj) && this.total_num_of_stops==((Metro) obj).total_num_of_stops);

    }

     /**
      * toString() returns a string describing attributes of a metro object
      * @return string
      */
    public String toString() {
        return "This Metro has "+wheels+" wheels, has a maximum speed of "+maxspeed+" km/h. " +
                "It has "+number_of_vehicles+" vehicles and its starting and destination stations are "+starting_station+" "+destination_station+
                ". There are "+total_num_of_stops+" stops between both stations.";
    }
}
