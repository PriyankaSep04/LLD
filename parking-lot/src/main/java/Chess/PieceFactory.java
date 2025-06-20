package Chess;

public class PieceFactory {

    public static Piece createPiece(String pieceType,boolean isWhitePiece){
        switch(pieceType){
            case "King":
                return new King(isWhitePiece);
            case "Bishop":
                return new Bishop(isWhitePiece);
            case "Queen":
                return new Queen(isWhitePiece);
            case "Knight":
                return new Knight(isWhitePiece);
            case "Rook":
                return new Rook(isWhitePiece);
            case "Pawn":
                return new Pawn(isWhitePiece);
            default:
                throw new IllegalArgumentException("Unknown piece type: " + pieceType);
        }
    }
}
