import model.Board;

public class Main {

    public static void main(String[] agrs){
        System.out.println("Hey!");
        Board b = new Board(8);
        System.out.println(b.action(1,1,2,1));
    }
}
