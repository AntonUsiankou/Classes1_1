package by.gsu.epamlab;

public class BusinessTrip {
    private static final int RATE = 120;
    private String name;
    private int expenses;
    private int days;

    public BusinessTrip(){
    }

    public BusinessTrip(String name, int expenses, int days) {
        super();
        this.name = name;
        this.expenses = expenses;
        this.days = days;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getExpenses() {
        return expenses;
    }
    public void setExpenses(int Expenses) {
        this.expenses = Expenses;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int Days) {
        this.days = Days;
    }

    private static String toByn(int kopecks) {
        int kops = kopecks % 100;
        return kopecks / 100 + "." + kops / 10 + kops % 10;
    }
    public int getTotal() {
        return this.expenses += 120 * this.days;
    }
    public void Show (){
        System.out.println( "\n"+ "Rate : " + RATE+ ";" + "\n"   + "Name : " + name + ";" + "\n" + "Excpenses : " + expenses + ";"+ "\n" + "Days : " + days + ";"+ "\n" + "Total:" + getTotal()+";"+ "\n");
    }

        @Override
        public String toString() {
            return  name + ";" + toByn(this.expenses) + ";" + this.days + ";" + toByn(getTotal());
        }
    }





