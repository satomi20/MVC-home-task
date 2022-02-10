package cardriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Controller {
    private Cars cars;
    private Driver driver;
    private Motor motor;

    public Controller(Cars cars, Driver driver, Motor motor) {
        this.cars = cars;
        this.driver = driver;
        this.motor = motor;
    }

    public void go(){
        driver.startup(motor);
        driver.pressThePedal(cars, motor);
        driver.addCars(cars);
        System.out.println(driver.getCarsList());
    }
}
