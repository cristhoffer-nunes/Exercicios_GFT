package exercicio_2;
import java.util.Scanner;

public class MusicaElefante {

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro:");
        int numero = num.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("1 elefante incomoda muita gente");
                break;
            case 2:
                System.out.println("2 elefantes incomodam, incomodam muito mais!");
                break;
            case 3:
                System.out.println("3 elefantes incomodam muita gente");  
                break;
                
            case 4:
                System.out.println("4 elefantes incomodam, incomodam, incomodam, incomodam muito mais!");  
                break;
                
            case 5:
                System.out.println("5 elefantes incomodam muita gente");  
                break;
                
            case 6:
                System.out.println("6 elefantes incomodam, incomodam, incomodam, incomodam, incomodam, incomodam muito mais!");  
                break;
                
            case 7:
                System.out.println("7 elefantes incomodam  muita gente");  
                break;
                
            case 8:
                System.out.println("8 elefantes incomodam, incomodam, incomodam, incomodam, incomodam, incomodam, incomodam, incomodam muito mais!");  
                break;
                
            case 9:
                System.out.println("9 elefantes incomodam muita gente");  
                break;
                
            case 10:
                System.out.println("10 elefantes incomodam, incomodam, incomodam, incomodam, incomodam, incomodam, incomodam, incomodam, incomodam, incomodam muito mais!");  
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }  
}
