class Invoice{
        //Define instance variables here
        String number;
        String description;
        int quantity;
        double price;
        public Invoice(){ }
        //Define parameterized constructor here
        public Invoice(String num, String desc, int quant, double pr) {
            number = num;
            description = desc;
            quantity = quant;
            price = pr;
        }
       // Setters
        void setNumber(String num) {
            number = num;
        }
        void setDescription(String desc) {
            description = desc;
        }
        void setQunatity(int quant) {
            quantity = quant;
        }
        void setPrice(double pr) {
            price = pr;
        }
       // Getters
        String getNumber() {
            return number;
        }
        String getDescription() {
            return description;
        }
        int getQunatity() {
            return quantity;
        }
        double getPrice() {
            return price;
        }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if (quantity < 0) {
                    invoiceAmount = 0;
                }
                else if (price < 0.0) {
                    invoiceAmount = 0.0;
                }
                else {
                    invoiceAmount = price * quantity;
                }
                return invoiceAmount;
       }
}
public class Main{
         public static void main(String []args){
                   Invoice myInvoice;
                   myInvoice = new Invoice("19BQ1A05L4", "My First Invoice :)", 5, 2.0);
                   myInvoice.setPrice(5.0);
                   System.out.println("Number: " + myInvoice.getNumber());
                   System.out.println("Description: " + myInvoice.getDescription());
                   System.out.println("Quantity: " + myInvoice.getQunatity());
                   System.out.println("Price:" + myInvoice.getPrice());
                   System.out.println("invoiceAmount: " + myInvoice.getInvoiceAmount());
         }
}
