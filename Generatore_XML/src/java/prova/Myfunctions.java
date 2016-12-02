package prova;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d.gagliano
 */
public class Myfunctions {
    /*attributi*/
    private int id;
    private String name;
    private int Result;
    
    /*costruttori*/
    public Myfunctions(){}
    
    public Myfunctions(int a, int b, String name, int id){
        
        this.Result = a + b;
        this.name = name;
        this.id = id;
        
    }
    /*funzioni get/set*/
    
      /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Result
     */
    public int getResult() {
        return Result;
    }

    /**
     * @param Result the Result to set
     */
    public void setResult(int Result) {
        this.Result = Result;
    }
    
    
    /* funzioni*/
    public void  funzione_1 (int a, int b){
        a = a + 10;
        b = b + 10;
       
    }
    
    public int moltiplicazione(int a, int b ){
        int c = a*b;
        return c;
    }   
}
