/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Abir
 */
public class main {

    public static void main(String[] args) {
        front_page front = new front_page();
        login_page login = new login_page();
        front.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                front.loading.setText(Integer.toString(i) + "%");
                front.loadingber.setValue(i);
                if (i == 100) {
                    front.setVisible(false);
                    login.setVisible(true);
                }

            }

        } catch (Exception e) {

        }
    }
}
