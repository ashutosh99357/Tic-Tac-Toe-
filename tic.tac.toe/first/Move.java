  
  package tic.tac.toe.first;

public class Move{

    private final int x;
    private final int y;

     public Move(int x, int y)
     {
        this.x=x;
        this.y=y;
     }
     public int getX()
     {
        return x;
     }
     public int getY()
     {
        return y;
     }
}