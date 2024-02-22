//HCF program  
public class Hcf {
    public static void main(String[] args) {
        int result = gcd(4 , 6);
        System.out.println(result);
    }

    static int gcd(int a , int b)
    {
        if(b == 0)
        return a;

        else{
            return gcd(b , a % b);
        }
    }
}
