package Chess;

public class Player {
    private String name;
    private boolean isWhiteSide;

    public Player(String name,boolean isWhiteSide){
        this.name = name;
        this.isWhiteSide = isWhiteSide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWhiteSide() {
        return isWhiteSide;
    }

    public void setWhiteSide(boolean whiteSide) {
        isWhiteSide = whiteSide;
    }
}
