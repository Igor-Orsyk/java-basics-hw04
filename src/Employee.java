

public class Employee implements Payable{

      String name, employeeId;
      double hourlyRate, numberOfHoursWorked;

  public Employee(String employeeId, String name) {
      this.name = name;
      this.employeeId = employeeId;
  }

  public String getEmployeeId() {
      return employeeId;
  }

  public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;}

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public double getAverageMonthlySalary() {
      return hourlyRate * numberOfHoursWorked;
  }

    @Override
    public double calculatePay() {
        return getAverageMonthlySalary();
    }

    @Override
  public String toString() {
      return "Worker name is " + name + ". Employeeid " + employeeId + ". Average salary is: " + String.format("%f", Math.ceil(getAverageMonthlySalary()));
  }
}
