class CountDigit{
    public static void main(String[] args) {
        int result = countDigit(100);
        System.out.println(result);
    }

    static int countDigit(int n){
        int count = 0;
        while(n > 0)
        {
            n = n / 10;
            count++;
        }
        return count;
    }
}