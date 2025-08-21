package Aula19deAgosto;

public class Main {
        public static void main(String[] args) {
            Mensagem service = new Mensagem();
            Mensagem printer = new Mensagem();

            String message = service.getHelloMessage();
            printer.print(message);

        }

}
