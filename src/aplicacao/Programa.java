package aplicacao;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import enums.Cores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Forma> formas = new ArrayList<>();

        System.out.print("Entre com a quantidade de formas: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Forma #" +i +" Dados:");
            System.out.print("Circulo ou Retangulo (C/R)? ");
            char forma = sc.next().charAt(0);
            System.out.println("Cor (BLACK/BLUE/RED): ");
            Cores cor = Cores.valueOf(sc.next());

            if(forma == 'r'){
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                formas.add(new Retangulo(cor,largura, altura));
            } else if (forma == 'c') {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                formas.add(new Circulo(cor,raio));
            }
        }

        System.out.println("Area das formas:");
        for (Forma f: formas){
            System.out.printf(String.format("%.2f\n",f.area()));
        }
    }
}
