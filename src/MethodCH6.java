public class MethodCH6 {
    public static void main(String[] args) {

        //---------------------------------------------------
//        int sum= 0;
//        for (int i = 1; i < 10; i++) {
//            sum+=i;
//        }
//        System.out.println("Sum form 1 to 10 is "+sum);
//
//        int sum1 = 0;
//        for (int i = 20; i < 37 ; i++) {
//            sum1+=i;
//        }
//        System.out.println("Sum from 20 to 37 is "+ sum1);
//
//        int sum2= 0;
//        for (int i = 35; i < 49; i++) {
//            sum2+=i;
//        }
//        System.out.println("Sum form 35 to 49 is "+ sum2);
        //----------------------------------------------------

        System.out.println("Sum from 1 to 10 is "+ calculateSum(1,10));

        System.out.println("Sum from 20 to 37 is "+ calculateSum(20,37));

        System.out.println("Sum from 37 to 49 is "+ calculateSum(37,49));


    }

    public static int calculateSum(int initNum,int endNum){
        int result = 0;
        for (int i = initNum; i < endNum ; i++) {
            result += i;
        }
        return  result;
    }

}
