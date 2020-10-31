/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakep;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program pernyataan, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String color[] = {"\033[38;2;255;0;0m", "\033[38;2;71;81;255m", "\033[38;2;255;255;0m", "\033[38;2;255;0;255m", "\033[38;2;0;255;0m", "\033[38;2;0;255;255m"};
        String netral = "\033[0m";
        String jawab;
        
            System.out.println(color[0].concat("Kamu ").concat(color[4]).concat("ngerjain sendiri ")
                    .concat(color[2]).concat("latihan 17 sampe ").concat(color[1]).concat("latihan 30 ini?"));
            System.out.print(color[1].concat("Jawab ").concat(color[0]).concat("(Yoi/Enggak) : "));
            jawab = scan.next().toUpperCase();

            
            if ("YOI".equals(jawab)){
                System.out.println(color[0].concat("Cakep Bener. ").concat(color[3]).concat("Good Job"));
            }else {
                if("ENGGAK".equals(jawab)){
                    System.out.println(color[0].concat("Tetep cakep sih.\n").concat(color[5])
                            .concat("Sing penting paham konsep nya yee.\n").concat(netral)
                            .concat("Keep the code works dude"));
                }
            }
    }
    
}
