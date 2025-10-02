//----PART C------
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Comparator;

class Product {
        String name;
        double price;
        String category;

        Product(String name, double price, String category) {
                this.name = name;
                this.price = price;
                this.category = category;
        }

        @Override
        public String toString() {
                return String.format("Product{name='%s', price=%.2f, category='%s'}", name, price, category);
        }
}

public class ProductStreamOperations {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                List<Product> products = new ArrayList<>();

                System.out.print("Enter number of products: ");
                int n = sc.nextInt();
                sc.nextLine(); // consume newline

                for (int i = 0; i < n; i++) {
                        System.out.println("Enter product " + (i + 1) + " details:");
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Category: ");
                        String category = sc.nextLine();

                        products.add(new Product(name, price, category));
                }

                // Group products by category
                Map<String, List<Product>> groupedByCategory = products.stream()
                                .collect(Collectors.groupingBy(p -> p.category));

                System.out.println("\nProducts grouped by category:");
                groupedByCategory.forEach((cat, prodList) -> {
                        System.out.println(cat + ":");
                        prodList.forEach(p -> System.out.println("  " + p));
                });

                // Most expensive product in each category
                Map<String, Optional<Product>> mostExpensive = products.stream()
                                .collect(Collectors.groupingBy(p -> p.category,
                                                Collectors.maxBy(Comparator.comparingDouble(p -> p.price))));

                System.out.println("\nMost expensive product in each category:");
                mostExpensive.forEach((cat, prodOpt) -> {
                        System.out.println(cat + ": " + prodOpt.orElse(null));
                });

                // Average price of all products
                double averagePrice = products.stream()
                                .collect(Collectors.averagingDouble(p -> p.price));

                System.out.printf("\nAverage price of all products: %.2f\n", averagePrice);
        }
}

/*
 * Enter number of products: 4
 * Enter product 1 details:
 * Name: Laptop
 * Price: 80000
 * Category: Electronics
 * Enter product 2 details:
 * Name: Phone
 * Price: 50000
 * Category: Electronics
 * Enter product 3 details:
 * Name: Sofa
 * Price: 30000
 * Category: Furniture
 * Enter product 4 details:
 * Name: Chair
 * Price: 10000
 * Category: Furniture
 * 
 * Products grouped by category:
 * Electronics:
 * Product{name='Laptop', price=80000.00, category='Electronics'}
 * Product{name='Phone', price=50000.00, category='Electronics'}
 * Furniture:
 * Product{name='Sofa', price=30000.00, category='Furniture'}
 * Product{name='Chair', price=10000.00, category='Furniture'}
 * 
 * Most expensive product in each category:
 * Electronics: Product{name='Laptop', price=80000.00, category='Electronics'}
 * Furniture: Product{name='Sofa', price=30000.00, category='Furniture'}
 * 
 * Average price of all products: 42500.00
 */
