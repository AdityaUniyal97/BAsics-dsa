class SumOFnNatural{
    public static void main(String[] args) {
        int result = fact(3);
        System.out.println(result);
    }

    static int fact(int n)
    {
        return n * ( n + 1) / 2;
    }
}