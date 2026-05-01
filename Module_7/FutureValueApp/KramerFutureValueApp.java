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

public class KramerFutureValueApp extends Application {

    // Private instance variables for controls. //
    private TextField txtMonthlyPayment;
    private TextField txtInterestRate;
    private TextArea txtAreaFutureValue;
    private ComboBox<Integer> cbYears;

    private Label lblMonthlyPayment;
    private Label lblInterestRate;
    private Label lblInterestRateFormat;
    private Label lblYears;

    private Button btnClear;
    private Button btnCalculate;

    @Override
    public void start(Stage primaryStage) {

        // INPUT CONTROLS //
        txtMonthlyPayment = new TextField();
        txtInterestRate = new TextField();

        txtAreaFutureValue = new TextArea();
        txtAreaFutureValue.setEditable(false);

        // Labels //
        lblMonthlyPayment = new Label("Monthly Payment:");
        lblInterestRate = new Label("Interest Rate:");
        lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblYears = new Label("Years:");

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

        // column alignment behavior
        pane.setMinWidth(350);

        // Add controls //
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

        // BUTTONS //
        btnClear = new Button("Clear");
        btnCalculate = new Button("Calculate");

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().addAll(btnClear, btnCalculate);

        pane.add(actionBtnContainer, 1, 4);

        // Output area //
        txtAreaFutureValue.setPrefHeight(120);
        txtAreaFutureValue.setPrefWidth(300);

        pane.add(txtAreaFutureValue, 0, 5, 2, 1);


        // SCENE //
        Scene scene = new Scene(pane, 300, 400);

        primaryStage.setTitle("Kramer Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}