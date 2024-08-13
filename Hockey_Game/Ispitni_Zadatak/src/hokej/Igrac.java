package hokej;

import java.awt.*;

public class Igrac extends AktFigura{
	
	private int w, h, dy=1;

	protected Igrac(Scena s, double xx, double yy, Color b, int t, int ww, int hh) {
		super(s, xx, yy, b, t);
		w=ww;
		h=hh;
		nit.start();
	}

	@Override
	protected void azurirajPolozaj() {
		Figura f=null;
		for(int i=0;(f=scena.dohvatiFig(i))!=null;i++)
			if(f.vrsta()=='P') break; // Ako nije pak, Figura f je igrac.
		if(f==null)return;
		
		Pak p=(Pak)f; // Figura je ovde sigurno pak.
		
		// ako ide prema igracu
		
		if(p.dohvX()>x&&p.dohvDx()<0||  
		   p.dohvX()<x&&p.dohvDx()>0) {
			
			// igrac poravnjava svoj y polozaj sa pakom
			if(y<p.dohvY())dy-=1;
		}
		y+=dy;
		if(y-h/2<=0) { // y od paka, h (visina po y osi) od igraca.
			y=h/2;
			dy=-dy;
		}
		else if (y + h / 2 >= scena.getHeight()){  // Igrac je udario o ivicu scene.
			 y = scena.getHeight() - h/2;
			 dy = -dy;
			 }
	}

	@Override
	public void crtaj() {
		Graphics g=scena.getGraphics();
		g.setColor(boja);
		g.fillRect((int)x-w/2, (int)y-h/2, w, h); // da bude na sredini
		
		
	}

	@Override
	public char vrsta() {
		return 'I';
	}

	public int dohvVis() {
		return h;
	}

	public int dohvSir() {
		return w;
	}

}
