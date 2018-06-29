package greenfoot;


import java.util.List;

import javax.swing.JLabel;



public class Actor {

	static World w;
	private int x;
	private int y;
	public JLabel label;
	private int kakudo;

	public Actor(int x,int y){
		kakudo=00;
		this.x=x;
		this.y=y;
	}
	public Actor() {

	}

	public void act(){


	}

	public int getX() throws java.lang.IllegalStateException{
		return this.x;
	}

	public int getY() throws java.lang.IllegalStateException{
		return this.y;
	}

	public boolean isAtEdge(){
		if(this.x<0||this.y<0){//左の壁か天井
			return true;
		}else if(w.getWorldWidth()<this.x+100){
			System.out.println("右の壁");
			return true;
		}else if(w.getWorldheigth()<this.y+150){
			System.out.println("下辺");
			return true;
		}
		return false;
	}

	public void setLocation(int x,int y){

	}

	public void move(int distance){

		double  radian = kakudo * Math.PI / 180;
		int moveY = (int)Math.sin(radian) * distance;
		int moveX = (int)Math.cos(radian) * distance;
		w.labelmove(this,0);
		this.x+=moveX;
		this.y+=moveY;



	}

	public void turn (int amount){
		kakudo+=amount;

	}


	protected boolean isTouching(java.lang.Class<?> cls){

		List<?> o=w.getObjectsAt(this.x, this.y, cls);

		o.remove(this);

		if(o.isEmpty()){
			return false;
		}else{
			return true;
		}

	}
	public static void setWorld(World world){
		w=world;
	}
	public List<Object> getIntersectingObjects(Object object) {
		return null;
	}




}
