/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ProductDAO;
import java.util.List;
import model.Product;

/**
 *
 * @author ThinhLVCE181726 <your.name at your.org>
 */


public class PClist {
    private ProductDAO productDAO = new ProductDAO();
    
    public List<Product> getAllPCs(){
        return productDAO.getAllPCs();
    }
}
