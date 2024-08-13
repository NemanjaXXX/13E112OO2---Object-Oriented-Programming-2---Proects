import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Sara {
	int n=1;
	int x1=80,y1=30,x2=200,y2=200;
	
	
	public Sara() {
		JFrame frame=new JFrame("SARO, VOLIM TE!");
		JButton frameButton=new JButton("Klikni me 7 puta.");
		frameButton.setForeground(Color.RED);
		frame.setBounds(500,250,400,200);
		frame.setLayout(null);
		frameButton.setBounds(70,30,250,100);
		frame.setResizable(false);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
		
		frameButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
	
				
				if(n==1) {
					String s1="  V";
					Dialog d1=new Dialog(frame,"TI SI MOJ ANDJEO!");
					Label l=new Label(s1.toString());
					l.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
					l.setForeground(Color.RED);
					d1.setBackground(Color.CYAN);
					d1.setBounds(x1,y1,x2,y2);
					d1.add(l);
					d1.setVisible(true);
					d1.setResizable(false);
					d1.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
					frameButton.setText("Klikni me jos 6 puta.");
					inc();
					return;
				}
				
				if(n==2) {
					String s1="  O";
					Dialog d2=new Dialog(frame,"MOJ SVET SI TI!");
					Label l=new Label(s1.toString());
					l.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
					l.setForeground(Color.YELLOW);
					d2.setBackground(Color.CYAN);
					d2.setBounds(x1,y1,x2,y2);
					d2.add(l);
					d2.setVisible(true);
					d2.setResizable(false);
					d2.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
					frameButton.setText("Klikni me jos 5 puta.");
					inc();
					return;
				}
				
				
				if(n==3) {
					String s1="   L";
					Dialog d3=new Dialog(frame,"I ADORE YOU!");
					Label l=new Label(s1.toString());
					l.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
				    l.setForeground(new Color(255,99,71)); //tomato
					d3.setBackground(Color.CYAN);
					d3.setBounds(x1,y1,x2,y2);
					d3.add(l);
					d3.setVisible(true);
					d3.setResizable(false);
					d3.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
					frameButton.setText("Klikni me jos 4 puta.");
					inc();
					return;
				}
				
				if(n==4) {
					String s1="   I";
					Dialog d4=new Dialog(frame,"SARO, VOLIM TE!");
					Label l=new Label(s1.toString());
					l.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
					l.setForeground(Color.ORANGE);
					d4.setBackground(Color.CYAN);
					d4.setBounds(x1,y1,x2,y2);
					d4.add(l);
					d4.setVisible(true);
					d4.setResizable(false);
					d4.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
					frameButton.setText("Klikni me jos 3 puta.");
					inc();
					return;
				}
				
				if(n==5) {
					String s1="  M";
					Dialog d5=new Dialog(frame,"I UVEK CU TE VOLETI!");
					Label l=new Label(s1.toString());
					l.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
					l.setForeground(Color.PINK);
					d5.setBackground(Color.CYAN);
					d5.setBounds(x1,y1,x2,y2);
					d5.add(l);
					d5.setVisible(true);
					d5.setResizable(false);
					d5.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
					frameButton.setText("Klikni me jos 2 puta.");
					inc();
					return;
				}
				
				if(n==6) {
					String s1="  T";
					Dialog d6=new Dialog(frame,"VOLIM STO SAM TVOJ!");
					Label l=new Label(s1.toString());
					l.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
					l.setForeground(new Color(127,0,255));
					d6.setBackground(Color.CYAN);
					d6.setBounds(x1,y1,x2,y2);
					d6.add(l);
					d6.setVisible(true);
					d6.setResizable(false);
					d6.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
					frameButton.setText("Klikni me jos 1 put.");
					inc();
					return;
				}
				
				if(n==7) {
					String s1="  E";
					Dialog d7=new Dialog(frame,"TI SI MOJE SVE!");
					Label l=new Label(s1.toString());
					l.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
					l.setForeground(new Color(255,20,147));
					d7.setBackground(Color.CYAN);
					d7.setBounds(x1,y1,x2,y2);
					d7.add(l);
					d7.setVisible(true);
					d7.setResizable(false);
					d7.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/heart.png"));
					frameButton.setText("Klikni me jos jednom.");
					inc();
					return;
				}
				
				
				if(n==9) {    // Redosled okrenut da bi se video ispis na dugmetu za n=8;
					frame.dispose();
					n=1;
					new Sara();
				}
				
				
				if(n==8) {
					frameButton.setText("VOLIM TE NAJVISE NA SVETU!!!");
					n++;
					
				}
				
				
				

				
				
			}

			
			
		});
		
		
		
		frame.add(frameButton,"Center");
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		frame.setVisible(true);
		
		
	}
	public void inc() {
		n++;
		if(n<=5) {
		x1+=250;
		}
		if(n==6){
			y1=480;
			x1=480;
		}
		
		if(n==7){
			y1=480;
			x1=720;
		}
		
	}

	public static void main(String[] args) {
		new Sara();

	}

}
