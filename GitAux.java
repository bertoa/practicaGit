/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author MFB
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("insertado por alumno2"); // modif alumno 2
}
    
    public void metodoComunitario(){
    	// Comentario incluido para pruebas
        System.out.println("Aqui escribimos todos");
	System.out.println("alumno 2"); // insertado por alumno 2
    }
    public void testGitAux(){
    	// metodo rama testing
	System.out.println("Metodo de testing");
    }
}
