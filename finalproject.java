import java.util.Scanner;

public class finalproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kembali; 

        //data admin dan kasir
        String[] userName = {"haura", "isna"};
        String[] password = {"123", "456"};
        boolean login = false;

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
                    System.out.println("5. Laporan Pendapatan ");
                    System.out.println("6. Keluar ");    
                    
                    System.out.print("Masukkan Angka Pilihan Menu: ");
                    int menu = sc.nextInt();
                    switch (menu) {
                        case 1:
                            
                            break;
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
                                String choice = sc.next();
                                // sc.next();
                                do{
                                if (choice.equalsIgnoreCase("y")) {
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
                    
                }if (userName[1].equals(username) && password[1].equals(pass)) {
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

        } while (login);


        

    }
}
