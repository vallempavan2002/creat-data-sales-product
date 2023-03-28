import java.util.*;

public class SalesProduct {
    public static void main(String[] args) {
        // Define sales data for 2021 and 2022
        Map<String, List<Double>> salesData = new HashMap<>();
        salesData.put("Tea", Arrays.asList(100.0, 120.0));
        salesData.put("Coffee", Arrays.asList(100.0, 110.0));
        salesData.put("Green Tea", Arrays.asList(75.0, 100.0));

        // Calculate variance and variance percentage for each product
        for (Map.Entry<String, List<Double>> entry : salesData.entrySet()) {
            String product = entry.getKey();
            List<Double> sales = entry.getValue();
            double sales2021 = sales.get(0);
            double sales2022 = sales.get(1);
            double variance = sales2022 - sales2021;
            double variancePct = (variance / sales2021) * 100;

            // Display the results
            System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f%%%n", product, sales2021, sales2022, variance, variancePct);
        }
    }
}
