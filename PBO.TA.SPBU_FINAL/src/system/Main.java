/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package system;
import data.Menu;
import data.Form_Cabang;
import data.Form_Karyawan;
import data.Form_Stock;
import data.Form_TipeKendaraan;
import data.Form_Transaksi;


/**
 *
 * @author Kingslaive
 */
public class Main implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main app = new Main();
        Thread thread = new Thread(app);
        thread.start();
    }
    
    @Override
    public void run(){
        Menu frame = new Menu();
        frame.setVisible(true);
    }
    
}
