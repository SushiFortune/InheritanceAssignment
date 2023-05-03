/*      Rania Maoukout 40249281
        COMP249
        Assignment 2
        Saturday, March 4th 2023
*/

import Aircrafts.Aircraft;
import Aircrafts.WW2Airplane;
import Ferry.Ferry;
import Metro.Metro;
import Monowheel.Monowheel;
import TrainAndTram.Train;
import TrainAndTram.Tram;
import Transportation.Transportation;
import WheeledTransp.WheeledTransportation;

/**
 * Main class includes two static methods, one to find least and most expensive aircraft in an array of diverse transportation objects.
 * The other method is where 2 arrays of transportation objects are created. The second array doesn't include any aircraft object. The toString() method is called for each object of the first array and equal method is called to validate it.
 * Then, the findLeastAndMostExpensiveAircraft() is called for both arrays.
 * @author raniam
 * @version 1.0
 *
 */

public class Main {
    /**
     * findLeastAndMostExpensiveAircraft() returns a string of most and least expensive aircraft in an array of transportation objects after the array is sorted
     * @param arr arguments
     * @return string
     */
    public static String findLeastAndMostExpensiveAircraft(Transportation[] arr)
    {
        String s=" ";
        Aircraft min= null;
        Aircraft max=null;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getClass()== Aircraft.class) {
                min= (Aircraft) arr[i];
                max= (Aircraft) arr[i];
                break;
            }
            else
                continue;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getClass()==Aircraft.class) {
                Aircraft temp= (Aircraft) arr[i];
                if (min.getPrice() > temp.getPrice())
                {
                    min=temp;
                }
                else
                    continue;

            }
        }
        if(min!=null && max!=null)
        return "The least expensive aircraft is "+min.toString()+ " The most expensive aircraft is "+max.toString();
        else if(min!=null && max!=null && min==max)
            return "The least expensive and most expensive aircraft is "+min.toString();
        else
            return "No aircraft object in this array";
    }

    /**
     * main() is where 2 arrays are created. Array1 includes 16 objects, at least two from each class.
     * Array1 includes 16 objects, two from each class, with no aircraft objects
     * The toString() method is called for each object of the first array and equals() method is called to compare 2 objects from different classes, 2 objects from same class but different values and 2 objects with similar values
     * The findLeastAndMostExpensiveAircraft() is then called for both arrays.
     * @param args arguments
     */

    public static void main(String[] args) {
        //Array different objects at least 1 from each class
        Transportation[] Array1=new Transportation[16];
        Array1[0]=new WheeledTransportation(4,300);
        Array1[1]=new WheeledTransportation(6,200);
        Array1[2]=new Train(30,400,6,"Montreal","New York");
        Array1[3]=new Train(30,400,8,"Montreal","New York");
        Array1[4]=new Metro(20,500,8,"Montreal","Quebec",5);
        Array1[5]=new Metro(26,290,10,"Montreal","Downtown",6);
        Array1[6]=new Tram();
        Array1[7]=new Tram(30,280,13,"Vermont","Philly",10,2020);
        Array1[8]=new Monowheel(1,350,800);
        Array1[9]=new Monowheel(1,350,800);
        Array1[10]=new Ferry(15,1400);
        Array1[11]=new Ferry(21,1900);
        Array1[12]=new Aircraft(200000,15000);
        Array1[13]=new Aircraft();
        Array1[14]=new WW2Airplane(100000,12000,true);
        Array1[15]=new WW2Airplane(150000,13000,false);

        //Array without aircraft objects
        Transportation [] Array2=new Transportation[16];
        Array2[0]=new WheeledTransportation(4,300);
        Array2[1]=new WheeledTransportation(6,200);
        Array2[2]=new Train(30,400,6,"Montreal","New York");
        Array2[3]=new Train(30,400,8,"Montreal","New York");
        Array2[4]=new Metro(20,500,8,"Montreal","Quebec",5);
        Array2[5]=new Metro(26,290,10,"Montreal","Downtown",6);
        Array2[6]=new Tram();
        Array2[7]=new Tram(30,280,13,"Vermont","Philly",10,2020);
        Array2[8]=new Monowheel(1,350,800);
        Array2[9]=new Monowheel(1,350,800);
        Array2[10]=new Ferry(15,1400);
        Array2[11]=new Ferry(21,1900);
        Array2[12]=new Ferry();
        Array2[13]=new WW2Airplane();
        Array2[14]=new WW2Airplane(100000,12000,true);
        Array2[15]=new WW2Airplane(150000,13000,false);

        for(int i=0;i< Array1.length;i++)
        {System.out.println(Array1[i]);}

        System.out.println(Array1[10].equals(Array1[14])); //Compare ferry object to WW2Airplane object
        System.out.println( Array1[12].equals( Array1[13])); //Compare 2 aircraft objects
        System.out.println(Array1[8].equals(Array1[9])); //Compare 2 monowheel objects with similar attributes*/

        System.out.println(findLeastAndMostExpensiveAircraft(Array1));
        System.out.println(findLeastAndMostExpensiveAircraft(Array2));

    }


}