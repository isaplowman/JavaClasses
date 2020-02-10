public class car {


    private int year;
    private String make;
    private int miles;
    private String model;



    public car(int year, int miles, String make, String model) {
        this.year = year;
        this.miles =0;
        this.make = make;
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive(int miles){
        this.miles += miles;
    }



    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", miles=" + miles +
                ", model='" + model + '\'' +
                '}';
    }
}
