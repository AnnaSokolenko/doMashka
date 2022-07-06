package Part1;

public class IfElsePart1 {
    public static void main(String[] args){
        if("1".equals(args[0])){
            System.out.println("Monday");

        } else if ("2".equals(args[0])) {
            System.out.println("Tuesday");
        } else if ("3".equals(args[0])) {
            System.out.println("Wednesday");
        } else if ("4".equals(args[0])) {
            System.out.println("Thursday");
        } else if ("5".equals(args[0])) {
            System.out.println("Friday");
        } else if ("6".equals(args[0]) || "7".equals(args[0])) {
            System.out.println("Weekend");
        } else{
            System.out.println("Error");
        }
    }
}
