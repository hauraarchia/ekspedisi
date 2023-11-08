import java.util.Scanner;
public class pengambilan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String noResi, namaPenerima, status, namaPengirim;

        System.out.println("Masukkan nomor resi(123A/234B/345C) :");
        noResi = sc.nextLine();
        switch (noResi) {
            case "123A":
                System.out.println("No Resi :" + noResi);
                System.out.println("Nama Pengirim: Haura");
                System.out.println("Nama Penerima: Isnaeny");
                break;
            case "234B":
                System.out.println("No Resi :" + noResi);
                System.out.println("Nama Pengirim: Isnaeny");
                System.out.println("Nama Penerima: Lutfi");
                break;
            case "345C":
                System.out.println("No Resi :" + noResi);
                System.out.println("Nama Pengirim: Luthfi");
                System.out.println("Nama Penerima: Haura");
                break;
            default:
                System.out.println("maaf nomor resi yang anda masukkan tidak diketahui");
                break;
        }
    }
}
