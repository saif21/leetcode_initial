package Kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mulList=new ArrayList<>();

        Scanner sc= new Scanner(System.in);

        for(int i=0;i<3;i++){
            mulList.add(new ArrayList<>());
        }

        for(int i=0; i<mulList.size();i++){
            for(int j=0;j<3;j++){
                mulList.get(i).add(sc.nextInt());
            }
        }
        System.out.println(mulList);
    }
}
