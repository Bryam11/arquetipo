package ${package}.${serviceNameFolder.replace('/','.')};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BrhyantAppication
{
    public static void main( String[] args )
    {
        SpringApplication.run(${serviceName}Application.class, args);
    }
}
