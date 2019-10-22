import java.util.Random;
import java.util.Scanner;

public class ClassTest {

    public static void main(String[] args) {
        verify(call(20));
    }

    public static String call(int len){
        Random random = new Random();
        int r1,r2,r3;
        String s = "";

        for(int i=0; i<len; i++) {
            r3 = random.nextInt(2);   // take Big A or small a randomly
            if (r3 == 0) {    // take Big A
                r1 = random.nextInt(26) + 65;
                s += (char)r1;
            } else if (r3 == 1) {  // take small a
                r2 = random.nextInt(26) + 97;
                s += (char)r2;
            }
        }

        System.out.println(s);
        return s;
    }

    public static void verify(String s){
        boolean flag = true;

        // first verification
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) < 65 || (s.charAt(i) > 90 && s.charAt(i) < 97) || s.charAt(i) > 122){
                flag = false;
            }
        }

        // second verification
        if(flag == true && s.equals(null)){
            flag = false;
        }

        // third verification
        if(flag == true && s.length() == 0){
            flag = false;
        }

        if(flag == true){
            System.out.println("verified");
        }
        else{
            System.out.println("not verified");
        }
    }
}
