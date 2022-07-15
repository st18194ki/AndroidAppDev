import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		進数変換 test = new 進数変換();
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Base number->");
        String base = null;
		try {
            base = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();        
        }
		
        System.out.print("input->");
        String input = null;
		try {
            input = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
        String input_decimal;
        
		switch(base) {
     		case("2"):
     			System.out.println("decimal:" + test.B_to_D(input));
     			input_decimal = test.B_to_D(input);
     			System.out.println("Octal:" + test.Octal(input_decimal));
     			System.out.println("Hexadecimal:" + test.Hexadecimal(input_decimal));
     			break;
     			
     		case("8"):
     			System.out.println("decimal:" + test.O_to_D(input));
     			input_decimal = test.O_to_D(input);
     			System.out.println("Binary:" + test.Binary(input_decimal));
     			System.out.println("Hexadecimal:" + test.Hexadecimal(input_decimal));
     			break;
     			
     		case("10"):
     			System.out.println("Binary:" + test.Binary(input));
     			System.out.println("Octal:" + test.Octal(input));
     			System.out.println("Hexadecimal:" + test.Hexadecimal(input));
     			break;
     			
     		case("16"):
     			System.out.println("decimal:" + test.H_to_D(input));
     			input_decimal = test.H_to_D(input);
      			System.out.println("Binary:" + test.Binary(input_decimal));    			
      			System.out.println("Octal:" + test.Octal(input_decimal));
      			break;
        }
	}
}