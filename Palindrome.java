public class Palindrome {
    public static void main(String[] args) {
        boolean result = isPlaindrome(123);
        System.out.println(result);
    }

    static boolean isPlaindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0)
        {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return n == rev;
    }
}
