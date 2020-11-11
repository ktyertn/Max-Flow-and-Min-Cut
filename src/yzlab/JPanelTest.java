package yzlab;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JPanel{
	BufferedImage image;
	int[][] graph; 
	int N,bNokta,sNokta;
	int diameter = 15;
	
	Random generator = new Random();
	
	public JPanelTest(int[][] graph , int N , int bNokta, int sNokta) {
		this.graph=graph;
		this.N=N;
		this.bNokta=bNokta;
		this.sNokta=sNokta;
	}
	
    @Override
    public void paintComponent(Graphics g) {
    	
    	int []x = new int[N];
    	int []y = new int[N];
    	
    	for(int count = 0; count < N; count++) {
    		if(count==bNokta-1) {
    			x[count]= 35;
        		y[count]= (N*100)/2;
        		g.drawString(String.valueOf(bNokta),(x[count]+(diameter/2))-2 , y[count]+30);
        		g.drawOval(x[count], y[count], diameter, diameter);
    		}else if(count==sNokta-1) {
    			x[count]= (N*100)-50;
        		y[count]= (N*100)/2;
        		g.drawString(String.valueOf(sNokta),(x[count]+(diameter/2))-2 , y[count]+30);
        		g.drawOval(x[count], y[count], diameter, diameter);
    		}else {    			
    			x[count]= generator.nextInt((N-2)*100)+100;
        		y[count]= generator.nextInt((N-1)*100);
        		g.drawString(String.valueOf(count+1),(x[count]+(diameter/2))-2 , y[count]+30);
        		g.drawOval(x[count], y[count], diameter, diameter);
    		}
    
    	
    	}
    	for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(graph[i][j] != 0) {
					g.drawString(String.valueOf(graph[i][j]),(x[i]+x[j])/2 , (y[i]+y[j])/2);
					g.drawLine(x[i]+(diameter/2),y[i]+(diameter/2),x[j]+(diameter/2),y[j]+(diameter/2));
				}
			}
		}
        // Draw Tree Here
        /*try {
        	
            image = ImageIO.read(new File("C:\\Users\\milan\\Desktop\\2.png"));
            ImageObserver imageObserver = new ImageObserver() {
                @Override
                public boolean imageUpdate(Image image, int i, int i1, int i2, int i3, int i4) {
                    return true;
                }
            };
            for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(graph[i][j] != 0) {
						g.drawImage(image,(j+1)*100,(i+1)*100,100,15,imageObserver );
					}
				}
			}
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //g.drawLine(300,400,50,50);
    }
	
}
