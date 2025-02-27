import java.io.*;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string: ");
        String str = br.readLine();
        char[] charArray = str.toCharArray();
        String reverseString = "";
        for (int i = charArray.length -1; i >= 0; i--) {
            reverseString += ""+charArray[i];
        }
        System.out.println("Reverse String: "+reverseString);
    }
}
