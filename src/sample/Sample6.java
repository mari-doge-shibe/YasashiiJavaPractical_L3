package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;




public class Sample6 extends Application {
    // sample code containing an event handler on mouse entered/exit events
    private Label lb;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        lb = new Label();

        BorderPane bp = new BorderPane();

        bp.setTop(lb);

        Scene sc = new Scene(bp, 300, 200);

        sc.addEventHandler(MouseEvent.MOUSE_ENTERED, new SampleEventHandler());
        sc.addEventHandler(MouseEvent.MOUSE_EXITED, new SampleEventHandler());

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    // event handler class
    class SampleEventHandler implements EventHandler<MouseEvent> {
        public void handle(MouseEvent e) {
            if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
                lb.setText("いらっしゃいませ。");
            } else if(e.getEventType() == MouseEvent.MOUSE_EXITED) {
                lb.setText("ようこそ。");
            }
        }
    }
}
