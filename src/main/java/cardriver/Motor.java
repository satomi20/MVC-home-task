package cardriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Motor extends Cars{
    private boolean motor = false;

    public Motor(boolean motor) {
        this.motor = motor;
    }

    public Motor(String carname, boolean motor) {
        super(carname);
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
