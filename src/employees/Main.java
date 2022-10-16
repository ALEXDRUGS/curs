package employees;

import java.util.Arrays;

public class Main {
    private static final Employee[] EMPLOYEE = new Employee[10];

    public static void main(String[] args) {


        EMPLOYEE[0] = new

                Employee(1, "Cavalera Massimiliano Antonio", 15_000);

        EMPLOYEE[1] = new

                Employee(2, "Welgemoed Shaun Morgan", 10_000);

        EMPLOYEE[2] = new

                Employee(3, "Ritchie John Simon", 12_000);

        EMPLOYEE[3] = new

                Employee(4, "Maynard James Keenan", 8_000);

        EMPLOYEE[4] = new

                Employee(5, "Cobain Kurt Donald", 23_000);
        data();
        sumSalary();
        averageSalary();
        minSalary();
        maxSalary();
        empFullName();
    }

    private static void sumSalary() {
        double sum = 0;
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i] != null) {
                sum += EMPLOYEE[i].getSalary();
            }
        }
        System.out.println(sum);
    }

    private static void averageSalary() {
        double average;
        double sum = 0;
        int count = 0;
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i] != null) {
                sum += EMPLOYEE[i].getSalary();
                count++;
            }
        }
        average = sum / count;
        System.out.println(average);
    }

    private static void minSalary() {
        double minSalary = Double.MAX_VALUE;
        String min = null;
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i] != null && minSalary > EMPLOYEE[i].getSalary()) {
                minSalary = EMPLOYEE[i].getSalary();
                min = EMPLOYEE[i].getFullName();
            }
        }
        System.out.println(min + minSalary);
    }

    private static void maxSalary() {
        double maxSalary = Double.MIN_VALUE;
        String employe = null;
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i] != null && maxSalary < EMPLOYEE[i].getSalary()) {
                maxSalary = EMPLOYEE[i].getSalary();
                employe = EMPLOYEE[i].getFullName();
            }
        }
        System.out.println(employe + maxSalary);
    }

    private static void empFullName() {
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i] != null) {
                System.out.println(EMPLOYEE[i].getFullName());
            }
        }
    }

    private static void data() {
        System.out.println(Arrays.toString(EMPLOYEE));
    }
}


