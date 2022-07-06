package Part2;
public class WorkingWithStrings {

    public static void main(String[] args) {
        String[] strArr = {"Monty loves to lick ass"};
        for (String aStrArr : strArr) {
            for (int j = 0; j < aStrArr.length(); j++) {
                switch (aStrArr.charAt(j)) {
                    case 'o':
                    case 'y':
                    case 'e':
                    case 'i':
                    case 'a':
                        System.out.print(" " + aStrArr.charAt(j));
                }
            }
        }
    }
}


