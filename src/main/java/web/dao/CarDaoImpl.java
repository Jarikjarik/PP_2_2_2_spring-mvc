package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Red", 2020),
            new Car("BMW", "Black", 2018),
            new Car("Audi", "White", 2019),
            new Car("Lada", "Blue", 2015),
            new Car("Kia", "Gray", 2021)
    );

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
