// Assignment 3, Tic Tac Toe Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 9 - Networking
// Description: 
package tictactoeserver;

// Class that tests Tic-Tac-Toe server.
import javax.swing.JFrame;

/**
 *
 * @author caustin
 * @author csiebler
 */
public class TicTacToeServerTest {

    public static void main(String[] args) {
        Main m = new Main();
        boolean flagvar = false;
        flagvar = m.flag();

        if (flagvar == true) {
            TicTacToeServer application = new TicTacToeServer();
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            application.execute();

        }
        else{
            System.out.println("sorry you cant log to server please check your name and password!, again.");
        }

    }
}
