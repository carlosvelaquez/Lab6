package lab4carlosvelasquez11641405;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main {
    static String path = "./Productos.txt";
    static File a = new File(path);
    static ArrayList<Producto> productos = new ArrayList();
    static ArrayList<Cliente> clientes = new ArrayList();

    public static void main(String[] args) {
        float ganancias = 0;
        Inicio.main(args);
    }
    
    public static void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(a, false);
            bw = new BufferedWriter(fw);
            
            for (Producto p : productos) {
                bw.write(p.getNombre() + ";" + p.getCategoria() + ";" + p.getPrecio() + ";" + p.getDescuento() + ";");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error", "Error", 0);
        }
    }
   
    public static void leerArchivo(){
        try {
            Scanner sc = new Scanner(a);
            sc.useDelimiter(";");
            
            while(sc.hasNext()){
                productos.add(new Producto(sc.next(), sc.next(), sc.nextFloat(), sc.nextFloat()));
            }
            
            sc.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "El archivo de productos no ha sido encontrado", "Error", 0);
        }
    }
        

}
