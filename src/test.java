import java.util.ArrayList;
import java.util.Date;

public class test {

    public static void main(String[] args) {
        System.out.println("hello   world");

        ArrayList list = new ArrayList();
        ArrayList H = new ArrayList();
        list.add(1);
        System.out.println();
        Date DATE = new Date();
        test();
/**/
        ArrayList list3 = new ArrayList();
        System.out.println("args = [" + args + "]");

    }

    public static void test() {
//     ArrayList

        ArrayList ay = new ArrayList();
        ay.add(1);
        ay.add(2);
        ay.add(1);
        for (Object o : ay) {
            System.out.println(o);
        }
        if (ay == null) {
            
        }
    }

}

