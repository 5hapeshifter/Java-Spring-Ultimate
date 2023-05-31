package com.devsuperior.desafio1.services;

import com.devsuperior.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        Double shippingValue = shippingService.shipment(order);
        double valorComDesconto = order.getValorBasico() * ((100 - order.getPorcentagemDesconto()) / 100);
        return valorComDesconto + shippingValue;
    }
}
