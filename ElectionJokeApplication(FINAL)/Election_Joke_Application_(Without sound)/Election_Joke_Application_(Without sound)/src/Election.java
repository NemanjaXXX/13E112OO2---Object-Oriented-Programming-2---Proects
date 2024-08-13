import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Election {
	
	private Image backgroundImage,person,win;
	private Label question;
	private JButton yes,no;
	private Dialog message;
	private Label txtmes;
	private Label txtmes1;
	private Label txtmes2;
	private int numberSpace;
	private TextArea results;
	

	
	
	private ImageIcon yesImage=new ImageIcon("res/Images/yes(48x48).png");
	private ImageIcon noImage=new ImageIcon("res/Images/no(48x48).png");

	private Election() {
		JFrame frame1=new JFrame("Izbori");
		frame1.setBounds(400,0,600,730);
		frame1.setVisible(true);
		frame1.setLayout(new GridLayout(2,1));
		

		 try {
			backgroundImage = ImageIO.read(new File("res/Images/flag.jpg"));
		} catch (IOException e) {

			e.printStackTrace();
		}

  

		frame1.setIconImage(Toolkit.getDefaultToolkit().getImage("res/Images/flag.jpg"));
		
		Panel p1=new Panel() {
			@Override
			public void paint(Graphics g)  {
				g.drawImage(backgroundImage, 0, 0, this);
				
			}
			
		};
		
		frame1.add(p1);
		
		
		 Panel p2=new Panel();
		
		
		p2.setLayout(new GridLayout(2,1));		
		p2.add(question=new Label("                                                             Da li zelite da glasate za Aleksandra Vucica?"), BorderLayout.NORTH);
		
		yes=new JButton("DA", yesImage);
		no=new JButton("NE",noImage);
		
		
		Panel p3=new Panel();
		p3.setLayout(new FlowLayout());
		p3.add(yes);
		p3.add(no);
		
		p2.add(p3);
		
        
        
        
        MouseAdapter adapter=new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e){
        		try {
					Robot robot = new Robot();
					robot.mouseMove(530, 680);
					if(e.getSource()==no) {
						no.setIcon((Icon) yesImage);
						no.setText("DA");
						
					}
					
					
					
					message=new Dialog(frame1,"Aleksandar Vucic - BRZE, JACE, BOLJE");
					message.setIconImage(Toolkit.getDefaultToolkit().getImage("res/Images/flag.jpg"));
					message.setBounds(250, 5, 830, 720);
					message.setModal(true);
					message.setLayout(new GridLayout(2,1));
					message.setResizable(false);
		
					try {
						win=ImageIO.read(new File("res/Images/winner.PNG"));
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					
					Panel p4=new Panel() {
						@Override
						public void paint(Graphics g)  {
							g.drawImage(win, 50, 0, message);
							
						}
					};
					
					p4.setBackground(new Color(255,222,173)); //navajo white
					
					Panel p5=new Panel();
					p5.setLayout(new FlowLayout());
					StringBuilder s1=new StringBuilder(" ,,Za nas je ovo vazan dan i vazno je da se pokazalo\n"
							+ " u kom smeru Srbija zeli da ide, vazno da je pobeda\n "
							+ "cista kao suza, da nije mala");
					StringBuilder s2=new StringBuilder(" razlika. Kada i pored antisistemskih\n "
							+ "kandidata dobijete 56 odsto, to je zaista neverovatno. \n"
							+ "Hvala vam puno, ne znam ni sta vise da kazem.''");
					String pom=" ";
					StringBuilder resultstxt=new StringBuilder("Rezultati i cinjenice:\n"+"\n"+"                1. Izgradili smo kilometre autoputa. Vise nego Nemacka skoro cetiri puta.\n"
														            										+"\n                2. Beograd na vodi nikad lepsi bio nije. Dok su bili zuti tu se legle zmije.\n"
														            										+"\n                3. Oni sto protestuju, sve bagra i olos i alkos i drogos, finansira Soros.\n"
														            										+"\n                4. Njihov mracni plan - DESTABILIZACIJA I DRZAVNI UDAR, RADIKALIZACIJA.\n"
														            										+"\n                5. Ali ipak verujem, premijeru i Vladi, nezavisnom sudstvu sto posteno radi.\n"
														            										+"\n                6. Strani ambasadori ne komadnuju vise, kako da se radi, kako da se dise.\n"
														            										+"\n                7. Iako nas pritiskaju, razni centri moci, da Srbiju ponizava, NIKO NECE MOCI.\n"
														            										+"\n\n\nPoruka:\n                 Hvala sto ste koristili ovu aplikaciju, hvala na podrsci Aleksandru Vucicu, sve najbolje i srecan rad Vam zelim.\n"
														            										+"\n                 Aplikacija je napravljena u cilju promocije zabave i humora. Nije usmerena protiv bilo koga. Cilj ove aplikacije je da izazove smeh kod korisnika.\n");
					
					MouseAdapter adapter1=new MouseAdapter() { // for TextArea
			        	@Override
			        	public void  mouseEntered(MouseEvent e) {
			        		try {
								Robot r=new Robot();
								
								r.mouseMove(930, 550);
								
							} catch (AWTException e1) {
								e1.printStackTrace();
							}
			        		
			        	}
			        };
					
					
					
					
					numberSpace=200;
					while(numberSpace--!=0)pom=pom+" ";
					
					StringBuilder s3=new StringBuilder("\n"+pom +" - Aleksandar Vucic, predsednik SNS-a");
					txtmes=new Label(s1.toString());
					txtmes1=new Label(s2.toString());
					txtmes2=new Label(s3.toString());
					results=new TextArea(resultstxt.toString());
					results.setEditable(false);
					results.setBackground(Color.CYAN);
					results.setForeground(Color.RED);
					results.setFont(new Font("BASELINE",Font.ITALIC,16));
					p5.add(txtmes);
					p5.add(txtmes1);
					p5.add(txtmes2);
					results.addMouseListener(adapter1);
					p5.add(results);
					p5.setBackground(new Color(255,222,173)); //navajo white
					
					
					message.add(p4);
					message.add(p5);
					
					message.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							message.dispose();
							
							
						}
					});
					

					message.setVisible(true);
					
					
					
					
				} catch (AWTException e1) {
					
					e1.printStackTrace();
				}
        	}
        	
        };
        
        
        yes.addMouseListener(adapter);
        no.addMouseListener(adapter);
        
        
        frame1.add(p2);
        frame1.setResizable(false);
        frame1.setIconImage(Toolkit.getDefaultToolkit().getImage("res/Images/icon.png"));
        
        frame1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame1.dispose();
				
				
			}
		});
		
		
		
	}
	
public static void main(String[]varg) {new Election();}
}
