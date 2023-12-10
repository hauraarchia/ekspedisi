import java.util.Scanner;

public class finalproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kembali; 
        char re;

        //data admin dan kasir
        String[] userName = {"haura", "isna"};
        String[] password = {"123", "456"};
        boolean login = false;

        //transaksi
        int hasil = 0;
        String key;
        int tujuan;

        String[] namaPengirim = new String[25];
        String[] namaPenerima = new String[25];
        String[] kotaT = new String[25];
        String[] layanan = new String[25];
        int[] berat = new int[25];
        double[] jumlah = new double[25];
        double[] bayar = new double[25];
        double[] kembalian = new double[25];

        // namaPengirim[0] = "isna";
        // namaPengirim[1] = "luthfi";

        // namaPenerima[0] = "haura";
        // namaPenerima[1] = "isna";

        // kotaT[0] = "Pasuruan";
        // kotaT[1] = "Surabaya";

        // layanan[0] = "standart";
        // layanan[1] = "standart";

        // berat[0] = 3;
        // berat[1] = 2;

        // jumlah[0] = 30000;
        // jumlah[1] = 24000;

        // bayar[0] = 50000;
        // bayar[1] = 50000;

        // kembalian[0] = 20000;
        // kembalian[1] = 26000;

        int input = 2;

        //table ongkir & kayanan
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


        //DATA INPUT
        String[] resi = new String[10];
        String[] pengirim = new String[10];
        String[] penerima = new String[10];
        int[] total = new int[10];




        int ongkir = 3; //ongkir
        int percobaan = 0; //login
    //    

        do {
            System.out.println("======================================");
            System.out.println("Selamat Datang di Sistem Ekspedisi 333");
            System.out.println("======================================");
            System.out.println("    Silahkan login terlebih dahulu    ");
            System.out.println("======================================");
            System.out.print("Masukkan Username: ");
            String username = sc.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = sc.nextLine();
            System.out.println("======================================");
            
             for (int i = 0; i < userName.length; i++) {
                if (userName[0].equals(username) && password[0].equals(pass)){
                    System.out.println("Selamat Datang " + username + "di Sistem Ekspedisi 333 Anda Sedang Login Sebagai Admin");
                    System.out.println("PILIH MENU: ");
                    System.out.println("1. Input Data Barang ");
                    System.out.println("2. Cek Ongkir ");
                    System.out.println("3. Pencarian ");
                    System.out.println("4. Cetak Resi");
                    System.out.println("5. Lacak Pesanan");
                    System.out.println("6. Laporan Pendapatan ");
                    System.out.println("7. Keluar ");    
                    
                    System.out.print("Masukkan Angka Pilihan Menu: ");
                    int menu = sc.nextInt();
                    switch (menu) {
                        //input data baarang
                        case 1:
                        
                                if (input < namaPengirim.length) {
                                    sc.nextLine(); // Membersihkan newline
                                    do {
                                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                                        System.out.println("        TAMBAH BARANG MASUK        ");
                                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                                        System.out.print("Masukkan Nama Pengirim  : ");
                                        namaPengirim[input] = sc.nextLine();
                                        System.out.print("Masukkan Nama Penerima : ");
                                        namaPenerima[input] = sc.nextLine();
                                        System.out.print("Masukkan Kota Tujuan(gunakan awalan huruf kapital): ");
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
                        //cek ongkir
                        case 2:
                                System.out.printf("%-5s | %-25s | %-20s | %-20s%n",
                                        "No", "Kota Tujuan", "Harga Standart", "Harga Cargo");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int j = 0; j < ongkir; j++) {
                                    System.out.printf("%-5d | %-25s | %-20s | %-20s%n",
                                            j + 1, kota[j], hargaReg[j], hargaCargo[j]);

                                }
                                
                                System.out.println(" ");
                                System.out.print("Apakah Ingin Menambah Kota Tujuan Baru? (y/n): ");
                                String ulang = sc.next();
                                // sc.next();
                                do{
                                    
                                if (ulang.equalsIgnoreCase("y")) {
                                    if (ongkir < kota.length) {
                                        sc.nextLine(); // Membersihkan newline
                                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                                        System.out.println("     TAMBAH KOTA TUJUAN BARU");
                                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                                        System.out.print("Kota Tujuan : ");
                                        kota[ongkir] = sc.nextLine();
                                        System.out.print("Harga Standart : ");
                                        hargaReg[ongkir] = sc.nextInt();
                                        System.out.print("Harga Cargo : ");
                                        hargaCargo[ongkir] = sc.nextInt();
                                        ongkir++;

                                        System.out.println();
                                        System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                        System.out.printf("%-5s | %-25s | %-20s | %-20s%n",
                                        "No", "Kota Tujuan", "Harga Standart", "Harga Cargo");
                                        System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                        for (int j = 0; j < ongkir; j++) {
                                        System.out.printf("%-5d | %-25s | %-20s | %-20s%n",
                                            j + 1, kota[j], hargaReg[j], hargaCargo[j]);

                                }
                                    } else {
                                        System.out.println("Batas maksimum kota tujuan telah tercapai");
                                    }
                                }
                                System.out.println(" ");
                                System.out.println("Apakah ingin menambah kota tujuan baru lagi? (y/n)");
                                kembali = sc.next().charAt(0);
                            } while (kembali == 'y' || kembali == 'Y');
                    break;
                        default:
                            break;
                    }
                    
                        if (userName[1].equals(username) && password[1].equals(pass)) {
                            System.out.println("Selamat Datang " + username + "di Sistem Ekspedisi 333 Anda Login Sebagai Kasir");
                            System.out.println("PILIH MENU: ");
                            System.out.println("1. Input Data Barang ");
                            System.out.println("2. Cek Ongkir ");
                            System.out.println("3. Pencarian ");
                            System.out.println("4. Cetak Resi");
                            System.out.println("5. Keluar ");     
                        }
                            System.out.println("Invalid username or password");
                            percobaan++;
                        }

                } 

        }while (login);
    }
}

