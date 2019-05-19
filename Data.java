/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aline-PC
 */
public class Data {
     
    private int dia; 
    private int mes; 
    private int ano; 
 
    public void colocarDia(int d) 
    { 
        dia = d; 
    } 
    public int pegarDia() 
    { 
        return dia; 
    } 
    public void colocarMes(int m) 
    { 
        mes = m; 
    } 
    public int pegarMes() 
    { 
        return mes; 
    } 
    public void colocarAno(int a) 
    { 
        ano = a; 
    } 
    public int pegarAno() 
    { 
        return ano; 
    } 
    public void displayData() 
    { 
        System.out.printf("%d/%d/%d", pegarDia(), pegarMes(), pegarAno()); 
    } 
    
}
