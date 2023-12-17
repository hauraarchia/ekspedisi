import java.util.Scanner;

public class sistempelacakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = {"Haura", "Isna", "Luthfi"};
        String[] passwords = {"13", "15", "17"};

        int percobaan = 0;

        while (true) {
            System.out.println("Silahkan masukkan username dan password");
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            for (int i = 0; i < usernames.length; i++) {
                if (usernames[i].equals(username) && passwords[i].equals(password)){
                    System.out.println("Selamat Datang, " + username + "!");
                    return;
                }
            }

            System.out.println("Invalid username or password");
            percobaan++;

        }

    }
}