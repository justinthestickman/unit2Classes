public class Annuity
{
    public static void main(String[] args)
    {
        double pmt = 10000;
        double n = 20;
        final double I = 0.08;
        final double BASE = 1+I;
        final double EXP = n-1;
        final double X = Math.pow(BASE,EXP);
        double pvann = pmt*((((X-1)/I)/X)+1);
        System.out.println(pvann);
    }
}