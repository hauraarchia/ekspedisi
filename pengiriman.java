import java.util.Scanner;

/**
 * ekspedisi
 */
public class pengiriman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double beratBarang ;
        String kotaTujuan, noResi;
        int tanggal, jam, barangSampai;

        System.out.println("masukkan kota yang akan dituju(pasuruan, bandung, surabaya): ");
        kotaTujuan = sc.nextLine();
        System.out.println("masukkan berat barang(perkilo) :");
        beratBarang = sc.nextDouble();
        switch(kotaTujuan){
            case "pasuruan":
            System.out.println("Kota tujuan adalah Kota Pasuruan");
            System.out.println("Harga perkilo untuk tujuan pasuruan senilai 10000");
            System.out.println("berat barang =" +beratBarang);
            System.out.println("total harga pengiriman anda="  +beratBarang*10000 );
            break;
            case "surabaya":
            System.out.println("Kota tujuan adalah Kota Surabaya");
            System.out.println("Harga perkilo untuk tujuan pasuruan senilai 15000");
            System.out.println("berat barang =" +beratBarang);
            System.out.println("total harga pengiriman anda ="  +beratBarang*15000 );
            break;
            case "bandung":
            System.out.println("Kota tujuan adalah Kota Bandung");
            System.out.println("Harga perkilo untuk tujuan pasuruan senilai 25000");
            System.out.println("berat barang =" +beratBarang);
            System.out.println("total harga pengiriman anda ="  +beratBarang*25000 );
            break;
            default:
            System.out.println("maaf tujuan yang anda inginkan belum terdaftar");
            break;
        }
        System.out.println("Masukkan tanggal pemesanan");
        tanggal = sc.nextInt();
        System.out.println("Masukkan jam pemesanan");
        jam = sc.nextInt();

        if (jam <=12.00 ) {
            System.out.println ("Pesanan dikirim hari ini");
            System.out.println("Status : Terkirim");      
         } else{
            System.out.println("Barang dikirim besok");
            System.out.println("Status : On process");}

        barangSampai = (int) (tanggal + 4);
        System.out.println("Estimasi barang sampai tanggal : " + barangSampai);

        System.out.println("Masukkan nomor resi(123A/234B/345C) :");
        noResi = sc.next();
        switch(noResi){
            case "123A":
            System.out.println("No Resi :" +noResi);
            System.out.println("Nama Pengirim: Isnaeny");
            System.out.println("Nama Penerima: A");
            break;
            case "234B":
            System.out.println("No Resi :" +noResi);
            System.out.println("Nama Pengirim: Luthfi");
            System.out.println("Nama Penerima: B");
            break;
            case "345C":
            System.out.println("No Resi :" +noResi);
            System.out.println("Nama Pengirim: Haura");
            System.out.println("Nama Penerima: c");
            break;
            default:
            System.out.println("maaf nomor resi yang anda masukkan tidak diketahui");
            break;
        }

    }
}