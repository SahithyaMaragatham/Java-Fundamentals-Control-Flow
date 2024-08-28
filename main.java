import java.util.Scanner;

class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int Num = sc.nextInt();

       //Control statement
       if(Num > 0){
        System.out.println("Positive");
       } 
       else if(Num == 0){
        System.out.println("Zero");
       }
       else{
        System.out.println("Negative");
       }

       //switch case
       switch(Num){
        case 1: System.out.println("Sunday");break;
        case 2: System.out.println("Monday");break;
        case 3: System.out.println("Tuesday");break;
        case 4: System.out.println("Wednesday");break;
        case 5: System.out.println("Thursday");break;
        case 6: System.out.println("Friday");break;
        case 7: System.out.println("Saturday");break;
        default: System.out.println("Your selection is invalid");
       }

       //looping
       for(int i = 1; i <= Num; i++){
        System.out.print(i);
        System.out.println();
       }

       //printing numbers in descending order using while loop
       while (Num >= 1) {
        System.out.println(Num);
        Num--;
       }

       //do...while loop
       do{
        System.out.println(Num);
        Num++;
       }
       while(Num < 6);
    }
}