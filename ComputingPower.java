public class ComputingPower {
    public static void main(String[] args) {
        int result = Power(2, 3);
        System.out.println(result);
    }

    static int Power(int x , int n)
    {
        if(n == 0)
        return 1;

        int temp = Power(x , n / 2);
        temp = temp * temp;

        if(n % 2 == 0)
        {
            return temp;
        }

        else
        {
            return temp * x;
        }
    }
}
