package xyz.lcdev.aidev.chess.ui

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane
import javafx.stage.Stage

import xyz.lcdev.aidev.chess.core.BoardState
import xyz.lcdev.aidev.chess.core.ChessPiece

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}

class Main: Application() {
    override fun start(stage: Stage) {
        val board = BoardState.standard()

        stage.title = "AI-Dev Chess"

        val mainPane = BorderPane()

        val center = GridPane()
        for(x in 0..7)
            for(y in 0..7)
                center.add(ChessPieceView(board[x, 7-y] ?: ChessPiece.Empty, x, y), x, y)
        center.alignment = Pos.CENTER

        mainPane.center = center

        mainPane.bottom = Label("©2022 Lightning Creations\n" +
                "AI-Dev is licensed under the BSDPlusPatent license. For more information, read the included LICENSE file.")

        val scene = Scene(mainPane, 1280.0, 720.0)
        scene.stylesheets.add(Main::class.java.getResource("dark-theme.css")?.toString())
        stage.scene = scene
        stage.show()
    }
}

class ChessPieceView(piece: ChessPiece, x: Int, y: Int): ImageView() {
    init {
        val piece = when(piece) {
            ChessPiece.Empty -> "em"
            ChessPiece.WhiteRook -> "wr"
            else -> "em" // TODO
        }
        val square = if((x + y) % 2 == 0) 'w' else 'b'
        image = Image(Main::class.java.getResource("pieces/${piece}${square}.png")?.toString())
        isPreserveRatio = true
    }
}
