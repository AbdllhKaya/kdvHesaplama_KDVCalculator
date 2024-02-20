import java.util. Scanner;
public class Main {
    public static void main(String[] args) {

    //Scanner class has been defined.
    Scanner input= new Scanner(System.in);

    //Variables have been initialized.
    double kdvOran1=0.18, kdvOran2=0.8, kdvOrani, kdvTutari, kdvliFiyat, fiyat;

    //Get values from the user.
    System.out.print("Ürünün fiyatını giriniz=");
    fiyat= input.nextDouble();

    System.out.println("KDV'siz fiyat="+fiyat );

    // The logical evaluation of the arithmetic operation was performed.
    boolean b = fiyat>1000;

    kdvOrani= b ? kdvOran2 : kdvOran1;
    System.out.println("KDV Oranı="+ kdvOrani);

    kdvTutari= b ? (fiyat*kdvOran2) : (fiyat*kdvOran1);
    System.out.println("KDV tutarı=" + kdvTutari);

    kdvliFiyat= fiyat+ kdvTutari;
    System.out.print("KDV'li Fiyat=" +kdvliFiyat);


    }
}