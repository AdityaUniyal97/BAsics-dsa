public class PrintAllDivisors {     
    public static void main(String[] args) {
      Divsor(12);        
    }

    static void Divsor(int n)
    {
       for(int i = 1 ; i * i <= n ; i++)
       {
        if( n % i == 0)
        {
            System.out.println(i);
        }
        if( i != n / i)
        {
            System.out.println(n/i);
        }
       }
    }
}
