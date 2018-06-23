package garden;

import greenfoot.Actor;

public class Fox extends Actor {

	int movingSpeed=1;

	public Fox() {

		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Fox( int x, int y) {

		super( x, y);
		// TODO 自動生成されたコンストラクター・スタブ
	}



	@Override
	public void act() {

		System.out.println("fox"+getID());
		move(movingSpeed);
		if(isAtEdge()){
			movingSpeed*=-1;
		}
		System.out.println("endfox"+getID());

	}

}
