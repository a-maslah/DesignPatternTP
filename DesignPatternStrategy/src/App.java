import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        Context context = new Context();
        context.appliquerStrategy();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Donner le nom du strategy");

            String strategyclassName = scanner.nextLine();
            IStrategy strategy = (IStrategy) Class.forName(strategyclassName).newInstance();
            context.setStrategy(strategy);
            context.appliquerStrategy();
        }


    }
}
