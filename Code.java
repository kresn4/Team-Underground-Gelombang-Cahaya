import java.util.Scanner;
public class Gelombang_Cahaya {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
        char pilihan;
        do {
            System.out.println("Rumus - rumus gelombang cahaya");
            System.out.println("----------------------------------------------");
            System.out.println("1. Menghitung Kecepatan Cahaya");
            System.out.println("2. Menghitung Panjang Gelombang");
            System.out.println("3. Menghitung Frekuensi Gelombang");
            System.out.println("----------------------------------------------");
            System.out.println("Masukkan Pilihan Anda 1 - 3");
            int operasi = scanner.nextInt();
            switch (operasi) {
                //Rumus Kecepatan Cahaya
                case 1: {
                    //Menampilkan Input
                    System.out.println("Masukkan Lambda (m)");
                    double lambdaOne = input.nextDouble();
                    System.out.println("Masukkan Frekuensi Gelombang (Hz)");
                    double f1 = input.nextDouble();
                    
                    //Proses
                    double c1 = lambdaOne * f1;
                    
                    //Menampilkan Output
                    System.out.println("Kecepatan Cahaya adalah= " + c1 + " m/s" );
                    
                break;
                }
                //Rumus Panjang Gelombang
                case 2: {
                    //Menampilkan Input
                    System.out.println("Masukkan Kecepatan cahaya (m/s): ");
                    double c2 = input.nextDouble();
                    System.out.println("Masukkan Frekuensi Gelombang (Hz): ");
                    double f2 = input.nextDouble();
                    
                    //Proses
                    double lambdaTwo = c2/f2;
                    
                    //Menampilkan Output
                    System.out.println("Panjang Gelombang adalah= " + lambdaTwo + " meter");
                    
                break;
                }
                //Rumus Frekuensi Gelombang
                case 3: {
                    //Menampilkan Input
                    System.out.println("Masukkan Kecepatan cahaya (m/s): ");
                    double c3 = input.nextDouble();
                    System.out.println("Masukkan Panjang Gelombang (meter): ");
                    double lambda3 = input.nextDouble();
                    
                    //Proses
                    double f3 = c3/lambda3;
                    
                    //Menampilkan Output
                    System.out.println("Frekuensi Gelombang adalah= " + f3 + " Hz");
                    
                break;
                }
            }
            scanner.close();
            input.close();

            System.out.println("Apakah ingin memasukkan menghitung lagi? Y/N");
            pilihan = scanner.next().charAt(0);
            
        } while (pilihan == 'y' || pilihan == 'Y');
        
        System.out.println("Terimakasih! Salam Team Undergound");
    }
}
