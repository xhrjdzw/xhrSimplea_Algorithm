package test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐浩然
 * @version FinalFieldExample, 2017-12-08
 */
class FinalFieldExample
{
    //final int x;
    int y;


    //    static FinalFieldExample f;
//    public FinalFieldExample() {
//        x = 3;
//        y = 4;
//    }
//
//
//
//    static void writer() {
//        f = new FinalFieldExample();
//    }
//
//    static void reader() {
//        if (f != null) {
//            int i = f.x;
//            int j = f.y;
//        }
//    }


    public static void main(String[] args)
    {
        final List Loans = new ArrayList();
        Loans.add("home loan");  //valid
        Loans.add("personal loan"); //valid
      //  Loans = new Vector();  //not valid
    }
}