import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by Mert on 1-5-2015.
 */
public class problem3app {

    private Long test;
    private java.util.List<Long> list = new ArrayList<Long>();
    private java.util.List<Long> list2 = new ArrayList<Long>();



    public problem3app() {
        JFrame frame = new JFrame("Primenumber");
        frame.setSize(750, 750);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);

        JPanel borderPanel = new JPanel();
        borderPanel.setBackground(Color.RED);

        JButton prime = new JButton("Is it a primenumber?");
        JButton calc = new JButton("Calculate");
        JLabel enterhere = new JLabel("This is just some test nigga");
        final JTextField number = new JTextField(30);

        frame.add(panel,BorderLayout.CENTER);
        frame.add(borderPanel,BorderLayout.SOUTH);
        borderPanel.add(prime);
        borderPanel.add(calc);
        panel.add(enterhere);
        panel.add(number);
        frame.setVisible(true);

        number.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = number.getText();
                Long b = Long.parseLong(input);
                setTest(b);
                calc();
            }
        });


        }


    public long getTest() {
        return test;
    }

    public void setTest(long i) {
        test = i;
    }

    public void calc() {

        list.clear();
        list2.clear();


        for (long i = 2; i < getTest(); i++) {
            boolean primenum = true;
            for (long j = 2; j<i; j++){

                if(i%j==0){
                    primenum = false;
                }
            }
            if(primenum) {
                list.add(i);
                //System.out.println("is a primenumber "+i);

                if(test%i==0){

                    list2.add(i);
                    System.out.println(i);

                }
            }

        }
    }

}
