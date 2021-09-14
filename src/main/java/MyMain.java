import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int bin = Integer.parseInt(binary);
        int sum = 0;
        int count = 1;
        for(int i = 0;i<binary.length();i++){
            if (bin%10==1) {
                sum += count;
            }
            bin/=10;
            count*=2;
        }
        return sum;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        String bina = "";
        if (decimal == 1)
            return "1";
        if (decimal == 0)
            return  "0";
        while (decimal>0){
            bina+=""+decimal%2;
            decimal/=2;
        }
        System.out.println(bina);
        String binar = "";
        for(int i = bina.length()-1;i>=0;i--){
            binar+=bina.charAt(i);
        }
        return binar;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number in binary to turn in to decimal form: ");
        String bin1 = scan.nextLine();
        System.out.println(bin1);
        System.out.println("Your number in decimal form is "+binaryToDecimal(bin1));
        System.out.println("Give me a number in decimal form to turn in to binary: ");
        int dec1 = scan.nextInt();
        System.out.println(dec1);
        System.out.println("Your number in binary is "+decimalToBinary(dec1));
    }
}
