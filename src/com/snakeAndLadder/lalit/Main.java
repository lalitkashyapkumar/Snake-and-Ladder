package com.snakeAndLadder.lalit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	public static Scene scene;
	public static PlayButton button;
	public static PlayButton sys;
	public static PlayButton roleDice;
	public static Play player;
	public static int prePosSys=0;
	public static int prePosPlay=0;
	public static int x=0;
	public static int y=0;
	public static int dice = 0;
	public static void main(String[] args){
		
		int []cb = new int[100];
		//*********ladders**********//
		cb[3] = 51;
		cb[6] = 27;
		cb[20] = 70;
		cb[36] = 55;
		cb[63] = 95;
		cb[68] = 98;
		
		//*********snake**********//
		cb[25] = -20;
		cb[34] = -34;
		cb[47] = -28;
		cb[65] = -13;
		cb[87] = -30;
		cb[91] = -30;
		cb[99] = -30;
		
		
		JFrame mainframe = new JFrame("Snake and Ladder by Lalit Kumar");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setSize(610, 710);
		mainframe.setLocationRelativeTo(null);
		mainframe.setResizable(false);
		mainframe.setAlwaysOnTop(true);
		
		scene = new Scene();
		player = new Play();
		button = new PlayButton(Color.green);
		sys = new PlayButton(Color.red);
		roleDice = new PlayButton(Color.pink);
		scene.setLayout(null);
		scene.add(button);
		scene.add(sys);
		scene.add(roleDice);
		roleDice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				playGame(cb);
			}
			
		});
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				playGame(cb);
			}
			
		});
		
		mainframe.setContentPane(scene);
		mainframe.setVisible(true);
	}
	static void playGame(int []cb) {
		prePosSys += player.createCb(cb, prePosSys);
		scene.setPval(dice);
		xyPos(prePosSys);
		sys.setX(x+10);
		sys.setY(y+10);
//		System.out.print(prePosPlay+" ");
		prePosPlay += player.createCb(cb, prePosPlay);
		
		scene.setSval(dice);
		xyPos(prePosPlay);
		System.out.println(prePosPlay +" "+x+" "+y);
		button.setX(x+10);
		button.setY(y+10);
		
		scene.repaint();
		button.repaint();
		if(prePosPlay == 100) {
			JOptionPane.showMessageDialog(scene, "you win");
			prePosSys = 0;
			prePosPlay = 0;
		}
		sys.repaint();
		if(prePosSys == 100) {
			JOptionPane.showMessageDialog(scene, "Computer win");
			prePosSys = 0;
			prePosPlay = 0;
		}
	}
	static void xyPos(int pos){
		if(pos==0) {
			pos=1;
		}
		int ycount = pos/10;
		int xcount = pos%10;
		
		x = (xcount-1) * 60;
		if(pos>0 && pos%10==0) {
			x = 540;
		}
		y = (9-ycount) * 60;
		if(pos>0 && pos%10==0) {
			y = (9-ycount+1) * 60;
		}
	}
}
