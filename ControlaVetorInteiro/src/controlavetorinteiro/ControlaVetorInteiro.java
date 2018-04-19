package controlavetorinteiro;

import java.util.Scanner;

public class ControlaVetorInteiro {
    private int vt[];
    Scanner entrada = new Scanner(System.in);
    
    public ControlaVetorInteiro(){
        vt = new int[5];
    }
    
    public void CarregarVetor(){
        for(int i =0; i < vt.length; i++){
            System.out.println("Digite o valor: ");
            vt[i]=entrada.nextInt();
        }
    }
    
    public void Exibir(){
        for(int i =0; i < vt.length; i++){
            System.out.println("Valor: " + vt[i]);
        }
    }
    
    public double Media(){
        double aux=0;
        for(int i=0; i < vt.length; i++){
            aux += vt[i];
        }
        return aux;
    }
    
    public int Menor(){
        int aux = vt[0];
        for(int i=0; i < vt.length; i++){
            if(vt[i]< aux){
                aux=vt[i];
            }
        }
        return aux;
    }
    
    public int Maior(){
        int aux = vt[0];
        for (int i =0; i < vt.length; i++){
            if(vt[i] < aux){
                aux = vt[i];
            }
        }
        return aux;
    }
    
    public int Pares(){
       int pares=0;
       for (int i =0; i < vt.length; i++){
           if(vt[i] % 2 == 0){
               pares = vt[i];
           }
       }
       return pares;
    }
    
    public int Impares(){
        int impares=0;
        for(int i=0; i < vt.length; i++){
            if (vt[i] % 2 != 0){
                impares=vt[i];
            }
        }
        return impares;
    }
}
