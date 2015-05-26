/**
 * Created by Mert on 1-5-2015.
 */
public class problem2 {

    public problem2() {

        int a = 0;
        int b = 1;
        int c = 0;
        int result = 0;
        boolean run = true;

        while(run = true){
            if(c >= 4000000){

                System.out.println(a);
                System.out.println(result);
                break;

            }

            if(c%2==0){
                result += c;

            }
            c = a + b;
            a = b;
            b = c;

        }


    }

}



