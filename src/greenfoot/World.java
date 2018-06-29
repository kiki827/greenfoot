package greenfoot;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class World extends JFrame {

	ArrayList<Actor> actors = new ArrayList<Actor>();

	private JPanel p;
	private  int worldWidth;
	private  int worldheigth;

	public World(String title, int worldWidth, int worldHeght, int cellCize) {
		this.worldWidth = worldWidth;
		this.worldheigth =worldHeght;

		setTitle(title);
		setBounds(100, 100, worldWidth, worldHeght);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setLayout(null);

		this.setVisible(true);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
		System.out.println("Hello World");
	}

	public void addObject(Actor object, int x, int y) {

		actors.add(object);

		ImageIcon icon1 = new ImageIcon("./foxravit.png");
		object.label = new JLabel(icon1);
		object.label.setBounds(x, y,100, 100);
		p.add(object.label);
		p.repaint();

	}

	public void labelmove(Actor object, int x) {

		object.label.setLocation(object.getX() + x, object.getY());
		p.add(object.label);

	}

	public void act() {

		Iterator<Actor> iterator = actors.iterator();
        while(iterator.hasNext()) {

            Actor iactor=(Actor)iterator.next();


            iactor.act();

            p.repaint();
        }
	}

	public void getAllObject() {
		Iterator<Actor> iterator = actors.iterator();
		while (iterator.hasNext()) {

			Actor iactor = (Actor) iterator.next();
			System.out.println(iactor);
			System.out.println(iactor.getX());


		}
	}

	public int getWorldWidth() {
		return worldWidth;
	}

	public int getWorldheigth() {
		return worldheigth;
	}

	public <A> ArrayList<Object> getObjectsAt(int x,int y,java.lang.Class<A> cls){


		ArrayList<Object> ob = new ArrayList<>();
		Iterator<Actor> iterator = actors.iterator();
		while (iterator.hasNext()) {

			Actor iactor = (Actor) iterator.next();
			int iactorX=iactor.getX();
			int iactorY=iactor.getY();
			if(iactorX>=x&&iactorX<x+100&&iactorY>=y&&iactorY<=y+100){
				ob.add(iactor);
			}else if(iactorX+100>=x&&iactorX<x&&iactorY>=y&&iactorY<=y+100){
				ob.add(iactor);
			}
		}

		return ob;

	}




}
