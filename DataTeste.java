import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datateste;

/**
 *
 * @author Aline-PC
 */
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Data d = new Data(04,05,2017);
        System.out.println(d.dia+"/"+d.mes+"/"+d.ano);     
        d.displayData();
    }
    
}
