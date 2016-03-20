import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Circle;

public class BeanGame extends Application{

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
	
		Polyline line = new Polyline();
		line.getPoints().addAll(150d,40d,150d,60d,120d,160d,120d,190d);
		
		Polyline line2 = new Polyline();
		line2.getPoints().addAll(180d,40d,180d,60d,210d,160d,210d,190d);
		
		Polyline line3 = new Polyline();
		line3.getPoints().addAll(120d,190d,210d,190d);
		
		
		Group g = new Group();
		
		g.getChildren().add(line);
		g.getChildren().add(line2);
		g.getChildren().add(line3);
	
		// Create a scene and place it in the stage
		Scene scene = new Scene(g, 340, 250);
		primaryStage.setTitle("Beam Game"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}	

  public static void main(String[] args) {
    launch(args);
  }
}
