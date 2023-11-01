package web.Dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoCarImpl implements DaoCar {
    private List<Car> cars ;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMV", "X7", "2015"));
        cars.add(new Car("Toyota","Supra","2006"));
        cars.add(new Car("Nissan","SkyLine","1999"));
        cars.add(new Car("Ford","Mustang","1969"));
        cars.add(new Car("ChervroleT","Camaro","2019"));

    }

    public  List<Car> getCars (int count){

        if (count == 0) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());

    }

}
