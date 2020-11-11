/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Controller {
    MahasiswaCRUD view;

    public Controller(MahasiswaCRUD view) {
        this.view = view;
    }
    
    public void writeObject(Object o){
         try {
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mhs.obj"));
             oos.writeObject(o);
             oos.flush();
             oos.close();
         } catch (FileNotFoundException ex) {
         } catch (IOException ex) {
         }
     }

     public Object readObject(){
         try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mhs.obj"));
             Object readObject = ois.readObject();
             ois.close();
             return readObject;
         } catch (ClassNotFoundException ex) {
             
         } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
     }
     public DefaultTableModel viewTable(List<Mahasiswa> mhs){
         DefaultTableModel table = new DefaultTableModel(new String[]{"No", "NIM", "Nama", "Jurusan", "Prodi", "IPK"}, 0);
         for(int i = 0; i<mhs.size(); i++){
             Mahasiswa m = mhs.get(i);
             Vector v = new Vector();
             v.add(i+1);
             v.add(m.getNim());
             v.add(m.getNama());
             v.add(m.getJurusan());
             v.add(m.getProdi());
             v.add(m.getIpk());
             table.addRow(v);
         }
         return table;
     }
}
