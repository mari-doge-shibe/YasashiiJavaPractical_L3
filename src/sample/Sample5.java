package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// In this sample, clicking any point on the scene changes the label text

public class Sample5 extends Application {
    private Label lb;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        // create a control
        lb = new Label("いらっしゃいませ");

        // create a pane
        BorderPane bp = new BorderPane();

        // add the control to the pane
        bp.setTop(lb);

        // create a scene
        Scene sc = new Scene(bp, 300, 200);

        // register an event handler
        sc.addEventHandler(MouseEvent.MOUSE_CLICKED, new SampleEventHandler());

        // add the scene to the stage
        stage.setScene(sc);

        // display the stage
        stage.setTitle("サンプル");
        stage.show();
    }

    // event handler class
    class SampleEventHandler implements EventHandler<MouseEvent> {
        public void handle(MouseEvent e) {
            lb.setText("ご購入ありがとうございます。");
        }
    }

}
