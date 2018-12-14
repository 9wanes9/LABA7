package labafx;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private TextField textFiled;
    @FXML
    private Button button1;
    @FXML
    private Slider slider1;
    @FXML
    private Slider slider2;
    @FXML
    private Slider slider3;
    @FXML
    private Slider slider4;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label5.setText("Введите число 5902");
        textFiled.setText("Вы ввели:"+Integer.toString((int)slider1.getValue())+Integer.toString((int)slider2.getValue())+Integer.toString((int)slider3.getValue())+Integer.toString((int)slider4.getValue()));
        label3.setText(Integer.toString((int)slider1.getValue()));
        label1.setText(Integer.toString((int)slider2.getValue()));
        label2.setText(Integer.toString((int)slider3.getValue()));
        label4.setText(Integer.toString((int)slider4.getValue()));
        }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
