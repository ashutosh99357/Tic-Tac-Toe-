package tic.tac.toe.first;

public  class TicTacToeSimulator
{

   public static void main(String[] args){
        TicTacToe ticTacToe = new TicTacToe(new Player('X'), new Player('0'),new Board());
        Result  result = ticTacToe.start();
        if(result.isDraw())
        System.out.println("");
        else
        System.out.println("Player with symbol: " + result.getWinner().getSymbol + "won...");
     }
}