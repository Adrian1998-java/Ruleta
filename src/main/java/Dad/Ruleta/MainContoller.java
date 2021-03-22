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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class MainContoller implements Initializable {

	//listView
	private List<String> listOfNames = new ArrayList<String>();
	
	@FXML
    private BorderPane view;

    @FXML
    private ListView<String> listView;

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
		listOfNames.add(optionView.getText());
		listView.getItems().add(optionView.getText());
		optionView.clear();
    }
	
    @FXML
    void onEnterInputPressed(KeyEvent event) {
    	if(event.getCode().equals(KeyCode.ENTER))
    	{
    		onAniadir(null);   	
    	}
    }
    

    @FXML
    void onBorrar(ActionEvent event) {
    	listOfNames.remove(listView.getFocusModel().getFocusedIndex());
    	listView.getItems().remove(listView.getFocusModel().getFocusedItem());
    }

    @FXML
    void onGanador(ActionEvent event) {
	
    	int ramdomInteger = 0 + (int)(Math.random() * listOfNames.size());
    	
    	resultText.setText(listOfNames.get(ramdomInteger));
    }


}
