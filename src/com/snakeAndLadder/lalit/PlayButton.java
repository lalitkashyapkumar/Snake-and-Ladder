package com.snakeAndLadder.lalit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PlayButton extends JButton {
		private int x;
		private int y;
		private ImageIcon green;
	
	  public PlayButton(Color label) {
		super("");
	    this.x = 10;
	    this.y = 550;
	    
	    if(label == Color.pink) {
	    	green = new  ImageIcon(getClass().getResource("/images/dice.png"));
	    	this.x = 270;
	    	this.y = 605;
	    	setIcon(green);
	    	
	    }
	    
	    Dimension size = getPreferredSize();
	    setBackground(label);
	    setFocusable(false);
	    if(label == Color.pink) {
	    	size.width = size.height = Math.min(size.width, size.height);
	    }
	    else
	    	size.width = size.height = Math.max(size.width, size.height);
	    
	    setBounds(this.x, this.y, size.width, size.height);
	    setPreferredSize(size);
	    setContentAreaFilled(false);
//	    Thread repaintThread= new Thread(new ReCreate());
//		repaintThread.start();
	}
	//********************Setter******************//  
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	protected void paintComponent(Graphics g) {
		
	    if (getModel().isArmed()) {
	      g.setColor(Color.red);
	    } else {
	      g.setColor(getBackground());
	    }
	    g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
	    Dimension size = getPreferredSize();
	    size.width = size.height = Math.max(size.width, size.height);
	    setBounds(this.x, this.y, size.width, size.height);
	    super.paintComponent(g);
	  }
	 
	  protected void paintBorder(Graphics g) {
	    g.setColor(Color.darkGray);
	    g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
	  }
	 
	  // Hit detection.
	  Shape shape;
	 
	  public boolean contains(int x, int y) {
	    if (shape == null || !shape.getBounds().equals(getBounds())) {
	      shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
	    }
	    return shape.contains(x, y);
	  }
}