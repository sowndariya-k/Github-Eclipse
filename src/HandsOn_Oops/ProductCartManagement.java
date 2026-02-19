package HandsOn_Oops;

class Product{
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	//constructor
	public Product(int productId, String productName, double price, int quantity) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	//set quantity
	public void setQuantity(int newQty) {
		if(newQty>0) {
			this.quantity=newQty;
		}
		else {
			System.out.println("Invalid quantity.");
		}
	}
	
	//calculate total amount
	public double calculateTotal() {
		return price*quantity;
	}
	
	//get product Id
	public int getProductId() {
		return productId;
	}
	
	//get product details
	public String getProductDetails() {
		return "ID: "+productId+ 
				", Name: "+productName+
				", Price: "+price+
				", Quantity: "+quantity+
				", Total: "+calculateTotal();
	}
}

class Cart{
	private Product[] products;
	private int count;
	
	public Cart(int size) {
		products = new Product[size];
		count=0;
	}
	
	// Add product
    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Cart is full.");
        }
    }

    // Remove product by ID
    public void removeProduct(int productId) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (products[i].getProductId() == productId) {
                // shift elements left
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count - 1] = null;
                count--;
                found = true;
                System.out.println("Product removed.");
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }
	
	// Calculate total
    public double calculateCartTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].calculateTotal();
        }
        return total;
    }
    
	//display product 
	public void displayCartItems() {
        if (count == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Cart Items:");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getProductDetails());
        }

        System.out.println("Total Cart Value: " + calculateCartTotal());
    }
}

public class ProductCartManagement {

	public static void main(String[] args) {

        Cart cart = new Cart(5); 

        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 550, 2);
        Product p3 = new Product(103, "Keyboard", 1500, 1);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCartItems();

        System.out.println("\nAfter removing product 102:");
        cart.removeProduct(102);
        cart.displayCartItems();
	}

}
