package com.snakeAndLadder.lalit;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Scene extends JPanel{
	
	private ImageIcon cbSnake;
	private Image imgCb;
	
	private ImageIcon green;
	private Image imgG;
	
	private ImageIcon red;
	private Image imgR;
	private int sval=0;
	private int pval=0;
	Scene(){
		super();
			
		cbSnake = new  ImageIcon(getClass().getResource("/images/cbSnake.png"));
		this.imgCb = this.cbSnake.getImage();
		
		green = new  ImageIcon(getClass().getResource("/images/green.png"));
		this.imgG = this.green.getImage();
		red = new  ImageIcon(getClass().getResource("/images/red.png"));
		this.imgR = this.red.getImage();
	}
	//********************Setter******************

	public void setSval(int sval) {this.sval = sval;}
	public void setPval(int pval) {this.pval = pval;}
	
	
	//*********Methods*************//
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics g2 = (Graphics2D)g;
		g2.drawImage(this.imgCb, 0, 0, null);
		((Graphics2D) g2).setStroke(new BasicStroke(3));
		g2.drawLine(305, 600, 305, 700);
		Font font = new Font("Serif", Font.PLAIN, 20);
	    g2.setFont(font);
	    g2.drawString("Player", 120, 625);
		g2.drawString("System", 415, 625);
		
		g2.drawImage(this.imgG, 132, 625, null);
		g2.drawImage(this.imgR, 415, 625, null);
		g2.drawString(sval+"", 150, 655);
		g2.drawString(pval+"", 435, 655);
	}
	
}
