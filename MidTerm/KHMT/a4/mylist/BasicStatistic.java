package a4.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho a4.mylist.a4.statistics.BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        try{
            double temp = (double) data.get(0);
        }catch (NumberFormatException e){
            System.out.println("Data is not number!");
            return -1;
        }

        double max = (double) data.get(0);
        for (int i = 0; i < data.size(); i++){
            if (max < (double) data.get(i)){
                max = (double) data.get(i);
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        try{
            double temp = (double) data.get(0);
        }catch (NumberFormatException e){
            System.out.println("Data is not number!");
            return -1;
        }

        double min = (double) data.get(0);
        for (int i = 0; i < data.size(); i++){
            if (min > (double) data.get(i)){
                min = (double) data.get(i);
            }
        }
        return min;
    }


    private double sum(){
        double sum = 0;
        for (int i = 0; i < data.size(); i++){
            sum += (double) data.get(i);
        }return sum;
    }
    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        try{
            double temp = (double) data.get(0);
        }catch (NumberFormatException e){
            System.out.println("Data is not number!");
            return -1;
        }
        return sum() / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        try{
            double temp = (double) data.get(0);
        }catch (NumberFormatException e){
            System.out.println("Data is not number!");
            return -1;
        }

        double mean = mean();
        double var = 0;
        for (int i = 0; i < data.size(); i++){
            var += ((double) data.get(i) - mean) * ((double) data.get(i) - mean);
        }

        return var / data.size();
    }
}
