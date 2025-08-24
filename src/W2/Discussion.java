package W2;
import java.awt.*;

public class Discussion {

    public static class customCheckbox extends Checkbox {

        public customCheckbox() {
            setBounds(50, 50, 100, 40);
            setLabel("Default");
            setForeground(Color.red);
        }
        public customCheckbox(String label) {
            setLabel(label);
            setBounds(50, 100, 100, 40);
            setForeground(Color.blue);
        }
        @Override
        public void setLabel(String label) {
            super.setLabel(label);
            setForeground(Color.green);
            System.out.println("checkbox Label updated to:" + label );
        }
    }




    public static void main(String[] args) {
        Frame frame = new Frame("Week 2 Disccussion");

        customCheckbox checkOne = new customCheckbox();
        customCheckbox checkTwo = new customCheckbox("Check Two");
        customCheckbox checkThree = new customCheckbox();
        checkThree.setLabel("Check Three");
        checkThree.setBounds(50, 150, 120, 40);




        // Add components to the frame
        frame.add(checkOne);
        frame.add(checkTwo);
        frame.add(checkThree);


        // Frame settings
        frame.setSize(300, 200);
        frame.setLayout(null);



        frame.setVisible(true);

    }
}
