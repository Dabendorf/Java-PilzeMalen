package pilze;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Dies ist die Zeichenklasse des Projekts PilzeMalen, welche die Pilze erzeugt und graphisch darstellt.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class PilzeMalen {
	
	/**Programmfenster*/
	private JFrame frame1 = new JFrame("Fliegenpilze");
	/**Breite des Programmfensters*/
	private int frameWidth = 800;
	/**Hoehe des Programmfensters*/
	private int frameHeight = 500;
	/**Liste mit Fliegenpilzen*/
	private ArrayList<Fliegenpilz> fliegenpilze = new ArrayList<Fliegenpilz>();
	/**JPanel, auf welchem die Pilze dargestellt werden*/
	private JPanel painter = new JPanel() {
		@Override
	    public void paintComponent(Graphics g) {
			for(Fliegenpilz fp:fliegenpilze) {
				g.setColor(new Color(0xFFFFFF));
				g.fillRect(fp.getX()-fp.getStb()/2, fp.getY()-5, fp.getStb(), fp.getSth());
				g.setColor(new Color(0xAA0000));
				g.fillArc(fp.getX()-fp.getRad()/2, fp.getY()-fp.getRad()/2, fp.getRad(), fp.getRad(), 0, 180);
				g.setColor(new Color(0x000000));
				/*for(Punkt p:fp.getPunkte()) {
					g.fillOval(p.getX(), p.getY(), p.getBreite(), p.getHoehe());
				}*/
			}
	    }
	};
	
	public PilzeMalen(int numberOf) {
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setPreferredSize(new Dimension(frameWidth,frameHeight));
		frame1.setMinimumSize(new Dimension(frameWidth,frameHeight));
		frame1.setMaximumSize(new Dimension(frameWidth,frameHeight));
		frame1.setResizable(false);
		frame1.setBackground(new Color(0x1B1E24));
		
		Container cp = frame1.getContentPane();
		cp.setLayout(new GridLayout(1,1));
		cp.add(painter);
		
		Random r = new Random();
		for(int i=0;i<numberOf;i++) {
			int rad = r.nextInt(50)+20;
			Fliegenpilz fp = new Fliegenpilz(r.nextInt(frameWidth), r.nextInt(frameHeight), (rad*2)/3, rad/4, rad);
			fliegenpilze.add(fp);
			/*int n=0;
			ArrayList<Punkt> punkte = new ArrayList<Punkt>();
			punkte.add(new Punkt());
			while(n<20) {
				boolean besetzt = false;
				punkte.get(n).setX(fp.getX()-fp.getRad()/2+r.nextInt(fp.getRad()));
				punkte.get(n).setY(fp.getY()-fp.getRad()+r.nextInt(fp.getRad()));
				punkte.get(n).setHoehe(fp.getRad()/12);
				punkte.get(n).setBreite(punkte.get(n).getHoehe());
				if(punkte.get(n).intersects(boxoben)) {
					for(int j=0;j<n;j++) {
						if(punkte.get(j).hits(punkte.get(n))) {
							besetzt = true;
							break;
						}
					}
				} else {
					besetzt = true;
				}
				if(besetzt==true) {
					besetzt = false;
				} else {
					n++;punkte.add(new Punkt());
					besetzt = false;
				}
			}
			fp.setPunkte(punkte);*/
		}
		
		frame1.pack();
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
	}

	public static void main(String[] args) {
		new PilzeMalen(50);
	}
}