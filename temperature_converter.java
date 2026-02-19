//temperature converter
import java.util.Scanner;
public class temperature_converter{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); 
        System.out.print("Enter the temperature: "); 
        String unit; 
        double temp ; 
        double newTemp; 
        System.out.print("Enter the temperature: "); 
        temp=scanner.nextDouble(); 
        System.out.print("Convert to celsius or Farhrenheit? (C or F): "); 
        unit=scanner.next().toUpperCase(); 
        //(conditon)? true:False
        newTemp =(unit.equals("C"))? (temp-32)*5/9 : (temp*5/9)+32;
        System.out.printf("%.1f %s ",newTemp,unit);
        scanner.close();
        
    }
}