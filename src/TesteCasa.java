
/**
 *
 * @author IFNMG
 */
public class TesteCasa {
    public static void main(String[] args) {
        
     
        Casa casa1 = new Casa();
        casa1.cor = "Preto";
        
   
        Porta p1 = new Porta();
     
        p1.cor = "Vermelho";
        p1.dimensaoX = 1.5;
        p1.dimensaoY = 2.5;
        p1.dimensaoZ = 0.15;
        casa1.porta1 = p1;
        casa1.porta1.abre();
       
        Porta p2 = new Porta();
    
        p2.cor = "Dourada";
        p2.dimensaoX = 1.0;
        p2.dimensaoY = 2.0;
        p2.dimensaoZ = 0.30;
        casa1.porta2 = p2;
        casa1.porta2.abre();
        
        Porta p3 = new Porta();
    
       
        p3.cor = "Azul";
        p3.dimensaoX = 2.0;
        p3.dimensaoY = 3.5;
        p3.dimensaoZ = 1.0;
        casa1.porta3 = p3;
        casa1.porta3.abre();
        
        //Chamando Métodos
        casa1.cor = "Amarela";
        System.out.println("Cor da casa: " + casa1.cor + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
        casa1.cor = "Branca";
        casa1.porta1.abre();
        casa1.porta2.abre();
        casa1.porta3.fecha();
        
        System.out.println("Cor da casa: " + casa1.cor + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
        casa1.cor = "Verde";
        casa1.porta1.fecha();
        casa1.porta2.fecha();
        casa1.porta3.abre();
        
        System.out.println("Cor da casa: " + casa1.cor + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
    }
}