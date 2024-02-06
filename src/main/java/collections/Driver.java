package collections;

import java.util.*;

public class Driver {
    public static void main(String[] args){

//        // ordered
//        // allows duplicates
//        // not sorted
//        // able to insert null
//        // Create Read Update Delete [CRUD]
//        // Create
//        List<Integer> intList = new ArrayList<Integer>();
//
//        intList.add(8);
//        intList.add(1);
//        intList.add(0);
//        intList.add(8);
//        intList.add(null);
//
//        System.out.println(intList);
//        intList.add(2,22);
//        System.out.println(intList);
//        List<Integer> secondIntList = new ArrayList<>();
//        System.out.println("2nd list:"+secondIntList);
//        secondIntList.addAll(intList);
//        System.out.println("2nd list:"+secondIntList);
//        intList.clear();
//        System.out.println("1st list:"+intList);
//        System.out.println("2nd list conatins 55?:"+secondIntList.contains(55));
//        // Read
//        System.out.println("element at index 2:"+secondIntList.get(2));
//
//        Integer foundPosition = secondIntList.indexOf(8);
//        System.out.println("element 8 found at :"+foundPosition);
//
//        secondIntList.remove(2);
//        System.out.println("2nd list after removal:"+secondIntList);
//        Integer deleteElement = 8;
//        secondIntList.remove(deleteElement);
//        System.out.println("2nd list after removal:"+secondIntList);
//        intList.addAll(secondIntList);
//        intList.add(99);
//        intList.add(8);
//        System.out.println("1st list:"+intList);
//        System.out.println("2nd list:"+secondIntList);
//        intList.removeAll(secondIntList);
//        System.out.println("1st list:"+intList);
//        System.out.println("2nd list:"+secondIntList);
//        secondIntList.retainAll(intList);
//        System.out.println("1st list:"+intList);
//        System.out.println("2nd list:"+secondIntList);
//        secondIntList.add(1);
//        secondIntList.add(7);
//        secondIntList.add(15);
//        secondIntList.add(9);
//        // update
//        secondIntList.set(2,8);
//        System.out.println(secondIntList);
//        // delete
//        secondIntList.remove(1);
//        System.out.println("After removing element at index 1:"+secondIntList);
//        Integer data = 9;
//        secondIntList.remove(data);
//        System.out.println("After removing 9:"+secondIntList);
//        // sorting
//        secondIntList.add(0);
//        secondIntList.add(-1);
//        System.out.println("2nd list:"+secondIntList);
//        Collections.sort(secondIntList);
//        System.out.println("2nd list sorted ASC:"+secondIntList);
//        Collections.reverse(secondIntList);
//        System.out.println("2nd list in DESC order:"+secondIntList);
//
//        // List of Custom data types
//        // create list of Products
//
//        // Create
//        List<Product> productList = new ArrayList<Product>();
//
//        productList.add(new Product(99,"Laptop",45000.0));
//        productList.add(new Product(22,"Key Board",1500.0));
//        productList.add(new Product(11,"Mouse",500.0));
//
//        System.out.println(productList);
//        //read
//        System.out.println("Product at index 1:"+productList.get(1));
//
//        Product findProduct = new Product(99,"Laptop",45000.0);
//
//        Integer productFoundIndex = productList.indexOf(findProduct);
//
//        System.out.println("Product found?"+productFoundIndex);
//        System.out.println("Product found at index 0?"+productList.get(productFoundIndex));
//        // delete
//        Product deleteProduct = new Product(99,"Laptop",45000.0);
//        productList.remove(deleteProduct);
//        System.out.println("Product list after deletion of product id 99 ?"+productList);
//        // update product price of mouse to 575.0 Rs
//        Product updateProduct = productList.get(1); // index of mouse
//        updateProduct.setPrice(575.0);
//        System.out.println("Product list :"+productList);
//
//        for(Product productRef : productList){
//            System.out.println(productRef);
//        }
//
//        // Sort of product list by id
//        productList.add(new Product(55,"Charger",100.0));
//
//        Collections.sort(productList);
//        System.out.println("Product sorted list by id :"+productList);
//
//        productList.sort(new ProductPriceComparator());
//        System.out.println("Product sorted list by price :"+productList);
//
//        // reverse
//        productList.sort(new ProductPriceComparator().reversed() );
//        System.out.println("Product sorted list by price in DESC:"+productList);
//        productList.add(new Product(55,"Charger",100.0));
//        System.out.println("Current product list:"+productList);
//        // Remove duplicate products from list
//        Set<Product> productSet = new HashSet<>(productList);
//        System.out.println("unique Products :"+productSet);
//        // maintain oder in my set
//        Set<Product> orderedProductSet = new LinkedHashSet<>(productList);
//        System.out.println("unique Products with order :"+orderedProductSet);
//        // Sorted unique products
//        Set<Product> sortedProductSet = new TreeSet<>(productList);
//        System.out.println("sorted unique Products  :"+sortedProductSet);
//

        // Map of Country codes
        // No order
        // it can have one null key
        // it can have many null values
        Map<Integer,String> countryCodeMap = new HashMap<>();
        countryCodeMap.put(7,"India");
        countryCodeMap.put(2,"USA");
        countryCodeMap.put(3,"UK");
        countryCodeMap.put(22,"Nepal");
        System.out.println(countryCodeMap);
        countryCodeMap.put(22,"Chennai");
        countryCodeMap.put(null,"Chennai");
        countryCodeMap.put(77,null);
        countryCodeMap.put(88,null);

        System.out.println(countryCodeMap);

        System.out.println("Keys of countryMap:"+countryCodeMap.keySet());
        System.out.println("All values of countryMap:"+countryCodeMap.values());
        // Do CRUD operations on countryCodeMap
        //Read
        System.out.println("Country with code 22 is"+ countryCodeMap.get(22));
        //Update
        // update the country code value of 77 to Brazil
        countryCodeMap.replace(77,"Brazil");
        System.out.println("After updation:"+countryCodeMap);
        //Delete
        // delete entry with key = 88
        countryCodeMap.remove(88);
        System.out.println("After deletion:"+countryCodeMap);

    }
}
