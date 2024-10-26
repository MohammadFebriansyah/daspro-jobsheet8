import java.util.Scanner;
public class DaftarAtlet13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int p = 1; p <= jumlahPoliteknik; p++) {
            System.out.print("\nMasukkan nama Politeknik ke-" + p + ": ");
            String namaPoliteknik = sc.nextLine();

            System.out.println("Masukkan 5 nama atlet cabang olahraga Badminton");
            System.out.print("Atlet 1: ");
            String atletBadminton1 = sc.nextLine();
            System.out.print("Atlet 2: ");
            String atletBadminton2 = sc.nextLine();
            System.out.print("Atlet 3: ");
            String atletBadminton3 = sc.nextLine();
            System.out.print("Atlet 4: ");
            String atletBadminton4 = sc.nextLine();
            System.out.print("Atlet 5: ");
            String atletBadminton5 = sc.nextLine();

          
            System.out.println("Masukkan 5 nama atlet cabang olahraga Tenis Meja");
            System.out.print("Atlet 1: ");
            String atletTenis1 = sc.nextLine();
            System.out.print("Atlet 2: ");
            String atletTenis2 = sc.nextLine();
            System.out.print("Atlet 3: ");
            String atletTenis3 = sc.nextLine();
            System.out.print("Atlet 4: ");
            String atletTenis4 = sc.nextLine();
            System.out.print("Atlet 5: ");
            String atletTenis5 = sc.nextLine();

           
            System.out.println("Masukkan 5 nama atlet cabang olahraga Basket");
            System.out.print("Atlet 1: ");
            String atletBasket1 = sc.nextLine();
            System.out.print("Atlet 2: ");
            String atletBasket2 = sc.nextLine();
            System.out.print("Atlet 3: ");
            String atletBasket3 = sc.nextLine();
            System.out.print("Atlet 4: ");
            String atletBasket4 = sc.nextLine();
            System.out.print("Atlet 5: ");
            String atletBasket5 = sc.nextLine();

            
            System.out.println("Masukkan 5 nama atlet cabang olahraga Bola Voli");
            System.out.print("Atlet 1: ");
            String atletVoli1 = sc.nextLine();
            System.out.print("Atlet 2: ");
            String atletVoli2 = sc.nextLine();
            System.out.print("Atlet 3: ");
            String atletVoli3 = sc.nextLine();
            System.out.print("Atlet 4: ");
            String atletVoli4 = sc.nextLine();
            System.out.print("Atlet 5: ");
            String atletVoli5 = sc.nextLine();

            System.out.println("\n===== Informasi Nama Atlet Porseni =====");
            System.out.println("Politeknik: " + namaPoliteknik);

            System.out.println("Cabang Olahraga Badminton");
            System.out.println("Atlet: " + atletBadminton1 + ", " + atletBadminton2 + ", " + atletBadminton3 + ", " + atletBadminton4 + ", " + atletBadminton5);

            System.out.println("Cabang Olahraga Tenis Meja");
            System.out.println("Atlet: " + atletTenis1 + ", " + atletTenis2 + ", " + atletTenis3 + ", " + atletTenis4 + ", " + atletTenis5);

            System.out.println("Cabang Olahraga Basket");
            System.out.println("Atlet: " + atletBasket1 + ", " + atletBasket2 + ", " + atletBasket3 + ", " + atletBasket4 + ", " + atletBasket5);

            System.out.println("Cabang Olahraga Bola Voli");
            System.out.println("Atlet: " + atletVoli1 + ", " + atletVoli2 + ", " + atletVoli3 + ", " + atletVoli4 + ", " + atletVoli5);
        }

        sc.close();
    }
}
