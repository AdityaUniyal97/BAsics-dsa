public class Lcm {
    public static void main(String[] args) {
        int result1 = gcd(100 , 2000);
        System.out.println(result1);
        int result2 = LCM(4 , 6);
        System.out.println(result2); 
    }

    static int gcd(int a , int b)
    {
        if( b == 0)
        return a;
        else{
            return gcd(b, a % b);
        }
    }

    static int LCM(int a , int b)
    {
        return (a * b) / gcd(a , b);
    }
}
