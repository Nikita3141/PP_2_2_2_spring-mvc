package web.model;

public class Car {

    private String marka ;

    private String model ;

    private String year ;



    public Car(String marka, String model ,String yaer) {
        this.marka = marka;
        this.model = model;
        this.year = yaer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", seria='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public String getYear() {
        return year;
    }


    public String getModel() {
        return model;
    }

}
