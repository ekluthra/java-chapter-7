import java.util.Scanner;

public class TempConverter{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice;
        
        System.out.println("Enter 1 for Fahrenheit to Celcius, 2 for Celcius to Farenheit");
        choice = scan.nextInt();
        
        if (choice == 1){
            farenheitToCelcius();
        }
        else if (choice == 2){
            celciusToFarenheit();
        }
    }
    public static void farenheitToCelcius(){
        double ftemp;
        double ctemp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a farenheit temp");
        ftemp = scan.nextInt();
        ctemp = (double)5/(double)9*(ftemp-32);
        System.out.format("%.1f is your temperature in celcius\n", ctemp);
    }
    
    public static void celciusToFarenheit(){
        double ftemp;
        double ctemp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a celcius temp");
        ctemp = scan.nextInt();
        ftemp = (double)9/(double)5*ctemp+32;
        System.out.format("%.1f is your temperature in farenheit\n", ftemp);
    }
    
}

