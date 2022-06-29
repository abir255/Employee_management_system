/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Abir
 */
public class constructor {

    String F_n;
    String l_N;
    String Age;
    String Add;
    String Phone;
    String Email;
    String NID;
    String Gender;
    String Job_post;
    String Salary;
    String E_id;

    public constructor(String F_n, String l_N, String Age, String Add, String Phone, String Email, String NID, String Gender, String Job_post, String Salary, String E_id) {
        this.F_n = F_n;
        this.l_N = l_N;
        this.Age = Age;
        this.Add = Add;
        this.Phone = Phone;
        this.Email = Email;
        this.NID = NID;
        this.Gender = Gender;
        this.Job_post = Job_post;
        this.Salary = Salary;
        this.E_id = E_id;
    }

    public void write() {
        try {

            String toAdd = F_n + " " + l_N + " " + Age + " " + Add + " " + Phone + " " + Email + " " + NID + " " + Gender + " " + Job_post + " " + Salary + " " + E_id;
            FileWriter fw = new FileWriter("e_data.txt", true);
           
            PrintWriter out = new PrintWriter(fw);
            out.println(toAdd);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   

    void add(constructor c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
