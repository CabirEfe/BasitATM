
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner atm = new Scanner(System.in);
        System.out.println("Şuan Hesabınızda 10000 Tl Var ");
        System.out.println("Lütfen Yapacağınız İşlemi Seçiniz");
         System.out.println("Para Yatırmak İçin 1 Yazınız.");
         System.out.println("Para Çekmek İçin 2 Yazınız");
         int değer = atm.nextInt();
                  
        
        if(değer == 1){
        System.out.println("Lütfen Yatıracağınız Tutarı Giriniz: ");
        double para = atm.nextDouble();
        double toplam = 10000 + para;
        System.out.println("Hesabınızdaki Toplam Para" + toplam);      
        }
        else if(değer == 2){
        System.out.println("Lütfen Çekeceğiniz Tutarı Giriniz: ");
        double para2 = atm.nextDouble();
            
        if(para2 < 10000){
        double kalan = 10000 - para2;
        System.out.println("Hesabınızda Kalan Miktar" + kalan);
        }    
        else{
        System.out.println("Hesabınızda Bu Kadar Para Yok.");
        System.out.println("Şuan Hesabınızda 10000 Tl Var ");
        }        
       } 
        else{
        System.out.println("Lütfen Yukarıda Gösterildiği Gibi Bir Sayı Giriniz.");
        }
         
         
             
         
                 
         
         
        
    }
    
}
