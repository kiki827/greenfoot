package garden;

import greenfoot.Actor;
import greenfoot.World;

public class Greenfoot {
	 static World w;
	public static void main (String []args){
		w=new Garden();

		Actor.setWorld(w);

		runContorole(1000);


	}

	public static  void runContorole(int times){


		for(int i=times;i>=0;i--){

			w.act();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}

	}

}
