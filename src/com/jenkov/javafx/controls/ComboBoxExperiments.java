package com.jenkov.javafx.controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import com.itextpdf.text.Font;
import com.itextpdf.text.*;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.*;
import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.event.EventHandler;


public class ComboBoxExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ComboBox Experiment 1");
        ColorPicker colorPicker = new ColorPicker();

        Color value = colorPicker.getValue();

        VBox vBox = new VBox(colorPicker);
        //HBox hBox = new HBox(button1, button2);


        ComboBox comboBox = new ComboBox();

        comboBox.getItems().add("Choice 1");
        comboBox.getItems().add("Choice 2");
        comboBox.getItems().add("Choice 3");


        String sWatermark = "Test me";

        EventHandler<ActionEvent> evtChangeFont =
                new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent e) {

                        Object selectedItem = comboBox.getSelectionModel().getSelectedItem();

//                        System.out.println(selectedItem);

                        if (selectedItem.equals("Choice 1")) {
                            Font f = new Font(FontFamily.HELVETICA, 18);
                            Phrase p = new Phrase(sWatermark, f);
                            System.out.println(f.getFamily().toString());

                        } else if (selectedItem.equals("Choice 2")) {
                            Font f = new Font(FontFamily.TIMES_ROMAN, 18);
                            Phrase p = new Phrase(sWatermark, f);
                            System.out.println(f.getFamily().toString());

                        } else if (selectedItem.equals("Choice 3")) {
                            Font f = new Font(FontFamily.COURIER, 18);
                            Phrase p = new Phrase(sWatermark, f);
                            System.out.println(f.getFamily().toString());
                        }
                    }
                };

        comboBox.setOnAction(evtChangeFont);



        HBox hbox = new HBox(comboBox);

        Scene scene = new Scene(hbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}