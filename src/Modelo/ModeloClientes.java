/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author LEONARDO
 */
public class ModeloClientes {
    
    private String nombre;
    private String Cedula;
    private ArrayList<HashMap<String,String>> carrito;

    public ModeloClientes(String nombre, String Cedula) {
        this.nombre = nombre;
        this.Cedula = Cedula;
        carrito = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public ArrayList<HashMap<String, String>> getCarrito() {
        return carrito;
    }
    
    public void agregarProductoAlCarrito(String cualProducto, int precio){
        HashMap<String,String> producto = new HashMap<>();
        int cantidad = 1;
        int indice = 0;
        boolean encontrado = false;
        for(HashMap<String, String> p : carrito){
            if(p.get("nombre").equals(cualProducto)){
                encontrado = true;
                cantidad = Integer.parseInt(p.get("cantidad")) + 1;
                break;
            }
            indice++;
        }
        
        producto.put("nombre", cualProducto);
        producto.put("precio", Integer.toString(precio));
        producto.put("cantidad", Integer.toString(cantidad));
        
        if(encontrado){
            carrito.set(indice, producto);
        }
        else{
            carrito.add(producto);
        }
    }
    
    public void eliminarProducto(int cualProducto){
        carrito.remove(cualProducto);
    }
    
    public void limpiarCarrito(){
        carrito.clear();
    }
    
}
    

