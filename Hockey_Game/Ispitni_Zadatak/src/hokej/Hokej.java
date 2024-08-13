package hokej;

import java.awt.*;
import java.awt.event.*;

public class Hokej extends Frame{
	private int poeniP;  // levi igrac
	private int poeniD;  // desni igrac
	private Label rezultat;
	private Scena s=new Scena();
	private Button dugKreni=new Button("Kreni"),
			       dugStani=new Button("Stani"),
			       dugPonisti=new Button("Ponisti");

	public void uvecajP(int igr) {
		if (igr == 0) poeniP++;
		 else if (igr == 1) poeniD++;
		 rezultat.setText(poeniP + ":" + poeniD);
		
	}
	

	private void dodajSever() {
		Panel pan=new Panel();
		pan.setBackground(Color.LIGHT_GRAY);
		rezultat=new Label("0:0");
		rezultat.setFont(new Font(null, Font.BOLD,22));
		pan.add(rezultat);
		add(pan,BorderLayout.NORTH);
	}
	
	private void dodajCentar() {
		s.setSize(350, 150); // suvisno, ne reguje kad koristis layout manager
		Pak p=new Pak(s,Color.GREEN,5,10,this);
		s.dodaj(p);
		s.dodaj(new Igrac(s, 20, s.getHeight() / 2, Color.BLUE, 8, 5, 30));
		s.dodaj(new Igrac(s, s.getWidth() - 30, s.getHeight() / 2, Color.RED, 8, 5, 30));
	    add(s, BorderLayout.CENTER);
		
	}
	
	private void dodajJug() {
		Panel pan=new Panel();
		pan.setBackground(Color.GRAY);
		dugKreni.addActionListener(
				(e)->{s.kreni();});
		
		dugStani.addActionListener(
				 (e)->{ s.stani(); });
		
	    dugPonisti.addActionListener(
				 (e)->{poeniP =poeniD =0;
				 rezultat.setText("0:0"); });
	    
	    pan.add(dugKreni);
		pan.add(dugStani);
		pan.add(dugPonisti);
		add(pan, BorderLayout.SOUTH);
		
	}
	
	 private void dodajKomponente() {
			dodajSever();
			dodajJug();
			dodajCentar();
			addWindowListener(new WindowAdapter() {
				
				@Override
				public void windowClosing(WindowEvent e){
					s.prekini();
					dispose();
				}
				
			});
			
		}
	
	

	public Hokej() {
		super("Hokej");
		setBounds(300,300,350,250);
		setLocation(300,300); // suvisno
		setResizable(false);
		dodajKomponente();
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		 new Hokej();
		 }


}
