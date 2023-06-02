
package com.mycompany.trabajo;
import java.util.ArrayList;
import java.io.*;

public class ArchivoPlano {
    File archivo=new File("datos.txt");
    
    public void escribir(String fila){
        
        try {
            if(!archivo.exists()){
                archivo.createNewFile();
            }            
            FileWriter w=new FileWriter(archivo,true);
            BufferedWriter bw=new BufferedWriter(w);
            PrintWriter pw=new PrintWriter(bw);
            pw.append(fila);
            pw.close();
            bw.close();
        
        } catch (Exception e) {
            System.out.println("Error");
        }    
    }// cierre metodo escribir
    
       
        
    public ArrayList<Object[]> leerDatos(){
        ArrayList<Object[]> datos=new ArrayList();
        try {
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            String fila="";
            while((fila=br.readLine())!=null){
                Object[] objFila=fila.split(";");
                datos.add(objFila);      
             }     
        } catch (Exception e) {
            System.out.println("Error");
        } 
        return datos;
    }//cierre metodo leer
    
    public void eliminarCliente(String documento){
        ArrayList<Object[]> datosArchivo=this.leerDatos();
        this.vaciarArchivo();
        for (Object[] cliente : datosArchivo) {            
            if(!String.valueOf(cliente[1]).equals(documento)){
                String linea=(String.valueOf(cliente[0])+";"
                        +String.valueOf(cliente[1])+";"
                        +String.valueOf(cliente[2])+"\n");
             
               this.escribir(linea);
            }     
        }            
    }
    
    public void vaciarArchivo(){
        try {
             if(!archivo.exists()){
                archivo.createNewFile();
            }            
            FileWriter w=new FileWriter(archivo);
            BufferedWriter bw=new BufferedWriter(w);
            PrintWriter pw=new PrintWriter(bw);
            pw.close();
            bw.close();
            
        } catch (Exception e) {
        }         
        
        
    }
    public void modificarEquipo(String equipom,String equipon){
        ArrayList<Object[]> datosArchivo=this.leerDatos();
        this.vaciarArchivo();
        for (Object[] cliente : datosArchivo) {            
            if(!String.valueOf(cliente[1]).equals(equipom)){
                String linea=(String.valueOf(cliente[0])+";"
                        +String.valueOf(cliente[1])+";"
                        +String.valueOf(cliente[2])+"\n");
               this.escribir(linea);
            } 
            else{
                String linea =(String.valueOf(cliente[0])+";"
                            +equipon+";"
                            +String.valueOf(cliente[2])+"\n");
                this.escribir(linea);
            }
        }   
    
    
    
    }
    
    public void llenarCombo(){
    ArrayList<Object[]> datosArchivo=this.leerDatos();
    }
    
    
    
    
    
 }
    
    


    
