// Package angeben
package ButtonBar;

// Benötigte Libraries importieren

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import GraphicObjects.*;

/**
 * 
 * @author Phil Köster // Dominique Berners
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane canvas;
    
    @FXML
    private TextField polygonNumberOfAngles;
    
    @FXML
    private void handleButtonActionRectangle(ActionEvent event) {
        
        final Rectangle r = new Rectangle("Horst", Color.GREEN, 100, 100, 100, 100);
        r.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                
                System.out.println("Das Rechteck " + r.getName() + " wurde ausgewählt.");
                
            }
            
        });
        canvas.getChildren().add(r);
        
    }
    
    @FXML
    private void handleButtonActionCircle(ActionEvent event) {
        
        final Circle c = new Circle("Angelika", Color.BLUE, 100, 100, 40);
        c.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                
                System.out.println("Der Kreis " + c.getName() + " wurde ausgewählt.");
                
            }
            
        });
        canvas.getChildren().add(c);
        
    }
    
    @FXML
    private void handleButtonActionTriangle(ActionEvent event) {
        
        final Triangle t = new Triangle("Wilhelmine", Color.YELLOW, 60, 60, 80);
        t.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                
                System.out.println("Das Dreieck " + t.getName() + " wurde ausgewählt.");
                
            }
            
        });
        canvas.getChildren().add(t);
        
    }
    
    @FXML
    private void handleButtonActionLine(ActionEvent event) {
        
        final Line l = new Line("Gottfried", Color.RED, 100, 50, 150, 100);
        l.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                
                System.out.println("Die Linie " + l.getName() + " wurde ausgewählt.");
                
            }
            
        });
        canvas.getChildren().add(l);
        
    }
    
    @FXML
    private void handleButtonActionPolygon(ActionEvent event) {
        
        String s = polygonNumberOfAngles.getCharacters().toString();
        if (s.length() > 0 && s.matches("[0-9]+")) {
            
            int numberOfAngles = Integer.parseInt(s);
            if (numberOfAngles > 0) {
                
                final Polygon p = new Polygon("Sybille", Color.GRAY, numberOfAngles, 200, 200);
                p.setOnMousePressed(new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent event) {

                        System.out.println("Das Polygon " + p.getName() + " wurde ausgewählt.");

                    }

                });
                canvas.getChildren().add(p);
                
            }
                
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
