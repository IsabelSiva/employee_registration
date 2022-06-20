import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        for (Employee e : employees) System.out.println(e);
    }
}
