import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz");
        String idmanlar = "Geçerli hareketler...\n" +
                "burpee\n" +
                "pushup\n" +
                "situp\n" +
                "squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun");

        System.out.print("Burpee sayısı : ");
        int burpeeSayısı = input.nextInt();
        System.out.print("pushup sayısı : ");
        int pushupSayısı = input.nextInt();
        System.out.print("situp sayısı : ");
        int situpSayısı = input.nextInt();
        System.out.print("squat sayısı : ");
        int squatSayısı = input.nextInt();
        input.nextLine();

        Idman idman = new Idman(burpeeSayısı,pushupSayısı,situpSayısı,squatSayısı);
        System.out.println("İdmanınız başlıyor...");

        while(!idman.idmanBittimi()){
            System.out.print("Hareket türü giriniz(burpee,pushup,squat,situp) : ");
            String tür = input.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız : ");
            int sayı = input.nextInt();
            input.nextLine();
            idman.hareketYap(tür,sayı);
        }
        System.out.println("İdman bitti...");

    }
}