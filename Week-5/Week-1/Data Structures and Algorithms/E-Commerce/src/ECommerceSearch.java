import java.util.Arrays;
import java.util.Comparator;

    public class ECommerceSearch {

        // Linear Search by productId
        public static Product linearSearch(Product[] products, int targetId) {
            for (Product p : products) {
                if (p.productId == targetId) {
                    return p;
                }
            }
            return null;
        }

        // Binary Search by productId (Assumes products are sorted by productId)
        public static Product binarySearch(Product[] products, int targetId) {
            int left = 0;
            int right = products.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (products[mid].productId == targetId) {
                    return products[mid];
                } else if (products[mid].productId < targetId) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            // Sample Product Array
            Product[] products = {
                    new Product(101, "Laptop", "Electronics"),
                    new Product(205, "Shampoo", "Personal Care"),
                    new Product(153, "Mobile Phone", "Electronics"),
                    new Product(304, "Notebook", "Stationery")
            };

            // Linear Search Test
            System.out.println("=== Linear Search ===");
            Product result1 = linearSearch(products, 153);
            System.out.println(result1 != null ? "Found: " + result1 : "Product not found.");

            // Sort for Binary Search
            Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

            // Binary Search Test
            System.out.println("\n=== Binary Search ===");
            Product result2 = binarySearch(products, 153);
            System.out.println(result2 != null ? "Found: " + result2 : "Product not found.");
        }
    }


