import board.Board;
import player.Player;
//import java.util.Scanner;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        System.out.println("First java project -> Tic Tac Toe project");
        
        Board b = new Board(3 , '-');

       // b.setDefaultSymbol('#');
        //  b.printboardConfig();

    //    Scanner scn = new Scanner(System.in);
    //    System.out.println("Enter name of player: ");
    //    String name = scn.nextLine();
    //    System.out.println("Enter symbol of player: ");
    //    char symbol = scn.nextLine().charAt(0);

       Player p1 = new Player();
       p1.setPlayerNameAndSymbol("Anu" , 'X');
       p1.getPlayerNameAndSymbol();

       Player p2 = new Player();
       p2.setPlayerNameAndSymbol("Roma" , 'O');
       p2.getPlayerNameAndSymbol();

       Game game = new Game(new Player[] {p1,p2}, b);
       game.play();
    }
}
