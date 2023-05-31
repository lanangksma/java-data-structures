package Latihan;

import java.util.Scanner;

public class MatkulApp {

    public static Matakuliah input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kode Matakuliah: ");
        String kode = sc.nextLine();
        System.out.print("Masukkan Nama Matakuliah: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan SKS Matakuliah: ");
        int sks = sc.nextInt();

        return new Matakuliah(kode, nama, sks);
    }

    public static void main(String[] args) {
        StrukturListMatkul list = new StrukturListMatkul();

        Matakuliah mtt = new Matakuliah("IF004", "Konstruksi PL Berorientasi", 3);
        Matakuliah mtt1 = new Matakuliah("IF003", "Struktur Diskrit", 3);
        Matakuliah mtt2 = new Matakuliah("IF002", "Pemograman Web", 3);
        Matakuliah mtt3 = new Matakuliah("IF001", "Dasar Pemograman", 4);

        list.addHead(mtt);
        list.addHead(mtt1);
        list.addHead(mtt2);
        list.addHead(mtt3);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add to Head");
            System.out.println("2. Add to Mid");
            System.out.println("3. Add to Tail");
            System.out.println("4. Remove from Head");
            System.out.println("5. Remove from Mid");
            System.out.println("6. Remove from Tail");
            System.out.println("7. Find");
            System.out.println("8. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("\n");

            switch (choice) {
                case 1 -> {
                    System.out.println("Add To Head");
                    list.addHead(input());
                }
                case 2 -> {
                    System.out.println("Add To Mid");
                    System.out.println("Enter the position:");
                    int position = scanner.nextInt();
                    list.addMid(input(), position);
                }
                case 3 -> {
                    System.out.println("Add To Tail");
                    list.addTail(input());
                }
                case 4 -> {
                    System.out.println("Remove From Head...");
                    list.removeHead();
                }
                case 5 -> {
                    System.out.print("Remove From Mid");
                    System.out.println("Enter the position");
                    int midPosition = scanner.nextInt();
                    list.removeMid(midPosition);
                }
                case 6 -> {
                    System.out.println("Remove From Tail...");
                    list.removeTail();
                }
                case 7 -> {
                    System.out.println("Find");
                    System.out.print("Enter the data:");
                    scanner.nextLine();
                    String searchData = scanner.nextLine();

                    Matakuliah foundNrp = new Matakuliah(searchData);
                    list.find(foundNrp);
                }
                case 8 -> list.displayElementMatkul();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please enter a valid choice.");
            }

            System.out.println();
        } while (choice != 0);
    }
}
