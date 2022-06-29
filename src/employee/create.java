/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Abir
 */
public class create {
    String username;
    String password;

    public create(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void write() throws IOException{
        try {

            String toAdd = username + " " + password;
            FileWriter fw = new FileWriter("create.txt", true);
            //BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(fw);
            out.println(toAdd);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
