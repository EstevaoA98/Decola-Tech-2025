package Learn.SpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MyApp implements CommandLineRunner {

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um item para adicionar à lista de compras: ");
        String item = scanner.nextLine();

        System.out.println("Item \"" + item + "\" adicionado na lista de compras!");
    }
}