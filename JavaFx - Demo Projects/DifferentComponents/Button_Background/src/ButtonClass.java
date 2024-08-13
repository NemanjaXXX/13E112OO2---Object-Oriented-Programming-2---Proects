import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.paint.RadialGradientBuilder;
import javafx.scene.paint.Stop;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ButtonClass extends Application{

	int n=1;//clicks counter
	int just_one=0;
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,700,700,Color.BISQUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("-fx-style-components=>btn.setStyle(...)");
		
		Button btn = new Button("Open FileChoser(enter)");
		btn.setLayoutX(200);
		btn.setLayoutY(150);
		btn.setStyle("-fx-background-color:"
				//generator na internetu: https://cssgradient.io/
				+ "linear-gradient(#096279, #00ff8d, #020024),  "//outline-okvir
				+ "linear-gradient(#37a9e4 19%, #00e27d 50%, #00e6d4 100%);"//interior-unutar okvira
				+ "-fx-background-insets: 0, 18, 0;"
				+ "-fx-background-radius: 50,5,20;"//ovo zaobljava
				+ "-fx-padding: 30 30 30 30;" // ovo pomera tekst sam prokljuvi na koj nacin vidi opet onaj komentaer
				+ "-fx-text-fill: red;"
				+ "-fx-font-weight: bold;"
				+ "-fx-font-size: 14px;");
		
		FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("You can write some text here: Open Resource File");
        btn.setDefaultButton(true);//Sensitive on enter.
        
        
		
		
		btn.setOnAction(value->{
			DropShadow shadow = new DropShadow();
			shadow.setColor(Color.YELLOW);
			btn.setEffect(shadow);
			btn.setScaleX(3);
			btn.setScaleY(2);
			btn.setScaleZ(1);
			//Ovo ga transformise
			btn.setStyle("-fx-background-color: #ffff00, "
					+ "linear-gradient(#00ff00,#ffb266), "   // zelena, boja koze
					+ "linear-gradient(#99ccff 0%, #ffff00 49% ,#00ffff 100%); "// plava, ZUTA JE GLAVNA, tirkizna 
					+ "-fx-background-insets:0,4,5;"
					+ "-fx-background-radius: 33,22,21;"  // 33 22 21 daje zaobljene krajeve
					+ "-fx-padding: 8 30 10 30;"
					+ "-fx-text-fill: red;"
					+ "-fx-font-size: 10px");
			Tooltip tool=new Tooltip("This button and Tooltip were changed!");
			tool.setStyle("-fx-background-color:red");
			tool.setStyle("-fx-background-color:" 
					+ "        linear-gradient(#ffd65b, #e68400)," 
					+ "        linear-gradient(#ffef84, #f2ba44)," 
					+ "        linear-gradient(#ffea6a, #efaa22)" 
					+ "        linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%)," 
					+ "        linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0));"  
					+ "    -fx-background-radius: 30;" 
					+ "    -fx-background-insets: 0,1,2,3,0;"  
					+ "    -fx-text-fill: #654b00;" 
					+ "    -fx-font-weight: bold;" 
					+ "    -fx-font-size: 14px;"
					+ "	   -fx-text-fill: #4c0099;"  
					+ "    -fx-padding: 10 20 10 20;");
			btn.setTooltip(tool);
			fileChooser.showOpenDialog(primaryStage);
		});
		btn.setTooltip(new Tooltip("Change Button by click! - Default message style.\n Visible: 5 seconds"));
		
		final ComboBox<String> emailComboBox = new ComboBox();
        emailComboBox.getItems().addAll(
            "jacob.smith@example.com",
            "isabella.johnson@example.com",
            "ethan.williams@example.com",
            "emma.jones@example.com",
            "michael.brown@example.com"  
        );
        emailComboBox.setLayoutX(100);
        emailComboBox.setLayoutY(10);
        emailComboBox.setPromptText("Choose".toUpperCase()+" E-mail (ComboBox)");
        emailComboBox.setStyle("-fx-background-color:" 
				+ "        #ecebe9," 
				+ "        rgba(0,0,0,0.05)," 
				+ "        linear-gradient(#dcca8a, #c7a740)," 
				+ "        linear-gradient(#f9f2d6 0%, #f4e5bc 20%, #e6c75d 80%, #e2c045 100%),"  
				+ "        linear-gradient(#f6ebbe, #e6c34d);"
				+ "    -fx-background-insets: 0,9 9 8 9,9,10,11;"
				+ "    -fx-background-radius: 50;" 
				+ "    -fx-padding: 15 30 15 30;" 
				+ "    -fx-font-family: \"Helvetica\";"
				+ "    -fx-font-size: 18px;" 
				+ "    -fx-text-fill: #0080ff;" 
				+ "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);"
				+ "    -fx-effect: dropshadow( one-pass-box , rgba(255,255,255,0.5) , 0, 0.0 , 0 , 1);");
	
		Button bizerba = new Button("1");
		bizerba.setLayoutX(20);
		bizerba.setLayoutY(250);
		bizerba.setStyle("-fx-background-color:"
				+ "#a4a4a1,"//boja okvira
				+ "linear-gradient(#2cfb14, #a2bf15)"
				+ "linear-gradient(circle, rgba(63,94,251,1) 0%, rgba(70,251,252,1) 51%)"
				+ "radial-gradient(circle, rgba(63,94,251,1) 0%, rgba(252,82,70,1) 68%);"
				+ "-fx-background-radius: 10 30 10 30;" // dugme je kruznog oblika ako se radius poveca
				+ "-fx-background-insets: 0,7 7 7 7,9,10,11;"//Ovo daje okvir
				+ "-fx-padding: 10 30 10 30;"
				+ "-fx-text-fill: #405b28;"
				+ "-fx-font-size: 55px;"
				+ "-fx-font-weight: bold;");
		
		
		
		bizerba.setOnMouseClicked(value->{	
				bizerba.setText(""+(++n));
				if(n%2==1) {
					bizerba.setStyle("-fx-background-color: skyblue, derive(skyblue, 25%), derive(skyblue, 50%), derive(skyblue, 75%);"//outline-okvir
							+ "-fx-background-insets: 20, 40, 60, 80;"//interior-unutar okvira
							+ "-fx-border-color: red;" /* set border to red*/
							+ "-fx-border-width: 3px;" /* border width 3px px može da se izostavi*/
							+ "-fx-font-size: 150px;"
							+ "-fx-border-style: dotted;"); // isprekidana u vid tackica
				}
				else {
					bizerba.setStyle("-fx-background-color:"
							+" #C0C0C0,"
							+ "linear-gradient(#f0ff35, #a9ff00),"
							+ "radial-gradient(center 50% -40%, radius 200%, #b8ee36 45%, #80c800 50%);"
							+ "-fx-background-radius: 10 10 10 10;" // dugme je kruznog oblika ako se radius poveca
							+ "-fx-background-insets: 1,8 8 8 8,5,20,30;"//Ovo daje okvir za osmice vazi pravilo TRBL- Top Bottom Left Right u okviru jednog tj. drugog inset-a
							+ "-fx-padding: 10 30 10 30;"
							+ "-fx-text-fill: #405b28;"
							+ "-fx-font-size: 55px;"
							+ "-fx-font-weight: bold;");

				}
		});
	Tooltip tool3=new Tooltip("This is message with picture.\n "
			+ "Just free(option) on iconfinder.com can download in correct size.\n"
			+ "This is processed on https://photoscissors.com/\n"
			+ "However, I must resized picture in Paint.");
	Image image = new Image(
		    getClass().getResourceAsStream("3Dsmiley.png")
		);
	tool3.setGraphic(new ImageView(image));
	tool3.setFont(new Font("Arial", 16));
	tool3.setStyle("-fx-background-color: #f5a000");//# se moze izostaviti, ako bilo sta dodam ne radi nzm zasto, gore je radilo
	bizerba.setTooltip(tool3);
		primaryStage.getIcons().add(image);
		
		
		final ColorPicker colorPicker = new ColorPicker();
        colorPicker.setValue(Color.CORAL);//initial color
        colorPicker.setLayoutY(200);
        colorPicker.setLayoutX(500);
        
        final Text text = new Text("Try the color picker!");
        text.setFont(Font.font ("Verdana", 20));
        text.setFill(colorPicker.getValue());
        
        colorPicker.setOnAction(new EventHandler() {
            public void handle(Event t) {
                text.setFill(colorPicker.getValue());               
            }
        });
        
        final SVGPath svg = new SVGPath();
        svg.setContent("M70,50 L90,50 L120,90 L150,50 L170,50" //SVG
            + "L210,90 L180,120 L170,110 L170,200 L70,200 L70,110 L60,120 L30,90"
            + "L70,50");
        svg.setStroke(Color.RED);
        svg.setStrokeWidth(2);
        DropShadow ds=new DropShadow();
        ds.setColor(Color.YELLOW);
        ds.setOffsetX(12);
        ds.setOffsetY(12);
        svg.setEffect(ds);
        svg.setFill(colorPicker.getValue());
        svg.setLayoutX(450);
        svg.setLayoutY(250);
        
 
        colorPicker.setOnAction(new EventHandler() {
            public void handle(Event t) {
                svg.setFill(colorPicker.getValue()); // Ovo je kljucno!                   
            }
        });
        
        CheckBox cb1=new CheckBox("Background 1");
        cb1.setLayoutY(10);
        CheckBox cb2=new CheckBox("Background 2");
        cb2.setLayoutY(30);
        CheckBox cb3=new CheckBox("Background 3");
        cb3.setLayoutY(50);
        CheckBox cb4=new CheckBox("Background 4");
        cb4.setLayoutY(80);
        cb4.setAllowIndeterminate(true);
        CheckBox cb5=new CheckBox("Basic background");
        cb5.setLayoutY(110);
        
        
        cb1.setOnAction(value->{
        	//RadialGradient ide sa samo 2 boje pa ako se ovde pokusa staviti vise to je greska.
        	final Paint background1 = RadialGradientBuilder.create().stops(new Stop(0d, Color.BISQUE), new Stop(1, Color.web("0076f1"))).centerX(0.2d).centerY(0.3d).build();
        	if(cb1.isSelected()) {
	        	scene.setFill(background1);
	        	}
        });
        
        cb2.setOnAction(value->{
        	if(cb2.isSelected()) {
        		final Paint background2 = RadialGradientBuilder.create().stops(new Stop(0d, Color.DARKSALMON), new Stop(1, Color.web("00eff5"))).centerX(0.5d).centerY(0.5d).build();
	        	scene.setFill(background2);
	        	}
        });
        
        cb3.setOnAction(value->{
			@SuppressWarnings("deprecation")
			final Paint background3 = RadialGradientBuilder.create().stops(new Stop(0d, Color.TURQUOISE), new Stop(1, Color.web("3A5998"))).centerX(0.5d).centerY(0.5d).build();
        	if(cb3.isSelected()) {
	        	scene.setFill(background3);
	        	}
        });
        
        cb4.setOnAction(value->{
        	if(cb4.isSelected()) {
	        	scene.setFill(Color.web("ACF2ED"));
	        	}
        	if(cb4.isIndeterminate()) {
        		final Paint background4 = RadialGradientBuilder.create().stops(new Stop(0d, Color.CYAN), new Stop(1, Color.web("ecf100"))).centerX(0.9d).centerY(0.5d).build();
        		scene.setFill(background4);
        	}
        });
        
        cb5.setOnAction(value->{
        	if(cb3.isSelected()) {
	        	scene.setFill(Color.BISQUE);
	        	}
        });
        // Style moze i u obliku stringa!
        final String LABEL_STYLE = "-fx-text-fill: red; -fx-font-size: 14;"
        							+ "-fx-effect: dropshadow(one-pass-box, cyan, 5, 20, 1, 1);";
        Label label = new Label("I love javafx GUI programming. It is funny. Style moze da se pise i u obliku String-a\n"
        		+ "i tako se moze setStyle-ovati na vise mesta. Ova majica dole je SVG.");
        label.setStyle(LABEL_STYLE);
        label.setLayoutX(150);
        label.setLayoutY(85);
        
        Image image2=new Image("3Dsmiley2.png");
        ImageView iw2=new ImageView();
        iw2.setImage(image2);
        iw2.setLayoutY(500);
        iw2.setLayoutX(500);
        root.getChildren().add(iw2);
        
        
        ToggleGroup tg=new ToggleGroup(); //Unutar grupe samo jedno moze biti cekirano.
        Label label2=new Label("Wolfgang Amadeus Mozart(1756-1791) was famous:");
        label2.setLayoutY(590);
        
        RadioButton rb1=new RadioButton("scientist");
        rb1.setLayoutY(620);
        rb1.setToggleGroup(tg);
        rb1.setSelected(true);
        
        RadioButton rb2=new RadioButton("architect");
        rb2.setLayoutY(640);
        rb2.setToggleGroup(tg);
        
        RadioButton rb3=new RadioButton("other");
        rb3.setLayoutY(660);
        rb3.setToggleGroup(tg);
        
        TextField tf=new TextField();
        Button submit=new Button("Check answer");
        tg.selectedToggleProperty().addListener(listener->{
        	if(rb3.isSelected()) {
        		tf.setPromptText("Write yor answer here");
        		tf.setFont(new Font("Serif", 12));
        		tf.setLayoutX(120);
        		tf.setLayoutY(665);
        		submit.setLayoutX(400);
        		submit.setLayoutY(665);
        		root.getChildren().addAll(tf,submit);
        	}
        });
        
      
       
        submit.setOnMouseClicked(value->{
        	String answer=tf.getText();
        	if(answer.equals("compositor")&&just_one==0) {
        		  Label checked=new Label("Your answer is correct.");
        		  checked.setLayoutX(500);
        		  checked.setLayoutY(665);
        		  root.getChildren().add(checked);
        		  just_one=1;
    		}
        	else if(just_one==0){
        		Label checked=new Label("Your answer is incorrect.");
      		  checked.setLayoutX(500);
      		  checked.setLayoutY(665);
      		  root.getChildren().add(checked);
      		  just_one=1;
        	}
        });
         
       
        
        
        
 
        root.getChildren().addAll(colorPicker, text);
		root.getChildren().addAll(btn,emailComboBox,bizerba,svg,cb1,cb2,cb3,cb4,cb5,label,label2,rb1,rb2,rb3);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}


}