public class ShoppingBillCalc {
    public static void main(String args[])
    {
        /*
        Build a shopping bill calculator with these items (use final for prices):
        Rice 5kg (Rs.250), Oil 1L (Rs.180), Bread (Rs.45), Milk 2L (Rs.90), Eggs 12pc (Rs.84).
        Calculate subtotal using arithmetic operators.
        Apply 5% GST if subtotal > Rs.500, else 0% GST. Use the ternary operator for this.
        Apply a 10% discount if subtotal > Rs.600 (after GST). Again use ternary.
        Use compound assignment operators (+=, -=) to build the final total step by step.

        Hint: Build the bill step-by-step: subtotal → add GST → subtract discount → final total.
        Expected Output (sample):
        Subtotal: Rs. 649.00
        GST (5%): Rs. 32.45
        Discount: Rs. 0.00
        TOTAL: Rs. 681.45
         */
        float riceQty = 5f, oilQty = 1f, breadQty = 1f, milkQty = 2f, eggsQty = 12f;
        float ricePrice = 250f, oilPrice = 180f, breadPrice = 45f,
                        milkPrice = 90f, eggsPrice = 84f;
        float subtotal = (riceQty * ricePrice) + (oilQty * oilPrice) + (breadQty * breadPrice) +
                         (milkQty * milkPrice) + (eggsQty * eggsPrice);
        float gst = (subtotal > 500) ? (subtotal * 0.05f) : 0f;
        float totalAfterGST = subtotal + gst;
        float discount = (totalAfterGST > 600) ? (totalAfterGST * 0.10f) : 0f;
        float finalTotal = totalAfterGST - discount;
        System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
        System.out.printf("GST (5%%): Rs. %.2f\n", gst);
        System.out.printf("Discount: Rs. %.2f\n", discount);
        System.out.printf("TOTAL: Rs. %.2f\n", finalTotal);


    }
}
