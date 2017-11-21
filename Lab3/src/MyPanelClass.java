import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        //g.setColor(Color.GRAY);
                        //g.fillRect(x1, y1, width+1, height+1);
                        //Draw a border
                        //g.setColor(Color.RED);
                        //g.drawRect(x1, y1, width, height);
                        //Draw a second border
                        //g.setColor(Color.CYAN);
                        //g.drawRect(x1+3, y1+3, width-7, height-7);
                        //Draw a diagonal line
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        //Draw a diagonal line in opposite direction
                        //g.setColor(Color.GREEN);
                        //g.drawLine(x1, y2, x2, y1);
                        //Draw an oval
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval((width-55)/2, (height-55)/2, 55, 55);
                        //Polygon p = new Polygon();
                        //p.addPoint(x1 + 5, y1 + 25);
                        //p.addPoint(x1 + 20, y1 + 10);
                        //p.addPoint(x1 + 35, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 25);
                        //g.setColor(Color.YELLOW);
                        //g.fillPolygon(p);
                        //Polygon p2 = new Polygon();
                        //p2.addPoint(x1 + 25, y1 + 73);
                        //p2.addPoint(x1 + 41, y1 + 73);
                        //p2.addPoint(x1 + 47, y1 + 58);
                        //p2.addPoint(x1 + 53, y1 + 73);
                        //p2.addPoint(x1 + 69, y1 + 73);
                        //p2.addPoint(x1 + 56, y1 + 83);
                        //p2.addPoint(x1 + 61, y1 + 98);
                        //p2.addPoint(x1 + 47, y1 + 88);
                        //p2.addPoint(x1 + 34, y1 + 98);
                        //p2.addPoint(x1 + 38, y1 + 83);
                        //g.setColor(Color.WHITE);
                        //g.drawPolygon(p2);
                        
                        //Draw Rectangles
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height/5);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height/5, width+1, 2*height/5);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1, 2*height/5, width+1, 3*height/5);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, 3*height/5, width+1, 4*height/5);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1, 4*height/5, width+1, height);
                        
                        //Draw Triangle
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1);
                        p.addPoint(width/2, height/2);
                        p.addPoint(x1, height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        //Draw Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 17, y1 + 70);
                        p2.addPoint(x1 + 34, y1 + 70);
                        p2.addPoint(x1 + 40, y1 + 50);
                        p2.addPoint(x1 + 46, y1 + 70);
                        p2.addPoint(x1 + 63, y1 + 70);
                        p2.addPoint(x1 + 50, y1 + 80);
                        p2.addPoint(x1 + 55, y1 + 98);
                        p2.addPoint(x1 + 40, y1 + 88);
                        p2.addPoint(x1 + 30, y1 + 98);
                        p2.addPoint(x1 + 33, y1 + 80);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
            }
}