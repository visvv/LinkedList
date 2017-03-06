import com.vv.list.LinkedList;

/**
 * Created by vasudvis on 1/24/2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);
        list.reverse();
        list.showAll();
//        System.out.println("Middle : " + list.findMiddle());

    }
}




