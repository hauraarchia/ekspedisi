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

        kota[0] = "Pasuruan";
        kota[1] = "Surabaya";
        kota[2] = "Probolinggo";

        hargaReg[0] = 10000;
        hargaReg[1] = 12000;
        hargaReg[2] = 14000;


        hargaCargo[0] = 8000;
        hargaCargo[1] = 15000;
        hargaCargo[2] = 12000;

        int hasil = 0;
        int input = 0; //input barang masuk
        int ongkir = 3; //

        do {
            System.out.println("Menu:");
            System.out.println(" 1. Input Barang");
            System.out.println(" 2. Laporan Pendapatan");
            System.out.println(" 3. Status Pengiriman");
            System.out.println(" 4. Lacak Pengiriman");
            System.out.println(" 5. Exit");
            System.out.print("Pilih Menu (1/2/3/4/5) : ");
            int pilihanMenu = sc.nextInt();

            switch (pilihanMenu) {
                
                case 1:
                // Input Barang dan Transaksi
                        
                if (input < namaPengirim.length) {
                    sc.nextLine(); // Membersihkan newline
                    do {
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("        TAMBAH BARANG MASUK        ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.print("Masukkan Nama Pengirim  : ");
                        namaPengirim[input] = sc.nextLine();
                        System.out.print("Masukkan Nama Penerima  : ");
                        namaPenerima[input] = sc.nextLine();
                        System.out.print("Masukkan Kota Tujuan (gunakan awalan huruf kapital): ");
                        kotaT[input] = sc.nextLine();
                        System.out.print("Masukkan Jenis Layanan (cargo/standart): ");
                        layanan[input] = sc.nextLine();
                        // menggambil nilai array
                        // start
                        int k = 0;
                        int l = 0;
                        int m = 0;
                    
                       if(k < kota.length) {
                            if (kota[k] == kota[input]) {

                                hasil = k;
                                // System.out.println(hasil);
                                // k++;
                            }

                            // layanan cargo
                            if (layanan[input] == "cargo" || layanan[input] == "Cargo") {
                                hargaCargo[ongkir] = hasil;
                                System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input] + " dan layanan "
                                + layanan[input] + ": " + hargaCargo[l]);
                                
                                System.out.print("Masukkan Berat Barang: ");
                                berat[input] = sc.nextInt();
                                jumlah[input] = berat[input] * hargaCargo[l];
                                System.out.println("total pesanan :" + jumlah[input]);
                                
                            }
                                
                            // standart/reguler
                            else{
                                hargaReg[ongkir] = hasil;
                                
                                System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input] + " dan layanan "
                                + layanan[input] + ": " + hargaReg[m]);
                                
                                System.out.print("Masukkan Berat Barang: ");
                                berat[input] = sc.nextInt();
                                jumlah[input] = berat[input] * hargaReg[m];
                                System.out.println("total pesanan :" + jumlah[input]);
                            }
                                System.out.println("Masukkan Jumlah Uang Pembayaran: ");
                                bayar[input] = sc.nextInt();
                                kembalian[input] = bayar[input] - jumlah[input];
                                System.out.println("Kembalian Anda : " +(int) kembalian[input]);
                            
                            input++;
                        }
                            System.out.println("Apakah ingin menambah kota tujuan baru lagi? (y/n)");
                            re = sc.next().charAt(0);
                        } while (re == 'y' || re == 'Y');  
                    }
                    break;
                    
                case 2:
                //Laporan Pendapatan
                sc.nextLine(); // Membersihkan newline

                   for (int i = 0; i < input; i++) {
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("        LAPORAN PENDAPATAN         ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" No Resi        : " + noResi[i]);
                        System.out.println(" Nama Pengirim  : " + namaPengirim[i]);
                        System.out.println(" Nama Penerima  : " + namaPenerima[i]);
                        System.out.println(" Kota Tujuan    : " + kotaT [i]);
                        System.out.println(" Jenis Layanan  : " + layanan[i]);
                        System.out.println(" Total Bayar    : " + jumlah [i]);
                    }
                    break;

                case 3:
                // Menambahkan status pengiriman
                sc.nextLine(); // Membersihkan newline

                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("     UPDATE STATUS PENGIRIMAN      ");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

                    System.out.print("Masukkan No Resi yang akan diupdate status: ");
                    String resiUpate = sc.nextLine();

                    // Mencari no resi
                    int resiIndex = - 1;
                    for (int i = 0; i < input; i++) {
                        if (noResi[i].equalsIgnoreCase(resiUpate)) {
                            resiIndex = i;
                        }
                    }

                    if (resiIndex != -1) {
                        System.out.println("Masukkan Status Pengiriman (Diproses || Dikirim || Diterima)");
                        status[resiIndex] = sc.nextLine();
                        System.out.println("Status Pengirim Update");
                    } else {
                        System.out.println("No Resi Tidak Ditemukan");
                    }
                    break;
                
                case 4:  
                //Lacak Pengiriman
                sc.nextLine(); // Membersihkan newline

                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("         LACAK PENGIRIMAN          ");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

                    System.out.print("Masukkan No Resi : ");
                    String resiLacak = sc.nextLine();

                    // Mencari no resi
                    int lacakIndex = -1;
                    for (int i = 0; i < input; i++) {
                        if (noResi[i].equalsIgnoreCase(resiLacak)) {
                            lacakIndex = i;
                            break;
                        }
                    }

                    if (lacakIndex != -1) {
                        System.out.println("Status Pengiriman untuk No Resi " + noResi[lacakIndex] + ": " + status[lacakIndex]);
                    } else {
                        System.out.println("No Resi Tidak Ditemukan");
                    }
                    break;

                case 5:// //keluar dari menu
                System.out.println("Terimakasih");
            }

            System.out.println(" ");
            System.out.print("Apakah ingin kembali ke menu utama? (y/n): ");
            System.out.println(" ");
            kembali = sc.next().charAt(0);
        } while (kembali == 'y' || kembali == 'Y');
    }
}
