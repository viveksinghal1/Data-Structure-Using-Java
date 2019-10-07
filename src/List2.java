import java.util.*;


public class List2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.nextLine();
        Lab list = new Lab();

        for (int i=0;i<s.length();i++){
            list.insert(Character.getNumericValue(s.charAt(i)));
        }
        list.display();

    }
}