import java.util.Scanner;

public class cetakResi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] kota = new String[10];
        String[] layananReguler = new String[10];
        String[] layananCargo = new String[10];

        kota[0] = "Pasuruan";
        kota[1] = "Surabaya";
        kota[2] = "Probolinggo";

        layananReguler[0] = "10000";
        layananReguler[1] = "12000";
        layananReguler[2] = "14000";

        layananCargo[0] = "8000";
        layananCargo[1] = "15000";
        layananCargo[2] = "12000";

        while (true) {
            System.out.println("Menu:");
            System.out.println( " 1. Mencetak resi");
            System.out.println(" 2. Cetak Laporan Pendapatan");
            System.out.print("Pilih Menu (1/2) : ");
            int pilihanMenu = sc.nextInt();

            switch (pilihanMenu) {

                // Mencetak Resi & Penambahan Status
                case 1:
                    System.out.println();
                    System.out.print("Masukkan No Resi: ");
                    String noResi = sc.next();
                    System.out.print("Masukkan Nama Pengirim: ");
                    String namaPengirim = sc.next();
                    System.out.print("Masukkan Nama Penerima: ");
                    String namaPenerima = sc.next();
                    System.out.print("Masukkan Kota tujuan: ");
                    String kotaTujuan = sc.next();
                    System.out.print("Pilih Jenis Layanan (Cargo/Standart): ");
                    String jenisLayanan = sc.next();

                    System.out.print("Ingin Menambah Status Pengiriman? (y/n): ");
                    String status = sc.next();

                    if (status.equalsIgnoreCase("y")) {
                        System.out.print("Status Pengiriman: ");
                        String statusPengiriman = sc.next();

                        System.out.println("=== MENCETAK RESI ===");
                        System.out.println(" No Resi: " + noResi);
                        System.out.println(" Nama Pengirim: " + namaPengirim);
                        System.out.println(" Nama Penerima: " + namaPenerima);
                        System.out.println(" Kota Tujuan: " + kotaTujuan);
                        System.out.println(" Jenis Layanan: " + jenisLayanan);
                        // System.out.println(ongkir);
                        System.out.println("Status Pengiriman: " + statusPengiriman);
                        System.out.println();

                    } else if (status.equalsIgnoreCase("n")) {
                        System.out.println("=== MENCETAK RESI ===");
                        System.out.println(" No Resi: " + noResi);
                        System.out.println(" Nama Pengirim: " + namaPengirim);
                        System.out.println(" Nama Penerima: " + namaPenerima);
                        System.out.println(" Kota Tujuan: " + kotaTujuan);
                        System.out.println(" Jenis Layanan: " + jenisLayanan);
                        // System.out.println(ongkir);
                        System.out.println();
                    }  
                case 2:
                   //mencetak semua resi 
            }
        }
    }
}