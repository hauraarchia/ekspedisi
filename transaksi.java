import java.util.Scanner;
public class transaksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaPengirim = new String[25];
        String[] namaPenerima = new String[25];
        double[] berat = new double[25];
        double[] total = new double[25];
        int[] bayar = new int[25];
        int[] kembalian = new int[25];

        int input = 0;


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
                System.out.print("Masukkan Kota Tujuan : ");
                //namaPenerima[input] = sc.nextLine();
                System.out.print("Masukkan Jenis Layanan : ");
                //namaPenerima[input] = sc.nextLine();
                System.out.print("Masukkan Berat Barang: ");

                
                input++;
            } else {
                System.out.println("Batas maksimum inputan barang telah tercapai");
            }
        }
        

    }
}

