
/**
 *
 * @author Matheus Agostinho
 */
public class TesteTemperatura {
    
    public static void main(String[] args) {
        
        Temperatura t1 = new Temperatura();
        
        double conversaoC = t1.converterParaCelsius(25);
        System.out.println(conversaoC);
        
        double conversaoF = t1.converterParaFarenheit(10);
        System.out.println(conversaoF);
        
    }
}
