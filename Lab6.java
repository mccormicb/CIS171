//Program: Lab6
//Author: Braden McCormic
//Date Modified: 2/14/22
//Purpose: Use Java DrawingPanel to create an image.
import java.awt.*;
public class Lab6{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(300, 200);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.CYAN);
        int width = 20; 
        for(int i = 0; i < 6; i++){
            g.drawRect(50,50,width, width);
            width += 20;
        }
        g.setColor(Color.RED);
        g.drawLine(50,50,170,170);

    }
}