/**
 * Created by Mert on 1-5-2015.
 */
public class problem1  {


    public problem1() {

        int result = 0;
        int a = 0;

        for(int i = 0;i<1000;i++){


            if((a%3)==0 || (a%5)==0) {
                result += a;
                System.out.println("ik heb er " + a + " bijgevoegd en de resultaat is nu " +result);
            }


            a++;

        }


        System.out.println("de eind resultaat na " +a+ " keer is " + result);



    }
}
