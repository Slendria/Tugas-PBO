import Model.Prisma;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Volume Prisma by Kelvin");
        System.out.println("=========================\n");
        Scanner keyboard = new Scanner(System.in);

        Prisma Prisma1 = new Prisma();
        System.out.print("Masukkan Alas Segitiga Prisma : ");
        Prisma1.a= keyboard.nextInt();

        Prisma Prisma2 = new Prisma();
        System.out.print("Masukkan Tinggi Segitiga : ");
        Prisma1.t= keyboard.nextInt();

        Prisma Prisma3 = new Prisma();
        System.out.print("Masukkan Tinggi Prisma : ");
        Prisma1.h= keyboard.nextInt();

        Prisma1.VolumePrisma();
    }
}
