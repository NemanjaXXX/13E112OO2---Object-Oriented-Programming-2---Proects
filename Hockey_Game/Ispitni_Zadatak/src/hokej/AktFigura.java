package hokej;

import java.awt.Color;


public abstract class AktFigura extends Figura implements Runnable{
	
	protected Thread nit=new Thread(this);
	private int tAzur;
	private boolean radi=false;
	

	protected AktFigura(Scena s, double xx, double yy, Color b, int t) {
		super(s, xx, yy, b);
		tAzur=t;
	}



	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				synchronized (this) {
					if(!radi) {wait();}
				}
				azurirajPolozaj();
				scena.repaint();
				Thread.sleep(tAzur);
			}
			
		}catch(Exception e) {}
		
	}
	
	public synchronized void kreni() {
		radi=true;
		notify();
		
	}
	
	public void stani() {
		radi=false;
	}

	public void prekini() {
		if(nit!=null) nit.interrupt();
	}


	protected abstract void azurirajPolozaj();

}
