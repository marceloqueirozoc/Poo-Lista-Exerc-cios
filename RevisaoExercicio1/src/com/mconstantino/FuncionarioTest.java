package com.mconstantino;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        System.out.println("Digite o id: ");
        func.setIfFunc(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do Funcionário: ");
        func.setNomeFunc(sc.nextLine());
        System.out.println("Digite o departamento: ");
        func.setDepartamento(sc.nextLine());
        System.out.println("Digite a data de contratação: ");
        func.setDataContratacao(LocalDate.parse(sc.nextLine()));
        System.out.println("Digite o salário: ");
        func.setSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o documento: ");
        func.setDocumento(sc.nextLine());
        func.setAtivo(true);

        func.imprimir();
        double aumento;
        System.out.println("Digite o aumento: ");
        aumento = sc.nextDouble();
        func.atualizarSalario(aumento);

        func.imprimir();
        func.demiteFuncionario();
        func.imprimir();

    }
}
