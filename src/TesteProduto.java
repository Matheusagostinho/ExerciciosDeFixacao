
/**
 *
 * @author Matheus Agostinho
 */
public class TesteProduto {
    
    public static void main(String[] args) {
        
        Produto pd1 = new Produto();
        
        pd1.preco = 240.0;
        pd1.diminuir10();
        
        System.out.println(pd1.preco);
 
        pd1.aumenta25();
        
        System.out.println(pd1.preco);
    }
        
}
