import java.util.Scanner;
public class tracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String noResi, namaPenerima, status;

        System.out.println("Masukkan nomor resi(123A/234B/345C) :");
        noResi = sc.nextLine();
        switch(noResi){
            case "123A":
            System.out.println("No Resi :" +noResi);
            System.out.println("Nama Penerima: Arifin");
            System.out.println("Status: Terkirim");
            break;
            case "234B":
            System.out.println("No Resi :" +noResi);
            System.out.println("Nama Penerima: Abinaya");
            System.out.println("Status: On Process");
            break;
            case "345C":
             System.out.println("No Resi :" +noResi);
            System.out.println("Nama Penerima: Haura");
            System.out.println("Status: Dalam Pengiriman");
            break;
            default:
            System.out.println("maaf nomor resi yang anda masukkan tidak diketahui");
            break;
        }

    }
}
