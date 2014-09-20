/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muse_game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Marina
 */
public class Muse_Game extends JPanel{

    /**
     * @param args the command line arguments
     */
    protected int count = 0;
    
        public Muse_Game(){
            t.start();
        }
    
        Timer t = new Timer(200, new ActionListener(){
        @Override
           public void actionPerformed(ActionEvent e){
             repaint();            
           }
        }); 
    
        @Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
                
                count = count + 5;
		g2d.fillRect(50, count, 30, 30);

		//g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));

                GeneralPath cubo = new GeneralPath();
                g2d.setColor(Color.ORANGE);
                g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.CAP_ROUND));
                cubo.moveTo(300, 0);
                cubo.lineTo(300,600);
                g2d.draw(cubo);
                
                
	}
        
        
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Muse Game");
                frame.add(new Muse_Game());
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
