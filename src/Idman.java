public class Idman {

    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squatSayisi;

    public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushupSayisi = pushupSayisi;
        this.situpSayisi = situpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public void hareketYap(String hareketTuru,int hareketSayısı){
        if(hareketTuru.equals("burpee")){
            burpeeyap(hareketSayısı);
        }
        else if(hareketTuru.equals("pushup")){
            pushupyap(hareketSayısı);
        }
        else if(hareketTuru.equals("situp")){
            situpyap(hareketSayısı);
        }
        else if(hareketTuru.equals("squat")){
            squatyap(hareketSayısı);
        }
        else {
            System.out.println("Geçersiz hareket...");
        }
    }

    public boolean idmanBittimi(){
        return (burpeeSayisi==0) && (pushupSayisi==0) && (situpSayisi==0) && (squatSayisi==0);
    }

    public void burpeeyap(int hareketSayısı){
        if(burpeeSayisi == 0){
        System.out.println("Yapılacak burpee kalmadı");
        }
        if(burpeeSayisi-hareketSayısı<0){
        System.out.println("Hedeflediğin burpee sayısını geçtin");
        burpeeSayisi = 0;
        System.out.println("Kalan burpee sayısı : " + burpeeSayisi);
        }
        else {
        burpeeSayisi-=hareketSayısı;
        System.out.println("Kalan burpee sayısı : " + burpeeSayisi);
        }
    }
    public void pushupyap(int hareketSayısı){
        if(pushupSayisi == 0){
            System.out.println("Yapılacak pushup kalmadı");
        }
        if(pushupSayisi-hareketSayısı<0){
            System.out.println("Hedeflediğin pushup sayısını geçtin");
            pushupSayisi = 0;
            System.out.println("Kalan pushup sayısı : " + pushupSayisi);
        }
        else {
            pushupSayisi-=hareketSayısı;
            System.out.println("Kalan pushup sayısı : " + pushupSayisi);
        }
    }
    public void situpyap(int hareketSayısı){
        if(situpSayisi == 0){
            System.out.println("Yapılacak situp kalmadı");
        }
        if(situpSayisi-hareketSayısı<0){
            System.out.println("Hedeflediğin situp sayısını geçtin");
            situpSayisi = 0;
            System.out.println("Kalan situp sayısı : " + situpSayisi);
        }
        else {
            situpSayisi-=hareketSayısı;
            System.out.println("Kalan situp sayısı : " + situpSayisi);
        }
    }
    public void squatyap(int hareketSayısı){
        if(squatSayisi == 0){
            System.out.println("Yapılacak squat kalmadı");
        }
        if(squatSayisi-hareketSayısı<0){
            System.out.println("Hedeflediğin squat sayısını geçtin");
            squatSayisi = 0;
            System.out.println("Kalan squat sayısı : " + squatSayisi);
        }
        else {
            squatSayisi-=hareketSayısı;
            System.out.println("Kalan squat sayısı : " + squatSayisi);
        }
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
}
