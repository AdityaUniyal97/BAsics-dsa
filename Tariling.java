//we have to count trailing zeros means we have to count the number of zeros at the end of the number.
//i-p> n = 5
// than o/p - 5 (1*2*3*4*5*=> 120) 1 zero
public class Tariling {
    public static void main(String[] args) {
       int result = CountTrail(5);
       System.out.println(result);         
    }

   static int CountTrail(int n)
   {
    int rev = 0;
    for(int i = 5 ; i <= n ; i = i * 5)
    {
        rev = rev + n/i;
    }
    return rev;
   }
}
