
/**
 *
 * @author Matheus Agostinho
 */
public class Temperatura {
    
  
    double converterParaCelsius (double tempC){
        return (tempC - 32) * 5/9;
    }
            
    double converterParaFarenheit (double tempC) {
        return (tempC * 9/5) + 32;
    }
}
