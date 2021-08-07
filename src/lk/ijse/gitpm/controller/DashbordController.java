/*
 *
 *  * *
 *  *  * @author : Tharaka Dasunpriya<tharakadasunpriya.tharaka@gmail.com>
 *  *  * @since : 07/08/2021
 *  *  *
 *
 */

package lk.ijse.gitpm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class DashbordController {
    @FXML
    private Button btnCustomer;

    @FXML
    private BorderPane main;

    @FXML
    void navigateToCustomer(ActionEvent event) {

        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/lk/ijse/gitpm/view/Customer.fxml")));

        } catch (Exception e) {
            e.printStackTrace();
        }
        main.setCenter(root);
    }


}
