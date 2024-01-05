package com.example.Kafka_Consumer.binding;

import lombok.Data;

@Data
public class Order {

    private String id;
    private Double price;
    private String email;

}
