package companyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int peopleCount = Integer.parseInt(reader.readLine());

        Map<String, List<Employee>> employees = new HashMap<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] input = reader.readLine().split(" ");

            Employee employee = null;

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            employees.putIfAbsent(department, new ArrayList<>());
            switch (input.length){
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    try {
                        int otherAge = Integer.parseInt(input[4]);
                        employee = new Employee(name, salary, position, department, otherAge);
                    } catch (NumberFormatException e){
                        String otherEmail = input[4];
                        employee = new Employee(name, salary, position, department, otherEmail);
                    }
                    break;
                case 6:
                    String email = input[4];
                    int age = Integer.parseInt(input[5]);
                    employee = new Employee(name, salary, position, department, email, age);

            }

            employees.get(department).add(employee);
        }

        employees.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(
                        e2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                        e1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()
                ))
                .limit(1)
                .forEach(e -> {
                    System.out.printf("Highest Average Salary: %s%n", e.getKey());
                    e.getValue().stream()
                            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                            .forEach(System.out::println);
                });
    }
}
