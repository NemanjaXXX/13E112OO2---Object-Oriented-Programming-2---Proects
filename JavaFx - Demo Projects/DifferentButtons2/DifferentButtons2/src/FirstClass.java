import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;


public class FirstClass extends Application{ // http://fxexperience.com/2011/12/styling-fx-buttons-with-css/

	Label space=new Label();
	Label space1=new Label();
	Label space2=new Label();
	Label space3=new Label();
	Label space4=new Label();
	Label space5=new Label();
	Label space6=new Label();
	Label space7=new Label();
	Label space8=new Label();
	Label space9=new Label();
	Label space10=new Label();
	Label space11=new Label("   ");
	Label space12=new Label("   ");
	Label space13=new Label("   ");
	Label space14=new Label("   ");
	Label space15=new Label("   ");


	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1=new Button("First Button");
		btn1.setStyle("-fx-background-color: #3c7fb1,  "
				+ "linear-gradient(#fafdfe, #e8f5fc),  "
				+ "linear-gradient(#eaf6fd 0%, #d9f0fc 49%, #bee6fd 50%, #a7d9f5 100%);"
				+ "-fx-background-insets: 0,1,2;"
				+ "-fx-background-radius: 3,2,1;"
				+ "-fx-padding: 3 30 3 30;"
				+ "-fx-text-fill: red;"
				+ "-fx-font-size: 14px;");

		btn1.setOnAction(value->{
			primaryStage.setTitle("First Button");
		});
		
		/*The first line defines the 3 background fills, first is solid color and the other
	      two are linear gradients. The background-insets offsets the backgrounds so they do
          not 100% paint over each other and the second background is 1px in from the outside
          and the 3rd background is 2px in from the outside of the button. The background-radius
          us setting the corner radius’s of the 3 backgrounds getting smaller as the backgrounds
          move in, this makes the gap between the borders a consistent 1 pixel all the way around.
          Padding adds extra space around the text to make the button bigger by default. Then the
          last two lines set the text color and size. That is all there is too it.

          I have not included styles for the pressed, over and focused states of all the buttons
          but they can all be easily added in a similar way. I have included a over and pressed
          state for the “Record Sales” button as a example.

*/
		
		Button btn2=new Button("My Practise Button");
		btn2.setStyle("-fx-background-color: #ffff00, "
				+ "linear-gradient(#00ff00,#ffb266), "   // zelena, boja koze
				+ "linear-gradient(#99ccff 0%, #ffff00 49% ,#00ffff 100%); "// plava, ZUTA JE GLAVNA, tirkizna 
				+ "-fx-background-insets:0,4,5;"
				+ "-fx-background-radius: 33,22,21;"  // 33 22 21 daje zaobljene krajeve
				+ "-fx-padding: 15 30 10 50;"
				+ "-fx-text-fill: red;"
				+ "-fx-font-size: 45px");  // radi iako se ne napise px, utice na vlicinu dugmeta

		btn2.setOnAction(value->{
			primaryStage.setTitle("My Practise Button");
		});
		
		
		/* 15 - udaljenje teksta od gornje ivice na dole u pikselima, utice na sirinu dugmeta 
		   30 - duzina dugmeta 
		   10 - sirina dugmeta
		   50 - udaljenje teksta u pikselima mereno od levog kraja dumeta na desno, utice na velicibu dugmta
		
		  format => -fx-padding: udaljenje teksta od gornje ivice
		                         duzina dugmeta
		                         sirina dugmeta
		                         udaljenje teksta od leve ivice
		*/
		
		
		
		Button btn3=new Button("Green");
		btn3.setStyle("-fx-background-color: "
				+ "linear-gradient(#f0ff35, #a9ff00),"
				+ "radial-gradient(center 50% -40%, radius 200%, #b8ee36 45%, #80c800 50%);"
				+ "-fx-background-radius: 6, 5;" 
				+ "-fx-background-insets: 0, 1;"
				+ "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );" 
				+ "-fx-text-fill: #395306;");
		
