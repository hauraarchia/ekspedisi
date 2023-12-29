import java.util.Scanner;

public class finalproject {
    static char re;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kembali;
        int menu = 0;

        // data admin dan kasir
        String[] userName = { "haura", "isna" };
        String[] password = { "123", "456" };
        boolean login = false;

        // transaksi
        int hasil = -1;
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

        noResi[0] = "1111";
        noResi[1] = "2222";

        status[0] = "Diproses";
        status[1] = "Dikirim";

        int input = 2;
        int noresi = 2;

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

        // DATA INPUT
        String[] resi = new String[10];
        String[] pengirim = new String[10];
        String[] penerima = new String[10];
        int[] total = new int[10];

        int ongkir = 3; // ongkir
        int percobaan = 0; // login
        //

        do {
            sc.nextLine();
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
                if (userName[0].equals(username) && password[0].equals(pass)) {
                    System.out.println("Anda Sedang Login Sebagai Admin");
                    do {
                        System.out.println("=====================================");
                        System.out.println("                MENU:                ");
                        System.out.println("=====================================");
                        System.out.println("1. Input Data Barang ");
                        System.out.println("2. Cetak Resi");
                        System.out.println("3. Kelola Pesanan");
                        System.out.println("4. Pencarian ");
                        System.out.println("5. Kelola Ongkir ");
                        System.out.println("6. Laporan Pendapatan ");
                        System.out.println("7. Keluar");
                        System.out

                                .println("=====================================");

                        System.out.print("Masukkan Angka Pilihan Menu: ");
                        menu = sc.nextInt();
                        switch (menu) {
                            case 1:
                                // input data baarang
                                if (input < namaPengirim.length) {
                                    sc.nextLine(); // Membersihkan newline
                                    System.out.println("===================================");
                                    System.out.println("        TAMBAH BARANG MASUK        ");
                                    System.out.println("===================================");
                                    System.out.print("Masukkan Nama Pengirim  : ");
                                    namaPengirim[input] = sc.nextLine();
                                    System.out.print("Masukkan Nama Penerima  : ");
                                    namaPenerima[input] = sc.nextLine();
                                    System.out.print("Masukkan Kota Tujuan    : ");
                                    kotaT[input] = sc.nextLine();
                                    System.out.print("Masukkan Jenis Layanan (cargo || standart) : ");
                                    layanan[input] = sc.nextLine();
                                    // menggambil nilai array
                                    // start

                                    for (int k = 0; k < kota.length; k++) {
                                        if (kota[k].equalsIgnoreCase(kotaT[input])) {
                                            hasil = k;
                                            break;
                                        }
                                    }
                                    if (layanan[input].equalsIgnoreCase("cargo")) {
                                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input]
                                                + " dan layanan "
                                                + layanan[input] + ": " + hargaCargo[hasil]);

                                        System.out.print("Masukkan Berat Barang: ");
                                        berat[input] = sc.nextInt();
                                        jumlah[input] = berat[input] * hargaCargo[hasil];
                                        System.out.println("total pesanan :" + (int) jumlah[input]);

                                        // standart/reguler
                                    } else if (layanan[input].equalsIgnoreCase("standart")) {

                                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input]
                                                + " dan layanan "
                                                + layanan[input] + ": " + hargaReg[hasil]);

                                        System.out.print("Masukkan Berat Barang: ");
                                        berat[input] = sc.nextInt();
                                        jumlah[input] = berat[input] * hargaReg[hasil];
                                        System.out.println("total pesanan :" + (int) jumlah[input]);

                                    }
                                    System.out.println("Masukkan Jumlah Uang Pembayaran: ");
                                    bayar[input] = sc.nextDouble();
                                    kembalian[input] = bayar[input] - jumlah[input];
                                    System.out.println("Kembalian Anda: " + (int) kembalian[input]);
                                    sc.nextLine();
                                    System.out.print("Masukkan No Resi: ");
                                    noResi[input] = sc.nextLine();
                                    status[input] = "Diproses";
                                    input++;
                                }
                                break;

