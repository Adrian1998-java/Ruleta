package Dad.Ruleta;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Model.name;


public class MainContoller implements Initializable {

	//listView
	
	private ListView<name> listNames = new ListView<name>();
	private List<name> listOfNames = new ArrayList<name>();
	private ObjectProperty<name> name=new SimpleObjectProperty<>();
	
	@FXML
    private BorderPane view;

    @FXML
    private ListView<name> listView;

    @FXML
    private TextField optionView;

    @FXML
    private Button aniadirButton;

    @FXML
    private Button borrarButton;

    @FXML
    private TextField resultText;

    @FXML
    private Button resultButton;

    public MainContoller() throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
    }
    
	public void initialize(URL location, ResourceBundle resources) {
		resultText.setDisable(true);
		
		
	}
	
	public BorderPane getView() {
		return view;
	}
	
	@FXML
    void onAniadir(ActionEvent event) {
		listOfNames.add(new name(optionView.getText()));
		listNames.getItems().add(new name(optionView.getText()));
    }

    @FXML
    void onBorrar(ActionEvent event) {
    	listOfNames.remove(listView.getFocusModel().getFocusedIndex());
    	listView.getItems().remove(listView.getFocusModel().getFocusedItem());
    }

    @FXML
    void onGanador(ActionEvent event) {
    	int i = 0;
    	while(i <= listOfNames.size())
    		i++;
    	int ramdomInteger = 0 + (int)(Math.random() * i-1);
    	
    	resultText.setText(listOfNames.get(ramdomInteger).getNameTyped());
    }


}
