public class Temperature {
    double celsius;

    void convert(){
        double fahrenheit = (celsius * 9 /5) + 32;
        System.out.println("Temperature in Fahrenheit is "+fahrenheit);
    }

    public static void main(String[] args) {
        Temperature input = new Temperature();
        input.celsius=15;
        input.convert();
    }
}
