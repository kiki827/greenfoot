package jankenanimal;

import java.util.List;
import java.util.Random;

import greenfoot.Actor;

public class JankenAnimal extends Actor implements Jankendekiru
{

	private int ID = IDGenerator.getid();
	JankenHand myHand;

	public JankenAnimal(int x, int y) {

		super( x, y);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void act() {
		move(1);
		if (isTouching(null)) {
			myHand = getHand();
			List<Object> io = getIntersectingObjects(null);
			if (!(io.get(0) instanceof Jankendekiru)) {
				turn(180);
			} else {// 相手もジャンケンができる
				JankenAnimal enemy = (JankenAnimal) io.get(0);
				JankenHand result = enemy.katta(myHand, ID, false);
				if (result != null) {
					katta(result, ID, true);
				}
			} // 自分のIDが小さいため接触をまつ
		}

		if (isAtEdge()) {
			turn(180);
		}
	}

	public JankenHand getHand() {
		Random rnd = new Random();
		int HandValue = rnd.nextInt(3);
		switch (HandValue) {
		case 0:
			return JankenHand.goo;
		case 1:
			return JankenHand.choki;
		case 2:
			return JankenHand.paa;
		}
		return null;
	}

	public JankenHand katta(JankenHand hand, int id, boolean boo) {
		JankenHand h1, h2;
		if (boo) {// 自分が渡したとき
			h1 = hand;
			h2 = myHand;
		} else {
			h1 = myHand;
			h2 = hand;
		}

		System.out.println("jan" + id + ":" + hand + "vs" + myHand);
		if (id > ID) {// 渡してきた側のIDが大きいとき
			switch (CmpHand(h1, h2)) {
			case 0:
				move(-3);
				break;
			case -1:
				turn(180);
				break;
			case 1:

			}

			if (boo) {// 自分が渡したとき
				return null;
			}
			return myHand;

		} else {// 渡してきた側のIDが小さいとき
			return null;
		}
	}

	private int CmpHand(JankenHand j1, JankenHand j2) {// ジャンケンの勝ち負けの判定
		JankenHand[] te = (JankenHand.values());
		if (j1 == j2) {
			return 0;// 相子
		} else if (j1.compareTo(j2) < 0 || (te[2].equals(j1) && te[0].equals(j2))) {
			return 1;// h1の勝ち
		} else {

			return -1;// h1の負け
		}
	}

}
