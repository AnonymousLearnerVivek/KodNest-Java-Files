package com.Advance_Java.Exception_Handling;
/*
    # User-Defined Exception Handling:

        In Java, to create user-defined exceptions, a class must extend theException class or its subclasses.

        In Java, user-defined exceptions are created by extending the Exception class or its subclasses.
        This allows developers to define custom error conditions specific to their application logic,
        which can be thrown and handled like standard exceptions.


 */
// Custom exception for payment failures
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

// Custom exception for delivery issues
class DeliveryException extends Exception {
    public DeliveryException(String message) {
        super(message);
    }
}

public class SwiggyOrderExample {
    public static void main(String[] args) {
        String[] orders = {"Order1", "Order2", "Order3", "Order4"};

        for (String order : orders) {
            try {
                processOrder(order);
            } catch (PaymentFailedException e) {
                System.out.println("Payment Failed for " + order + ": " + e.getMessage());
            } catch (DeliveryException e) {
                System.out.println("Delivery Issue for " + order + ": " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong with " + order + ": " + e.getMessage());
            }
        }

        System.out.println("All orders have been processed. Enjoy your food! 🍽️");
    }

    public static void processOrder(String order) throws PaymentFailedException, DeliveryException {
        if (order.equals("Order2")) {
            throw new PaymentFailedException("Your card was declined.");
        } else if (order.equals("Order3")) {
            throw new DeliveryException("Delivery address not found.");
        } else if (order.equals("Order4")) {
            throw new NullPointerException("Order details are missing.");
        } else {
            System.out.println(order + " processed successfully!");
        }
    }
}
/*
Output:
    Order1 processed successfully!
    Payment Failed for Order2: Your card was declined.
    Delivery Issue for Order3: Delivery address not found.
    Something went wrong with Order4: Order details are missing.
    All orders have been processed. Enjoy your food! 🍽️
 */