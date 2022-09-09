package tic.tac.toe.first;
 
public class Result{
    private final boolean isDraw;
    private final Player winner;

    public class Result(boolean isDraw, Player winner)
    {
        this.isDraw = isDraw;
        this.winner=winner;
    }
    public boolean isDraw()
    {
        return isDraw;
    }
    public Player getWinner()
    {
        return winner;
    }
}