package application.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfPairs {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        int nrOfTest = s.nextInt();

        while (nrOfTest-- > 0)
            readArrays(s);

        //put into a HashMap and count, then / 2.
    }

    private static void readArrays(Scanner s) {
        int nrOfElements = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nrOfElements; i++) {

            list.add(s.nextInt());
        }


        System.out.println(list);
    }

}
