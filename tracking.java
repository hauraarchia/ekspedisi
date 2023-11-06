import java.util.Scanner;
public class tracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String noResi, namaPenerima, status;
        int barangSampai, tanggal, jam, jumlahResi;

        System.out.println("");
        System.out.println("Masukkan jumlah resi");
        jumlahResi = sc.nextInt();

        int i = 0;
        while (i < jumlahResi) {
            System.out.println("");
            System.out.println("Masukkan nomor resi(123A/234B/345C) ");
            System.out.println("Masukkan nomor resi ke- " + (i+1)+ " : ");
            noResi = sc.next();
            i++;
            
            System.out.println("Masukkan tanggal pemesanan");
            tanggal = sc.nextInt();
            System.out.println("Masukkan jam pemesanan");
            jam = sc.nextInt();
            System.out.println("==============================");

            if (noResi.equalsIgnoreCase("123A")) {
                System.out.println("No Resi :" + noResi);
                System.out.println("Nama Penerima : Isnaeny");
                    if (jam <=12.00) {
                        System.out.println("Pesanan dikirim hari ini");
                        System.out.println("Status : Terkirim");
                    } else {
                        System.out.println("Pesanan dikirim besok");
                        System.out.println("Status : On Process");
                    }
            } else if (noResi.equalsIgnoreCase("234B")) {
                System.out.println("No Resi :" + noResi);
                System.out.println("Nama Penerima : Haura");
                    if (jam <=12.00) {
                        System.out.println("Pesanan dikirim hari ini");
                        System.out.println("Status : Terkirim");
                    } else {
                        System.out.println("Pesanan dikirim besok");
                        System.out.println("Status : On Process");
                    }
            } else if (noResi.equalsIgnoreCase("345C")) {
                System.out.println("No Resi :" + noResi);
                System.out.println("Nama Penerima : Lutfi");
                    if (jam <=12.00) {
                        System.out.println("Pesanan dikirim hari ini");
                        System.out.println("Status : Terkirim");
                    } else {
                        System.out.println("Pesanan dikirim besok");
                        System.out.println("Status : On Process");
                    }
            } else {
                System.out.println("No resi salah");
                break;
            } 

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
}    
