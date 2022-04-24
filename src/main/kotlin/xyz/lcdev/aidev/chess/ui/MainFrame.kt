package xyz.lcdev.aidev.chess.ui

import java.awt.BorderLayout
import java.awt.Button
import java.awt.Choice
import java.awt.Dimension
import java.awt.Frame
import java.awt.GridLayout
import java.awt.Label
import java.awt.Panel
import java.awt.event.WindowEvent
import java.awt.event.WindowListener

import xyz.lcdev.aidev.chess.core.AIDev

class MainFrame : Frame(), WindowListener {
    init {
        addWindowListener(this)
        setLocationRelativeTo(null)
        size = Dimension(1280, 720)
        loadMainLayout()
    }

    fun loadMainLayout() {
        val evaluators = AIDev.enumerateEvaluators();
        val evaluatorNames = mutableListOf<String>();
        //for(evaluator in evaluators) {
        //    evaluatorNames.add(evaluator.kotlin.annotations.firstOrNull({
        //        annotation ->
        //        annotation.
        //    })!!);
        //}

        add(Button("CENTER"), BorderLayout.CENTER)

        val rightPanel = Panel(GridLayout(4, 1))
        
        rightPanel.add(Label("WHITE"))
        val whitePanel = Panel(GridLayout(2, 3))
        rightPanel.add(whitePanel)

        whitePanel.add(Label("Search"))
        whitePanel.add(Label("Evaluator"))
        whitePanel.add(Label("Time Control"))

        val whiteSearchChoice = Choice()
        whiteSearchChoice.add("Random")
        whitePanel.add(whiteSearchChoice)
        val whiteEvalChoice = Choice()
        whiteEvalChoice.add("Random")
        whitePanel.add(whiteEvalChoice)
        val whiteTimeChoice = Choice()
        whiteTimeChoice.add("Random")
        whitePanel.add(whiteTimeChoice)

        rightPanel.add(Label("BLACK"))
        val blackPanel = Panel(GridLayout(2, 3))
        rightPanel.add(blackPanel)

        blackPanel.add(Label("Search"))
        blackPanel.add(Label("Evaluator"))
        blackPanel.add(Label("Time Control"))

        val blackSearchChoice = Choice()
        blackSearchChoice.add("Random")
        blackPanel.add(blackSearchChoice)
        val blackEvalChoice = Choice()
        blackEvalChoice.add("Random")
        blackPanel.add(blackEvalChoice)
        val blackTimeChoice = Choice()
        blackTimeChoice.add("Random")
        blackPanel.add(blackTimeChoice)

        val rightFlow = Panel()
        rightFlow.add(rightPanel)
        add(rightFlow, BorderLayout.EAST)

        add(Label("© 2022 Lightning Creations"), BorderLayout.SOUTH)
        
        validate()
    }

    override fun windowActivated(e: WindowEvent) {}

    override fun windowClosed(e: WindowEvent) {
        System.exit(0)
    }

    override fun windowClosing(e: WindowEvent) {
        dispose()
    }

    override fun windowDeactivated(e: WindowEvent) {}

    override fun windowDeiconified(e: WindowEvent) {}

    override fun windowIconified(e: WindowEvent) {}

    override fun windowOpened(e: WindowEvent) {}
}
