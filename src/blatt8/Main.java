package blatt8;

/**
 * Created with IntelliJ IDEA.
 * User: Julian
 * Date: 07.06.13
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[]args){
        System.out.println("End program with '!'");
        Scanner scanner = new Scanner();
        int token;
        while ((token = scanner.getNextToken()) != Scanner.EOF ){
            Parser.put(token);
        }

        Parser.print();

        System.out.println("Program end");
    }
}
