public class ConvertTemp {
    /*

        Write a program that converts Celsius to Fahrenheit AND Kelvin.
        Formula: F = (C * 9/5) + 32, K = C + 273.15
     */
    public static void main(String args[]){
        float C=32f, F, K;
        F = (C * 9/5) + 32;
        K = C + 273.15f;
        System.out.println("Celsius: " + C);
        System.out.println("Fahrenheit: " + F);
        System.out.println("Kelvin: " + K);


    }

}
