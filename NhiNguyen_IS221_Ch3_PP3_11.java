/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch3_PP3_11
   Author:   Nhi Nguyen
   Date:     Feb 16, 2023
   Language: Java
   Purpose:  The purpose of this program is to write a JavaFX application that
             displays the Olympic logo.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Feb 16, 2023
   Desc.:    This is the original version of the code.  
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch3_pp3_11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class NhiNguyen_IS221_Ch3_PP3_11 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle cir_blueCircle = new Circle(100, 100, 50, Color.BLUE);
        cir_blueCircle.setFill(Color.TRANSPARENT);
        cir_blueCircle.setStroke(Color.BLUE);
        cir_blueCircle.setStrokeWidth(8.0d);
        
        Circle cir_yellowCircle = new Circle(160, 150, 50, Color.YELLOW);
        cir_yellowCircle.setFill(Color.TRANSPARENT);
        cir_yellowCircle.setStroke(Color.YELLOW);
        cir_yellowCircle.setStrokeWidth(8.0d);
        
        Circle cir_blackCircle = new Circle(220, 100, 50, Color.BLACK);
        cir_blackCircle.setFill(Color.TRANSPARENT);
        cir_blackCircle.setStroke(Color.BLACK);
        cir_blackCircle.setStrokeWidth(8.0d);
        
        Circle cir_greenCircle = new Circle(280, 150, 50, Color.GREEN);
        cir_greenCircle.setFill(Color.TRANSPARENT);
        cir_greenCircle.setStroke(Color.GREEN);
        cir_greenCircle.setStrokeWidth(8.0d);
        
        Circle cir_redCircle = new Circle(340, 100, 50, Color.RED);
        cir_redCircle.setFill(Color.TRANSPARENT);
        cir_redCircle.setStroke(Color.RED);
        cir_redCircle.setStrokeWidth(8.0d);
        
        Group grpMyGroup = new Group(cir_blueCircle, cir_yellowCircle, 
                cir_blackCircle, cir_greenCircle, cir_redCircle);
        
        Scene scene = new Scene(grpMyGroup, 450, 250);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Olympic Logo");
        primaryStage.show();
    }    
    public static void main(String[] args) {
        launch(args);
    }

}