                            case 2:
                                // Cetak Resi
                                if (input < noResi.length) {
                                    sc.nextLine();
                                    System.out.println("===================================");
                                    System.out.println("            CETAK RESI             ");
                                    System.out.println("===================================");

                                    System.out.print("Masukkan No Resi: ");
                                    String Resi = sc.nextLine();

                                    // Mencari pengirim
                                    int resiIndex = -1;
                                    for (int e = 0; e < input; e++) {
                                        if (Resi.equalsIgnoreCase(noResi[e])) {
                                            resiIndex = e;
                                            break;
                                        }
                                    }

                                    if (resiIndex != -1) {
                                        System.out.println(" ");
                                        System.out.printf(" --------------------------------%n");
                                        System.out.printf(" | %-13s : %-12s | %n", "No Resi", noResi[resiIndex]);
                                        System.out.printf(" --------------------------------%n");
                                        System.out.printf(" | %-13s : %-12s | %n", "Nama Pengirim",
                                                namaPengirim[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Nama Penerima",
                                                namaPenerima[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Kota Tujuan", kotaT[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Jenis Layanan", layanan[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Total Bayar",
                                                (int) jumlah[resiIndex]);
                                        System.out.printf(" --------------------------------%n");
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("No Resi Tidak Ditemukan!");
                                    }
                                }
                                break;

                            case 3:
                                // kelola pemesanan
                                do {
                                    System.out.println("===================================");
                                    System.out.println("         KELOLA PEMESANAN          ");
                                    System.out.println("===================================");
                                    System.out.println("PIlih Menu: ");
                                    System.out.println("1. Lacak Pengiriman");
                                    System.out.println("2. Update Status Pengiriman");
                                    System.out.print("Masukkan Angka Pilihan: ");
                                    menu = sc.nextInt();
                                    switch (menu) {
                                        case 1:
                                            if (input < noResi.length) {
                                                sc.nextLine();
                                                System.out.println("===================================");
                                                System.out.println("         LACAK PENGIRIMAN          ");
                                                System.out.println("===================================");

                                                System.out.print("Masukkan No Resi : ");
                                                String resiLacak = sc.nextLine();

                                                // Mencari no resi
                                                int lacakIndex = -1;
                                                for (int l = 0; l < input; l++) {
                                                    if (noResi[l].equalsIgnoreCase(resiLacak)) {
                                                        lacakIndex = l;
                                                        break;
                                                    }
                                                }

                                                if (lacakIndex != -1) {
                                                    System.out.println("Status Pengiriman No Resi " + "'"
                                                            + noResi[lacakIndex] + "'" + " : " + status[lacakIndex]);
                                                } else {
                                                    System.out.println("No Resi Tidak Ditemukan!");
                                                }
                                            }
                                            break;
                                        case 2:
                                            if (input < status.length) {
                                                sc.nextLine();
                                                System.out.println("===================================");
                                                System.out.println("     UPDATE STATUS PENGIRIMAN      ");
                                                System.out.println("===================================");

                                                System.out.print("Masukkan No Resi yang akan diupdate status: ");
                                                String statusUp = sc.nextLine();

                                                // Mencari no resi
                                                int statusIn = -1;
                                                for (int q = 0; q < input; q++) {
                                                    if (noResi[q].equalsIgnoreCase(statusUp)) {
                                                        statusIn = q;
                                                        break;
                                                    }
                                                }

                                                if (statusIn != -1) {
                                                    System.out.println(
                                                            "Masukkan Status Pengiriman (Diproses || Dikirim || Diterima)");
                                                    status[statusIn] = sc.nextLine();
                                                    System.out.println("Status Pengirim Update!");
                                                } else {
                                                    System.out.println("No Resi Tidak Ditemukan!");
                                                }

                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    System.out.println(" ");
                                    System.out.println("Apakah anda ingin kembali ke menu kelola pesanan?");
                                    re = sc.next().charAt(0);
                                } while (re == 'y' || re == 'Y');
                                break;

                            case 4:
                                // Pencarian
                                if (input < noResi.length) {
                                    sc.nextLine();
                                    System.out.println("===================================");
                                    System.out.println("             PENCARIAN            ");
                                    System.out.println("===================================");
                                    System.out.print("Masukkan nomor resi: ");
                                    String pencResi = sc.nextLine();

                                    int pencarian = -1;
                                    for (int q = 0; q < input; q++) {
                                        if (noResi[q].equalsIgnoreCase(pencResi)) {
                                            pencarian = q;
                                            break;

                                        }
                                    }
                                    if (pencarian != -1) {
                                        System.out.println("=================================");
                                        System.out.println("            PENCARIAN            ");
                                        System.out.println("=================================");
                                        System.out.println("No Resi: " + noResi[pencarian]);
                                        System.out.println("Nama Pengirim: " + namaPengirim[pencarian]);
                                        System.out.println("Nama Penerima: " + namaPenerima[pencarian]);
                                        System.out.println("Kota Tujuan: " + kotaT[pencarian]);
                                        System.out.println("=================================");
                                    } else {
                                        System.out.println("No Resii tidak ditemukan!");
                                    }
                                }
                                break;

                            case 5:
                                // Kelola Ongkir
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
                                break;

                            case 6:
                                // Laporan Pendapatan
                                System.out.println(" ");
                                System.out.println("===================================");
                                System.out.println("         LAPORAN PENDAPATAN        ");
                                System.out.println("===================================");
                                for (int r = 0; r < input; r++) {
                                    System.out.printf(" ------------------------------%n");
                                    System.out.printf(" | %-13s : %-10s | %n", "No Resi", noResi[r]);
                                    System.out.printf(" ------------------------------%n");
                                    System.out.printf(" | %-13s : %-10s | %n", "Nama Pengirim", namaPengirim[r]);
                                    System.out.printf(" | %-13s : %-10s | %n", "Nama Penerima", namaPenerima[r]);
                                    System.out.printf(" | %-13s : %-10s | %n", "Kota Tujuan", kotaT[r]);
                                    System.out.printf(" | %-13s : %-10s | %n", "Jenis Layanan", layanan[r]);
                                    System.out.printf(" | %-13s : %-10s | %n", "Total Bayar", (int) jumlah[r]);
                                    System.out.printf(" | %-13s : %-10s | %n", "Status", status[r]);
                                    System.out.printf(" ------------------------------%n");
                                    System.out.println(" ");
                                }
                                break;
                            case 7:
                                break;
                            default:
                                break;
                        }
                    } while (menu != 7);
                }
                if (userName[1].equals(username) && password[1].equals(pass)) {
                    System.out.println("Anda Sedang Login Sebagai Kasir");
                    do {
                        System.out.println("=====================================");
                        System.out.println("                MENU:                ");
                        System.out.println("=====================================");
                        System.out.println("1. Input Data Barang ");
                        System.out.println("2. Cetak Resi");
                        System.out.println("3. Kelola Pesanan");
                        System.out.println("4. Pencarian ");
                        System.out.println("5. Kelola Ongkir ");
                        System.out.println("6. Keluar");
                        System.out.println("=====================================");

                        System.out.print("Masukkan Angka Pilihan Menu: ");
                        menu = sc.nextInt();
                        switch (menu) {

                            case 1:
                                // input data baarang
                                if (input < namaPengirim.length) {
                                    sc.nextLine(); // Membersihkan newline
                                    System.out.println("===================================");
                                    System.out.println("        TAMBAH BARANG MASUK        ");
                                    System.out.println("===================================");
                                    System.out.print("Masukkan Nama Pengirim  : ");
                                    namaPengirim[input] = sc.nextLine();
                                    System.out.print("Masukkan Nama Penerima  : ");
                                    namaPenerima[input] = sc.nextLine();
                                    System.out.print("Masukkan Kota Tujuan    : ");
                                    kotaT[input] = sc.nextLine();
                                    System.out.print("Masukkan Jenis Layanan (cargo || standart) : ");
                                    layanan[input] = sc.nextLine();
                                    // menggambil nilai array
                                    // start

                                    for (int k = 0; k < kota.length; k++) {
                                        if (kota[k].equalsIgnoreCase(kotaT[input])) {
                                            hasil = k;
                                            break;
                                        }
                                    }
                                    if (layanan[input].equalsIgnoreCase("cargo")) {
                                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input]
                                                + " dan layanan "
                                                + layanan[input] + ": " + hargaCargo[hasil]);

                                        System.out.print("Masukkan Berat Barang: ");
                                        berat[input] = sc.nextInt();
                                        jumlah[input] = berat[input] * hargaCargo[hasil];
                                        System.out.println("total pesanan :" + (int) jumlah[input]);

                                        // standart/reguler
                                    } else if (layanan[input].equalsIgnoreCase("standart")) {

                                        System.out.println("Harga Pengiriman dengan tujuan kota " + kotaT[input]
                                                + " dan layanan "
                                                + layanan[input] + ": " + hargaReg[hasil]);

                                        System.out.print("Masukkan Berat Barang: ");
                                        berat[input] = sc.nextInt();
                                        jumlah[input] = berat[input] * hargaReg[hasil];
                                        System.out.println("total pesanan :" + (int) jumlah[input]);

                                    }
                                    System.out.println("Masukkan Jumlah Uang Pembayaran: ");
                                    bayar[input] = sc.nextDouble();
                                    kembalian[input] = bayar[input] - jumlah[input];
                                    System.out.println("Kembalian Anda: " + (int) kembalian[input]);
                                    sc.nextLine();
                                    System.out.print("Masukkan No Resi: ");
                                    noResi[input] = sc.nextLine();
                                    input++;
                                }
                                break;

                            case 2:
                                // Cetak Resi
                                if (input < noResi.length) {
                                    sc.nextLine();
                                    System.out.println("===================================");
                                    System.out.println("            CETAK RESI             ");
                                    System.out.println("===================================");

                                    System.out.print("Masukkan No Resi: ");
                                    String Resi = sc.nextLine();

                                    // Mencari pengirim
                                    int resiIndex = -1;
                                    for (int e = 0; e < input; e++) {
                                        if (Resi.equalsIgnoreCase(noResi[e])) {
                                            resiIndex = e;
                                            break;
                                        }
                                    }

                                    if (resiIndex != -1) {
                                        System.out.println(" ");
                                        System.out.printf(" --------------------------------%n");
                                        System.out.printf(" | %-13s : %-12s | %n", "No Resi", noResi[resiIndex]);
                                        System.out.printf(" --------------------------------%n");
                                        System.out.printf(" | %-13s : %-12s | %n", "Nama Pengirim",
                                                namaPengirim[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Nama Penerima",
                                                namaPenerima[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Kota Tujuan", kotaT[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Jenis Layanan", layanan[resiIndex]);
                                        System.out.printf(" | %-13s : %-12s | %n", "Total Bayar",
                                                (int) jumlah[resiIndex]);
                                        System.out.printf(" --------------------------------%n");
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("No Resi Tidak Ditemukan!");
                                    }
                                }
                                break;

                            case 3:
                                // kelola pemesanan
                                do {
                                    System.out.println("===================================");
                                    System.out.println("         KELOLA PEMESANAN          ");
                                    System.out.println("===================================");
                                    System.out.println("PIlih Menu: ");
                                    System.out.println("1. Lacak Pengiriman");
                                    System.out.println("2. Update Status Pengiriman");
                                    System.out.print("Masukkan Angka Pilihan: ");
                                    menu = sc.nextInt();
                                    switch (menu) {
                                        case 1:
                                            if (input < noResi.length) {
                                                sc.nextLine();
                                                System.out.println("===================================");
                                                System.out.println("         LACAK PENGIRIMAN          ");
                                                System.out.println("===================================");

                                                System.out.print("Masukkan No Resi : ");
                                                String resiLacak = sc.nextLine();

                                                // Mencari no resi
                                                int lacakIndex = -1;
                                                for (int l = 0; l < input; l++) {
                                                    if (noResi[l].equalsIgnoreCase(resiLacak)) {
                                                        lacakIndex = l;
                                                        break;
                                                    }
                                                }

                                                if (lacakIndex != -1) {
                                                    System.out.println("Status Pengiriman No Resi " + "'"
                                                            + noResi[lacakIndex] + "'" + " : " + status[lacakIndex]);
                                                } else {
                                                    System.out.println("No Resi Tidak Ditemukan!");
                                                }
                                            }
                                            break;
                                        case 2:
                                            if (input < status.length) {
                                                sc.nextLine();
                                                System.out.println("===================================");
                                                System.out.println("     UPDATE STATUS PENGIRIMAN      ");
                                                System.out.println("===================================");

                                                System.out.print("Masukkan No Resi yang akan diupdate status: ");
                                                String statusUp = sc.nextLine();

                                                // Mencari no resi
                                                int statusIn = -1;
                                                for (int q = 0; q < input; q++) {
                                                    if (noResi[q].equalsIgnoreCase(statusUp)) {
                                                        statusIn = q;
                                                        break;
                                                    }
                                                }

                                                if (statusIn != -1) {
                                                    System.out.println(
                                                            "Masukkan Status Pengiriman (Diproses || Dikirim || Diterima)");
                                                    status[statusIn] = sc.nextLine();
                                                    System.out.println("Status Pengirim Update!");
                                                } else {
                                                    System.out.println("No Resi Tidak Ditemukan!");
                                                }
                                                input++;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    System.out.println(" ");
                                    System.out.println("Apakah anda ingin kembali ke menu kelola pesanan?");
                                    re = sc.next().charAt(0);
                                } while (re == 'y' || re == 'Y');
                                break;

                            case 4:
                                // Pencarian
                                if (input < noResi.length) {
                                    sc.nextLine();
                                    System.out.println("===================================");
                                    System.out.println("             PENCARIAN            ");
                                    System.out.println("===================================");
                                    System.out.print("Masukkan nomor resi: ");
                                    String pencResi = sc.nextLine();

                                    int pencarian = -1;
                                    for (int q = 0; q < input; q++) {
                                        if (noResi[q].equalsIgnoreCase(pencResi)) {
                                            pencarian = q;
                                            break;

                                        }
                                    }
                                    if (pencarian != -1) {
                                        System.out.println("=================================");
                                        System.out.println("            PENCARIAN            ");
                                        System.out.println("=================================");
                                        System.out.println("No Resi: " + noResi[pencarian]);
                                        System.out.println("Nama Pengirim: " + namaPengirim[pencarian]);
                                        System.out.println("Nama Penerima: " + namaPenerima[pencarian]);
                                        System.out.println("Kota Tujuan: " + kotaT[pencarian]);
                                        System.out.println("=================================");
                                    } else {
                                        System.out.println("No Resii tidak ditemukan!");
                                    }
                                }
                                break;

                            case 5:
                                // Kelola Ongkir
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
                                break;
                            case 6:
                                return;
                            default:
                                break;
                        }
                        System.out.println(" ");
                        System.out.println("Apakah anda ingin menjalankan menu lain?(y/n)");
                        re = sc.next().charAt(0);
                    } while (re == 'y' || re == 'Y');
                    break;
                }
                percobaan++;
            }

        } while (re == 'n' || re == 'N');

    }
}