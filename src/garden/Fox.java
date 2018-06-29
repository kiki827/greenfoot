package garden;

import greenfoot.Actor;

public class Fox extends Actor {



	public Fox() {

		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Fox( int x, int y) {

		super( x, y);
		// TODO 自動生成されたコンストラクター・スタブ
	}



	@Override
	public void act() {

		move(1);


		if(isAtEdge()){
			turn(180);
		}
		if(isTouching(null)){
			turn(180);
			move(1);

			System.out.println(this.getX());
		}

	}

}
