package com.devsuperior.desafio1;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio1Application implements CommandLineRunner {

    private OrderService orderService;

	public Desafio1Application(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 =  new Order(1034,  150.00, 20.0);
		Order order2 =  new Order(2282,  800.00, 10.0);
		Order order3 =  new Order(1309,  95.90, 0.0);

		System.out.println(orderService.total(order1));
		System.out.println(orderService.total(order2));
		System.out.println(orderService.total(order3));



	}

}
