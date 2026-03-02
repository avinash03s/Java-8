package Java_8_feature.mapVsFlatMap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TrainingInstitute {

    private String name;
    private List<String> location;

    public TrainingInstitute(String name, List<String> location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "TrainingInstitute{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}

public class Demo {

    public static void main(String[] args) {

        /// map() vs flatMap()

        TrainingInstitute t1 = new TrainingInstitute("TDIT", Arrays.asList("Pune", "Ahmedabad", "Kozhikode", "Lucknow"));
        TrainingInstitute t2 = new TrainingInstitute("Dish", Arrays.asList("Beed", "Mumbai", "Kharagpur"));
        TrainingInstitute t3 = new TrainingInstitute("TEKUP SKILL", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore"));
        TrainingInstitute t4 = new TrainingInstitute("ITI", Arrays.asList("Bangalore", "Jalna", "Latur", "Parbhni"));

        List<TrainingInstitute> list = new ArrayList<>(Arrays.asList(t1, t2, t3, t4));

        /// using map()
        list.stream().map(TrainingInstitute::getName).forEach(System.out::println);///get Name
        list.stream().map(TrainingInstitute::getLocation).forEach(System.out::println);///get Location(problem)

        System.out.println("----------------------------------------------------------------------------------");

        /// use flatMap()
        list.stream().flatMap(x-> x.getLocation().stream()).forEach(System.out::println);/// separate all location
    }
}

/// Why flatMap()?
/// One institute → many locations
/// flatMap() flattens all locations into one stream

/// Why map()? - Each TrainingInstitute gives exactly one name.

/// Use map() when one input gives one output.
/// Use flatMap() when one input gives multiple outputs and you want them combined.
