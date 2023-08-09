package hus.oop.studentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                Student newStudent = new Student.StudentBuilder(dataList.get(0))
                        .withFirstname(dataList.get(1))
                        .withLastname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();

                StudentManager.getInstance().append(newStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        System.out.println("Test Original Data");
        testOriginalData();

        System.out.println();

        System.out.println("Test Sort Year Of Birth Decreasing");
        testSortYearOfBirthDecreasing();

        System.out.println();

        System.out.println("Test Sort Year Of Birth Increasing");
        testSortYearOfBirthIncreasing();

        System.out.println();

        System.out.println("testSortMathsGradeDecreasing");
        testSortMathsGradeDecreasing();

        System.out.println();

        System.out.println("testSortMathsGradeIncreasing");
        testSortMathsGradeIncreasing();

        System.out.println();

        System.out.println("testSortChemistryGradeDecreasing");
        testSortChemistryGradeDecreasing();

        System.out.println();

        System.out.println("testSortChemistryGradeIncreasing");
        testSortChemistryGradeIncreasing();

        System.out.println();

        System.out.println("testSortPhysicsGradeIncreasing");
        testSortPhysicsGradeIncreasing();

        System.out.println();

        System.out.println("testSortPhysicsGradeDecreasing");
        testSortPhysicsGradeDecreasing();

        System.out.println();

        System.out.println("testFilterStudentsHighestMathsGrade");
        testFilterStudentsHighestMathsGrade();

        System.out.println();

        System.out.println("testFilterStudentsLowestMathsGrade");
        testFilterStudentsLowestMathsGrade();

        System.out.println();

        System.out.println("testFilterStudentsHighestChemistryGrade");
        testFilterStudentsHighestChemistryGrade();

        System.out.println();

        System.out.println("testFilterStudentsLowestChemistryGrade");
        testFilterStudentsLowestChemistryGrade();

        System.out.println();

        System.out.println("testFilterStudentsHighestPhysicsGrade");
        testFilterStudentsHighestPhysicsGrade();

        System.out.println();

        System.out.println("testFilterStudentsLowestPhysicsGrade");
        testFilterStudentsLowestPhysicsGrade();

        System.out.println();

        System.out.println("testFilterStudentsHighestAverageGrade");
        testFilterStudentsHighestAverageGrade();

        System.out.println();

        System.out.println("testFilterStudentsLowestAverageGrade");
        testFilterStudentsLowestAverageGrade();
    }

    public static void init() {
        String filePath = "src/hus/oop/studentmanager/data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String studentIds = StudentManager.idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortYearOfBirthDecreasing() {
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortMathsGradeIncreasing() {
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        String studentIdsString = StudentManager.idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortMathsGradeDecreasing() {
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        String studentIdsString = StudentManager.idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortPhysicsGradeIncreasing() {
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        String studentIdsString = StudentManager.idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortPhysicsGradeDecreasing() {
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        String studentIdsString = StudentManager.idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortChemistryGradeIncreasing() {
        List<Student> students = StudentManager.getInstance().sortChemistryGradeIncreasing();
        String studentIdsString = StudentManager.idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortChemistryGradeDecreasing() {
        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        String studentIdsString = StudentManager.idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHighestPhysicsGrade() {
        String codeString = StudentManager.idOfStudentsToString(StudentManager.getInstance().filterStudentsHighestPhysicsGrade(5));
        System.out.println(codeString);
    }

    public static void testFilterStudentsLowestPhysicsGrade() {
        String codeString = StudentManager.idOfStudentsToString(StudentManager.getInstance().filterStudentsLowestChemistryGrade(5));
        System.out.println(codeString);
    }

    public static void testFilterStudentsHighestChemistryGrade() {
        String codeString = StudentManager.idOfStudentsToString(StudentManager.getInstance().filterStudentsHighestChemistryGrade(5));
        System.out.println(codeString);
    }

    public static void testFilterStudentsLowestChemistryGrade() {
        String codeString = StudentManager.idOfStudentsToString(StudentManager.getInstance().filterStudentsLowestChemistryGrade(5));
        System.out.println(codeString);
    }

    public static void testFilterStudentsHighestAverageGrade() {
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> result = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            result.add(students.get(i));
        }

        String codeString = StudentManager.idOfStudentsToString(result);
        System.out.print(codeString);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        List<Student> result = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            result.add(students.get(i));
        }

        String codeString = StudentManager.idOfStudentsToString(result);
        System.out.print(codeString);
    }
}
