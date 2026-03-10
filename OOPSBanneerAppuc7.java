import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppuc7 {

    
    static class CharacterPattern {
        private final String pattern;

        public CharacterPattern(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }
    }

    
    static class CharacterPatternMap {
        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
           
            patternMap.put('O', new CharacterPattern(
                    " *** \n*   *\n*   *\n*   *\n *** "
            ));
            patternMap.put('P', new CharacterPattern(
                    "**** \n*   *\n**** \n*    \n*    "
            ));
            patternMap.put('S', new CharacterPattern(
                    " ****\n*    \n *** \n    *\n**** "
            ));
        }

        public static CharacterPattern getPattern(char c) {
            return patternMap.get(c);
        }
    }

    
    public static void displayBanner(String word) {
        StringBuilder[] lines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            CharacterPattern cp = CharacterPatternMap.getPattern(c);
            if (cp != null) {
                String[] patternLines = cp.getPattern().split("\n");
                for (int i = 0; i < 5; i++) {
                    lines[i].append(patternLines[i]).append("  ");
                }
            }
        }

        
        for (StringBuilder line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}