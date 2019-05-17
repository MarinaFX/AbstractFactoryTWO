package UI;

import MSystem.Pizza;
import MSystem.Pizzaiolo;
import MSystem.Pizzaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Considere os seguintes conceitos do mundo real: pizzaria, pizzaiolo, pizza, consumidor. Considere ainda que
 * em uma determinada pizzaria, dois pizzaiolos se alternam. Um deles trabalha segundas, quartas e sextas e
 * só sabe fazer pizza de calabresa (queijo + calabresa + tomate), o outro trabalha terças, quintas e sábados e
 * só sabe fazer pizza de presunto (queijo + presunto + tomate). A pizzaria fecha aos domingos.
 *
 * Tente mapear os conceitos acima para o padrão Abstract Factory (hierarquia de fábricas, hierarquia de
 * produtos, cliente) e implemente um programa que receba uma data como parâmetro (formato dd/mm/yyyy)
 * e imprima os ingredientes da pizza que é feita no dia ou, se a pizzaria estiver fechada, informe isso na tela.
 * Agora imagine que a pizzaria agora faz também calzones (novamente, de calabresa ou presunto).
 * Complemente a solução com mais este componente.
 * Link usado para formatar input de YYYY-MM-DD para DD-MM-YYYY:
 * https://stackoverflow.com/questions/8746084/string-to-localdate
 */

public class App {

    private static LocalDate recebeData(){
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String resposta = in.nextLine();
        LocalDate data = LocalDate.parse(resposta, formatter);
        return data;
    }

    public static void main(String[] args) {
        LocalDate data;
        Pizzaria pizzaria;
        Pizzaiolo pizzaiolo;
        Pizza pizza;
        System.out.println("====================START====================");


        System.out.println("Bem vindo!");
        System.out.print("Informe uma data no formato dd/mm/yyyy: ");
        data = recebeData();
        System.out.println();
        pizzaria = new Pizzaria(data);

        try {
            pizzaiolo = pizzaria.fazPedido();
            pizza = pizzaiolo.fazPizza();
            pizza.mostraSabor();
        } catch (IllegalArgumentException f){
            System.err.println(f.getMessage());
        }
        try {
            Thread.sleep(70);
            System.out.println("=====================END=====================");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
