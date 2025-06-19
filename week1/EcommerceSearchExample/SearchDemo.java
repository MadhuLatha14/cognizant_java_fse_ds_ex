import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear search by product name
    public static Product linearSearch(Product[] products, String productName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    // Binary search by product name (requires sorted array)
    public static Product binarySearch(Product[] products, String productName) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(productName);
            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Education"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Shoes", "Footwear")
        };

        // Sort products by productName for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Linear Search
        String searchName = "Laptop";
        Product linearResult = linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Product not found."));

        // Binary Search
        Product binaryResult = binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Product not found."));
    }
}
