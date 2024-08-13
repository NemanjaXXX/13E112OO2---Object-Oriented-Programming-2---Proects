package hokej;
import java.awt.*;

public class Scena extends Canvas{

	private Elem prvi,posl;
	
	private class Elem{
		Figura fig;
		Elem sled;
		Elem(Figura ffig){
			fig=ffig;
			if(prvi!=null) posl.sled=this;
			else prvi=this;
			posl=this;
		}
	}
	
	
	public synchronized void dodaj(Figura f) {
		new Elem(f);
	}
	
	public synchronized Figura dohvatiFig(int ind) {
		Elem tek=prvi;
		if(ind<0)return null;
		while(tek!=null && ind>0) {
			tek=tek.sled;
			ind--;
		}
		if(tek==null)return null;
		else return tek.fig;
	}
	
	public synchronized void paint(Graphics g) {
		Elem tek=prvi;
		while(tek!=null) {
			tek.fig.crtaj();
			tek=tek.sled;
		}
	}
	
	public synchronized void kreni() {
		for(Elem tek=prvi;tek!=null;tek=tek.sled) {
			
			
			if(tek.fig instanceof AktFigura) {
			((AktFigura)tek.fig ).kreni();
			}
			
			
		}
	}
	
	public synchronized void stani() {
		for(Elem tek=prvi;tek!=null;tek=tek.sled) {
			
			if(tek.fig instanceof AktFigura) {
				((AktFigura)tek.fig).stani();
			}
			
		}
	}
	
	public synchronized void prekini() {
		for(Elem tek=prvi; tek!=null;tek=tek.sled ) {
			
			if(tek.fig instanceof AktFigura) {
				((AktFigura)tek.fig).prekini();
			}
			
		}
	}

}
