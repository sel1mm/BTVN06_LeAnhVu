package bai2;
import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter content: ");
        String content = sc.nextLine();
        System.out.println("");
        System.out.print("Enter like: ");
        int like = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.print("Enter status: ");
        String status = sc.nextLine();
        Comment ct = new Comment(content, like);
        SpecComment sp = new SpecComment(content, like ,status);
        System.out.println("");
        System.out.println("1. Test toString()");
        System.out.println("");
        System.out.println("2. Test setData()");
        System.out.println("");
        System.out.println("3. Test getValue()");
        System.out.println("");
        int choice;
        System.out.print("Enter TC(1,2,3): ");
        choice = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("OUTPUT:");
        System.out.println(""); 
       switch(choice){
            case 1: 
                System.out.println(ct.toString());
                System.out.println("");
                System.out.println(sp.toString());
                break;
            case 2: 
                sp.setData();
                break;
            case 3:
                System.out.println(sp.getValue());
                break;             
        }
    }  
}
