import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double mesafe;
        int yas,yoltip;


        Scanner inp=new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz");
        mesafe=inp.nextDouble();

        System.out.println("Yasinizi giriniz");
        yas=inp.nextInt();

        System.out.println("Yolculuk tipinizi giriniz. (1 => Tek Yön , 2 => Gidiş Dönüş)");
        yoltip=inp.nextInt();

        double tutar=mesafe*0.10;


        if(mesafe>0){
            System.out.println("Bilet fiyatı="+tutar);
            if(yas<12){
                tutar=tutar-((mesafe*0.10)/2);
            }
            if (yas>12 && yas<24){
                tutar= tutar-(((mesafe*0.10)*10)/100);
            }
            if (yas>65){
                tutar=tutar-(((mesafe*0.10)*30)/100);
            }
            if(yas<0){
                System.out.println("Hatalı bir yaş girdiniz");
                
            }

            if(yoltip==1){
                tutar=tutar;
            }else if(yoltip==2){
                tutar=tutar-((tutar*20)/100);
            }else{
                System.out.println("Hatalı bir seçim yaptınız");
            }

        }else{
            System.out.println("Hayalı mesafe girdiniz");
        }


        System.out.println("İndirimli bilet fiyatı="+tutar);
    }
}
