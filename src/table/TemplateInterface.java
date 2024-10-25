
package table;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TemplateInterface extends Application{

    public static void main(String[] args) {
        launch(args); //<---------
    }
    @Override
    public void start (Stage stage) throws Exception{
       
       StackPane root = new StackPane();
       Scene scene = new Scene(root, 300, 300);
       stage.setScene(scene);
       stage.show();//<---------
       //documentation java 5. ADD VM Options
    }
}