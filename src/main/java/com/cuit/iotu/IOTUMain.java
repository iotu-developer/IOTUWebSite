package com.cuit.iotu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by jt1n on 2019/8/10.
 */
@SpringBootApplication
@ServletComponentScan
public class IOTUMain {
    public static void main(String[] args) {
        SpringApplication.run(IOTUMain.class);
    }
}
