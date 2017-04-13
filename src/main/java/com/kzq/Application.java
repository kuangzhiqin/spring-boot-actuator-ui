/**
 * 
 */
package com.kzq;

/**
 * @author kzq
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println();
        System.out.println("## Running Springboot-actuator-ui ##");
        System.out.println();
    }


}
