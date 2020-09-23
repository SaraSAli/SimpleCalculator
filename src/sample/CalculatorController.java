package sample;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {
    float data = 0;
    int operation = -1;
    float ans = 0;
    Stack<String> history = new Stack<>();
    History obj;

    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button dot;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button five;
    @FXML
    private Button mod;
    @FXML
    private Label label;

    @FXML
    void handleEventButton(ActionEvent event) {
        if (event.getSource() == one) {
            obj.history.push("1");
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            obj.history.push("2");
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            obj.history.push("3");
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            obj.history.push("4");
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            obj.history.push("5");
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            obj. history.push("6");
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            obj. history.push("7");
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            obj.history.push("8");
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            obj.history.push("9");
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            obj.history.push("0");
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
            label.setText("");
        } else if (event.getSource() == dot)
            display.setText(display.getText() + ".");

        else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            label.setText(String.valueOf(data));
            operation = 1; //Addition
            display.setText("");
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            label.setText(String.valueOf(data));
            operation = 2; //Subtraction
            display.setText("");

        } else if (event.getSource() == mult) {
            data = Float.parseFloat(display.getText());
            label.setText(String.valueOf(data));
            operation = 3; //Multiplication
            display.setText("");
        } else if (event.getSource() == div) {
            data = Float.parseFloat(display.getText());
            label.setText(String.valueOf(data));
            operation = 4; //Division
            display.setText("");
        } else if (event.getSource() == mod) {
            data = Float.parseFloat(display.getText());
            label.setText(String.valueOf(data));
            operation = 5; //mod
            display.setText("");
        } else if (event.getSource() == equal) {
            float data2 = Float.parseFloat(display.getText());
            switch (operation) {
                case 1:
                    ans = data2 + data;
                    display.setText(String.valueOf(ans));
                    label.setText(label.getText() + "+" + String.valueOf(data2));
                    break;
                case 2:
                    ans = data - data2;
                    display.setText(String.valueOf(ans));
                    label.setText(label.getText() + "-" + String.valueOf(data2));
                    break;
                case 3:
                    ans = data * data2;
                    display.setText(String.valueOf(ans));
                    label.setText(label.getText() + "*" + String.valueOf(data2));
                    break;
                case 4:
                    try {
                        ans = data / data2;
                    } catch (Exception e) {
                        display.setText("ERROR");
                    }
                    display.setText(String.valueOf(ans));
                    label.setText(label.getText() + "/" + String.valueOf(data2));
                    break;
                case 5:
                    ans = data % data2;
                    display.setText(String.valueOf(ans));
                    label.setText(label.getText() + "%" + String.valueOf(data2));
            }
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resources) {

    }
}
