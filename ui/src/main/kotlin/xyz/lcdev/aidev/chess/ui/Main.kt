package xyz.lcdev.aidev.chess.ui

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
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

        mainPane.bottom = Label("©2022 Lightning Creations\n" +
                "AI-Dev is licensed under the BSDPlusPatent license. For more information, read the included LICENSE file.")

        val scene = Scene(mainPane, 1280.0, 720.0)
        scene.stylesheets.add(Main::class.java.getResource("dark-theme.css")?.toString())
        stage.scene = scene
        stage.show()
    }
}
