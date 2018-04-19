package equipamento;
import java.util.ArrayList;
import java.util.Scanner;


public class ControlaEquipamento {
    ArrayList<Equipamento> lista;
    
    public ControlaEquipamento(){
        lista = new ArrayList<Equipamento>();
    }
    
    public void Inserir(Equipamento a){
        lista.add(a);
    }
    
    public void Alterar(int patr){
        Scanner scan = new Scanner(System.in);
        for (Equipamento a : lista){
            if(a.getPatr()== patr){
                System.out.print("Novo Numero do Patrimonio: ");
                a.setPatr(scan.nextInt());
                
                System.out.print("Nova Data de Aquisição: ");
                a.setData(scan.nextInt());
                
                System.out.print("Nova Descrição: ");
                a.setDesc(scan.nextLine());
                System.out.println("");
                
                System.out.print("Novo Tipo Equipamento: ");
                a.setTipo(scan.nextLine());
                System.out.println("");
            }
            
        }
        
    }
    
    public void Excluir(int patr){
        for (Equipamento a : lista){
            if(a.getPatr()== patr){
                lista.remove(a);
            }
        }
    }
    
    
}
