package controlarvetor;
import java.util.Scanner;

public class ControlarVetor {
   private String texto[];
   
   Scanner entrada = new Scanner(System.in);
   
   public ControlarVetor(){
       texto = new String[5];
   }
   
   public void CarregarVetor(){
       for(int i=0; i < texto.length; i++){
           texto[i]=entrada.next();
       }
   }
   
   public void exibir(){
       for(int i=0; i < texto.length; i++){
           texto[i] = texto[i].toUpperCase();
           System.out.println("Nome: " + texto[i]);
       }
   }
   
   public void sobrenome(){
       for(int i=0; i < texto.length; i++){
           String palavras[] = texto[i].split(" ");
           System.out.println("Sobrenome: " + palavras[palavras.length -1]);
       }
   }
   
   
}
