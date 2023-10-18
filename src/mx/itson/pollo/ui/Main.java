/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.pollo.ui;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mx.itson.pollo.entities.Comentario;
import mx.itson.pollo.entities.Post;
import mx.itson.pollo.entities.User;
import mx.itson.pollo.enumeradores.Categorias;

/**
 *
 * @author ryst2
 * Este es un post de facebok que hace ilusion a una persona que buscar que lo suban en un videojuego o que lo cargue sin hacer nada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        User user = new User();
        user.setName("Jorge Palacios");
        user.setCorreo("palos@gmail.com");
        user.setContrasena("1234");
        
        
        Post post = new Post();
        user.getName();
        post.setEnunciado("Soy muy manco en valorant, quien me da carry?");
        post.setCategoria(Categorias.VIDEOJUEGOS);
        Date fecha = Calendar.getInstance().getTime();
        post.setFecha(fecha);
        
        
        Comentario c1 = new Comentario();
        c1.setUser("NiteMex");
        c1.setDesctipcion("Yo te puedo dar carrito pa, pasa ign");
        c1.setFecha(fecha);
        
        Comentario c2 = new Comentario();
        c2.setUser("Six");
        c2.setDesctipcion("Yo tambien necesito carrito, soy hierro 1");
        c2.setFecha(fecha);
        
        List<Comentario> comentarios; 
        comentarios = new ArrayList<>();
        comentarios.add(c1);
        comentarios.add(c2);
        
        
        System.out.println("--------------------------- Feed ---------------------------");
        System.out.println(user.getName() + "                 " + post.getFecha()); 
        System.out.println(post.getEnunciado());
        System.out.println("                                                " + post.getCategoria());
        System.out.println("Comentarios ("+comentarios.size()+") \n");
        for(Comentario comentario : comentarios){
            System.out.println("        "+comentario.getUser() + "                 " + comentario.getFecha());
            System.out.println("        "+comentario.getDesctipcion()+ "\n");
        }
        
        
        
        
    }
    
}
