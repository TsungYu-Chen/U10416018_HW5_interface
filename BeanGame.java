import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class BeanGame extends Application{
	@Override
	public void start(Stage primaryStage){
		Scene scene = new Scene(new LinePane(), 500, 500);
		primaryStage.setTitle("Beangame");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	class LinePane extends Pane{
		public LinePane(){
			Line lineUp1 = new Line(230, 50, 230, 90);
			lineUp1.setStrokeWidth(5);
			lineUp1.setStroke(Color.GREEN);
			getChildren().add(lineUp1);
			
			Line lineUp2 = new Line(270, 50, 270, 90);
			lineUp2.setStrokeWidth(5);
			lineUp2.setStroke(Color.GREEN);
			getChildren().add(lineUp2);
			
			Line lineUp3 = new Line(230, 90, 100, 350);
			lineUp3.setStrokeWidth(5);
			lineUp3.setStroke(Color.GREEN);
			getChildren().add(lineUp3);
			
			Line lineUp4 = new Line(270, 90, 400, 350);
			lineUp4.setStrokeWidth(5);
			lineUp4.setStroke(Color.GREEN);
			getChildren().add(lineUp4);
			
			Line lineDown1 = new Line(100, 350, 100, 440);
			lineDown1.setStrokeWidth(5);
			lineDown1.setStroke(Color.GREEN);
			getChildren().add(lineDown1);
			
			Line lineDown2 = new Line(400, 350, 400, 440);
			lineDown2.setStrokeWidth(5);
			lineDown2.setStroke(Color.GREEN);
			getChildren().add(lineDown2);
			
			Line lineDown3 = new Line(100, 440, 400, 440);
			lineDown3.setStrokeWidth(5);
			lineDown3.setStroke(Color.GREEN);
			getChildren().add(lineDown3);
			
			Line lineM1 = new Line(137, 350, 137, 440);
			lineM1.setStrokeWidth(5);
			lineM1.setStroke(Color.BLUE);
			getChildren().add(lineM1);
			
			Line lineM2 = new Line(176, 350, 176, 440);
			lineM2.setStrokeWidth(5);
			lineM2.setStroke(Color.BLUE);
			getChildren().add(lineM2);
			
			Line lineM3 = new Line(213, 350, 213, 440);
			lineM3.setStrokeWidth(5);
			lineM3.setStroke(Color.BLUE);
			getChildren().add(lineM3);
			
			Line lineM4 = new Line(252, 350, 252, 440);
			lineM4.setStrokeWidth(5);
			lineM4.setStroke(Color.BLUE);
			getChildren().add(lineM4);
			
			Line lineM5 = new Line(289, 350, 289, 440);
			lineM5.setStrokeWidth(5);
			lineM5.setStroke(Color.BLUE);
			getChildren().add(lineM5);
			
			Line lineM6 = new Line(328, 350, 328, 440);
			lineM6.setStrokeWidth(5);
			lineM6.setStroke(Color.BLUE);
			getChildren().add(lineM6);
			
			Line lineM7 = new Line(365, 350, 365, 440);
			lineM7.setStrokeWidth(5);
			lineM7.setStroke(Color.BLUE);
			getChildren().add(lineM7);
			
		}
	}
	
}
