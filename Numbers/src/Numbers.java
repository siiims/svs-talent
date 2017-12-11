public class Numbers {
    /***
     * The Numbers class implements an application
     * that receives from command line numbers with their word representation
     * and prints back their numeric representation.
     *
     * @author Simona Zlatanova
     * @param args
     */

    public static void main(String[] args) {
        for(int i = 0; i < args.length; ++i) {
            switch (args[i]) {
                case "one" :
                    System.out.print(1);
                    break;
                case "two" :
                    System.out.print(2);
                    break;
                case "three" :
                    System.out.print(3);
                    break;
                case "four" :
                    System.out.print(4);
                    break;
                case "five" :
                    System.out.print(5);
                    break;
                case "six" :
                    System.out.print(6);
                    break;
                case "seven" :
                    System.out.print(7);
                    break;
                case "eight" :
                    System.out.print(8);
                    break;
                case "nine" :
                    System.out.print(9);
                    break;
                case "zero" :
                    System.out.print(0);
                    break;
                default:
                    break;
            }
        }
    }
}
