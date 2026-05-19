import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KramerGradeBookApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Title Label //
        Label lblTitle = new Label("Grade Book Application");
        lblTitle.setTextFill(Color.web("#4B2E83"));

        // Form Labels //
        Label lblFirstName = new Label("First Name:");
        Label lblLastName = new Label("Last Name:");
        Label lblCourse = new Label("Course:");
        Label lblGrade = new Label("Grade:");
        Label lblComments = new Label("Comments:");
        
        // Labels Array for Styling. //
        Label[] labels = {
                lblFirstName,
                lblLastName,
                lblCourse,
                lblGrade,
                lblComments
        };

        // Text Fields //
        TextField txtFirstName = new TextField();
        TextField txtLastName = new TextField();
        TextField txtCourse = new TextField();

        // Set Max Width for Text Fields to Allow Dynamic Scaling. //
        txtFirstName.setMaxWidth(Double.MAX_VALUE);
        txtLastName.setMaxWidth(Double.MAX_VALUE);
        txtCourse.setMaxWidth(Double.MAX_VALUE);

        // ComboBox for Grades
        ComboBox<String> cboGrade = new ComboBox<>();
        cboGrade.getItems().addAll(
                "A", "A-", 
                "B+", "B", "B-", 
                "C+", "C", "C-", 
                "D+", "D", "D-", 
                "F"
        );
        cboGrade.setPromptText("Select Grade");
        cboGrade.setMaxWidth(Double.MAX_VALUE);

        // Comments Area //
        TextArea txtComments = new TextArea();
        txtComments.setPrefRowCount(4);
        txtComments.setMaxWidth(Double.MAX_VALUE);
        txtComments.setMaxHeight(Double.MAX_VALUE);

        // Buttons //
        Button btnSave = new Button("Save Grade");
        Button btnView = new Button("View Grades");
        Button btnClear = new Button("Clear Form");

        // Results Area //
        Label lblResults = new Label("Results:");
        lblResults.setTextFill(Color.web("#4B2E83"));

        TextArea txtResults = new TextArea();
        txtResults.setEditable(false);
        txtResults.setPrefRowCount(20);
        txtResults.setMaxWidth(Double.MAX_VALUE);
        txtResults.setMinHeight(250);
        txtResults.setMaxHeight(Double.MAX_VALUE);

        // Allow Vertical Growth //
        VBox.setVgrow(txtComments, Priority.ALWAYS);
        VBox.setVgrow(txtResults, Priority.ALWAYS);

        // Allow Horizontal Growth //
        GridPane.setHgrow(txtFirstName, Priority.ALWAYS);
        GridPane.setHgrow(txtLastName, Priority.ALWAYS);
        GridPane.setHgrow(txtCourse, Priority.ALWAYS);
        GridPane.setHgrow(cboGrade, Priority.ALWAYS);
        GridPane.setHgrow(txtComments, Priority.ALWAYS);

        // Placeholder Event Handlers //
        btnSave.setOnAction(e -> {
            
        });

        btnView.setOnAction(e -> {
            
        });

        btnClear.setOnAction(e -> {
            
        });

        // GridPane Layout //
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(15);
        grid.setVgap(15);

        // Add Column Constraints //
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setMinWidth(150);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setMinWidth(300);
        column2.setHgrow(Priority.ALWAYS);

        grid.getColumnConstraints().addAll(column1, column2);

        // Add Components to Grid //
        grid.add(lblFirstName, 0, 0);
        grid.add(txtFirstName, 1, 0);

        grid.add(lblLastName, 0, 1);
        grid.add(txtLastName, 1, 1);

        grid.add(lblCourse, 0, 2);
        grid.add(txtCourse, 1, 2);

        grid.add(lblGrade, 0, 3);
        grid.add(cboGrade, 1, 3);

        grid.add(lblComments, 0, 4);
        grid.add(txtComments, 1, 4);

        // Button Layout //
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(
                btnSave,
                btnView,
                btnClear
        );
        buttonBox.setAlignment(Pos.CENTER);

        // Main Layout //
        VBox root = new VBox(15);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #F4F4F4;");

        root.getChildren().addAll(
                lblTitle,
                grid,
                buttonBox,
                lblResults,
                txtResults
        );

        // Scene //
        Scene scene = new Scene(root, 600, 500);

        // Dynamic Scaling and Styling for Title. //
        lblTitle.styleProperty().bind(
            Bindings.concat(
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-size: ",
                scene.widthProperty().divide(32),
                "px;",
                "-fx-font-weight: bold;",
                "-fx-text-fill: #4B2E83;"
            )
        );

        // Dynamic Scaling and Styling for Form Labels. //
        for (Label lbl : labels) {

        lbl.styleProperty().bind(
            Bindings.concat(
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-size: ",
                scene.widthProperty().divide(50),
                "px;",
                "-fx-font-weight: bold;",
                "-fx-text-fill: #4B2E83;"
                )
            );
        }

        // Dynamic Scaling and Styling for TextFields. //
        txtFirstName.styleProperty().bind(
            Bindings.concat(
                "-fx-background-color: #E0E0E0;",
                "-fx-text-fill: #4B2E83;",
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-weight: bold;",
                "-fx-background-radius: 5;",
                "-fx-font-size: ",
                scene.widthProperty().divide(65),
                "px;"
            )
        );

        txtLastName.styleProperty().bind(
            Bindings.concat(
                "-fx-background-color: #E0E0E0;",
                "-fx-text-fill: #4B2E83;",
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-weight: bold;",
                "-fx-background-radius: 5;",
                "-fx-font-size: ",
                scene.widthProperty().divide(65),
                "px;"
            )
        );

        txtCourse.styleProperty().bind(
            Bindings.concat(
                "-fx-background-color: #E0E0E0;",
                "-fx-text-fill: #4B2E83;",
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-weight: bold;",
                "-fx-background-radius: 5;",
                "-fx-font-size: ",
                scene.widthProperty().divide(65),
                "px;"
            )
        );

        txtComments.styleProperty().bind(
            Bindings.concat(
                "-fx-background-color: #E0E0E0;",
                "-fx-text-fill: #4B2E83;",
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-weight: bold;",
                "-fx-background-radius: 5;",
                "-fx-font-size: ",
                scene.widthProperty().divide(65),
                "px;"
            )
        );

        // Dynamic ComboBox Scaling
        cboGrade.styleProperty().bind(
            Bindings.concat(
                "-fx-background-color: #B7A369;",
                "-fx-text-fill: #4B2E83;",
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-weight: bold;",
                "-fx-background-radius: 5;",
                "-fx-font-size: ",
                scene.widthProperty().divide(65),
                "px;"
            )
        );

        // Dynamic Scaling and Styling for Buttons. //
        Button[] buttons = {
                btnSave,
                btnView,
                btnClear
        };

        for (Button btn : buttons) {

            btn.styleProperty().bind(
                Bindings.concat(
                    "-fx-background-color: #4B2E83;",
                    "-fx-text-fill: white;",
                    "-fx-font-family: 'Times New Roman';",
                    "-fx-font-size: ",
                    scene.widthProperty().divide(65),
                    "px;",
                    "-fx-font-weight: bold;",
                    "-fx-background-radius: 5;"
                )
            );
        }

        // Dynamic Scaling and Styling for Results Label. //
        lblResults.styleProperty().bind(
            Bindings.concat(
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-size: ",
                scene.widthProperty().divide(30),
                "px;",
                "-fx-font-weight: bold;",
                "-fx-text-fill: #4B2E83;"
            )
        );

        // Dynamic Scaling and Styling forResults Area . //
        txtResults.styleProperty().bind(
            Bindings.concat(
                "-fx-background-color: #E0E0E0;",
                "-fx-text-fill: #4B2E83;",
                "-fx-font-family: 'Times New Roman';",
                "-fx-font-weight: bold;",
                "-fx-background-radius: 5;",
                "-fx-font-size: ",
                scene.widthProperty().divide(45),
                "px;"
            )
        );

        // Stage //
        primaryStage.setTitle("GradeBookApp");
        primaryStage.setScene(scene);

        // Set Minimum Size to Ensure Usability. //
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(500);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
} // End of KramerGradeBookApp.java
