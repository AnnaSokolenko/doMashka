package Part2;

public class WWSConsonats {
    public static void main(String[] args) {
        String[] strArr = {"Monty loves to lick ass"};
        for (String aStrArr : strArr) {
            for (int i = 0; i < aStrArr.length(); i++) {
                switch (aStrArr.charAt(i)) {
                    case 'M':
                    case 'n':
                    case 't':
                    case 'l':
                    case 's':
                    case 'c':
                    case 'k':
                        System.out.print(" " + aStrArr.charAt(i));
                }
            }
        }
    }
}
