package tictactoeserver;


import java.sql.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hassan
 */
public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("mysql driver is load it succecfuly!");
            //
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamedatabase","root","");
            st = con.createStatement();
            
        }catch(Exception ex){
            System.out.println("Error: "+ ex);
        }
    
    
    }
    public boolean getData(){
        String nameDB = null;
        String passwordDB = null;
        boolean flag = false;
        try{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("please enter your name ");
                nameDB = input.nextLine();
                System.out.println("please enter your password");
                passwordDB = input.nextLine();
            
            }catch(Exception ex){
                System.out.println("error: "+ex); 
                
                
            }
            
            String query = " select * from players";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                
                String name= rs.getString("name");
                String password= rs.getString("password");
                System.out.println("name: "+name);
                System.out.println("password: "+password);
                if(name.equals(nameDB) && passwordDB.equals(password)){
                    System.out.println("now you can log to server");
                    flag = true;
                }
                
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ ex);
        }
        return flag;
    }
    
}
