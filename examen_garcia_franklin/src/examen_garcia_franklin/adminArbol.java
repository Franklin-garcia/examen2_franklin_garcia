/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_garcia_franklin;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Franklin Garcia
 */
public class adminArbol {

    private DefaultTreeModel modelo;
    private File archivo = null;

    public adminArbol(String Path) {
        archivo = new File(Path);
    }

    public DefaultTreeModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTreeModel modelo) {
        this.modelo = modelo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //Mutador extra
    public void cargarArchivo(JTree arbol) {
        try {

            DefaultTreeModel temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    DefaultTreeModel modelo=(DefaultTreeModel)objeto.readObject();
                    arbol.setModel(modelo); 
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }//fin if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(modelo);

        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
