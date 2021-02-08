package com.snakeAndLadder.lalit;

import java.util.Random;

public class Play{
	public int createCb(int []a, int prepos){
		
		Random dice = new Random();
		int posDice = dice.nextInt(7);
		while(posDice ==0 ) {
			posDice = dice.nextInt(7);
		}
		Main.dice = posDice;
//		System.out.println("rand "+posDice+" "+prepos+" "+a[posDice+prepos]);
		if(posDice+prepos > 100 ) {
			return 0;
		}
		if(posDice+prepos == 100 ) {
			return posDice;
		}
		if(a[posDice+prepos]>0) {
			//ladder
			
			return a[posDice+prepos] - prepos;
		}
		if(a[posDice+prepos] < 0 ) {
			return posDice + a[posDice+prepos];
		}//snake
		
		return posDice;
	}
}
