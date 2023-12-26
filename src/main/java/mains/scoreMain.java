package mains;

import mains.models.Name;
import mains.models.Score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class scoreMain {

    public static void main(String[] args) {

        Map<Name, Score<Integer>> mapNameScores = new HashMap<>();

        Name abe = new Name("Abe");
        Name bob = new Name("Bob");
        Name charlie = new Name("Charlie");
        Name david = new Name("David");
        Name emily = new Name("Emily");

        mapNameScores.putIfAbsent(abe, new Score<>(10));
        mapNameScores.putIfAbsent(emily, new Score<>(15));
        mapNameScores.putIfAbsent(bob, new Score<>(20));

//        mapNameScores.computeIfAbsent(charlie, name -> new Score<>(0))
//                .put(mapNameScores.get(charlie).getTotal() + new Score<>(10));
//
//        mapNameScores.putIfAbsent(keyToUpdate, new Score<>(0)); // Add the key with a zero value if it doesn't exist
//        mapNameScores.get(keyToUpdate).setValue(mapNameScores.get(keyToUpdate).getValue() + 10); // Increase the value by 10 (now guaranteed to exist)




        mapNameScores.entrySet().forEach(entry -> {
            Name key = entry.getKey();
            Score<Integer> value = entry.getValue();
            System.out.println(key + " : " + value);
        });

        for (Name key : mapNameScores.keySet()) {
            Score<Integer> value = mapNameScores.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("unsorted");
        mapNameScores.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));


        // Sort by Name using natural order
        System.out.println("sort by name using natural order");
        List<Map.Entry<Name, Score<Integer>>> sortedEntriesList = new ArrayList<>();
        for (Map.Entry<Name, Score<Integer>> nameScoreEntry : mapNameScores.entrySet()) {
            sortedEntriesList.add(nameScoreEntry);
        }
        sortedEntriesList.sort(Map.Entry.comparingByKey());


        sortedEntriesList.stream()
            .

    forEach(entry ->System.out.println(entry.getKey()+" : "+entry.getValue()));

}


}
