package CollectionP;

import java.util.*;

public class VegetableShop {
    private Set<String> availableVeg;
    private Map<String, Double> vegetablePrice;

    public VegetableShop() {
        availableVeg = new HashSet<>();
        vegetablePrice = new HashMap<>();

        vegetablePrice.put("tomato", 7.99);
        vegetablePrice.put("onion", 9.98);
        vegetablePrice.put("potato", 12.98);
        vegetablePrice.put("carrot", 28.98);

        availableVeg.addAll(vegetablePrice.keySet());
    }

    public Set<String> getAvailableVeg() {
        return availableVeg;
    }

    public Double getVegetablePrice(String vegetableName) {
        return vegetablePrice.getOrDefault(vegetableName, 0.0);
    }

    public void addVegetables(String vegetableName, Double price) {
        vegetablePrice.put(vegetableName, price);
        availableVeg.add(vegetableName);
    }

    public static void main(String[] args) {
        VegetableShop v1 = new VegetableShop();

        System.out.println("Available vegetable: ");
        for (String vegetable : v1.getAvailableVeg()) {
            System.out.println(vegetable + ":  $" + v1.getVegetablePrice(vegetable));
        }

        System.out.println("");
        v1.addVegetables("Broccoli", 2.99);
        System.out.println("Available vegetables (after adding Broccoli):");
        for (String vegetable : v1.getAvailableVeg()) {
            System.out.println(vegetable + ": $" + v1.getVegetablePrice(vegetable));
        }

        System.out.println("");
        Map<String, Double> sortedPrices = new TreeMap<>(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return v1.getVegetablePrice(s1).compareTo(v1.getVegetablePrice(s2));
            }
        });
        sortedPrices.putAll(v1.vegetablePrice);
        for (String vegetable : sortedPrices.keySet()) {
            System.out.println(vegetable + ": $" + sortedPrices.get(vegetable));
        }
    }
}
