import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mert on 2-5-2015.
 */
public class problem7 {

    public problem7() {


        List<Long> list = new ArrayList<Long>();
        long i = 2;
        boolean start = true;

        while(start = true){

            i++;
            boolean primenum = true;

            for(long j = 2;j<i;j++){

                if(i%j==0){
                    primenum = false;
                }

            }
            if(primenum) {
                list.add(i);
            }

            if(list.size()== 10000){
                System.out.println(i);
                break;
            }




        }


    }
}
