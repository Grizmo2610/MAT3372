package countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .build();

                CountryListManager.getInstance()
                        .append(CountryFactory.getInstance().createCountry(dataList.get(5), newCountryData));
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
            result.addAll(Arrays.asList(splitData));
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
        System.out.println("Test Original Data: ");
        testOriginalData();

        System.out.println();

        System.out.println("Test Sort Population Increasing: ");
        testSortPopulationIncreasing();

        System.out.println();

        System.out.println("Test Sort Population Decreasing: ");
        testSortPopulationDecreasing();

        System.out.println();

        System.out.println("Test Sort Area Increasing: ");
        testSortAreaIncreasing();

        System.out.println();

        System.out.println("Test sort Area Decreasing: ");
        testSortAreaDecreasing();

        System.out.println();

        System.out.println("Test sort GDP Increasing: ");
        testSortGdpIncreasing();

        System.out.println();

        System.out.println("Test sort GDP Decreasing: ");
        testSortGdpDecreasing();

        System.out.println();

        System.out.println("Test Filter Continent (Asia): ");
        testFilterContinent();

        System.out.println();

        System.out.println("Test Filter Countries Most Populous: ");
        testFilterCountriesMostPopulous();

        System.out.println();

        System.out.println("Test Filter Countries Least Populous: ");
        testFilterCountriesLeastPopulous();

        System.out.println();

        System.out.println("Test Filter Countries Largest Area: ");
        testFilterCountriesLargestArea();

        System.out.println();

        System.out.println("Test Filter Countries Smallest Area: ");
        testFilterCountriesSmallestArea();

        System.out.println();

        System.out.println("Test Filter Countries Highest GDP: ");
        testFilterCountriesHighestGdp();

        System.out.println();

        System.out.println("Test Filter Countries Lowest GDP: ");
        testFilterCountriesLowestGdp();
    }

    public static void init() {
        String filePath = "src/countrylistmanager/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String codes = CountryListManager.codeOfCountriesToString(CountryListManager.getInstance().getCountryList());
        System.out.println(codes);
    }

    public static void testSortPopulationIncreasing() {
        String codes = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().sortPopulationIncreasing());
        System.out.println(codes);
    }

    public static void testSortPopulationDecreasing() {
        String codes = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().sortPopulationDecreasing());
        System.out.println(codes);
    }

    public static void testSortAreaIncreasing() {
        String codes = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().sortAreaIncreasing());
        System.out.println(codes);
    }

    public static void testSortAreaDecreasing() {
        String codes = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().sortAreaDecreasing());
        System.out.println(codes);
    }

    public static void testSortGdpIncreasing() {
        String codes = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().sortGdpIncreasing());
        System.out.println(codes);
    }

    public static void testSortGdpDecreasing() {
        String codes = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().sortGdpDecreasing());
        System.out.println(codes);
    }

    public static void testFilterContinent() {
        String codes = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().filterContinent("Asia"));
        System.out.println(codes);
    }

    public static void testFilterCountriesMostPopulous() {
        String codeString = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().filterCountriesMostPopulous(5));
        System.out.println(codeString);
    }

    public static void testFilterCountriesLeastPopulous() {
        String codeString = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().filterCountriesLeastPopulous(5));
        System.out.println(codeString);
    }

    public static void testFilterCountriesLargestArea() {
        String codeString = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().filterCountriesLargestArea(5));
        System.out.println(codeString);
    }

    public static void testFilterCountriesSmallestArea() {
        String codeString = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().filterCountriesSmallestArea(5));
        System.out.println(codeString);
    }

    public static void testFilterCountriesHighestGdp() {
        String codeString = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().filterCountriesHighestGdp(5));
        System.out.println(codeString);
    }

    public static void testFilterCountriesLowestGdp() {
        String codeString = CountryListManager
                .codeOfCountriesToString(CountryListManager.getInstance().filterCountriesLowestGdp(5));
        System.out.println(codeString);
    }

}
