public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println("Is the sum of the first 2 numbers equal to the 3rd number ? :" + hasEqualSum(2,1,2 ));

    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if(num1 + num2 == num3){
            return true;
        }
        return false;
    }
}
