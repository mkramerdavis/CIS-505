// Package declaration for the application. //
package EnhancedFutureValueApp;

// Import Statements for JavaFX and other necessary classes. //
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
 * KramerEnhancedFutureValueApp.java
 * This class implements the enhanced future value calculator application.
 */
public class KramerEnhancedFutureValueApp extends Application {

    // Private instance variables for controls. //
    private TextField txtMonthlyPayment;
    private TextField txtInterestRate;
    private TextArea txtResults;
    private ComboBox<Integer> cbYears;

    private Label lblMonthlyPayment;
    private Label lblInterestRate;
    private Label lblInterestRateFormat;
    private Label lblYears;
    private Label lblFutureValueDate;

    private Button btnClear;
    private Button btnCalculate;

    @Override
    public void start(Stage primaryStage) {

        // INPUT CONTROLS //
        txtMonthlyPayment = new TextField();
        txtInterestRate = new TextField();

        txtResults = new TextArea();
        txtResults.setEditable(false);

        // Labels //
        lblMonthlyPayment = new Label("Monthly Payment:");
        lblInterestRate = new Label("Interest Rate:");
        lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblYears = new Label("Years:");
        lblFutureValueDate = new Label();

        lblInterestRateFormat.setTextFill(Color.RED);

        // ComboBox //
        cbYears = new ComboBox<>();
        cbYears.getItems().addAll(1, 2, 3, 4, 5, 10, 15, 20, 25, 30);

        // LAYOUT //
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // Column alignment behavior //
        pane.setMinWidth(350);

        // Add Controls //
        GridPane.setHalignment(lblMonthlyPayment, HPos.LEFT);
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(txtMonthlyPayment, 1, 0);
        txtMonthlyPayment.setPrefWidth(150);

        GridPane.setHalignment(lblInterestRate, HPos.LEFT);
        pane.add(lblInterestRate, 0, 1);
        pane.add(txtInterestRate, 1, 1);
        txtInterestRate.setPrefWidth(150);

        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        GridPane.setHalignment(lblYears, HPos.LEFT);
        pane.add(lblYears, 0, 3);
        pane.add(cbYears, 1, 3);
        cbYears.setPrefWidth(150);

        pane.add(lblFutureValueDate, 0, 5, 2, 1);

        // BUTTONS //
        btnClear = new Button("Clear");
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate = new Button("Calculate");
        btnCalculate.setOnAction(e -> calculateResults());

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().addAll(btnClear, btnCalculate);

        pane.add(actionBtnContainer, 1, 4);

        // Output area //
        txtResults.setPrefHeight(120);
        txtResults.setPrefWidth(300);

        pane.add(txtResults, 0, 6, 2, 1);


        // SCENE //
        Scene scene = new Scene(pane, 305, 405);

        primaryStage.setTitle("Kramer Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    } // End of start() method. //

    // Method to clear form fields and reset the form. //
    private void clearFormFields() {
        txtMonthlyPayment.clear();
        txtInterestRate.clear();
        txtResults.clear();
        lblFutureValueDate.setText("");
        cbYears.setValue(null);
    }

    // Method to calculate the future value and display results. //
    private void calculateResults() {
        try {
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double rate = Double.parseDouble(txtInterestRate.getText());
            int years = cbYears.getValue();

            double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);

            lblFutureValueDate.setText("Calculation as of " + getFormattedDate());

            NumberFormat currency = NumberFormat.getCurrencyInstance();

            txtResults.setText("The future value is " + currency.format(futureValue));
        } 
        catch (Exception e) {
        txtResults.setText("Please enter valid values.");
        }
    }

    // Method to get the current date formatted as MM/dd/yyyy. //
    private String getFormattedDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(new Date());
    }

    // Main method to launch the application. //
    public static void main(String[] args) {
        launch(args);
    }
}// End of KramerEnhancedFutureValueApp.java //