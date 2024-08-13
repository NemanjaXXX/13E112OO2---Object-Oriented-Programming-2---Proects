package hokej;
import java.awt.*;

public abstract class Figura {
	
	protected Scena scena;
	protected double x;
	protected double y;
	protected Color boja;
	
	protected Figura(Scena s, double xx,double yy, Color b) {
		scena=s;
		x=xx;
		y=yy;
		boja=b;
	}
	
	public abstract void crtaj();
	public abstract char vrsta();
	public double dohvX() {return x;}
	public double dohvY() {return y;}

}
