import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    private Map<Character, String> morseMap = new HashMap<>();

    private final Character[] alphabetEng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    private final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};


    public void fillMorseMap(){
        for(int i = 0; i < alphabetEng.length; i++){
            morseMap.put(alphabetEng[i],morse[i]);
        }
    }

    public String translateString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
             Character c = s.charAt(i);
             sb.append(" " + morseMap.get(c));

        }
        return sb.toString();
    }

    public Map<Character, String> getMorseMap() {
        return morseMap;
    }

    public void setMorseMap(Map<Character, String> morseMap) {
        this.morseMap = morseMap;
    }
}
