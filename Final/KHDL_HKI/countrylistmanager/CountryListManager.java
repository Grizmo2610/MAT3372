package countrylistmanager;

import java.util.*;

public class CountryListManager {
    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        if (instance == null)
            instance = new CountryListManager();
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        countryList.add(country);
    }

    public void add(AbstractCountry country, int index) {
        countryList.add(index, country);
    }

    public void remove(int index) {
        countryList.remove(index);
    }

    public void remove(AbstractCountry country) {
        countryList.remove(country);
    }

    public AbstractCountry countryAt(int index) {
        return countryList.get(index);
    }

    public List<AbstractCountry> sortPopulationIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortPopulationDecreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return - (left.getPopulation() - right.getPopulation());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(left.getArea(), right.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaDecreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getArea(), left.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortGdpIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return -Double.compare(right.getGdp(), left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortGdpDecreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getGdp(), left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        List<AbstractCountry> result = new ArrayList<AbstractCountry>();
        for (int i = 0; i < countryList.size(); i++) {
            if (countryAt(i).getClass().toString().contains(continent)) {
                result.add(countryAt(i));
            }
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesMostPopulous(int howMany) {
        List<AbstractCountry> result = new ArrayList<AbstractCountry>();
        List<AbstractCountry> temp = sortPopulationDecreasing();

        for (int i = 0; i < temp.size() && i < howMany; i++) {
            result.add(temp.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesLeastPopulous(int howMany) {
        List<AbstractCountry> result = new ArrayList<AbstractCountry>();
        List<AbstractCountry> temp = sortPopulationIncreasing();

        for (int i = 0; i < temp.size() && i < howMany; i++) {
            result.add(temp.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesLargestArea(int howMany) {
        List<AbstractCountry> result = new ArrayList<AbstractCountry>();
        List<AbstractCountry> temp = sortAreaDecreasing();

        for (int i = 0; i < temp.size() && i < howMany; i++) {
            result.add(temp.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesSmallestArea(int howMany) {
        List<AbstractCountry> result = new ArrayList<AbstractCountry>();
        List<AbstractCountry> temp = sortAreaIncreasing();

        for (int i = 0; i < temp.size() && i < howMany; i++) {
            result.add(temp.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesHighestGdp(int howMany) {
        List<AbstractCountry> result = new ArrayList<AbstractCountry>();
        List<AbstractCountry> temp = sortGdpDecreasing();

        for (int i = 0; i < temp.size() && i < howMany; i++) {
            result.add(temp.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesLowestGdp(int howMany) {
        List<AbstractCountry> result = new ArrayList<AbstractCountry>();
        List<AbstractCountry> temp = sortGdpIncreasing();

        for (int i = 0; i < temp.size() && i < howMany; i++) {
            result.add(temp.get(i));
        }
        return result;
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
