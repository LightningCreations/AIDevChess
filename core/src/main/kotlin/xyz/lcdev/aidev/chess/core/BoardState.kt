package xyz.lcdev.aidev.chess.core

class BoardState {
    val state = Array(64) { ChessPiece.Empty }

    operator fun get(x: Int, y: Int): ChessPiece? = if(x < 0 || x >= 8 || y < 0 || y >= 8) null else state[x + y * 8]
    operator fun set(x: Int, y: Int, piece: ChessPiece) { state[x + y * 8] = piece }

    companion object {
        fun standard(): BoardState {
            val result = BoardState()
            
            result[0, 0] = ChessPiece.WhiteRook
            result[1, 0] = ChessPiece.WhiteKnight
            result[2, 0] = ChessPiece.WhiteBishop
            result[3, 0] = ChessPiece.WhiteKing
            result[4, 0] = ChessPiece.WhiteQueen
            result[5, 0] = ChessPiece.WhiteBishop
            result[6, 0] = ChessPiece.WhiteKnight
            result[7, 0] = ChessPiece.WhiteRook

            for(x in 0..7) result[x, 1] = ChessPiece.WhitePawn
        
            for(x in 0..7) result[x, 6] = ChessPiece.BlackPawn

            result[0, 7] = ChessPiece.BlackRook
            result[1, 7] = ChessPiece.BlackKnight
            result[2, 7] = ChessPiece.BlackBishop
            result[3, 7] = ChessPiece.BlackKing
            result[4, 7] = ChessPiece.BlackQueen
            result[5, 7] = ChessPiece.BlackBishop
            result[6, 7] = ChessPiece.BlackKnight
            result[7, 7] = ChessPiece.BlackRook

            return result
        }
    }
}
