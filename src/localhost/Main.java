package localhost;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.err.println(input + '\n');
        
        int counter = 0;
        try {
        	counter = Integer.parseInt(input);
        } catch (Exception e) {
            System.err.println(e.getClass().getName());
            throw e;
        }
        String hello = "Hello";
        
        String[] hellos = new String[counter];
        StringBuffer buffer = new StringBuffer();
        for (int i = 0;i < counter;i++) {
            hellos[i] = hello + (((i + 1) != counter) ? '\n' : "");
        }
        for (String value : hellos) {
            buffer.append(value);
        }
        System.out.println(buffer.toString());
    }

}
