
/**
 *
 * @author Matheus Agostinho
 */

public class Aluno {
    
    //Atributo
    String cpf;
    Data dataDeNascimento;
    
    //Método
    String imprimirDados (){
        String dados = "CPF: " + cpf + " Data de nascimento: " + dataDeNascimento.imprimirData();
        return dados;
    }
}
