import java.util.Scanner;

public class transaksi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = -1;
        String key;
        int tujuan;
        

        String[] namaPengirim = new String[25];
        String[] namaPenerima = new String[25];
        String[] kotaT = new String[25];
        String[] layanan = new String[25];
        double[] berat = new double[25];
        double[] total = new double[25];
        int[] bayar = new int[25];
        int[] kembalian = new int[25];
        double[] jumlah = new double[25];

        namaPengirim[0] = "isna";
        namaPenerima[0] = "haura";
        kotaT[0] = "Pasuruan";
        layanan[0] = "standart";
        berat[0] = 3;
        total[0] = 30000;
        bayar[0] = 50000;
        kembalian[0] = 20000;

        String[] kota = new String[10]; // kota tujuan
        double[] hargaReg = new double[10]; // layanan standart atau reguler
        double[] hargaCargo = new double[10]; // layanan cargo

        int input = 0;

        // cek ongkir

        kota[0] = "Pasuruan";
        kota[1] = "Surabaya";
        kota[2] = "Probolinggo";

        // standart
        hargaReg[0] = 10000;
        hargaReg[1] = 12000;
        hargaReg[2] = 14000;

        hargaCargo[0] = 8000;
        hargaCargo[1] = 15000;
        hargaCargo[2] = 12000;

        int ongkir = 3;

        // program transaksi
        System.out.println(" ");
        System.out.print("Apakah Ingin Menambah Pengiriman? (y/n): ");
        String choice = sc.next();
        // sc.next();
        if (choice.equalsIgnoreCase("y")) {
            if (input < namaPengirim.length) {
                sc.nextLine(); // Membersihkan newline
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("        TAMBAH BARANG MASUK        ");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.print("Masukkan Nama Pengirim  : ");
                namaPengirim[input] = sc.nextLine();
                System.out.print("Masukkan Nama Penerima : ");
                namaPenerima[input] = sc.nextLine();
                System.out.print("Masukkan Kota Tujuan (gunakan awalan huruf kapital): ");
                kotaT[input] = sc.nextLine();
                System.out.print("Masukkan Jenis Layanan (cargo/standart): ");
                layanan[input] = sc.nextLine();
                // menggambil nilai array
                // start
                
                
                
            for (int k = 0; k < kota.length; k++ ) {
                    if (kota[k].equalsIgnoreCase(kotaT[input])) {
                        hasil = k;
                        
                        break;
                        // System.out.println(hasil);
                        // k++;
                    }
                    }
                if (layanan[input].equalsIgnoreCase("cargo")) {
                        
                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input] + " dan layanan "
                        + layanan[input] + ": " + hargaCargo[hasil]);
                    
                        
                        System.out.print("Masukkan Berat Barang: ");
                        berat[input] = sc.nextInt();
                        jumlah[input] = berat[input] * hargaCargo[hasil];
                        System.out.println("total pesanan :" + jumlah[input]);

                    
                    // standart/reguler  
                } else if (layanan[input].equalsIgnoreCase("standart")) {
                        
                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input] + " dan layanan "
                        + layanan[input] + ": " + hargaReg[hasil]);
                        
                        System.out.print("Masukkan Berat Barang: ");
                        berat[input] = sc.nextInt();
                        jumlah[input] = berat[input] * hargaReg[hasil];
                        System.out.println("total pesanan :" + jumlah[input]);
                    }

                    
                
                input++;
                 
                //  System.out.println(hasil);
            }

        } else {
            return;
        }  
    }
                    }
