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
 * Main2 class includes two static methods, one that deep copies the transportation objects of an array into another array.
 * The other method is where an array of transportation objects is created.
 * Then, the copyTheObjects() method is called.
 * @author raniam
 * @version 1.0
 *
 */

public class Main2 {

    /**
     * copyTheObjects() is supposed to return a deep copy of passed array. Then it calls the toString() method for each object within the copy array.
     * @param arr passed array of transportation objects
     */

        public static void copyTheObjects(Transportation[] arr)
         {
            Transportation[] copiedarray=new Transportation[arr.length];

            for(int i=0;i<arr.length;i++) {

                copiedarray[i] = new Transportation(arr[i]);
            }

            for(int i=0;i<copiedarray.length;i++)
            {
                System.out.println(copiedarray[i].toString());
            }

        }

    /**
     * main() is where the array of transportation objects is created. Array1 includes 16 objects, at least 1 from each class.
     * The copyTheObjects() is then called for Array1.
     * @param args arguments
     */
        public static void main(String[] args) {
            //Array different objects at least 1 from each class
            Transportation [] Array1=new Transportation[16];
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


            copyTheObjects(Array1);



        }



    }
