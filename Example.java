//import dependent class
import javax.swing.*;
import java.awt.*;

/**
 * This is an example class of CSc2010 homework 9
 * Created by Bing Li on 4/22/15.
 */
public class Example extends JFrame {

    /**
     * This is the constructor of Example class
     */
    public Example(){
        //enable X button
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //Set window's size, the parameters are width and height
        this.setSize(500,500);

        //Create panel for drawing
        JPanel panel = new JPanel(){
            /**
             * Override paintComponent method
             * @param g
             */
            public void paintComponent(Graphics g){
                super.paintComponent(g);

                // set background color of panel
                this.setBackground(Color.yellow);

                //draw a blue rectangle
                //set color
                g.setColor(Color.blue);
                //draw rectangle, the parameters are x, y(coordinate), width and height(size)
                g.fillRect(50,50,50,50);

                //draw a black circle
                //set color
                g.setColor(Color.black);
                //draw circle, the parameters are x, y(coordinate), width and height(size)
                g.fillOval(200,200,50,50);


                //paint result
                this.repaint();
            }
        };
        //add panel to window
        this.add(panel);
        //display window
        this.setVisible(true);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args){
        new Example(); // create your container

    }
}
