package pilze;

import java.util.ArrayList;

/**
 * Diese Klasse repraesentiert einen Fliegenpilz.<br>
 * Als Eigenschaften enthaelt sie die (x,y)-Koordinaten eines Punktes, ausserdem die Stammhoehe und -Breite und den Radius des Pilzkopfes.<br>
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class Fliegenpilz {

	/**Koordinate des Pilzes*/
	private int x, y;
	/**Stammhoehe des Pilzes*/
	private int sth;
	/**Stammbreite des Pilzes*/
	private int stb;
	/**Radius des Pilzkopfes des Pilzes*/
	private int rad;
	/**Die Liste an Punkten auf dem Pilz*/
	private ArrayList<Punkt> punkte = new ArrayList<Punkt>();
	
	public Fliegenpilz(int x, int y, int sth, int stb, int rad) {
		this.x = x;
		this.y = y;
		this.sth = sth;
		this.stb = stb;
		this.rad = rad;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSth() {
		return sth;
	}

	public void setSth(int sth) {
		this.sth = sth;
	}

	public int getStb() {
		return stb;
	}

	public void setStb(int stb) {
		this.stb = stb;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public ArrayList<Punkt> getPunkte() {
		return punkte;
	}

	public void setPunkte(ArrayList<Punkt> punkte) {
		this.punkte = punkte;
	}
}