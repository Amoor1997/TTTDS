/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeserver;

/**
 *
 * @author hassan
 */
public class Main {
    
    public boolean flag(){
        boolean flagvar = false;
        DBConnect connect = new DBConnect();
        flagvar = connect.getData();
        return flagvar;
    }
    
    
    
}
