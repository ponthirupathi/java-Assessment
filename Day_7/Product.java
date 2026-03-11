// 2. Product Price Calculation
// Create a class Product with:

// productId

// productName

// price

// quantity

// Requirements:

// Initialize all variables using a parameterized constructor.

// Create a method calculateTotalPrice() that returns price * quantity.

// In the main method, create two product objects and print the total price.
package Day_7;

public class Product {

    int productId;

    String productName;

    int price;

    int quantity;

      Product(int id,String name,int p,int q)
      {
        this.productId = id;
        this.productName = name;
        this.price = p;
        this.quantity = q;
      }
      public void calculateTotalPrice(){

      int  total_amount =  price * quantity;
      System.out.println("product ID:"+productId);
      System.out.println("product NAME:"+productName);
      System.out.println("product PRICE:"+price);
      System.out.println("product QUANTITY:"+quantity);
      System.out.println("product TOTAL_AMOUNT:"+total_amount);
      System.out.println("-----------------------------------");


      }


      public static void main(String[] args) {
        
        Product p1 = new Product(01,"Iphone",120000,2);
        p1.calculateTotalPrice();

         Product p2 = new Product(02,"Redmi_phone",20000,3);
        p2.calculateTotalPrice();

         Product p3 = new Product(03,"One_plus_phone",100000,5);
        p3.calculateTotalPrice();
      }
    }