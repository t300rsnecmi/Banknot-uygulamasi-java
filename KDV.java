
import java.util.Scanner;


public class KDV 
{

    
    public static void main(String[] args) 
    {
       Scanner klavye=new Scanner(System.in);
        System.out.print("Ürün Kodunu Gir:");
        String urkod=klavye.nextLine();
        
        // int urKod=klavye.nextInt();klavye.nextLine();
        
        System.out.print("Ürün Adını Gir:");
        String urAd=klavye.nextLine();
        System.out.print("Ürün Fiyatını Gir:");
        double urFiyat=klavye.nextDouble();
        
        urFiyat=urFiyat*1.18;      //urFiyat*=1.18;
        
        System.out.printf("\n%s isimli ürünün", urAd);
        System.out.println("\n--------------");
        System.out.printf("KDV Dahil Fiyat:%5.1fTL",urFiyat);
        
    }
    
}
