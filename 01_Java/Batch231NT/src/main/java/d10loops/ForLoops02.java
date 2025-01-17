package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz. Interview Sorusu
        //           578 ==> 5+7+8=20 ==> Output 20 olmali

        int sum = 0;

        for (int i = 578; i > 0; i = i / 10) { // i /=10
            sum = sum + i % 10;

        }
        System.out.println("sum = " + sum); //sum = 20

        //---------------------------
        System.out.println("-----------------");
        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf

        String t = "Yusuf";
        String unique = "";

        for (int i = 0; i < t.length();         i++) {

            char ch = t.charAt(i); //index verince harfi getirecek

            if (t.indexOf(ch) == t.lastIndexOf(ch)) {
                unique = unique + ch;
            }

        }
        System.out.println("Tekrarsiz : " + unique); //Tekrarsiz : Ysf

    }
}
