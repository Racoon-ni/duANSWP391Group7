/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ThinhLVCE181726 <your.name at your.org>
 */
import service.PClist;
import model.Product;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/pc-list")
public class PCListServlet extends HttpServlet {
    private PClist pcservice = new PClist();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Product> products = pcservice.getAllPCs();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/WEB-INF/include/product-list.jsp").forward(request, response);
    }
}
