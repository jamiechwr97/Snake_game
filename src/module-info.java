module Snake2_0 {
	
	requires javafx.controls;
	requires javafx.base;
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}