package xyz.lcdev.aidev.chess.ui

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.stage.Stage

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}

class Main: Application() {
    override fun start(stage: Stage) {
        stage.title = "AI-Dev Chess"
        val mainPane = BorderPane()
        mainPane.center = Button("Center")
        val scene = Scene(mainPane, 1280.0, 720.0)
        stage.scene = scene
        stage.show()
    }
}
