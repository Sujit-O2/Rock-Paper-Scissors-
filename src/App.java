//    sujit swain    //
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int a;
       int user;
    //    1= stone;
    //    2=paper;
    //    3=Scissor;

       Random random =new Random();
       
       Scanner sc =new Scanner(System.in);
       System.out.println("\n\n\n\t>>>>>>>>>>> WELCOME TO STONE PAPER SCISSOR GAME <<<<<<<<<<<<<<\n\n\n");
       while(true){
        a=random.nextInt(1,3);
        System.out.println(" \n\n 1. Stone \n\n 2. Paper\n\n 3. Scissor\n\n 4. Exit.\n\n");
       user= sc.nextInt();
       System.out.println(" ");
        if(a==user){
            System.out.println("Draw\n You Both drawed the same Thing");
        }
       else if(a==1 && user==2){
            System.out.println("You Win\n bot drawed Stone");
        }
        else if(a==1 && user==3){
            System.out.println("You Lose\n bot drawed Stone");
        }
        else if(a==2 && user==1){
            System.out.println("You Lose\n bot drawed Paper");
        }
        else if(a==2 && user==3){
            System.out.println("You Win\n bot drawed Paper");
        }

        else if(a==3 && user==1){
            System.out.println("You Win\n bot drawed Scissor");
        }
        else if(a==3 && user==2){
            System.out.println("You Lose\n bot drawed Scissor");
        }
    
        else if(user ==4){
            break;
        }
        else{
            System.out.println("Invalid choice\n");
        }

       }
       sc.close();
}

}
