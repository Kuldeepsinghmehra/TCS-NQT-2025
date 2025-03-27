package Numbers;

public class decimalToBinary {
    public static void main(String[] args) {
        int number=12;
        StringBuilder sb=new StringBuilder();
        if(number==0)
        {
            sb.append(0);
        }
        while(number>0)
        {
            int rem=number%2;
            number=number/2;
            sb.append(rem);

        }
       System.out.println("this is Decimal to binary"+sb.reverse().toString());
    
    }
    
}
