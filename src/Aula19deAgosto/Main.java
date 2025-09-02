package Aula19deAgosto;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Victor", 20);
        MensagemService mensagem = new MensagemService();

        String texto = mensagem.sayHello(pessoa);
        System.out.println(texto);
    }
}
