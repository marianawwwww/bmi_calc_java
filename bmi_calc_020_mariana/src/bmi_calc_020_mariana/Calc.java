/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi_calc_020_mariana;
import java.util.Scanner;

/**
 *
 * @author LENOVO YOGA 520
 */
public class Calc {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int jk;
        float berat, tinggi, bmi, meter;
        double broca;
     
        System.out.println("PROGRAM JAVA MENGHITUNG BERAT BADAN IDEAL DENGAN BMI & RUMUS BROCA");
        System.out.println(" ");
        System.out.println("Masukan Jenis Kelamin ");
        System.out.println("1.Laki-laki");
        System.out.println("2.Perempuan");
        System.out.print  ("Jenis Kelamin pilih (1/2) : ");
        jk = input.nextInt();
        System.out.print ("Masukan Berat : ");
        berat = input.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = input.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println(" ");
        System.out.print("BMI : "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("(Kurus)");
        }else if (bmi<=22.9){
            System.out.println("(Normal)");
        }else if (bmi<24.9){
            System.out.println("(Overweight)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }
        
        switch(jk){
            case 1 : broca=((tinggi-100)-(0.10*(tinggi-100))); break;
            case 2 : broca=((tinggi-100)-(0.15*(tinggi-100))); break;
            default : broca=0;
        }
    
        int hasil = (int)broca;
        System.out.println("Berat badan ideal menurut rumus Broca : "+hasil+" Kg");
   }
}
