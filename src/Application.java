import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int employeeNumber;

        System.out.println("DIGITE O NÚMERO DE FUNCIONÁRIOS.");
        employeeNumber = sc.nextInt();
        
        for (int i = 0; i < employeeNumber ; i++) {
            System.out.println("DIGITE O Id DO FUNCIONARIO");
            int id = sc.nextInt();
            System.out.println("DIGITE O NOME DO FUNCIONARIO");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("ENTRE COM O SALARIO DO FUNCIONARIO");
            double salary = sc.nextDouble();
            employees.add( new Employee(id, name, salary));
        }
        int idToIncrease;
        System.out.println("DIGITE O id DO FUNCIONARIO QUE DESEJA AUMENTAR O SALARIO");
        idToIncrease = sc.nextInt();
        Employee employee1 = (Employee) employees.stream().filter(x -> x.getId() == idToIncrease).toList();

        for (Employee e: employees){System.out.println(e);}
        System.out.println(employee1);

    }
}
