package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		position = null; //enfatizando apenas, pois por padrao o java ja coloca como nulo
	}
	
	protected Board getBoard() {
		return board;
	}
	
}
