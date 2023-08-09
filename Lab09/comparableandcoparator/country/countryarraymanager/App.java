package comparableandcoparator.country.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        System.out.println("testOriginalData: ");
        testOriginalData();


        System.out.println("testSortDecreasingByArea: ");
        testSortDecreasingByArea();

        System.out.println("testSortIncreasingByArea: ");
        testSortIncreasingByArea();

        System.out.println("testSortDecreasingByGdp: ");
        testSortDecreasingByGdp();

        System.out.println("testSortIncreasingByGdp: ");
        testSortIncreasingByGdp();

        System.out.println("testSortDecreasingByPopulation: ");
        testSortDecreasingByPopulation();

        System.out.println("testSortIncreasingByPopulation: ");
        testSortIncreasingByPopulation();


        System.out.println("testFilterAsiaCountry: ");
        testFilterAsiaCountry();

        System.out.println("testFilterAfricaCountry");
        testFilterAfricaCountry();

        System.out.println("testFilterEuropeCountry");
        testFilterEuropeCountry();

        System.out.println("testFilterNorthAmericaCountry");
        testFilterNorthAmericaCountry();

        System.out.println("testFilterOceaniaCountry");
        testFilterOceaniaCountry();

        System.out.println("testFilterSouthAmericaCountry");
        testFilterSouthAmericaCountry();

        System.out.println("testFilterMostPopulousCountries: ");
        testFilterMostPopulousCountries();

        System.out.println("testFilterLeastPopulousCountries: ");
        testFilterLeastPopulousCountries();

        System.out.println("testFilterHighestGdpCountries: ");
        testFilterHighestGdpCountries();

        System.out.println("testFilterLowestGdpCountries: ");
        testFilterLowestGdpCountries();

        System.out.println("testFilterLargestAreaCountries: ");
        testFilterLargestAreaCountries();

        System.out.println("testFilterSmallestAreaCountries: ");
        testFilterSmallestAreaCountries();

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);

                Country country;
                if (continent.equals("Africa")) {
                    country = new AfricaCountry(code, name, population, area, gdp);
                } else if (continent.equals("Asia")) {
                    country = new AsiaCountry(code, name, population, area, gdp);
                } else if (continent.equals("Europe")) {
                    country = new EuropeCountry(code, name, population, area, gdp);
                } else if (continent.equals("North America")) {
                    country = new NorthAmericaCountry(code, name, population, area, gdp);
                } else if (continent.equals("Oceania")) {
                    country = new OceaniaCountry(code, name, population, area, gdp);
                } else if (continent.equals("South America")) {
                    country = new SouthAmericaCountry(code, name, population, area, gdp);
                } else {
                    continue; // Skip unknown continent
                }

                countryManager.append(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
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

    public static void init() {
        String filePath = "C:\\HoangTu\\OOP\\Lab09\\src\\comparableandcoparator\\country\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);

    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }
}
