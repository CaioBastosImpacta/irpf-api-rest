package fit.restapi.model.request;

public class PersonModelRquest {
    private double totalSalary;
    private int dependentsNumber;

    public PersonModelRquest() {
        super();
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getDependentsNumber() {
        return dependentsNumber;
    }

    public void setDependentsNumber(int dependentsNumber) {
        this.dependentsNumber = dependentsNumber;
    }

    


}
