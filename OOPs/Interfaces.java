public class Interfaces {
    public static void main(String[] args) {
        System.out.println("\n\t Interfaces \n");
        Queen q = new Queen();
        q.moves();

    }
    
}

interface chessPlayer{
    void moves();//blue print
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("\n\t Up,Down,Left,right,diagonals ");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("\n\t Up,down,right,left, 1 step \n");
    }
}

            output:

              Interfaces 


         Up,Down,Left,right,diagonals 



         