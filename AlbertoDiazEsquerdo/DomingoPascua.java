/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;
import java.util.Scanner;
/**
 *
 * @author diaesqal
 */
public class DomingoPascua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un ano: ");
        int año= sc.nextInt();
        
        int N = 22 + ((19*(año % 19) + 24) % 30) + ((2 * (año % 4) + 4 * (año % 7) + 6 * ((19 * (año % 19) +24) % 30) + 5) % 7);
        
        System.out.println("Domingo de Pascua: ");
        System.out.print((N <= 31) ? String.valueOf(N): String.valueOf(N-31));
        System.out.println((N <= 31) ? "Marzo": "Abril");
    }
}
