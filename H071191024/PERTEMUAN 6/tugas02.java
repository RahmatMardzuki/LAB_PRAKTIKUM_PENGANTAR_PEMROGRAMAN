import java.util.Scanner;
class tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int panjang = kata.length();
        

        String kata1 = kata.replace(" ", "").toUpperCase();
        String kata2 = kata1.substring(0, (panjang - 1)/2);

        
        String kataBalik = "";
        for (int i = 0; i < kata2.length()- 1; i++) {
            kataBalik = kata2.charAt(i) + kataBalik;
        }
        
        int hexa = panjang*panjang;
        int octal = panjang;
        char simbol;
        
        if (kataBalik.charAt(0)>65 && kataBalik.charAt(0)<91) {
            simbol = '?';
        } else {
            simbol = '!';
        }
        //%x = hexa dan %o=octal dan %c = char dan %s = string
        System.out.printf("#%x%s%s%o%c", hexa, kata2, kataBalik, octal, simbol);

    }
}