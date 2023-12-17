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
        input.stream().forEach(z -> result.add(z));
        return result;
    }

    public static Set<Person> toSet(List<Person> input) {
         Set<Person> personSet = input.stream().
                collect(Collectors.toSet());
        return personSet;
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
        input.forEach(z->{
            result.computeIfAbsent(z.getAge(), k -> new ArrayList<>()).add(z);
            
        });
        return result;
    }

    public static Map<Integer, List<Person>> groupByAge(List<Person> input) {

        return input.stream().collect(Collectors.groupingBy(z->z.getAge()));
    }
}
