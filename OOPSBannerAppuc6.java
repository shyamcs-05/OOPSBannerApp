public class OOPSBannerAppuc6 {

    // Static helper methods for each character
    public static String[] getO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    public static String[] getP() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    public static String[] getS() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    // Method to render banner from arrays
    public static void printBanner(String[][] letters) {
        for (int row = 0; row < letters[0].length; row++) {
            for (String[] letter : letters) {
                System.out.print(letter[row] + "   "); // spacing between letters
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Build banner for "OOPS"
        String[][] banner = { getO(), getO(), getP(), getS() };

        // Display banner
        printBanner(banner);
    }
}