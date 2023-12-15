import java.util.Scanner;

public class cetakResi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        char kembali;
        char re;

        //maksimal 25 resi
        String [] noResi = new String[25];
        String [] namaPengirim = new String[25];
        String [] namaPenerima = new String[25];
        String [] kotaT = new String[25];
        String [] layanan = new String[25];
        String [] status = new String[25];
        double [] jumlah = new double[25];
        double [] bayar = new double[25];
        double [] kembalian = new double[25];
        int [] berat = new int[25];


        //ongkir dan layanan
        String[] kota = new String[10]; //kota tujuan
        int[] hargaReg = new int[10]; //layanan standart atau reguler
        int[] hargaCargo = new int[10]; //layanan cargo
        String[] pengirim = new String[10];

        namaPengirim[0] = "isna";
        namaPengirim[1] = "luthfi";

        namaPenerima[0] = "haura";
        namaPenerima[1] = "isna";

        kotaT[0] = "Pasuruan";
        kotaT[1] = "Surabaya";

        layanan[0] = "standart";
        layanan[1] = "standart";

        berat[0] = 3;
        berat[1] = 2;

        jumlah[0] = 30000;
        jumlah[1] = 24000;

        bayar[0] = 50000;
        bayar[1] = 50000;

        kembalian[0] = 20000;
        kembalian[1] = 26000;

        noResi [0] = "1234";
        noResi [1] = "0987";

        kota[0] = "Pasuruan";
        kota[1] = "Surabaya";
        kota[2] = "Probolinggo";

        hargaReg[0] = 10000;
        hargaReg[1] = 12000;
        hargaReg[2] = 14000;


        hargaCargo[0] = 8000;
        hargaCargo[1] = 15000;
        hargaCargo[2] = 12000;

        int hasil = 0; //harga 
        int input = 2; //input barang masuk
        int ongkir = 3; 
        

        do {
            System.out.println(" ");
            System.out.println("Menu:");
            System.out.println(" 1. Input Barang");
            System.out.println(" 2. Cetak Resi");
            System.out.println(" 3. Status Pengiriman");
            System.out.println(" 4. Lacak Pengiriman");
            System.out.println(" 5. Laporan pendapatan");
            System.out.println(" 6. Keluar Menu");
            System.out.print("Pilih Menu (1/2/3/4/5/6) : ");
            int pilihanMenu = sc.nextInt();

            switch (pilihanMenu) {
                
                case 1:
                // Input Barang dan Transaksi
                      
                if (input < namaPengirim.length) { 
                    do {
                        System.out.println("===================================");
                        System.out.println("        TAMBAH BARANG MASUK        ");
                        System.out.println("===================================");
                        sc.nextLine(); // Membersihkan newline 
                        System.out.print("Masukkan Nama Pengirim  : ");
                        namaPengirim[input] = sc.nextLine();
                        System.out.print("Masukkan Nama Penerima  : ");
                        namaPenerima[input] = sc.nextLine();
                        System.out.print("Masukkan Kota Tujuan(gunakan awalan huruf kapital) : ");
                        kotaT[input] = sc.nextLine();
                        System.out.print("Masukkan Jenis Layanan (cargo/standart)            : ");
                        layanan[input] = sc.nextLine();
                        // menggambil nilai array
                        // start
        
                        for (int k = 0; k < kota.length; k++) {
                            if (kota[k].equalsIgnoreCase(kotaT[input])) {
                                hasil = k;

                                break;
                                // System.out.println(hasil);
                                // k++;
                            }
                        }
                        if (layanan[input].equalsIgnoreCase("cargo")) {

                            System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input]
                                    + " dan layanan "
                                    + layanan[input] + ": " + hargaCargo[hasil]);

                            System.out.print("Masukkan Berat Barang: ");
                            berat[input] = sc.nextInt();
                            jumlah[input] = berat[input] * hargaCargo[hasil];
                            System.out.println("total pesanan :" + jumlah[input]);

                            // standart/reguler
                        } else if (layanan[input].equalsIgnoreCase("standart")) {

                            System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input]
                                    + " dan layanan "
                                    + layanan[input] + ": " + hargaReg[hasil]);

                            System.out.print("Masukkan Berat Barang: ");
                            berat[input] = sc.nextInt();
                            jumlah[input] = berat[input] * hargaReg[hasil];
                            System.out.println("total pesanan :" + jumlah[input]);

                        }
                        System.out.println("Masukkan Jumlah Uang Pembayaran: ");
                        bayar[input] = sc.nextDouble();
                        kembalian[input] = bayar[input] - jumlah[input];
                        System.out.println("Kembalian Anda: " + kembalian[input]);
                        input++;
                        System.out.println("Apakah ingin menambah kota tujuan baru lagi? (y/n)");
                        re = sc.next().charAt(0);
                    } while (re == 'y' || re == 'Y');
                }
                break;

                case 2:
                //Cetak Resi
                    sc.nextLine();
                    System.out.println("===================================");
                    System.out.println("            CETAK RESI             ");
                    System.out.println("===================================");

                    System.out.print("Masukkan Nama Pengirim untuk menambah No Resi: ");
                    String Resi = sc.nextLine();

                    //Mencari pengirim
                    int resiIndex = - 1;
                    for (int i = 0; i < input; i++) {
                        if (Resi.equalsIgnoreCase(namaPengirim[i])) {
                            resiIndex = i;
                            break;
                        }   
                    }

                    //update no resi 
                    if (resiIndex != -1) {
                        System.out.print("Masukkan No Resi: ");
                        noResi[resiIndex] = sc.nextLine();
                        System.out.println(" ");
                        System.out.println(" !! No Resi Update !!   ");
                    }else {
                        System.out.println(" ");
                        System.out.println(" !! Nama Pengirim Tidak Ditemukan !!");
                    }

                    if (resiIndex != -1) {
                        System.out.println(" ");
                        System.out.printf(" ------------------------------%n");
                        System.out.printf(" | %-13s : %-10s | %n", "No Resi", noResi [resiIndex]);
                        System.out.printf(" ------------------------------%n");
                        System.out.printf(" | %-13s : %-10s | %n", "Nama Pengirim", namaPengirim [resiIndex]);
                        System.out.printf(" | %-13s : %-10s | %n", "Nama Penerima", namaPenerima [resiIndex]);
                        System.out.printf(" | %-13s : %-10s | %n", "Kota Tujuan", kotaT [resiIndex]);
                        System.out.printf(" | %-13s : %-10s | %n", "Jenis Layanan", layanan [resiIndex]);
                        System.out.printf(" | %-13s : %-10s | %n", "Total Bayar", jumlah [resiIndex]);
                        System.out.printf(" ------------------------------%n");
                    } 
                    break;

                case 3:
                //Menambahkan status pengiriman
                    sc.nextLine();
                    System.out.println("===================================");
                    System.out.println("     UPDATE STATUS PENGIRIMAN      ");
                    System.out.println("===================================");

                    System.out.print("Masukkan No Resi yang akan diupdate status: ");
                    String statusUp = sc.nextLine();

                    // Mencari no resi
                    int statusIn = - 1;
                    for (int i = 0; i < input; i++) {
                        if (noResi[i].equalsIgnoreCase(statusUp)) {
                            statusIn = i;
                            break;
                        }
                    }

                    if (statusIn != -1) {
                        System.out.println("Masukkan Status Pengiriman (Diproses || Dikirim || Diterima)");
                        status[statusIn] = sc.nextLine();
                        System.out.println(" ");
                        System.out.println(" !! Status Pengirim Update !!  ");
                    } else {
                        System.out.println(" ");
                        System.out.println(" !!No Resi Tidak Ditemukan !! ");
                    }
                    break;
                
                case 4:  
                //Lacak Pengiriman
                    sc.nextLine();
                    System.out.println("===================================");
                    System.out.println("         LACAK PENGIRIMAN          ");
                    System.out.println("===================================");

                    System.out.print("Masukkan No Resi : ");
                    String resiLacak = sc.nextLine();

                    // Mencari no resi
                    int lacakIndex = -1;
                    for (int i = 0; i < input; i++) {
                        if (noResi[i].equalsIgnoreCase(resiLacak)) {
                            lacakIndex = i;
                        }
                    }

                    if (lacakIndex != -1) {
                        System.out.println(" Status Pengiriman untuk No Resi " + noResi[lacakIndex] + " : " + status[lacakIndex]);
                    } else {
                        System.out.println(" No Resi Tidak Ditemukan");
                    }
                    break;
                    
                case 5:
                //Laporan Pendapatan

                    System.out.println(" ");
                    System.out.println("===================================");
                    System.out.println("         LAPORAN PENDAPATAN        ");
                    System.out.println("===================================");
                   for (int i = 0; i < input; i++) {
                        System.out.printf(" ------------------------------%n");
                        System.out.printf(" | %-13s : %-10s | %n", "No Resi", noResi [i]);
                        System.out.printf(" ------------------------------%n");
                        System.out.printf(" | %-13s : %-10s | %n", "Nama Pengirim", namaPengirim [i]);
                        System.out.printf(" | %-13s : %-10s | %n", "Nama Penerima", namaPenerima [i]);
                        System.out.printf(" | %-13s : %-10s | %n", "Kota Tujuan", kotaT [i]);
                        System.out.printf(" | %-13s : %-10s | %n", "Jenis Layanan", layanan [i]);
                        System.out.printf(" | %-13s : %-10s | %n", "Total Bayar", jumlah [i]);
                        System.out.printf(" | %-13s : %-10s | %n", "Status", status [i]);
                        System.out.printf(" ------------------------------%n");
                        System.out.println(" ");
                    }
                    break;

                case 6:
                //keluar dari menu
                    System.out.println("Terimakasih");

            }

            System.out.println(" ");
            System.out.print("Apakah ingin kembali ke menu utama? (y/n): ");
            System.out.println(" ");
            kembali = sc.next().charAt(0);
        }while (kembali == 'y' || kembali == 'Y');
    }
}
