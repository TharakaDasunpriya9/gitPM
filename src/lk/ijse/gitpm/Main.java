

package lk.ijse.gitpm;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/lk/ijse/gitpm/view/dashbord.fxml")));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            //primaryStage.initStyle(StageStyle.TRANSPARENT);
            //primaryStage.setFullScreen(true);
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
