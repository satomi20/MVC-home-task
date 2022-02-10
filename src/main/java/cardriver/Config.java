package cardriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("config")
public class Config {
    @Bean
    public Controller controller(){
        return new Controller(cars(), driver(), motor());
    }
    @Bean
    public Cars cars(){
        return new Cars();
    }
    @Bean
    public Driver driver(){
        return new Driver();
    }
    @Bean
    public Motor motor(){
        return new Motor(false);
    }


    
  
}
