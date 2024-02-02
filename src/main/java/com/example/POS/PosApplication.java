package com.example.POS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class PosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
	}

	public static Manager manager = new Manager();

	@PostMapping("/createItem")
	public void createItem(@RequestParam String name, double price, String date) {
		manager.createItem(name, price, date);
	}
	@DeleteMapping("/removeItem")
	public void removeItem(@RequestParam int idItem) {
		manager.removeItem(idItem);
	}
	//TODO: editItem not editeItem done
	@PostMapping("/editeItem")
	//TODO: How to change the rest of the item attributes? done
	public void editeItem(@RequestParam int idItem, String name,double price,String date) {
		manager.editeItem(idItem,name,price,date);
	}
	@GetMapping("/getItem")
	//TODO: An item is not defined by its name. It is defined by its id. Check other endpoints. done
	public Item getItem(@RequestParam int idItem ) {
		return manager.getItems().get(idItem);
	}
	@GetMapping("/getAllItems")
	public ArrayList<Item> getAllItems() {
		return manager.getItems();

	}
	@PostMapping("/createOrder")
	public void createOrder(@RequestParam String customerName) {
		manager.createOrder(customerName);
	}

	@PostMapping("/editeOrder")
	//TODO: Why @RequestParam only for first parameter? Should apply to all endpoints.
	public void editeOrder(@RequestParam int idOrder,  String customerName) {
		manager.editeOrder(idOrder, customerName);
	}

	@DeleteMapping("/removeOrder")
	//TODO: An order is not defined by the customer name. It is defined by its id. Check other endpoints as well.
	public void removeOrder(@RequestParam int idOrder) {
		manager.removeOrder(idOrder);
	}

	@GetMapping("/printOrder")
	public Order printOrder(@RequestParam int idOrder) {
		return manager.printOrder(idOrder);
	}
	@GetMapping("/getAllOrders")
	public ArrayList<Order> getAllOrders() {
		return manager.getOrders();
	}
	@PostMapping("/addItemLineToOrder")
	public void addItemLineToOrder(@RequestParam int idOrder, int idItem, int count) {
		manager.addItemLineToOrder(idOrder, idItem, count);

	}

	@DeleteMapping("/removeItemLineFromOrder")
	public void removeItemLineFromOrder(@RequestParam int idOrder, int idItemLine) {
		manager.removeItemLineFromOrder(idOrder, idItemLine);

	}

	@PostMapping("/editeItemLine")
	//TODO: What is the new value to be edited?
	public void editeItemLine(@RequestParam int idOrder,int idItemLine, int idItem,int count) {
		manager.editeItemLine(idOrder,idItemLine,idItem,count);

	}
	@GetMapping("/getSumOrder")
	public double sum(int idOrder) {
		return manager.sum(idOrder);

	}
}















































































































