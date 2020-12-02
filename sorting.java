import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> chisla = new ArrayList<>();
        ArrayList<Integer> chisla2 = new ArrayList<>();
         while (true) {
        System.out.println("Enter the first number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Enter the second number: ");
        int second = Integer.valueOf(scan.nextLine());
        System.out.println("Enter the third number ");
        int third = Integer. valueOf(scan.nextLine());
        if (first==second || first==third || second==third) {
            System.out.println("Bad numders");
            if (first==0 && second==0 && third==0) {
                break;
            }
            continue; 
        } else {
            chisla.add(first);
            chisla.add(second);
            chisla.add(third);
            Collections.sort(chisla);
            System.out.println("SORTING:");
            for(Integer temp: chisla){
            System.out.println(temp);
        }
            break;
        }
    }
  System.out.println("End");
}
}