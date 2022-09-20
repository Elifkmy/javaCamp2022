public class Main {
    public static void main(String[] args) {
        int sayi1 = 40;
        int sayi2 = 50;
        int sayi3 = 20;
        if (sayi1 > sayi2 && sayi1 > sayi3){
            System.out.println("En büyük = " + sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En büyük = " + sayi2);
        } else {
            System.out.println("En büyük = " + sayi3);
        }
    }
}