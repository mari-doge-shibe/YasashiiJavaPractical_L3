package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sample7 extends Application {
    // sample code determining the key input and displays the result
    private Label lb1, lb2;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        lb1 = new Label("矢印キーでお選びください。");
        lb2 = new Label();

        BorderPane bp = new BorderPane();

        bp.setTop(lb1);
        bp.setBottom(lb2);

        Scene sc = new Scene(bp, 300, 200);

        sc.setOnKeyPressed(new SampleEventHandler());

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    // event handler class
    class SampleEventHandler implements EventHandler<KeyEvent> {
        public void handle(KeyEvent e) {
            String str;
            KeyCode k = e.getCode();
            switch(k){
                case UP:
                    str = "上";
                    break;
                case DOWN:
                    str = "下";
                    break;
                case LEFT:
                    str = "左";
                    break;
                case RIGHT:
                    str = "右";
                    break;
                default:
                    str = "他のキー";
            }
            lb2.setText(str + "ですね。");
        }
    }


}
