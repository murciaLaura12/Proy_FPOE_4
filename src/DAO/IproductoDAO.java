/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Modelo.ModeloProducto;
import java.util.List;

/**
 *
 * @author LEONARDO
 */
public interface IproductoDAO {
    
    
    public List<ModeloProducto> getAllProducts();
    public ModeloProducto getProduct(String productoID);
    public boolean addProduct(ModeloProducto producto);
    public boolean updateProduct(ModeloProducto ModeloProducto);
    public boolean deleteProduct(String productoId); 
    
}
