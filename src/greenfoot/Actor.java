package greenfoot;

import javax.swing.JLabel;



public class Actor {

	static World w;
	private int x;
	private int y;
	public JLabel label;

	public Actor(int x,int y){

		this.x=x;
		this.y=y;
	}
	public Actor() {

	}

	public void act(){
		System.out.println("Actoract");

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
		}else if(w.getWorldW()>this.x+100){
			return true;
		}
		return false;
	}

	public void setLocation(int x,int y){

	}

	public void move(int distance){
		this.x+=distance;
		w.labelmove(this,distance);



	}

	public void turn (int amount){

	}

	protected boolean isTouching(java.lang.Class<?> cls){

		return false;
	}
	public static void setWorld(World world){
		w=world;
	}




}
