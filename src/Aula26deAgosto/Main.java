package Aula26deAgosto;

public class Main {
    public static void main(String[] args) {
        // Testando LSP
        Shape r = new aula26deAgosto.Rectangle(5, 10);
        System.out.println("Área retângulo: " + r.getArea()); // 50

        Shape s = new Square(10);
        System.out.println("Área quadrado: " + s.getArea()); // 100

        // Testando ISP
        Printer impressoraSimples = new BasicPrinter();
        impressoraSimples.print("Contrato 123");

        Printer multifuncional = new OfficeAllInOne();
        multifuncional.print("Relatório");

        Scanner scanner = new OfficeAllInOne();
        scanner.scan("RG");

        Fax fax = new OfficeAllInOne();
        fax.fax("555-1234", "Olá");
    }
}
