package com.devsuperior.desafio1.services;

import com.devsuperior.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        Double valorBasico = order.getValorBasico();
        if (100 > valorBasico) {
            return 20.0;
        } else if (200 > valorBasico) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
