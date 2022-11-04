package com.example.aufgabezahl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//Zahlen von 1 - 100 Zahl -ist teilbar durch 3 = dings, durch 5 = bums durch 3+5 = dingsbums
public class AufgabezahlApplication {

    public static void main(String[] args) {
        for(int i = 1; i <= 101; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("dingsbums");

            } else if(i % 3 == 0)
            {
                System.out.println("dings");
            } else if(i % 5 == 0)
            {
                System.out.println("bums");
            } else
            {
                System.out.println(i);
            }
        }
    }
}