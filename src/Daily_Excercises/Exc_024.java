package Daily_Excercises;

public class Exc_024 {
    public static void main(String [] args){

        double basicPay = 16000;
        double HRA = (40.0/100)*basicPay;
        double DA = (10.0/100)*basicPay;
        double otherAllowances =5000;
        double grossSalary = basicPay+HRA+DA+otherAllowances;
        double PF = (12.0/100)*basicPay;
        double professionalTax= 200;
        double incomeTax = 5000;
        double totalDeductions = PF+professionalTax+incomeTax;
        double netSalary = grossSalary-totalDeductions;
        System.out.println("Your Net salary is : " + netSalary);


    }
}
