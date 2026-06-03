package module11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsExercisesTest {

    // =====================================================
    // Exercise 1: Wrapper Sum
    // =====================================================

    @Test
    void testExercise1NormalValues() {
        assertEquals(15,
                CollectionsExercises.exercise1_sumWrapper(5, 10));
    }

    @Test
    void testExercise1FirstNull() {
        assertEquals(7,
                CollectionsExercises.exercise1_sumWrapper(null, 7));
    }

    @Test
    void testExercise1SecondNull() {
        assertEquals(9,
                CollectionsExercises.exercise1_sumWrapper(9, null));
    }

    @Test
    void testExercise1BothNull() {
        assertEquals(0,
                CollectionsExercises.exercise1_sumWrapper(null, null));
    }

    // =====================================================
    // Exercise 2: Filter Even Numbers
    // =====================================================

    @Test
    void testExercise2FilterEven() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ArrayList<Integer> result =
                CollectionsExercises.exercise2_filterEven(list);

        assertEquals(
                Arrays.asList(2, 4, 6),
                result
        );
    }

    @Test
    void testExercise2NoEvenNumbers() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 3, 5));

        ArrayList<Integer> result =
                CollectionsExercises.exercise2_filterEven(list);

        assertTrue(result.isEmpty());
    }

    // =====================================================
    // Exercise 3: List To String
    // =====================================================

    @Test
    void testExercise3ListToString() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3));

        assertEquals("1, 2, 3",
                CollectionsExercises.exercise3_listToString(list));
    }

    @Test
    void testExercise3SingleElement() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(5));

        assertEquals("5",
                CollectionsExercises.exercise3_listToString(list));
    }

    @Test
    void testExercise3EmptyList() {
        ArrayList<Integer> list =
                new ArrayList<>();

        assertEquals("",
                CollectionsExercises.exercise3_listToString(list));
    }

    // =====================================================
    // Exercise 4: Map Lookup
    // =====================================================

    @Test
    void testExercise4KeyFound() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);

        assertEquals(1,
                CollectionsExercises.exercise4_mapLookup(map, "A"));
    }

    @Test
    void testExercise4KeyNotFound() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);

        assertEquals(-1,
                CollectionsExercises.exercise4_mapLookup(map, "B"));
    }

    // =====================================================
    // Exercise 5: Count Frequencies
    // =====================================================

    @Test
    void testExercise5CountFrequencies() {
        ArrayList<String> words =
                new ArrayList<>(Arrays.asList(
                        "apple",
                        "banana",
                        "apple",
                        "orange",
                        "banana",
                        "apple"
                ));

        HashMap<String, Integer> result =
                CollectionsExercises.exercise5_countFrequencies(words);

        assertEquals(3, result.get("apple"));
        assertEquals(2, result.get("banana"));
        assertEquals(1, result.get("orange"));
    }

    // =====================================================
    // Exercise 6: Day Type
    // =====================================================

    @Test
    void testExercise6Weekday() {
        assertEquals("Weekday",
                CollectionsExercises.exercise6_dayType(Day.MONDAY));
    }

    @Test
    void testExercise6Weekend() {
        assertEquals("Weekend",
                CollectionsExercises.exercise6_dayType(Day.SATURDAY));
    }

    // =====================================================
    // Exercise 7: Grade Description
    // =====================================================

    @Test
    void testExercise7GradeDescriptions() {
        assertEquals("Excellent",
                CollectionsExercises.exercise7_gradeDescription(Grade.A));

        assertEquals("Good",
                CollectionsExercises.exercise7_gradeDescription(Grade.B));

        assertEquals("Average",
                CollectionsExercises.exercise7_gradeDescription(Grade.C));

        assertEquals("Poor",
                CollectionsExercises.exercise7_gradeDescription(Grade.D));

        assertEquals("Fail",
                CollectionsExercises.exercise7_gradeDescription(Grade.F));
    }

    // =====================================================
    // Exercise 8: Reverse List
    // =====================================================

    @Test
    void testExercise8ReverseList() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        ArrayList<Integer> result =
                CollectionsExercises.exercise8_reverseList(list);

        assertEquals(
                Arrays.asList(4, 3, 2, 1),
                result
        );
    }

    @Test
    void testExercise8DoesNotModifyOriginal() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3));

        CollectionsExercises.exercise8_reverseList(list);

        assertEquals(
                Arrays.asList(1, 2, 3),
                list
        );
    }

    // =====================================================
    // Exercise 9: Find Duplicates
    // =====================================================

    @Test
    void testExercise9FindDuplicates() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(
                        1, 2, 3, 2, 4, 1, 5, 1
                ));

        ArrayList<Integer> result =
                CollectionsExercises.exercise9_findDuplicates(list);

        assertEquals(
                Arrays.asList(2, 1),
                result
        );
    }

    @Test
    void testExercise9NoDuplicates() {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3));

        ArrayList<Integer> result =
                CollectionsExercises.exercise9_findDuplicates(list);

        assertTrue(result.isEmpty());
    }

    // =====================================================
    // Exercise 10: Merge Maps
    // =====================================================

    @Test
    void testExercise10MergeMaps() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 5);
        map2.put("C", 3);

        HashMap<String, Integer> result =
                CollectionsExercises.exercise10_mergeMaps(map1, map2);

        assertEquals(1, result.get("A"));
        assertEquals(5, result.get("B"));
        assertEquals(3, result.get("C"));
        assertEquals(3, result.size());
    }

    // =====================================================
    // Exercise 11: Highest Value Key
    // =====================================================

    @Test
    void testExercise11FindHighestValueKey() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 50);
        map.put("Bob", 90);
        map.put("Charlie", 70);

        assertEquals("Bob",
                CollectionsExercises.exercise11_findHighestValueKey(map));
    }

    @Test
    void testExercise11EmptyMap() {
        HashMap<String, Integer> map = new HashMap<>();

        assertEquals("",
                CollectionsExercises.exercise11_findHighestValueKey(map));
    }

    // =====================================================
    // Exercise 12: Group Words By Length
    // =====================================================

    @Test
    void testExercise12GroupWordsByLength() {
        ArrayList<String> words =
                new ArrayList<>(Arrays.asList(
                        "cat",
                        "dog",
                        "elephant",
                        "sun"
                ));

        HashMap<Integer, ArrayList<String>> result =
                CollectionsExercises.exercise12_groupWordsByLength(words);

        assertEquals(
                Arrays.asList("cat", "dog", "sun"),
                result.get(3)
        );

        assertEquals(
                Arrays.asList("elephant"),
                result.get(8)
        );
    }

    // =====================================================
    // Exercise 13: Invert Map
    // =====================================================

    @Test
    void testExercise13InvertMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        HashMap<Integer, String> result =
                CollectionsExercises.exercise13_invertMap(map);

        assertEquals("A", result.get(1));
        assertEquals("B", result.get(2));
    }

    // =====================================================
    // Exercise 14: Remove Nulls
    // =====================================================

    @Test
    void testExercise14RemoveNulls() {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList(
                        "A",
                        null,
                        "B",
                        null,
                        "C"
                ));

        ArrayList<String> result =
                CollectionsExercises.exercise14_removeNulls(list);

        assertEquals(
                Arrays.asList("A", "B", "C"),
                result
        );
    }

    @Test
    void testExercise14AllNulls() {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList(
                        null,
                        null
                ));

        ArrayList<String> result =
                CollectionsExercises.exercise14_removeNulls(list);

        assertTrue(result.isEmpty());
    }

    // =====================================================
    // Exercise 15: Count Grades
    // =====================================================

    @Test
    void testExercise15CountGrades() {
        ArrayList<Grade> grades =
                new ArrayList<>(Arrays.asList(
                        Grade.A,
                        Grade.B,
                        Grade.A,
                        Grade.C,
                        Grade.B,
                        Grade.A
                ));

        HashMap<Grade, Integer> result =
                CollectionsExercises.exercise15_countGrades(grades);

        assertEquals(3, result.get(Grade.A));
        assertEquals(2, result.get(Grade.B));
        assertEquals(1, result.get(Grade.C));
    }

    @Test
    void testExercise15EmptyList() {
        ArrayList<Grade> grades =
                new ArrayList<>();

        HashMap<Grade, Integer> result =
                CollectionsExercises.exercise15_countGrades(grades);

        assertTrue(result.isEmpty());
    }
}