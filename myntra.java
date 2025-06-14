class myntra{
    public static void main(String[] args){
        String brand = "Highlander";
        System.out.println("Brand " + brand);
        String typeofProduct = "Men White Slim Fit Printed Casual Shirt";

        System.out.println("Product Type " + typeofProduct);
        
        
        //ratings
        double ratings = 4.2;
        int noofRatings = 16;
        System.out.println("Ratings "+ ratings);
        System.out.println("Total Ratings " + noofRatings);
        

        //pricing
        double price = 3499.50;
        double discount = 81.0;
        double sellingPrice = 749.0;

        System.out.println("MRP " + price);
        System.out.println("Discount " + discount);
        System.out.println("Our Price " + sellingPrice);


        //Sizes
        byte s1 = 39;
        byte s2 = 40;
        byte s3 = 42;
        byte s4 = 44;
        System.out.println("Available Sizes " + s1 +"," + s2 + "," + s3 + "," + s4);

    }
}