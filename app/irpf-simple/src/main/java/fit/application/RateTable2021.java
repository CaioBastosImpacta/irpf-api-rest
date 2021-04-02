package fit.application;

import fit.application.abstractions.RateTable;

public class RateTable2021 implements RateTable {
    public static final double INSS_VALUE = 0.11;

    @Override
    public double getInssValue(double salary) {
        return INSS_VALUE * salary;
    }

    @Override
    public double getRate(double netSalary) {
        if (netSalary <= 1903.98) return 0.0;
        if (netSalary <= 2826.65) return 0.075;
        if (netSalary <= 3751.05) return 0.15;
        if (netSalary <= 4664.68) return 0.225;
        return 0.275;
    }
}
