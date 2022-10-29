class OrderManagement {

    private DistanceCalculator distanceCalculator;

    public OrderManagement(DistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }

    public void setDistanceCalculator(DistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }
}

class DefaultDistanceCalculator implements DistanceCalculator {

    @Override
    public double calculateDistance(City city1, City city2) {
        return 0;
    }

}

class GoogleDistanceCalculator {

    public double getDistanceBetweenCities(City city1, City city2) {
        return 1;
    }

    public static double getDistanceBetweenCitiesStatic(City city1, City city2) {
        return 1;
    }
}

public class Main {

    public static void main(String[] args) {
        OrderManagement orderManagement =
                new OrderManagement(new DefaultDistanceCalculator());

        orderManagement.setDistanceCalculator(new DistanceCalculator() {
            @Override
            public double calculateDistance(City city1, City city2) {
                // take into account interstate distance calculation
                return city1.getLongitude() - city2.getLongitude(); // some dummy calculations
            }
        });

        DistanceCalculator dCalculator = (city1, city2) -> city1.getLongitude() - city2.getLongitude();
        DistanceCalculator dCalculator2 = (city1, city2) -> {
            System.out.println("Text inside lambda function");
            return city1.getLongitude() - city2.getLongitude();
        };

        dCalculator2.calculateDistance(new City(), new City());

        orderManagement.setDistanceCalculator((city1, city2) -> city1.getLongitude() - city2.getLongitude());


        // ========== Method reference demo ==========

        orderManagement
                .setDistanceCalculator(GoogleDistanceCalculator::getDistanceBetweenCitiesStatic);

        GoogleDistanceCalculator gdc = new GoogleDistanceCalculator();
        orderManagement
                .setDistanceCalculator(gdc::getDistanceBetweenCities);

    }
}