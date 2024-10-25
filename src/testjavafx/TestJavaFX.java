
package testjavafx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestJavaFX extends Application{

    public static void main(String[] args) {
        launch(args); //<---------
    }
    @Override
    public void start (Stage stage) throws Exception{
       Button button = new Button("Hello");
       button.setOnAction(e->{
           Alert alert = new Alert(AlertType.INFORMATION,"Hello");
           alert.showAndWait();
       });
       StackPane root = new StackPane();
       root.getChildren().add(button);
       Scene scene = new Scene(root, 300, 300);
       stage.setScene(scene);
       stage.show();//<---------
       //documentation java 5. ADD VM Options
    }
}