		btn3.setOnAction(value->{
			primaryStage.setTitle("Green");
		});
		
		
		Button btn4=new Button("Round Red");
		btn4.setStyle("-fx-background-color:linear-gradient(#ff5400, #be1d00);" // nijansa crvene boje
				    + "-fx-background-radius: 30;" // OVO MU ZAOBLI IVICE !!!
				    + "-fx-background-insets: 0;"  // KAD SE OVO POVECA NA 30 NE VIDI SE NISTA OSIM TEKSTA
				    + "-fx-text-fill: white;"); 
		btn4.setOnAction(value->{
			primaryStage.setTitle("Round Red");
		});
		
		
		Button btn5=new Button("Bevel Grey");
		btn5.setStyle("-fx-background-color:"
				+ "linear-gradient(#f2f2f2, #d6d6d6),"  
				+ "        linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%)," 
				+ "        linear-gradient(#dddddd 0%, #f6f6f6 50%);"  
				+ "    -fx-background-radius: 8,7,6;" // Menjao sam, ali ne primecujem efekte.
				+ "    -fx-background-insets: 0,1,2;" // Treca vrednost menja sivilo, povecava se sa povecanjem vrednosti.
				+ "    -fx-text-fill: black;"  
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
		
		btn5.setOnAction(value->{
			primaryStage.setTitle("Bevel Grey");
		});
		
		Button btn6=new Button("Glass Grey");
		btn6.setStyle("-fx-background-color: \r\n" 
				+ "        #c3c4c4,\r\n" 
				+ "        linear-gradient(#d6d6d6 50%, white 100%)," 
				+ "        radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%);" 
				+ "    -fx-background-radius: 30;" 
				+ "    -fx-background-insets: 0,1,1;" 
				+ "    -fx-text-fill: black;" 
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
		
		btn6.setOnAction(value->{
			primaryStage.setTitle("Glass Grey");
		});
		
		Button btn7=new Button("Shiny Orange");
		btn7.setStyle("-fx-background-color:" 
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
				+ "    -fx-padding: 10 20 10 20;");
		
		btn7.setOnAction(value->{
			primaryStage.setTitle("Shiny Orange");
		});
		
		
		Button btn8=new Button("Dark Blue");
		btn8.setStyle("-fx-background-color:"  
				+ "        #090a0c," 
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),"  
				+ "        linear-gradient(#20262b, #191d22)," 
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));" 
				+ "    -fx-background-radius: 5,4,3,5;"  
				+ "    -fx-background-insets: 0,1,2,0;"
				+ "    -fx-text-fill: white;" 
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );" 
				+ "    -fx-font-family: \"Arial\";" 
				+ "    -fx-text-fill: linear-gradient(white, #d0d0d0);"
				+ "    -fx-font-size: 12px;" 
				+ "    -fx-padding: 10 20 10 20;"
				+ "    -fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.9) , 1, 0.0 , 0 , 1 );");
		
		btn8.setOnAction(value->{
			primaryStage.setTitle("Dark Blue");
		});
		
		Button btn9=new Button("Record Sales");
		btn9.setStyle("-fx-padding: 8 15 15 15;"
				+ "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;" 
				+ "    -fx-background-radius: 8;" 
				+ "    -fx-background-color:"  
				+ "        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),"  
				+ "        #9d4024," 
				+ "        #d86e3a," 
				+ "        radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);" 
				+ "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );" 
				+ "    -fx-font-weight: bold;" 
				+ "    -fx-font-size: 1.1em;");
		
		btn9.setOnAction(value->{
			primaryStage.setTitle("Record Saled");
		});
		
		/*#record-sales:pressed {
    -fx-padding: 10 15 13 15;
    -fx-background-insets: 2 0 0 0,2 0 3 0, 2 0 4 0, 2 0 5 0;
}
#record-sales Text {
    -fx-fill: white;
    -fx-effect: dropshadow( gaussian , #a30000 , 0,0,0,2 );
}*/
		
		
		
		Button btn10=new Button("Rich Blue");
		btn10.setStyle(" -fx-background-color:" 
				+ "        #000000," 
				+ "        linear-gradient(#7ebcea, #2f4b8f)," 
				+ "        linear-gradient(#426ab7, #263e75)," 
				+ "        linear-gradient(#395cab, #223768);" 
				+ "    -fx-background-insets: 0,1,2,3;" 
				+ "    -fx-background-radius: 3,2,2,2;" 
				+ "    -fx-padding: 12 30 12 30;" 
				+ "    -fx-text-fill: white;" 
				+ "    -fx-font-size: 12px;"
				+ "    -fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		btn10.setOnAction(value->{
			primaryStage.setTitle("Rich Blue");
		});
		
		Button btn11=new Button("Big Yellow");
		btn11.setStyle("-fx-background-color:" 
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
				+ "    -fx-text-fill: #311c09;" 
				+ "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);"
				+ "    -fx-effect: dropshadow( one-pass-box , rgba(255,255,255,0.5) , 0, 0.0 , 0 , 1);");
		
		btn11.setOnAction(value->{
			primaryStage.setTitle("Big Yellow");
		});
		
		Button btn12=new Button("iPhone Dark Grey");
		btn12.setStyle("-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , -1 );"
				+ " -fx-background-color:" 
				+ "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%)," 
				+ "        linear-gradient(#020b02, #3a3a3a)," 
				+ "        linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%)," 
				+ "        linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%)," 
				+ "        linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);" 
				+ "    -fx-background-insets: 0,1,4,5,6;" 
				+ "    -fx-background-radius: 9,8,5,4,3;" 
				+ "    -fx-padding: 15 30 15 30;" 
				+ "    -fx-font-family: \"Helvetica\";" 
				+ "    -fx-font-size: 18px;" 
				+ "    -fx-font-weight: bold;" 
				+ "    -fx-text-fill: white;" 
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		
		
		btn12.setOnAction(value->{
			primaryStage.setTitle("iPhone Dark Grey");
		});
		
		Button btn13=new Button("iPad Grey");
		btn13.setStyle("  -fx-background-color:" 
				+ "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%)," 
				+ "        linear-gradient(#020b02, #3a3a3a),"
				+ "        linear-gradient(#b9b9b9 0%, #c2c2c2 20%, #afafaf 80%, #c8c8c8 100%),"  
				+ "        linear-gradient(#f5f5f5 0%, #dbdbdb 50%, #cacaca 51%, #d7d7d7 100%);"  
				+ "    -fx-background-insets: 0,1,4,5;"
				+ "    -fx-background-radius: 9,8,5,4;" 
				+ "    -fx-padding: 15 30 15 30;" 
				+ "    -fx-font-family: \"Helvetica\";"
				+ "    -fx-font-size: 18px;" 
				+ "    -fx-font-weight: bold;" 
				+ "    -fx-text-fill: #333333;" 
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		
		btn13.setOnAction(value->{
			primaryStage.setTitle("iPad Grey");
		});
		
		Button btn14=new Button("Lion Default");
		btn14.setStyle("-fx-background-color:"
				+ "        rgba(0,0,0,0.08)," 
				+ "        linear-gradient(#5a61af, #51536d)," 
				+ "        linear-gradient(#e4fbff 0%,#cee6fb 10%, #a5d3fb 50%, #88c6fb 51%, #d5faff 100%);" 
				+ "    -fx-background-insets: 0 0 -1 0,0,1;" 
				+ "    -fx-background-radius: 5,5,4;" 
				+ "    -fx-padding: 3 30 3 30;" 
				+ "    -fx-text-fill: #242d35;" 
				+ "    -fx-font-size: 14px;");
		
		btn14.setOnAction(value->{
			primaryStage.setTitle("Lion Default");
		});
		
		Button btn15=new Button("Lion");
		btn15.setStyle("-fx-background-color:" 
				+ "        rgba(0,0,0,0.08)," 
				+ "        linear-gradient(#9a9a9a, #909090)," 
				+ "        linear-gradient(white 0%, #f3f3f3 50%, #ececec 51%, #f2f2f2 100%);" 
				+ "    -fx-background-insets: 0 0 -1 0,0,1;" 
				+ "    -fx-background-radius: 5,5,4;" 
				+ "    -fx-padding: 3 30 3 30;" 
				+ "    -fx-text-fill: #242d35;" 
				+ "    -fx-font-size: 14px;");
		btn15.setOnAction(value->{
			primaryStage.setTitle("Lion");
		});
		
		
		Button btn16=new Button("Windows7 Default");
		btn16.setStyle("-fx-background-color:"
				+ "        #3c7fb1," 
				+ "        linear-gradient(#fafdfe, #e8f5fc)," 
				+ "        linear-gradient(#eaf6fd 0%, #d9f0fc 49%, #bee6fd 50%, #a7d9f5 100%);" 
				+ "    -fx-background-insets: 0,1,2;" 
				+ "    -fx-background-radius: 3,2,1;" 
				+ "    -fx-padding: 3 30 3 30;" 
				+ "    -fx-text-fill: black;" 
				+ "    -fx-font-size: 24px;");
		btn16.setOnAction(value->{
			primaryStage.setTitle("Windows7 Default");
		});
		
		Button btn17=new Button("Windows7");
		btn17.setStyle("fx-background-color:" 
				+ "        #707070," 
				+ "        linear-gradient(#fcfcfc, #f3f3f3),\r\n" 
				+ "        linear-gradient(#f2f2f2 0%, #ebebeb 49%, #dddddd 50%, #cfcfcf 100%);" 
				+ "    -fx-background-insets: 0,1,2;" 
				+ "    -fx-background-radius: 3,2,1;" 
				+ "    -fx-padding: 3 30 3 30;" 
				+ "    -fx-text-fill: black;" 
				+ "    -fx-font-size: 24px;");
		btn17.setOnAction(value->{
			primaryStage.setTitle("Windows7");
		});
		
		
		
		
		
		
		
		// --------!!! PAY ATTENTION ON VBOX !!!--------
	    // NE MOZE SE DODAVATI ISTA KOMPONENTA VISEO OD JEDAN PUT.
			                                                             
		// ZATO POSTOJE SPACE-OVI KOJI SE RAZLICITO ZOVU.
        // U SUPROTNOM DAJE GRESKU DUPLICATE CHILDREN ADDED SA JOS GOMILOM DRUGIH GRESAKA.

		                                                         
		VBox vbox= new VBox(btn1,space,btn2,space1,btn3,space2,btn4,space3,btn5,space4,btn6,space5);
		HBox hbox=new HBox(btn12,space11,btn13,space12,btn14,space13,btn15,space14,btn16,space15,btn17);
	    VBox vbox2= new VBox(vbox,btn7,space6,btn8,space7,btn9,space8,btn10,space9,btn11,space10,hbox);                                                         
        
		Scene scene = new Scene(vbox2, 500, 500);
	        primaryStage.setScene(scene);
	        primaryStage.show();
		
	}   

	
	public static void main(String[] args) {
		launch(args);

	}
}
