package Learn.SpringBoot;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class List {
    public static void main(String[] args){
        Scanner list = new Scanner(System.in);

        System.out.println("Qual o item? ");
        String item = list.nextLine();

    }

}
