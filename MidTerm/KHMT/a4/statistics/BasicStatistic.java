package a4.statistics;

import java.util.*;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        this.dataSet = new ArrayDataSet();
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    @Override
    public int size() {
        return dataSet.size();
    }

    @Override
    public double max() {
        double max =  dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++){
            if (max < dataSet.element(i)){
                max = dataSet.element(i);
            }
        }return max;
    }

    @Override
    public double min() {
        double min =  dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++){
            if (min > dataSet.element(i)){
                min = dataSet.element(i);
            }
        }return min;
    }

    private double sum(){
        double sum = 0;
        for (int i = 0; i < dataSet.size(); i++){
            sum += dataSet.element(i);
        }return sum;
    }

    @Override
    public double mean() {
        return sum()/dataSet.size();
    }

    @Override
    public double variance() {
        double mean = mean();
        double var = 0;
        for (int i = 0; i < dataSet.size(); i++){
            var += (dataSet.element(i) - mean) * (dataSet.element(i) - mean);
        }

        return var / dataSet.size();
    }

    public int count(double value){
        int count = 0;
        for (int i = 0; i < dataSet.size(); i++){
            if (dataSet.element(i) == value){
                count++;
            }
        }return count;
    }

    @Override
    public double[] rank() {
        double[] sortedData = dataSet.elements(0, dataSet.size() - 1);
        Arrays.sort(sortedData);

        Map<Double, Double> rankMap = new HashMap<>();
        for (int i = 0; i < sortedData.length; i++) {
            double value = sortedData[i];
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, (double) (i + 1));
            } else {
                double previousRank = rankMap.get(value);
                double currentRank = (previousRank + (double) (i + 1)) / 2.0;
                rankMap.put(value, currentRank);
            }
        }


        double[] result = new double[dataSet.size()];
        for (int i = 0; i < dataSet.size(); i++) {
            double value = dataSet.element(i);
            result[i] = rankMap.get(value);
        }

        return result;
    }


    @Override
    public double median() {
        double[] temp = dataSet.elements(0, dataSet.size() - 1);
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));

        int length = temp.length;
        if (length % 2 == 0) {
            return (temp[length / 2 - 1] + temp[length / 2]) / 2;
        }
        return temp[length / 2];
    }
}
