package d28exceptions_enum_iterators;

public class ExceptionRunner {
    public static void main(String[] args) {
        ogrenciNotu(-55);
    }

    public static void ogrenciNotu(int not){
        //System.out.println(not);
        if (not < 0 || not > 100){

            try {
                throw new InvalidStudentGradeException("Ogrenci notu sifirdan kucuk veya yuzden buyuk olamaz");
            } catch (InvalidStudentGradeException e) {
               e.printStackTrace();
            }

        } else {
            System.out.println(not);
        }



    }

}
