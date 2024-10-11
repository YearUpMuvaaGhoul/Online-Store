package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import static store.loadProducts;


public class Store {
    public static void main(String[] args) {
        List<Product> products = loadProducts("Products.csv");

        // Code to display home screen for store

    }

    private static List<Product> loadProducts(String fileName) {
        List<Product> products = new ArrayList<>();
        String line = "";
        String splitBy = "\\|"; // CSV

//delete first header line
        int counterSkip = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {

     //first line data n/a
                if (counterSkip == 0) {
                    counterSkip++; // ++ is to show anything after 0 (+1 ln)
                    continue ; }

                String[] productData = line.split(splitBy);
               System.out.println(Arrays.toString(productData));

       Product product = new Product(productData[0], productData[1],
                        Double.parseDouble(productData[2]),
                     productData[3]);
                     products.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
}

// public static void main(String[] args) {
   // List<Product> products = Store.loadProducts("Products.csv");
//    Console cart = new Console();
  //  Scanner scanner = new Scanner(System.in);

    //while (true) {
      //  System.out.println("Welcome to the Online Store!");
        //System.out.println("1. Display Products");
      //  System.out.println("2. Display Cart");
        // System.out.println("3. Exit");

   ///     int choice = scanner.nextInt();
      //  scanner.nextLine(); //  newline

        //switch (choice) {
          //  case 1:
            //    displayProducts(products, scanner, cart);
              //  break;
      //      case 2:
        //        displayCart(cart, scanner);
          //      break;
//            case 3:
  //              System.out.println("Thanks for shopping with us!");
    //            return;
      //      default:
        //        System.out.println("Invalid choice. Please try again.");
 //       }
   // }
//}

//
  //  while (true)
    //    System.out.println("Products:");
      //  for (Product product : products) {
        //    System.out.println(product);
        //}

       // System.out.println("1. Add to Cart");
        //System.out.println("2. Search Products");
        //System.out.println("3. Back to Home");

       // int choice = scanner.nextInt();
       // scanner.nextLine(); // consume the newline

      //  switch (choice) {
        //    case 1:
          //      System.out.println("Enter SKU of the product to add:");
            //    String sku = scanner.nextLine();
              //  for (Product product : products) {
                //    if (product.getSku().equalsIgnoreCase(sku)) {
                  //      cart.addProduct(product);
                    //    System.out.println("Product added to cart.");
          //          }
            //    }
              //  break;
         //   case 2:
                // Implement search functionality
           //     System.out.println("Enter a search term:");
             //   String searchTerm = scanner.nextLine();
               // for (Product product : products) {
                //    if (product.getProductName().contains(searchTerm) ||
                  //          String.valueOf(product.getPrice()).contains(searchTerm) ||
                    //        product.getDepartment().contains(searchTerm)) {
                      //  System.out.println(product);
        //            }
          //      }
            //    break;
    //        case 3:
      //          return;
        //    default:
          //      System.out.println("Invalid choice. Please try again.");
       // }
//    }
//}

// private static void displayCart(Console cart, Scanner scanner) {
   // while (true) {
     //   System.out.println("Your Cart:");
       // for (Product product : cart.getProducts()) {
         //   System.out.println(product);
       // }
//
  //      System.out.println("Total: $" + cart.getTotal());
    //    System.out.println("1. Remove from Cart");
      //  System.out.println("2. Check Out");
        //System.out.println("3. Back to Home");

//        int choice = scanner.nextInt();
  //      scanner.nextLine(); // consume the newline

    //    switch (choice) {
      //      case 1:
        //        System.out.println("Enter SKU of the product to remove:");
          //      String sku = scanner.nextLine();
            //    cart.removeProduct(sku);
              //  System.out.println("Product removed from cart.");
                //break;
        //    case 2:
          //      System.out.println("Checking out...");
            //    // Implement checkout functionality
              //  return;
     //       case 3:
       //         return;
         //   default:


