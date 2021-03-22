package Model;

import javafx.beans.property.ListProperty;

public class name {

	private String nameTyped = new String();
	
	public name(String name) {
		this.nameTyped = name;
	}

	public String getNameTyped() {
		return nameTyped;
	}

	public void setNameTyped(String nameTyped) {
		this.nameTyped = nameTyped;
	}
	
}
