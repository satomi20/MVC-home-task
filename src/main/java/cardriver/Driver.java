package cardriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Driver implements DriverInterface{
    public List<Cars> carsList = new ArrayList<>();

    public List<Cars> getCarsList() {
        return carsList;
    }

    @Override
    public void startup(Motor motor) {
        motor.setMotor(true);
        System.out.println("Трум-трум");
    }

    @Override
    public void pressThePedal(Cars cars, Motor motor) {
        Scanner scanner = new Scanner(System.in);
        if (motor.isMotor() == true){
            System.out.println("Введите скорость");
            int b = scanner.nextInt();
            cars.setMaxspeed(b);
            System.out.println("Вы набрали скорость " + cars.getMaxspeed());
        }else if (motor.isMotor() == false){
            System.out.println("Мотор не заведен");
            startup(motor);
        }
    }

    @Override
    public List<Cars> addCars(Cars cars) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какая машина у вас на сегодня");
        String a = scan.nextLine();
        cars = new Cars(a);
        carsList.add(cars);
        return carsList;
    }
}
