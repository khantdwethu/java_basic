public class Chapter6 {
    public static void main(String[] args) {
       int res = sumDigits(1111111111);
        System.out.println(res);
    }
    public static int sumDigits(long n) {
        int result = 0,modulas = 0,divide = 0;

        do{
            modulas = (int) n%10;
            result += modulas;
            divide = (int) n/10;
            n= divide;
        }while (n>0);


        return result;
    }
}
