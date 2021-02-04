import java.nio.charset.StandardCharsets;

public class ReversString {

    public static void main(String[] args) {
    
        String input = "Hello world";  //Input

        byte[] Arr = input.getBytes();    // getBytes() method to convert string into bytes[].

        byte[] result = new byte[Arr.length];    //To store the result 
                
        for (int i = 0; i < Arr.length; i++)              // Store result in reverse order into the result byte[]
            result[i] = Arr[Arr.length - i - 1];

        System.out.println(new String(result));
    }
}
