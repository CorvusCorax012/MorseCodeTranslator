import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        MorseCode code = new MorseCode();
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        code.fillMorseMap();

        System.out.println("Please type what you would like to translate to morse code here:");

        String readString = scanner.next();
        while(!readString.equals("*"))
        {
            sb.append(code.translateString(readString.toLowerCase()));
            sb.append(" / ");
            readString = scanner.next();
        }
        System.out.println("Translation:");
        System.out.println(sb);
    }
}
