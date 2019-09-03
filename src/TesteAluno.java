
/**
 *
 * @author IFNMG
 */
public class TesteAluno {
    
    public static void main(String[] args) {
        
        //Criando objeto aluno
        Aluno a1 = new Aluno();
        a1.cpf = "11188855548";
        
        //Criando objeto data
        Data d1 = new Data();
        d1.dia = 13;
        d1.mes = 03;
        d1.ano = 1997;
        
        //Atribuindo data de nascimento do aluno
        a1.dataDeNascimento = d1;
        
        //Imprimindo dados do aluno
        System.out.println(a1.imprimirDados());
        
        
    }
    
}

