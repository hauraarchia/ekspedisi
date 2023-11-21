import java.util.Scanner;
public class cekOngkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kembali;
        
        //table ongkir & kayanan
        String[] kota = new String[10]; // kota tujuan
        int[] hargaReg = new int[10]; // layanan standart atau reguler
        int[] hargaCargo = new int[10]; // layanan cargo

        kota[0] = "Pasuruan";
        kota[1] = "Surabaya";
        kota[2] = "Probolinggo";

        hargaReg[0] = 10000;
        hargaReg[1] = 12000;
        hargaReg[2] = 14000;

        hargaCargo[0] = 8000;
        hargaCargo[1] = 15000;
        hargaCargo[2] = 12000;

        int ongkir = 3;


        do {
            System.out.printf("%-5s | %-25s | %-20s | %-20s%n",
                "No", "Kota Tujuan", "Harga Standart", "Harga Cargo");
                System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < ongkir; i++) {
            System.out.printf("%-5d | %-25s | %-20s | %-20s%n",
                    i + 1, kota[i], hargaReg[i], hargaCargo[i]);

        }
        System.out.println(" ");
        System.out.print("Apakah Ingin Menambah Kota Tujuan Baru? (y/n): ");
        String choice = sc.next();
        // sc.next();
        if (choice.equalsIgnoreCase("y")) {
            if (ongkir < kota.length) {
                sc.nextLine(); // Membersihkan newline
                System.out.println("----------------------------------");
                System.out.println("     TAMBAH KOTA TUJUAN BARU");
                System.out.println("----------------------------------");
                System.out.print("Kota Tujuan   : ");
                kota[ongkir] = sc.nextLine();
                System.out.print("Harga Standart : ");
                hargaReg[ongkir] = sc.nextInt();
                System.out.print("Harga Cargo     : ");
                hargaCargo[ongkir] = sc.nextInt();
                ongkir++;
            } else {
                System.out.println("Batas maksimum nasabah baru telah tercapai");
            }
        }
        System.out.println(" ");
        System.out.println("Apakah ingin kembali ke menu utama? (y/n)");
        kembali = sc.next().charAt(0);
        }while (kembali == 'y' || kembali == 'Y');
    }
}




