import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mert on 2-5-2015.
 */
public class problem6 {

    public problem6(){

        int resultB = 0;

        int a = 0;
        int b = 0;

        for(int i = 0;i<101;i++){
            a += (i*i);

        }

        for(int i =0;i<101;i++){
            b += i;

        }

        resultB = b * b;
        System.out.println(resultB-a);

    }


}
