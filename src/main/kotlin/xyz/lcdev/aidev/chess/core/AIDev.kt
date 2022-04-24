package xyz.lcdev.aidev.chess.core

import org.reflections.Reflections
import org.reflections.scanners.Scanners.TypesAnnotated

import xyz.lcdev.aidev.chess.core.annotation.Evaluator

val reflections = Reflections()

class AIDev {
    companion object {
        @JvmStatic // So that people using Java don't hate us
        fun enumerateEvaluators() = reflections.get(TypesAnnotated.with(Evaluator::class.java))
    }
}
