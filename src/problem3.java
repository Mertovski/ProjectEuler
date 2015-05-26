import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mert on 1-5-2015.
 */
public class problem3 {

    public problem3() {

        List<Long> list = new ArrayList<Long>();
        List<Long> list2 = new ArrayList<Long>();


        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        Long a = input.nextLong();

        for (long i = 2; i < a; i++) {
            boolean primenum = true;
            for (long j = 2; j<i; j++){

                if(i%j==0){
                    primenum = false;
                }
            }
            if(primenum) {
                list.add(i);
                //System.out.println("is a primenumber "+i);

                if(a%i==0){

                    list2.add(i);
                    System.out.println(i);

                }
            }


        }

    }
}