/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class arr {

    ArrayList<constructor> emp = new ArrayList<>();

    public arr() {
        int a = 1, p = -1;

        int i = 0;
        ArrayList<constructor> emp = new ArrayList<>();
        try {
            FileReader fr = new FileReader("e_data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String F_n = parts[0];
                String l_N = parts[1];
                String Age = parts[2];
                String Add = parts[3];
                String Phone = parts[4];
                String Email = parts[5];
                String NID = parts[6];
                String Gender = parts[7];
                String Job_post = parts[8];
                String Salary = parts[9];
                String E_id = parts[10];
                constructor c = new constructor(F_n, l_N, Age, Add, Phone, Email, NID, Gender, Job_post, Salary, E_id);
                emp.add(c);
                fr.close();
                System.out.println(emp.size());
            }
        } catch (Exception e) {

        }
    }

    public void r() {
        
    }

    public static void main(String[] args) {
        new arr();
    }

}
