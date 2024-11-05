package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        var discount = order.getBasic() * (order.getDiscount() / 100);
        var frete = shippingService.shipment(order);


        return order.getBasic() - discount + frete;

    }


}
