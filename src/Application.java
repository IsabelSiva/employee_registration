import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int employeeNumber;


        System.out.println("Quantos funcionários deseja cadastrar?");
        employeeNumber = sc.nextInt();

        while (employeeNumber != 0){
            System.out.println("Digite o ID do funcionário");
            int id = sc.nextInt();
            System.out.println("Entre com o nome do funcionário");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Entre com o salário do empregado");
            double salario = sc.nextDouble();

            employees.add(new Employee(id, name, salario));

            employeeNumber--;
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Digite o ID do funcionário que deseja efetuar aumento");
        int idToFind = sc.nextInt();

//        for (Employee e : employees){
//
//            if (e.getId() == idToFind){
//                System.out.println("digite a porcentagem do aumento");
//                double aumento = sc.nextDouble();
//                e.increaseSalary(aumento);
//                System.out.println(e);
//
//            }else System.out.println("usuário não encontrado");
//
//            System.out.println("Lista de Funcionários:\n" + e);
//
//        }
        Employee emp = employees.stream().filter(x -> x.getId() == idToFind).findFirst().orElse(null);

        System.out.println("Lista de Funcionários:\n" + emp);
       // for (Employee e : filterId) System.out.println(e);
    }
}
