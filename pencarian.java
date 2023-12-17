import java.util.Scanner;
public class pencarian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kembali;
        char re;
        char keluar;

        // data admin dan kasir
        String[] userName = { "haura", "isna" };
        String[] password = { "123", "456" };
        boolean login = false;

        // transaksi
        int hasilResi = -1;
        int hasil = -1;
        int update = -1;
        String key;
        int tujuan;

        String[] noResi = new String[25];
        String[] namaPengirim = new String[25];
        String[] namaPenerima = new String[25];
        String[] kotaT = new String[25];
        String[] layanan = new String[25];
        String[] status = new String[25];
        double[] jumlah = new double[25];
        double[] bayar = new double[25];
        double[] kembalian = new double[25];
        int[] berat = new int[25];

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

        status[0] = "Dalam Proses";
        status[1] = "Dalam Pengiriman";

        noResi[0] = "hau12";
        noResi[1] = "is1";

        int input = 2;

        // table ongkir & kayanan
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

        // //update status
        // String[] statusUp = new String[25];

        int ongkir = 3; // ongkir
        int percobaan = 0; // login


        if (input < noResi.length) {
            
            System.out.println("Masukkan nomor resi: ");
            String pencResi = sc.nextLine();
    
            int pencarian = -1;
            for (int i = 0; i < noResi.length; i++) {
                if (noResi[i].equalsIgnoreCase(pencResi)) {
                    pencarian = i;
                    break;
                    
                }
            }
            System.out.println("No Resi: " +noResi[pencarian]);
            System.out.println("Nama Pengirim: " +namaPengirim[pencarian]);
            System.out.println("Nama Penerima: " +namaPenerima[pencarian]);
            System.out.println("Kota Tujuan: " +kotaT[pencarian]);
        }
    }
    
}