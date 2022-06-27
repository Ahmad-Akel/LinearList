package gui;

import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ahmad Akel
 */
public class ControlPanelHBox extends HBox {

    public ControlPanelHBox() {
        setPadding(new Insets(35, 0, 0, 0));
        setSpacing(15);
    }

    public void addButton(String name, EventHandler<ActionEvent> handler) {
        Button button = new Button(name);
        button.setPrefSize(100, 30);
        button.setOnAction(handler);
        getChildren().add(button);
    }

    public void addLabel(String text) {
        Label label = new Label(text);
        label.setPadding(new Insets(5, 0, 0, 20));
        getChildren().add(label);
    }

    public void addComboBox(Enum[] items, EventHandler<ActionEvent> handler) {
        ComboBox comboBox = new ComboBox(FXCollections.observableList(Arrays.asList(items)));
        comboBox.setPrefSize(130, 30);
        comboBox.setOnAction(handler);
        getChildren().add(comboBox);
    }

    public void addLabel(Label label) {
        getChildren().add(label);
    }
}
