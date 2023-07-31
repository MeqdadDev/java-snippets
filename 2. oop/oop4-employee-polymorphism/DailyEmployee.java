package OOP;

public class DailyEmployee extends Employee {
    private float workDayPrice;
    private float dailyRate;

    public DailyEmployee(String name, String address, String department, String email, float salary, float workDayPrice, float dailyRate) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public float getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(float dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public float getSalary(){
        return workDayPrice * dailyRate;
    }
}
