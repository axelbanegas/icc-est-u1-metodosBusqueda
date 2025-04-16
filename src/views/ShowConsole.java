package views;
import java.util.Scanner;
public class ShowConsole{
    private Scanner scanner;
    public ShowConsole(){
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner(){
        System.out.println("*** Metodos de Busqueda ***");
    }
    public int inputCode(){
        System.out.print("Ingrese el codigo de la persona: ");
        int code = scanner.nextInt();
        return code;
    }
    public void showMessage(String message){
        System.out.println(message);
    }
}