/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

/**
 *
 * @author Dragos
 */
public class ArrayObjClass {
    
    private String name;
    private String autor;
    private String isbn;
    private int nrpag;
    
    public ArrayObjClass(String name,String autor,String isbn,int nrpag){
        
        this.name = name;
        this.autor = autor;
        this.nrpag = nrpag;
        this.isbn = isbn;
    }
    
    public ArrayObjClass(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNrpag() {
        return nrpag;
    }

    public void setNrpag(int nrpag) {
        this.nrpag = nrpag;
    }
    
        public String toString(){
    return( "\n\r" + "  " + name + "  " + autor + "  " + isbn + "  " + nrpag );
} 
    
    
    
    
    
    
}
