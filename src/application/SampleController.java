package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class SampleController implements Initializable {

	TranslateTransition slide = new TranslateTransition();
	
    @FXML
    private AnchorPane panelSlide;

    @FXML
    void processPlay(ActionEvent event) {
    	slide.setDuration(Duration.seconds(0.2));
    	slide.setNode(panelSlide);
    	
    	slide.setToX(0);
    	slide.play();
    	
    	panelSlide.setTranslateX(400);
    }
    

    @FXML
    void processCancel(ActionEvent event) {
    	slide.setDuration(Duration.seconds(0.2));
    	slide.setNode(panelSlide);
    	
    	slide.setToX(410);
    	slide.play();
    	
    	panelSlide.setTranslateX(0);
    }
    
    @FXML
    void processClose(MouseEvent event) {
    	slide.setDuration(Duration.seconds(0.2));
    	slide.setNode(panelSlide);
    	
    	slide.setToX(410);
    	slide.play();
    	
    	panelSlide.setTranslateX(0);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		panelSlide.setTranslateX(410);
	}

}
