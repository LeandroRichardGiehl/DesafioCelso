package desafiocelso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FolhaDePagamento {
        public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar funcionário assalariado");
            System.out.println("2. Adicionar funcionário horista");
            System.out.println("3. Calcular total gasto com folha salarial");
            System.out.println("4. Sair");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o nome do funcionário assalariado:");
                        String nomeAssalariado = scanner.nextLine();
                        System.out.println("Digite o ID do funcionário:");
                        int idAssalariado = scanner.nextInt();
                        System.out.println("Digite o salário mensal do funcionário:");
                        double salarioMensal = scanner.nextDouble();
                        FuncionarioAssalariado assalariado = new FuncionarioAssalariado(nomeAssalariado, idAssalariado, salarioMensal);
                        funcionarios.add(assalariado);
                        break;

                    case 2:
                        System.out.println("Digite o nome do funcionário horista:");
                        String nomeHorista = scanner.nextLine();
                        System.out.println("Digite o ID do funcionário:");
                        int idHorista = scanner.nextInt();
                        System.out.println("Digite o salário por hora do funcionário:");
                        double salarioPorHora = scanner.nextDouble();
                        System.out.println("Digite o número de horas trabalhadas do funcionário:");
                        int horasTrabalhadas = scanner.nextInt();
                        FuncionarioHorista horista = new FuncionarioHorista(nomeHorista, idHorista, salarioPorHora, horasTrabalhadas);
                        funcionarios.add(horista);
                        break;

                    case 3:
                        double totalSalarial = 0.0;
                        for (Funcionario funcionario : funcionarios) {
                            totalSalarial += funcionario.getPagamento();
                        }
                        System.out.println("Total gasto com a folha salarial: " + totalSalarial);
                        break;

                    case 4:
                        System.out.println("Saindo do programa.");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir números quando necessário.");
                scanner.nextLine();
                opcao = 0;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
