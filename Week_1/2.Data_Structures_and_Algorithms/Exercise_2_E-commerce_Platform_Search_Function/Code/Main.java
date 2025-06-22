import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Mobile", "Electronics")
        };

        System.out.println("Linear Search: Looking for 'Watch'");
        Product foundLinear = linearSearch(products, "Watch");
        System.out.println(foundLinear != null ? "Found: " + foundLinear : "Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search: Looking for 'Watch'");
        Product foundBinary = binarySearch(products, "Watch");
        System.out.println(foundBinary != null ? "Found: " + foundBinary : "Product not found");

        System.out.println("\nResults of Linear Search vs Binary Search:");
        System.out.println("For worst case, the time complexity is O(log n) for binary search ,while linear search has a time complexity of O(n).\n");
    }
}
