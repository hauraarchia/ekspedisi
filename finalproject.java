import java.util.Scanner;

public class finalproject {
    static Scanner sc = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static int choice = 0; // untuk pilihan menu
    static String inputUsername;
    static String inputPassword;
    // Array untuk menyimpan informasi pengguna

    private static String[] userName = { "haura", "isna" };
    private static String[] Password = { "123", "456" };
    static String[] noResi = new String[25];
    static String[] namaPengirim = new String[25];
    static String[] namaPenerima = new String[25];
    static String[] kotaT = new String[25];
    static String[] layanan = new String[25];
    static String[] status = new String[25];
    static double[] jumlah = new double[25];
    static double[] bayar = new double[25];
    static double[] kembalian = new double[25];
    static int[] berat = new int[25];

    // table ongkir & kayanan
    static String[] kota = new String[10]; // kota tujuan
    static int[] hargaReg = new int[10]; // layanan standart atau reguler
    static int[] hargaCargo = new int[10]; // layanan cargo

    static String[] resi = new String[10];
    static String[] pengirim = new String[10];
    static String[] penerima = new String[10];
    static int[] total = new int[10];

    static int ongkir = 3; // ongkir
    static int percobaan = 0; // login

    static int input = 2;
    static int noresi = 2;

    static int hasil = -1;
    static String key;
    static int tujuan;
    static char kembali;
    static char re;
    static int menu = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat objek Scanner untuk menerima input dari pengguna

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

        kota[0] = "Pasuruan";
        kota[1] = "Surabaya";
        kota[2] = "Probolinggo";

        hargaReg[0] = 10000;
        hargaReg[1] = 12000;
        hargaReg[2] = 14000;

        hargaCargo[0] = 8000;
        hargaCargo[1] = 15000;
        hargaCargo[2] = 12000;

        System.out.println("------------------------------------------");
        System.out.println("|                  LOGIN                 |");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan Username : ");
        inputUsername = sc.next();
        System.out.print("Masukkan Password : ");
        inputPassword = sc.next();
        System.out.println("-----------------------------------------");

        login(inputUsername, inputPassword);

        if (isLoggedIn) {
            System.out.println("Login berhasil. Selamat datang, " + inputUsername + "!");
        } else {
            System.out.println("Login gagal. Cek kembali username dan password Anda.");
        }
        displayMenuOptions(); // menampilkan fungsi menu
        sc.close();

    }

    private static void login(String inputUsername, String inputPassword) {
        isLoggedIn = false;

        for (int i = 0; i < userName.length; i++) {
            if (inputUsername.equals(userName[i]) && inputPassword.equals(Password[i])) {
                isLoggedIn = true;
                break;
            }
        }
    }

    // Fungsi untuk memeriksa informasi login

    private static void displayMenuOptions() {
        System.out.println("\n=== Menu Options ===");
        System.out.println("1. Admin ");
        System.out.println("2. Kasir");
        System.out.println("3. Logout");
        System.out.println("====================");
        System.out.print("Pilih menu (1-3): ");
        choice = sc.nextInt();
        processMenuChoice(sc, choice);
        if (choice == 3) {
            do {
                System.out.println("------------------------------------------");
                System.out.println("|                  LOGIN                 |");
                System.out.println("------------------------------------------");
                System.out.print("Masukkan Username : ");
                inputUsername = sc.next();
                System.out.print("Masukkan Password : ");
                inputPassword = sc.next();
                System.out.println("-----------------------------------------");
                login(inputUsername, inputPassword);

                if (isLoggedIn) {
                    System.out.println("Login berhasil. Selamat datang, " + inputUsername + "!");
                } else {
                    System.out.println("Login gagal. Cek kembali username dan password Anda.");
                }
                displayMenuOptions();
                choice = sc.nextInt(); // untuk pilihan menu
            } while (choice == 3);
        }

    }

    private static void processMenuChoice(Scanner sc, int choice) {
        switch (choice) {
            case 1:
                do {
                    System.out.println("=====================================");
                    System.out.println("             MENU ADMIN:             ");
                    System.out.println("=====================================");
                    System.out.println("1. Input Data Barang ");
                    System.out.println("2. Cetak Resi");
                    System.out.println("3. Kelola Pesanan");
                    System.out.println("4. Pencarian ");
                    System.out.println("5. Kelola Ongkir ");
                    System.out.println("6. Laporan Pendapatan ");
                    System.out.println("7. Keluar");
                    System.out.println("=====================================");

                    System.out.print("Masukkan Angka Pilihan Menu: ");
                    int menu = sc.nextInt();
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
                            sc.nextLine();
                            if (menu == 7) {
                                displayMenuOptions();
                                choice = sc.nextInt();
                                processMenuChoice(sc, choice);
                            }
                            break;
                        default:
                            System.out.print("!Pilihan tidak valid. Silahkan Pilih menu dengan benar!");
                            break;
                    }
                } while (menu != 7);
                displayMenuOptions();
                break;
            case 2:
                do {
                    System.out.println("=====================================");
                    System.out.println("             MENU ADMIN:             ");
                    System.out.println("=====================================");
                    System.out.println("1. Input Data Barang ");
                    System.out.println("2. Cetak Resi");
                    System.out.println("3. Kelola Pesanan");
                    System.out.println("4. Pencarian ");
                    System.out.println("5. Kelola Ongkir ");
                    System.out.println("6. Laporan Pendapatan ");
                    System.out.println("7. Keluar");
                    System.out.println("=====================================");

                    System.out.print("Masukkan Angka Pilihan Menu: ");
                    int menu = sc.nextInt();
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
                            sc.nextLine();
                            if (menu == 7) {
                                displayMenuOptions();
                                choice = sc.nextInt();
                                processMenuChoice(sc, choice);
                            }
                            break;
                        default:
                            System.out.print("!Pilihan tidak valid. Silahkan Pilih menu dengan benar!");
                            break;
                    }
                } while (menu != 6);
                displayMenuOptions();
                break;
            case 3:
                System.out.println("Logout berhasil. Sampai jumpa!");
                break;
            default:
                System.out.println("Pilihan menu tidak valid.");
        }
    }

}