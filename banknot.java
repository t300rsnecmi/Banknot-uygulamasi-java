
import java.util.Scanner;


public class banknot {

  
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int [] banknot={200,100,50,20,10,5};
       String [] para={"ikiyüz","100","elli","yirmi","on","beş"};
       
       int adet,tutar;
        System.out.print("Para tutarını gir:");
        tutar=input.nextInt();
        System.out.print("------------------------");
        for(int i=0;i<6;i++)
        {
            adet=tutar/banknot[i];    
        tutar-=adet*banknot[i];
        
        if(adet>0)
                System.out.printf("\n%5d adet %10s TL\n",adet,para[i]);
        }
    if(tutar>0)
            System.out.printf("\n%5d TL madeni para\n",tutar);
    }
    
    
}
