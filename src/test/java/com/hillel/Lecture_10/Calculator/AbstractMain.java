package com.hillel.Lecture_10.Calculator;

public class AbstractMain {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println("Operations of the SimpleCalculator: ");
        simpleCalculator.additionOperation();
        simpleCalculator.subtractionOperation();
        simpleCalculator.multiplicationOperation();
        simpleCalculator.divisionOperation();
        simpleCalculator.exponentiationOperation(5,3);
        simpleCalculator.squareRootExtraction(225);
        System.out.println("\n");

        FinancialCalculator financialCalculator = new FinancialCalculator();
        System.out.println("Operations of the FinancialCalculator: ");
        financialCalculator.additionOperation();
        financialCalculator.subtractionOperation();
        financialCalculator.multiplicationOperation();
        financialCalculator.divisionOperation();
        financialCalculator.exponentiationOperation(5,3);
        financialCalculator.linearEquationOperation(4, 80);
        System.out.println("\n");


        AccountingCalculator accountingCalculator = new AccountingCalculator();
        System.out.println("Operations of the AccountingCalculator: ");
        accountingCalculator.additionOperation();
        accountingCalculator.subtractionOperation();
        accountingCalculator.multiplicationOperation();
        accountingCalculator.divisionOperation();
        accountingCalculator.exponentiationOperation(5,3);
        accountingCalculator.roundOperation(3237.6344);
        System.out.println("\n");

        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        System.out.println("Operations of the EngineeringCalculator: ");
        engineeringCalculator.additionOperation();
        engineeringCalculator.subtractionOperation();
        engineeringCalculator.multiplicationOperation();
        engineeringCalculator.divisionOperation();
        engineeringCalculator.exponentiationOperation(5,3);
        engineeringCalculator.sinOperation(90);
        System.out.println("\n");

        ProgrammableCalculator programmableCalculator = new ProgrammableCalculator();
        System.out.println("Operations of the ProgrammableCalculator: ");
        programmableCalculator.additionOperation();
        programmableCalculator.subtractionOperation();
        programmableCalculator.multiplicationOperation();
        programmableCalculator.divisionOperation();
        programmableCalculator.exponentiationOperation(5,3);
        programmableCalculator.checkDivisorOperation(278,5);
        System.out.println("\n");
    }
}
