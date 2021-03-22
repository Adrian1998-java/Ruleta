package Dad.Ruleta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class App extends Application
{
	private MainContoller mainController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		mainController = new MainContoller();
		
		Scene scene = new Scene(mainController.getView());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ruleta");
		primaryStage.getIcons().add(new Image("Images/Icon.png"));
		
		
		primaryStage.show();
	}
    public static void main( String[] args ) 
    {
    	launch(args);
	}
}
