package fop.w9streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntro {
    public static final Person p1 = new Person("Paul", 20);
    public static final Person p2 = new Person("Mia", 23);
    public static final Person p3 = new Person("Leo", 23);
    public static final Person p4 = new Person("Elias", 23);
    public static final Person p5 = new Person("Laura", 22);

    public static double calculate(List<Double> input) {
        List<Double> s = input.stream().filter(n->n>0)
                .map(x->Math.pow(x,2))
                .reduce((num1,num2)->num1+num2).stream()
                 .collect(Collectors.toList());
        return s.get(0);

    }

    public static Set<Person> toSetForEach(List<Person> input) {
        Set<Person> result = new HashSet<>();
        return result;
    }

    public static Set<Person> toSet(List<Person> input) {
        Set<Person> s =input.stream().collect(Collectors.toSet());
        return s;
    }

    public static double average(int[] input) {
        double average = Arrays.stream(input)
                .average()
                .orElse(0.0);


        return average;

    }

    public static double averageAge(List<Person> input) {
       double averageAge = input.stream()
               .mapToInt(Person::getAge)
               .average()
               .orElse(0.0);
       return averageAge;
       
    }

    public static Map<Integer, List<Person>> groupByAgeForEach(
            List<Person> input) {
        Map<Integer, List<Person>> result = new HashMap<Integer, List<Person>>();
        return result;
    }

    public static Map<Integer, List<Person>> groupByAge(List<Person> input) {
        Map<Integer, List<Person>> groupedByAgeForEach = new HashMap<>();

        input.forEach(p->{int age = p.getAge();
            groupedByAgeForEach.computeIfAbsent(age, k -> new ArrayList<>()).add(p);
        });
        Map<Integer, List<Person>> groupedByAge = input.stream()
                .collect(java.util.stream.Collectors.groupingBy(Person::getAge));

        return groupedByAge;
    }
}
