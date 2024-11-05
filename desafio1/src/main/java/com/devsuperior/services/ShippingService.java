package com.devsuperior.services;


import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final Double freteMaximo = 20.00;
    private final Double freteMinimo = 12.00;
    private final Double freteGratis = 0.00;

    public Double shipment(Order order) {
        if (order.getBasic() < 100)
            return freteMaximo;
        else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            return freteMinimo;
        } else {
            return freteGratis;
        }
    }






}
