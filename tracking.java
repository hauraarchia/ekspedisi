import java.util.Scanner;
public class tracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String noResi, namaPenerima, status;
        int barangSampai, tanggal, jam;

        System.out.println("Masukkan nomor resi(123A/234B/345C) :");
        noResi = sc.nextLine();
        switch(noResi){
            case "123A":
            System.out.println("No Resi :" +noResi);
            System.out.println("Nama Penerima: Isnaeny");
            break;
            case "234B":
            System.out.println("No Resi :" +noResi);
            System.out.println("Nama Penerima: Lutfi");
            break;
            case "345C":
             System.out.println("No Resi :" +noResi);
            System.out.println("Nama Penerima: Haura");
            break;
            default:
            System.out.println("maaf nomor resi yang anda masukkan tidak diketahui");
            break;
        }

        System.out.println("Masukkan tanggal pemesanan");
        tanggal = sc.nextInt();
        System.out.println("Masukkan jam pemesanan");
        jam = sc.nextInt();

        if (jam <=12.00 ) {
            System.out.println ("Pesanan sedang dikirim");
            System.out.println("Status : Terkirim");      
         } else{
            System.out.println("Barang dikirim besok");
            System.out.println("Status : On process");}

        barangSampai = (tanggal + 4);
        if (barangSampai > 30){
            barangSampai -= 30;
            System.out.println("Estimasi barang sampai pada tanggal : " + barangSampai + " pada bulan selanjutnya");
        } else{
            System.out.println("Estimasi barang sampai pada tanggal : " + barangSampai);
            System.out.println("");
        }
}
}
