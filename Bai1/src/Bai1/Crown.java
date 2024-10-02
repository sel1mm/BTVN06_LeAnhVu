package Bai1;
import java.util.*; 

public class Crown {
    private String color;
    private int weight;
    
    public Crown(){
        
    }
    
    public Crown(String color, int weight){
        this.color=color;
        this.weight=weight;
    }
    
    public String getColor(){
        String x = "";
        for(int i=0;i<color.length();i++){
            if(i==0){
                x+=color.toLowerCase().charAt(i);
                continue;
            }
            x+=color.charAt(i);
        }
        return x;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public int setWeight(int weight){
        return this.weight+=weight;
    }
    
    public void printMenu(){
        System.out.println("1. Test getColor()");
        System.out.println("");
        System.out.println("2. Test setWeight()");
        System.out.println("");
        System.out.print("Enter TC(1 or 2): ");
    }
    
    public static void main(String[] args) {
        Crown crn = new Crown();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        System.out.println("");
        System.out.print("Enter weight: ");
        int weight = Integer.parseInt(sc.nextLine());
        crn = new Crown(color,weight);
        System.out.println("");
        crn.printMenu();
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("");
        switch(choice){
            case 1: 
                System.out.println("OUTPUT:");
                System.out.println("");
                System.out.println(crn.getColor());
                break;
            case 2:
                System.out.print("Enter new weight: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("");
                System.out.println("OUTPUT:");
                System.out.println("");
                crn.setWeight(a);
                System.out.println(crn.getWeight());
                break;
        }
    } 
}
