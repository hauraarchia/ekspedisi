import java.util.Scanner;

public class finalproject {

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
                if (userName[0].equals(username) && password[0].equals(pass)) {
                    do {
                        System.out.println(
                                "Selamat Datang " + username
                                        + " di Sistem Ekspedisi 333 Anda Sedang Login Sebagai Admin");
                        System.out.println("PILIH MENU: ");
                        System.out.println("1. Input Data Barang ");
                        System.out.println("2. Cek Ongkir ");
                        System.out.println("3. Cetak Resi");
                        System.out.println("4. Pencarian ");
                        System.out.println("5. Lacak Pengiriman");
                        System.out.println("6. Laporan Pendapatan ");
                        System.out.println("7. Keluar ");

                        System.out.print("Masukkan Angka Pilihan Menu: ");
                        int menu = sc.nextInt();
                        switch (menu) {
                            // input data baarang
                            case 1:

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
                                    System.out.println("Masukkan Status Pengiriman: ");
                                    status[input] = sc.nextLine();
                                    System.out.println("Status Pengiriman Anda Saat ini: " + status[input]);

                                    input++;
                                }
                                break;
                            // cek ongkir
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
                                do {
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
                            case 3:
                                if (input < noResi.length) {

                                    sc.nextLine();
                                    System.out.println("===================================");
                                    System.out.println("            CETAK RESI             ");
                                    System.out.println("===================================");

                                    System.out.print("Masukkan Nama Pengirim untuk menambah No Resi: ");
                                    String Resi = sc.nextLine();

                                    // Mencari pengirim
                                    int resiIndex = -1;
                                    for (int n = 0; n < input; n++) {
                                        if (Resi.equalsIgnoreCase(namaPengirim[n])) {
                                            resiIndex = n;
                                            break;
                                        }
                                    }

                                    // update no resi
                                    if (resiIndex != -1) {
                                        System.out.print("Masukkan No Resi: ");
                                        noResi[resiIndex] = sc.nextLine();
                                        System.out.println("  !No Resi Update!");
                                    } else {
                                        System.out.println("Nama Pengirim Tidak Ditemukan");
                                    }

                                    System.out.println("---------------------------------------------------");
                                    // System.out.println(" ");
                                    System.out.println(" No Resi        : " + noResi[resiIndex]);
                                    System.out.println(" Nama Pengirim  : " + namaPengirim[resiIndex]);
                                    System.out.println(" Nama Penerima  : " + namaPenerima[resiIndex]);
                                    System.out.println(" Kota Tujuan    : " + kotaT[resiIndex]);
                                    System.out.println(" Jenis Layanan  : " + layanan[resiIndex]);
                                    System.out.println(" Total Bayar    : " + jumlah[resiIndex]);
                                    System.out.println(" Status Pesanan : " + status[resiIndex]);
                                    System.out.println("---------------------------------------------------");
                                    input++;
                                }
                                break;
                            case 4:
                                if (input < noResi.length) {

                                    System.out.println("Masukkan nomor resi: ");
                                    String pencResi = sc.nextLine();

                                    int pencarian = -1;
                                    for (int f = 0; f < noResi.length; f++) {
                                        if (noResi[f].equalsIgnoreCase(pencResi)) {
                                            pencarian = f;
                                            break;

                                        }
                                    }
                                    System.out.println("No Resi: " + noResi[pencarian]);
                                    System.out.println("Nama Pengirim: " + namaPengirim[pencarian]);
                                    System.out.println("Nama Penerima: " + namaPenerima[pencarian]);
                                    System.out.println("Kota Tujuan: " + kotaT[pencarian]);
                                }
                                break;
                            case 5:
                                System.out.println("Pilih Menu");
                                System.out.println("1. Lacak Pengiriman");
                                System.out.println("2. Update Status Pengiriman");
                                System.out.println("Masukkan Angka Pilihan Menu: ");
                                int choice = sc.nextInt();
                                switch (choice) {
                                    case 1:
                                        if (input < noResi.length) {
                                            sc.nextLine();
                                            System.out.println("===================================");
                                            System.out.println("         LACAK PENGIRIMAN          ");
                                            System.out.println("===================================");

                                            System.out.print("Masukkan No Resi : ");
                                            String resiLacak = sc.nextLine();
                                            System.out.println("--------------------------");

                                            // Mencari no resi
                                            int lacakIndex = -1;
                                            for (int q = 0; q < noResi.length; q++) {
                                                if (noResi[q].equalsIgnoreCase(resiLacak)) {
                                                    lacakIndex = q;
                                                    System.out.println(
                                                            "Status Pengiriman untuk No Resi " + "'" + resiLacak + "'"
                                                                    + ": " + status[lacakIndex]);
                                                    break;
                                                }
                                            }

                                            // Check if the resiLacak was not found
                                            if (lacakIndex == -1) {
                                                System.out.println("!No Resi Tidak Ditemukan!");
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
                                            int hasilstatus = -1;
                                            for (int q = 0; q < noResi.length; q++) {
                                                if (noResi[q].equalsIgnoreCase(statusUp)) {
                                                    hasilstatus = q;
                                                    break;
                                                }
                                            }

                                            if (hasilstatus != -1) {
                                                System.out.println(
                                                        "Masukkan Status Pengiriman (Diproses || Dikirim || Diterima): ");
                                                status[input] = sc.nextLine();
                                                System.out.println("  !Status Pengirim Update!  ");
                                            } else {
                                                System.out.println("  !No Resi Tidak Ditemukan! ");
                                            }
                                            input++;
                                        }
                                        break;
                                    default:
                                        break;
                                }

                                break;
                            case 6:
                                for (int b = 0; b < input; b++) {
                                    System.out.println(" ");
                                    System.out.println("===================================");
                                    System.out.println("         LAPORAN PENDAPATAN        ");
                                    System.out.println("===================================");
                                    System.out.println(" No Resi       : " + (noResi[b] != null ? noResi[b] : ""));
                                    System.out.println(
                                            " Nama Pengirim : " + (namaPengirim[b] != null ? namaPengirim[b] : ""));
                                    System.out.println(
                                            " Nama Penerima : " + (namaPenerima[b] != null ? namaPenerima[b] : ""));
                                    System.out.println(" Kota Tujuan   : " + (kotaT[b] != null ? kotaT[b] : ""));
                                    System.out.println(" Jenis Layanan : " + (layanan[b] != null ? layanan[b] : ""));
                                    System.out.println(" Total Bayar   : " + (jumlah[b] != 0.0 ? jumlah[b] : ""));
                                    System.out.println(" Status        : " + (status[b] != null ? status[b] : ""));
                                    System.out.println();
                                }
                                break;
                            default:
                                break;
                        }
                        System.out.println("apakah anda ingin kembali ke menu utama?(y/n)");
                        keluar = sc.next().charAt(0);
                    } while (keluar == 'y' || keluar == 'Y');
                    break;
                }
                if (userName[1].equals(username) && password[1].equals(pass)) {
                    do {
                        System.out.println(
                                "Selamat Datang " + username + " di Sistem Ekspedisi 333 Anda Login Sebagai Kasir");
                        System.out.println("PILIH MENU: ");
                        System.out.println("1. Input Data Barang ");
                        System.out.println("2. Cek Ongkir ");
                        System.out.println("3. Cetak Resi");
                        System.out.println("4. Pencarian ");
                        System.out.println("5. Lacak Pengiriman");

                        System.out.print("Masukkan Angka Pilihan Menu: ");
                        int menu = sc.nextInt();
                        switch (menu) {
                            // input data baarang
                            case 1:

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
                                    System.out.println("Masukkan Status Pengiriman: ");
                                    status[input] = sc.nextLine();
                                    System.out.println("Status Pengiriman Anda Saat ini: " + status[input]);

                                    input++;
                                }
                                break;
                            // cek ongkir
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
                                do {
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
                            case 3:
                                if (input < noResi.length) {

                                    sc.nextLine();
                                    System.out.println("===================================");
                                    System.out.println("            CETAK RESI             ");
                                    System.out.println("===================================");

                                    System.out.print("Masukkan Nama Pengirim untuk menambah No Resi: ");
                                    String Resi = sc.nextLine();

                                    // Mencari pengirim
                                    int resiIndex = -1;
                                    for (int n = 0; n < input; n++) {
                                        if (Resi.equalsIgnoreCase(namaPengirim[n])) {
                                            resiIndex = n;
                                            break;
                                        }
                                    }

                                    // update no resi
                                    if (resiIndex != -1) {
                                        System.out.print("Masukkan No Resi: ");
                                        noResi[resiIndex] = sc.nextLine();
                                        System.out.println("  !No Resi Update!");
                                    } else {
                                        System.out.println("Nama Pengirim Tidak Ditemukan");
                                    }

                                    System.out.println("---------------------------------------------------");
                                    // System.out.println(" ");
                                    System.out.println(" No Resi        : " + noResi[resiIndex]);
                                    System.out.println(" Nama Pengirim  : " + namaPengirim[resiIndex]);
                                    System.out.println(" Nama Penerima  : " + namaPenerima[resiIndex]);
                                    System.out.println(" Kota Tujuan    : " + kotaT[resiIndex]);
                                    System.out.println(" Jenis Layanan  : " + layanan[resiIndex]);
                                    System.out.println(" Total Bayar    : " + jumlah[resiIndex]);
                                    System.out.println(" Status Pesanan : " + status[resiIndex]);
                                    System.out.println("---------------------------------------------------");
                                    input++;
                                }
                                break;
                            case 4:
                                if (input < noResi.length) {

                                    System.out.println("Masukkan nomor resi: ");
                                    String pencResi = sc.nextLine();

                                    int pencarian = -1;
                                    for (int f = 0; f < noResi.length; f++) {
                                        if (noResi[f].equalsIgnoreCase(pencResi)) {
                                            pencarian = f;
                                            break;

                                        }
                                    }
                                    System.out.println("No Resi: " + noResi[pencarian]);
                                    System.out.println("Nama Pengirim: " + namaPengirim[pencarian]);
                                    System.out.println("Nama Penerima: " + namaPenerima[pencarian]);
                                    System.out.println("Kota Tujuan: " + kotaT[pencarian]);
                                }
                                break;
                            case 5:
                                System.out.println("Pilih Menu");
                                System.out.println("1. Lacak Pengiriman");
                                System.out.println("2. Update Status Pengiriman");
                                System.out.println("Masukkan Angka Pilihan Menu: ");
                                int choice = sc.nextInt();
                                switch (choice) {
                                    case 1:
                                        if (input < noResi.length) {
                                            sc.nextLine();
                                            System.out.println("===================================");
                                            System.out.println("         LACAK PENGIRIMAN          ");
                                            System.out.println("===================================");

                                            System.out.print("Masukkan No Resi : ");
                                            String resiLacak = sc.nextLine();
                                            System.out.println("--------------------------");

                                            // Mencari no resi
                                            int lacakIndex = -1;
                                            for (int q = 0; q < noResi.length; q++) {
                                                if (noResi[q].equalsIgnoreCase(resiLacak)) {
                                                    lacakIndex = q;
                                                    System.out.println(
                                                            "Status Pengiriman untuk No Resi " + "'" + resiLacak + "'"
                                                                    + ": " + status[lacakIndex]);
                                                    break;
                                                }
                                            }

                                            // Check if the resiLacak was not found
                                            if (lacakIndex == -1) {
                                                System.out.println("!No Resi Tidak Ditemukan!");
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
                                            int hasilstatus = -1;
                                            for (int q = 0; q < noResi.length; q++) {
                                                if (noResi[q].equalsIgnoreCase(statusUp)) {
                                                    hasilstatus = q;
                                                    break;
                                                }
                                            }

                                            if (hasilstatus != -1) {
                                                System.out.println(
                                                        "Masukkan Status Pengiriman (Diproses || Dikirim || Diterima): ");
                                                status[input] = sc.nextLine();
                                                System.out.println("  !Status Pengirim Update!  ");
                                            } else {
                                                System.out.println("  !No Resi Tidak Ditemukan! ");
                                            }
                                            input++;
                                        }
                                        break;
                                    default:
                                        break;
                                }

                                break;
                            case 6:
                                for (int b = 0; b < input; b++) {
                                    System.out.println(" ");
                                    System.out.println("===================================");
                                    System.out.println("         LAPORAN PENDAPATAN        ");
                                    System.out.println("===================================");
                                    System.out.println(" No Resi       : " + (noResi[b] != null ? noResi[b] : ""));
                                    System.out.println(
                                            " Nama Pengirim : " + (namaPengirim[b] != null ? namaPengirim[b] : ""));
                                    System.out.println(
                                            " Nama Penerima : " + (namaPenerima[b] != null ? namaPenerima[b] : ""));
                                    System.out.println(" Kota Tujuan   : " + (kotaT[b] != null ? kotaT[b] : ""));
                                    System.out.println(" Jenis Layanan : " + (layanan[b] != null ? layanan[b] : ""));
                                    System.out.println(" Total Bayar   : " + (jumlah[b] != 0.0 ? jumlah[b] : ""));
                                    System.out.println(" Status        : " + (status[b] != null ? status[b] : ""));
                                    System.out.println();
                                }
                                break;
                            default:
                                break;
                        }

                        System.out.println("Apakah anda ingin keluar?(y/n)");
                        keluar = sc.next().charAt(0);
                    } while (keluar == 'n' || keluar == 'N');
                }
                percobaan++;
            }
        } while (login);
    }
}
