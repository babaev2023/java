
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Stepan Babaev
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Say 'Hello'!");
        Label lbl1 = new Label("Inpur you name:");
        Label lbl2 = new Label();
        TextField txt = new TextField();
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if("".equals(txt.getText())) lbl2.setText("Hello World!");
                else lbl2.setText("Hello " + txt.getText()+ "!");
            }
        });
        
        //Размещаем кнопки
        GridPane root = new GridPane();
        root.add(lbl1, 0, 0);
        root.add(txt, 1, 0);
        root.add(btn, 1, 1);
        root.add(lbl2, 1, 2);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
