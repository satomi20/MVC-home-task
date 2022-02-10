package cardriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public  class Cars {
    private String carname;
    private int maxspeed = 200;

    public Cars(){}

    public Cars(String carname) {
        this.carname = carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setMaxspeed(int maxspeed) {
        if (maxspeed<=200){
            this.maxspeed = maxspeed;
        }else {
            System.out.println("Выше скорости 200 нельзя");
        }

    }

    public String getCarname() {
        return carname;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    @Override
    public String toString() {
        return
                "carname= " + carname;
    }
}

