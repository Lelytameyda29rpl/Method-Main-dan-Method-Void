/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;//libarary untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
public class Void {
    //Mendeklarasikan Variabel
    String nama_hewan;
    int pilihan;
    
    //Method Void Pertama
    void kelompokhewan(){
        Scanner input = new Scanner(System.in);//Untuk mengambil input dari keyboard
        
        //Perintah untuk menghasilkan output program
        //User dapat memilih dan memasukkannya ke dalam nilai Variabel
        System.out.println("Pilihan Nama Hewan");
        System.out.println("==================");
        System.out.println("1.domba");
        System.out.println("2.harimau");
        System.out.println("3.landak");
        
        //User memasukkan nilai Variabel
        System.out.print("Masukkan Nomor Pilihan Nama Hewan Yang Anda Inginkan: ");
        pilihan = input.nextInt();
        
        //Penerapan Percabangan IF ELSE
        if (pilihan==1){
            System.out.println("Herbivora");
        }else if (pilihan==2){
            System.out.println("Karnovora");
        }else if (pilihan==3){
            System.out.println("Omnivora");
         
        }
        
    }
    //Method Void Kedua
    void bergerak(){
        //Penerapan Pengulangan, digunakan untuk mengulangi banyaknya kalimat yang sudak diperintahkan
        for(int i=1; i<=6; i++)
        //Perintah untuk menghasilkan output program
        System.out.println("Domba, Harimau, dan Landak Bergerak Menggunakan Keempat Kakinya");
        
        
        
        
        
 
  
        
    
        
    
    
        
       
    }
    
}
