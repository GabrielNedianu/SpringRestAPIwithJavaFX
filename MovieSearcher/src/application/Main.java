package application;
	


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	
	public void start(Stage primaryStage) {
		try {
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));
			
			Text scenetitle = new Text("Salutare!");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);

			Label userName = new Label("Introdu filmul :");
			grid.add(userName, 0, 1);

			TextField userTextField = new TextField();
			grid.add(userTextField, 1, 1);
			
			Button btn = new Button("Cauta!");
			HBox hbBtn = new HBox(10);
			hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbBtn.getChildren().add(btn);
			grid.add(hbBtn, 1, 4);
			
			final Text actiontarget = new Text();
	        grid.add(actiontarget, 1, 6);
	        
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	        	 
	            @Override
	            public void handle(ActionEvent e) {
	            	String FilmIntrodus = userTextField.getText();
	                //MovieScene(FilmIntrodus);
	            	primaryStage.setTitle("Poftim Filmul");
	                primaryStage.setScene(MovieScene(FilmIntrodus));
	                primaryStage.show();
	            }
	        });
	
			Scene scene = new Scene(grid, 300, 275);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setTitle("Movie Searcher!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static String JsonFilm() {
		
		
		
		return null;
	}
	
	public static Scene MovieScene(String movieS) {
		
		String[] Info = JsuopReturner.getInformation(movieS);
        
        Text numeFilm = new Text(Info[0]);
        numeFilm.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
        Image image = new Image(Info[1]);
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        
        Text numePlot = new Text(Info[2]);
        numePlot.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
        BorderPane border = new BorderPane();
        border.setTop(numeFilm);
        border.setLeft(imageView);
        border.setBottom(numePlot);
        
        Scene scene = new Scene(border, 600, 600); 
        //stage.setTitle("Loading an image");
        
		return scene;	
	}
}
