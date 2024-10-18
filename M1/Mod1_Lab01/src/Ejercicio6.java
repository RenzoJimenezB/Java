public class Ejercicio6 {
    public static final float BASE_TAX_RATE = 0.2F;

    public static void main(String[] args) {
        int salary = 3000;
        float salaryTaxAmount = (salary > 1500) ? salary * BASE_TAX_RATE : 0;

        float finalSalary = salary - salaryTaxAmount;

        System.out.println("Su salario final es: S/" + String.format("%.2f", finalSalary));
    }
}
