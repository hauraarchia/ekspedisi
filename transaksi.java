import java.util.Scanner;
public class transaksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        String key;
        int tujuan;

        String[] namaPengirim = new String[25];
        String[] namaPenerima = new String[25];
        String[] kotaT = new String[25];
        String[] layanan = new String[25];
        int[] berat = new int[25];
        double[] total = new double[25];
        int[] bayar = new int[25];
        int[] kembalian = new int[25];

        int input = 0;


        //cek ongkir
        // table ongkir & kayanan
        String[] kota = new String[10]; // kota tujuan
        int[] hargaReg = new int[10]; // layanan standart atau reguler
        int[] hargaCargo = new int[10]; // layanan cargo

        kota[0] = "Pasuruan";
        kota[1] = "Surabaya";
        kota[2] = "Probolinggo";

        //standart
        hargaReg[0] = 10000;
        hargaReg[1] = 12000;
        hargaReg[2] = 14000;

        hargaCargo[0] = 8000;
        hargaCargo[1] = 15000;
        hargaCargo[2] = 12000;

        int ongkir = 3;



        //program transaksi
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
                System.out.print("Masukkan Kota Tujuan(gunakan awalan huruf kapital): ");
                kotaT[input] = sc.nextLine();
                System.out.print("Masukkan Jenis Layanan (cargo/standart): ");
                layanan[input] = sc.nextLine();
                //menggambil nilai array
                //start
                int k=0;
                int l=0;
                int m=0;
                while (k < kota.length) {
                    if (kota[k] == kota[input]) {

                        hasil = k;
                       // System.out.println(hasil);
                       // k++;
                    }

                    //layanan cargo
                    if (layanan[input] == "cargo" || layanan[input] == "Cargo") {
                        hargaCargo[ongkir] = hasil;
                    } 
                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input] + " dan layanan "+ layanan[input] +": "+ hargaCargo[l]);

                        System.out.print("Masukkan Berat Barang: ");
                        berat[input] = sc.nextInt();
                        System.out.println("Total Pesanan: " + berat[input] * hargaCargo[l] );

                        //standart/reguler
                    if (layanan[input] == "standart" || layanan[input] == "Standart") {
                        hargaReg[ongkir] = hasil;
                    }

                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input] + " dan layanan "+ layanan[input] +": "+ hargaReg[m]);
                        
                        System.out.print("Masukkan Berat Barang: ");
                        berat[input] = sc.nextInt();
                        System.out.println("Total Pesanan: " + berat[input] * hargaReg[m] );
                        
                    }
                    input++;
            } 
        }else{
            return;
        }
    }
}

