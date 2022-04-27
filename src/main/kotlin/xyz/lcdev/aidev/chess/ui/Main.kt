import javafx.application.Application
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.stage.Stage

class Main: Application() {
    fun main(args: Array<String>) {
        launch(*args)
    }

    override fun start(primaryStage: Stage) {
        primaryStage.title = "AI-Dev Chess"
        val mainPane = BorderPane()
        mainPane.center = Button("Center")
    }
}
