package hokej;

import java.awt.*;
import java.util.Random;

public class Pak extends AktFigura{
	
	private Random rand=new Random();
	private int d;
	private double dx=1,dy=0;
	private Hokej hok;

	{rand.setSeed(System.currentTimeMillis());}
	
	protected Pak(Scena s, Color b, int t, int dd, Hokej h) {
		super(s, s.getWidth()/2, s.getHeight()/2, b, t);
		d=dd;
		hok=h;
		nit.start();
	}
	
	public int dohvPrecnik() {
		return d;
	}
	
	public double dohvDx() {
		return dx;
	}
	
	public double dohvDy() {
		return dy;
	}
	
	private void dodeliBrzinu() {
		 // biraj ugao u itervalu [45,60] ili [-60,-45]
		while(Math.abs(Math.tan(dy/dx)) < 1 ||
				 Math.abs(Math.tan(dy/dx)) > 1.74){
				 dy= -1 + Math.random() * 2;  // najvise za +1 ili -1
				 }

	}
	
	
	private void resetujPoziciju() {
		x=scena.getWidth()/2;
		y=scena.getHeight()/2;
		dodeliBrzinu();
	}

	@Override
	protected void azurirajPolozaj() {
		 x+=dx; 
		 y+=dy; 
		 Figura f;
		 Igrac igr1 = null, igr2 = null; 
		 
		 	for(int i = 0;(f = scena.dohvatiFig(i)) != null; i++)
		 			if(f.vrsta()=='I'){
		 				if(igr1 == null) igr1 = (Igrac)f;
		 				else {// Ako je pak.
		 					igr2 = (Igrac)f;
		 					if(igr1.dohvX()>igr2.dohvX()) { 
		 						f=igr1; 
		 						igr1=igr2;
		 						igr2=(Igrac)f;
		 						}
		 				}
		 }
		 	
		 if(igr1!=null && igr2!=null) {  // Ako pak udari u igraca.
			 if(x+d/2<=igr2.dohvX()+igr2.dohvSir()/2 && 
				x+d/2>=igr2.dohvX()-igr2.dohvSir()/2 &&
				y>=igr2.dohvY()-igr2.dohvVis()/2 &&
				y<=igr2.dohvY()+igr2.dohvVis()/2)
				 	dx *= -1;
		 else
			 if(x-d/2<=igr1.dohvX()+igr1.dohvSir()/2 &&
			 	x-d/2>=igr1.dohvX()-igr1.dohvSir()/2 &&
			 	y>=igr1.dohvY()-igr1.dohvVis()/2 &&
			 	y<=igr1.dohvY()+igr1.dohvVis()/2)
				 dx *= -1;
	 }
		 
		 // Ako pak prodje iza igraca.
		 
		 if(x-d/2<=0) {
			 hok.uvecajP(1); 
			 dx = 1; 
			 resetujPoziciju();
		 }
		 
		 // Ako pak udari o ivicu.
		 
		 if(x+d/2>=scena.getWidth()) {
			 hok.uvecajP(0);
			 dx = -1; 
			 resetujPoziciju();
		 }
		 
		 if(y-d/2<=0) dy *= -1;
		 
		 if(y+d/2>=scena.getHeight()) dy *= -1;
		 
		 }
	@Override
	public void crtaj() {
		Graphics g=scena.getGraphics();
		g.setColor(boja);
		g.fillOval((int)x-d/2, (int)y-d/2, d, d);
		
	}

	@Override
	public char vrsta() {
		return 'P';
	}

}
