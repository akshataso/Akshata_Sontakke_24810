package com.cybage.main;

import java.util.List;
import java.util.Scanner;

import com.cybage.model.Product;
import com.cybage.service.ProductService;



public class ProductMgmt {

	public static void main(String[] args) {

		System.out.println("\n---------Product Management--------");
		boolean stat = false;

		try (Scanner scanner = new Scanner(System.in)) {
			ProductService productService = new ProductService();
			while (!stat) {

				System.out.println(
						"1.Add Product\n2.Update Product\n3.Delete Product\n4.Get Product\n5.Display products\n6.Exit");

				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Enter Product name, quantity and cost: ");
					Product product = new Product(scanner.next(), scanner.nextInt(), scanner.nextDouble());
					System.out.println(productService.addProduct(product));
					break;

				case 2:
					System.out.println("Enter Product ID: ");
					int pid = scanner.nextInt();
					boolean flag = false;
					while (!flag) {
						System.out.println("\n1.Update name\n2.Update quantity\n3.Update cost\n4.Exit");
						switch (scanner.nextInt()) {
						case 1:
							System.out.println("Enter product name: ");
							String name = scanner.next();

							Product product2 = productService.getProduct(pid);
							product2.setProductName(name);
							System.out.println(productService.updateProduct(pid, product2));
							break;
						case 2:
							System.out.println("Enter product quantity: ");
							int quantity = scanner.nextInt();
							Product product3 = productService.getProduct(pid);
							product3.setProductQuantity(quantity);
							System.out.println(productService.updateProduct(pid, product3));
							break;
						case 3:
							System.out.println("Enter product cost: ");
							double cost = scanner.nextDouble();
							Product product4 = productService.getProduct(pid);
							product4.setProductCost(cost);
							System.out.println(productService.updateProduct(pid, product4));
							break;
						case 4:
							flag = true;
							break;
						default:
							System.out.println("Please try again");
							break;
						}
					}

					break;

				case 3:
					System.out.println("Enter Product Id: ");
					System.out.println(productService.deleteProduct(scanner.nextInt()));

					break;

				case 4:
					System.out.println("Enter product Id: ");
					Product product2 = productService.getProduct(scanner.nextInt());
					System.out.println(product2);
					break;
				case 5:
					List<Product> productList = productService.getAllProducts();
					productList.forEach(System.out::println);
					break;
				case 6:
					stat = true;
					System.out.println("GoodBye!!!");
					break;

				default:
					System.out.println("Please try again");
					break;
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
