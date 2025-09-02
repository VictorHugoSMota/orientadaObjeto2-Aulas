package Aula19deAgosto;

public class MensagemService {
    public String sayHello(Pessoa pessoa) {
        return "Olá, meu nome é " + pessoa.getNome() + " e tenho " + pessoa.getIdade() + " anos.";
    }

}
