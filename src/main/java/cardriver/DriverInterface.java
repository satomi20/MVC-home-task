package cardriver;

import java.util.List;

public interface DriverInterface {
    public void pressThePedal(Cars cars, Motor motor);
    public void startup(Motor motor);
    public List<Cars> addCars(Cars cars);
}
