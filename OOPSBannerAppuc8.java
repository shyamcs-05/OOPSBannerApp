import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppuc8 {

     
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
         
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    
    public static void renderBanner(String word) {
        StringBuilder[] lines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            String[] pattern = patternMap.get(c);
            if (pattern != null) {
                for (int i = 0; i < 5; i++) {
                    lines[i].append(pattern[i]).append("  ");
                }
            }
        }

         
        for (StringBuilder line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}