import java.util.Scanner;

public class login{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username[]= {"ADMIN", "KASIR"}; 
        String pw[]= {"123", "456"};
        int login, menu;
        String nama, pin;
        boolean loginAdmin = false, loginKasir = false; 

        System.out.println("EKSPEDISI");
        System.out.println("----------------");

        System.out.println("LOGIN SEBAGAI: ");
        System.out.println("1. ADMIN");
        System.out.println("2. KASIR");
        System.out.println("");
        login = sc.nextInt();
        sc.nextLine();

        if (login == 1) {
            System.out.println("Masukkan Username: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Password: ");
            pin = sc.nextLine();

            for (int i = 0; i < username.length; i++) {
                if (username[i].equals(nama) && pw[i].equals(pin)) {
                    System.out.println("");
                    System.out.println("Login Berhasil, Anda masuk sebagai " + nama);
                    loginAdmin = true;
                    break;
                } else {
                    System.out.println("Username atau password invalid silahkan coba lagi");
                    break;
                }
            }
            
            while (loginAdmin) {
                System.out.println("MENU ADMIN");
                System.out.println("-------------");
                System.out.println("1. LACAK PENGIRIMAN");
                System.out.println("2. CEK ONGKIR");
                System.out.println("3. PENCARIAN");
                System.out.println("4. LAPORAN PENDAPATAN");
                System.out.println("5. EXIT");
                menu = sc.nextInt();
            }

        } else if (login == 2){
            System.out.println("Masukkan Username: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Password: ");
            pin = sc.nextLine();

            for (int i = 1; i < username.length; i++) {
                if (username[i].equals(nama) && pw[i].equals(pin)) {
                    System.out.println("");
                    System.out.println("Login Berhasil, Anda masuk sebagai " + nama);
                    loginKasir = true;
                    break;
                } else {
                    System.out.println("Username atau password invalid silahkan coba lagi");
                    break;
                }
            }

            while (loginKasir) {
                System.out.println("MENU KASIR");
                System.out.println("-------------");
                System.out.println("1. INPUT BARANG");
                System.out.println("2. CETAK RESI");
                System.out.println("3. EXIT");
                menu = sc.nextInt();
            }
        }
    }
}
