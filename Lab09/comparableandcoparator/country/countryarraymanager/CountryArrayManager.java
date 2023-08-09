package comparableandcoparator.country.countryarraymanager;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    public int minPopulation(Country[] coun, int start) {
        int minIndex = start;
        for (int i = start + 1; i <  this.length; i++) {
            if (coun[start].getPopulation() > coun[i].getPopulation())
                start = i;
        }
        return start;
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     * 
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < this.length; i++) {
            int index = minPopulation(newArray, i);
             Country temp = newArray[i];
             newArray[i] = newArray[index];
             newArray[index] = temp;
        }

        return newArray;
    }

    public int maxPopulation(Country[] coun , int start) {
        int minIndex = start;
        for (int i = start + 1; i <  this.length; i++) {
            if (coun[start].getPopulation() < coun[i].getPopulation())
                start = i;
        }
        return start;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * 
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length; i++) {
            int index = maxPopulation(newArray, i);
            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * 
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++)
            for (int j = i + 1; j < this.length; j++)
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * 
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++)
            for (int j = i + 1; j < this.length; j++)
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * 
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     * 
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        Country[] temp = new AfricaCountry[this.length];
        int index = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countryAt(i) instanceof AfricaCountry) {
                temp[index] = countryAt(i);
                index++;
            }
        }

        Country[] africaCountries = new AfricaCountry[index + 1];
        System.arraycopy(temp, 0, africaCountries, 0, index + 1);

        return (AfricaCountry[]) africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        Country[] temp = new AsiaCountry[this.length];
        int index = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countryAt(i) instanceof AsiaCountry) {
                temp[index] = this.countries[i];
                index++;
            }
        }

        Country[] asiaCountries = new AsiaCountry[index + 1];
        System.arraycopy(temp, 0, asiaCountries, 0, index + 1);

        return (AsiaCountry[]) asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        Country[] temp = new EuropeCountry[this.length];
        int index = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countryAt(i) instanceof EuropeCountry) {
                temp[index] = countryAt(i);
                index++;
            }
        }

        Country[] europeCountries = new EuropeCountry[index + 1];
        System.arraycopy(temp, 0, europeCountries, 0, index + 1);

        return (EuropeCountry[]) europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        Country[] temp = new NorthAmericaCountry[this.length];
        int index = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countryAt(i) instanceof NorthAmericaCountry) {
                temp[index] = countryAt(i);
                index++;
            }
        }

        Country[] northAmericaCountries = new NorthAmericaCountry[index + 1];
        System.arraycopy(temp, 0, northAmericaCountries, 0, index + 1);

        return (NorthAmericaCountry[]) northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        Country[] temp = new OceaniaCountry[this.length];
        int index = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countryAt(i) instanceof OceaniaCountry) {
                temp[index] = countryAt(i);
                index++;
            }
        }

        Country[] oceaniaCountries = new OceaniaCountry[index + 1];
        System.arraycopy(temp, 0, oceaniaCountries, 0, index + 1);

        return (OceaniaCountry []) oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        Country[] temp = new SouthAmericaCountry[this.length];
        int index = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countryAt(i) instanceof SouthAmericaCountry) {
                temp[index] = countryAt(i);
                index++;
            }
        }

        Country[] southAmericaCountries = new SouthAmericaCountry[index + 1];
        System.arraycopy(temp, 0, southAmericaCountries, 0, index + 1);

        return (SouthAmericaCountry []) southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] mostPopulousCountries = new Country[howMany];
        Country[] temp = sortByDecreasingPopulation();
        System.arraycopy(temp, 0, mostPopulousCountries, 0, howMany);
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] leastPopulousCountries = new Country[howMany];
        Country[] temp = sortByIncreasingPopulation();
        System.arraycopy(temp, 0, leastPopulousCountries, 0, howMany);
        return leastPopulousCountries;
    }



    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] larestAreaCountries = new Country[howMany];
        Country[] temp = sortByDecreasingArea();
        System.arraycopy(temp, 0, larestAreaCountries, 0, howMany);
        return larestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] smallestAreaCountries = new Country[howMany];
        Country[] temp = sortByIncreasingArea();
        System.arraycopy(temp, 0, smallestAreaCountries, 0, howMany);
        return smallestAreaCountries;
    }


    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] highestAreaCountries = new Country[howMany];
        Country[] temp = sortByDecreasingGdp();
        System.arraycopy(temp, 0, highestAreaCountries, 0, howMany);
        return highestAreaCountries;
    }


    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] highestAreaCountries = new Country[howMany];
        Country[] temp = sortByIncreasingArea();
        System.arraycopy(temp, 0, highestAreaCountries, 0, howMany);
        return highestAreaCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]\n";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.println(countriesString.toString().trim() + "]");
    }
}
