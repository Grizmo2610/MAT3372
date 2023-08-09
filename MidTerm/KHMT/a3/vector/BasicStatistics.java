package a3.vector;

import java.util.HashMap;
import java.util.Map;

public class BasicStatistics {
    private MyVector[] vectors;

    public static void main(String[] args) {
        System.out.println("Test Array Vector!");
        testArrayVector();

        System.out.println();

        System.out.println("Test List Vector!");
        testListVector();

        System.out.println();

        System.out.println("Test simple static!");
        doSimpleStatic();
        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Viết các hàm testArrayVector để test các chứ năng của array vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...
           - Viết các hàm testListVector để test các chứ năng của list vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...

         II. Thực hiện thống kê đơn giản với các vector
           - Tạo ra ít nhất 10 vector và cho vào mảng vectors để quản lý. Trong đó có ít nhất 2 nhóm các vector
             có chuẩn bằng nhau.
           - Tìm và in ra thông tin chuẩn nhó nhất, chuẩn lớn nhất của các vector.
           - In ra các vector có chuẩn sắp xếp theo thứ tự tăng dần, giản dần.
           - In ra các vector có chuẩn nằm trong một đoạn [a, b] cho trước.
           - In ra rank của các vector theo thứ tự trong mảng vectors.

         III. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt) và nộp cùng source code.
         */
    }

    public static void testArrayVector() {
        MyArrayVector vector = new MyArrayVector();
        vector.insert(1);
        vector.insert(2);
        vector.insert(3);
        vector.insert(4);

        MyArrayVector another = new MyArrayVector();
        another.insert(4);
        another.insert(5);
        another.insert(6);


        System.out.println("Test insert: " + vector);

        vector.remove(3);
        System.out.println("Test remove last: " + vector);

        System.out.println("Test norm: " + vector.norm());

        System.out.println("Test scale: " + vector.scale(5));

        System.out.println("Test add: " + vector.add(5));

        System.out.println("Test minus: " + vector.minus(5));

        System.out.println("Test pow: " + vector.pow(2));

        System.out.println("Test add vector: " +vector.add(another));

        System.out.println("Test minus vector: " + vector.minus(another));
        /* TODO */
    }

    public static void testListVector() {
        MyListVector vector = new MyListVector();
        vector.insert(1);
        vector.insert(2);
        vector.insert(3);
        vector.insert(4);

        MyListVector another = new MyListVector();
        another.insert(4);
        another.insert(5);
        another.insert(6);


        System.out.println("Test insert: " + vector);

        vector.remove(3);
        System.out.println("Test remove last: " + vector);

        System.out.println("Test norm: " + vector.norm());

        System.out.println("Test scale: " + vector.scale(5));

        System.out.println("Test add: " + vector.add(5));

        System.out.println("Test minus: " + vector.minus(5));

        System.out.println("Test pow: " + vector.pow(2));

        System.out.println("Test add vector: " +vector.add(another));

        System.out.println("Test minus vector: " + vector.minus(another));
        /* TODO */
    }

    public BasicStatistics(MyVector[] vectors) {
        this.vectors = vectors;
    }

    public static void print(Object[] data){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] +" ");
        }
        System.out.println();
    }
    public static void print(double[] data){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] +" ");
        }
        System.out.println();
    }

    public double[] createNormArray(){
        double[] norms = new double[vectors.length];
        for (int i = 0; i < norms.length;i++){
            norms[i] = vectors[i].norm();
        }
        return norms;
    }

    public static void doSimpleStatic() {
        MyVector[] vec = new MyVector[10];
        for (int i = 0; i < 10; i++) {
            MyListVector vector = new MyListVector();
            for (int j = i; j < i + 3; j++) {
                vector.insert(j);
            }vec[i] = vector;
        }
        BasicStatistics statistics = new BasicStatistics(vec);

        System.out.println("Test create: ");
        print(statistics.vectors);

        double[] norms = statistics.createNormArray();

        System.out.println("Norm array: ");
        print(norms);

        System.out.println("Max norm: " + statistics.normMax());
        System.out.println("Min norm: " + statistics.normMin());
        System.out.println("Test sort ascending: ");
        print(statistics.sortNorm(true));
        System.out.println("Test sort descending: ");
        print(statistics.sortNorm(false));
        System.out.println("Test filter: ");
        print(statistics.filter(2,10));
        System.out.println("Test rank: ");
        print(statistics.rank());
        /* TODO */
    }



    /**
     * Lấy giá trị chuẩn lớn nhất trong các vector.
     * @return chuẩn lớn nhất.
     */
    public double normMax() {
        double[] norms = createNormArray();
        double max = norms[0];
        for (int i = 1; i < norms.length; i++)
            if (max < norms[i]){
                max = norms[i];
            }
        return max;
    }

    /**
     * Lấy giá trị chuẩn nhỏ nhất trong các vector.
     * @return chuẩn nhỏ nhất.
     */
    public double normMin() {
        double[] norms = createNormArray();
        double min = norms[0];
        for (int i = 1; i < norms.length; i++)
            if (min > norms[i]){
                min = norms[i];
            }
        return min;
    }

    /**
     * Lấy ra mảng các vector được sắp xếp theo thứ tự của chuẩn.
     * Nếu order là true thì mảng đầu ra là các vector có chuẩn tăng dần.
     * Nếu order là false thì mảng đầu ra là các vector có chuẩn giảm dần.
     * @return mảng các vector theo thứ tự mảng tăng dần.
     */
    public MyVector[] sortNorm(boolean order) {
        MyVector[] target = new MyVector[vectors.length];
        System.arraycopy(vectors, 0, target,0,vectors.length);

        for (int i = 0; i < target.length; i++){
            for (int j = 0; j < target.length - 1; j++){
                if (order){
                    if (target[j].norm() > target[j + 1].norm()){
                        MyVector temp1 = target[j];
                        target[j]  = target[j + 1];
                        target[j + 1] = temp1;
                    }
                }else {
                    if (target[j].norm() < target[j + 1].norm()){
                        MyVector temp1 = target[j];
                        target[j]  = target[j + 1];
                        target[j + 1] = temp1;
                    }
                }
            }
        }

        return target;
    }

    /**
     * Lọc ra mảng các vector có chuẩn năm trong đoạn [from, to].
     * @param from
     * @param to
     * @return các vector có chuẩn nằm trong đoạn [from, to]
     */
    public MyVector[] filter(int from, int to) {
        MyVector[] temp = new MyVector[vectors.length];
        int count = 0;
        for (int i = 0; i < temp.length; i++){
            if (vectors[i].norm() >= from && vectors[i].norm() <= to){
                temp[count] = vectors[i];
                count++;
            }
        }
        MyVector[] target = new MyVector[count];
        System.arraycopy(temp,0,target,0, count);
        return target;
    }

    /**
     * Lấy ra thông tin rank của các vector trong mảng theo chuẩn.
     * Rank được tính theo quy luật sau, ví dụ
     *   - tập [3 1 4] có rank [2.0 1.0 3.0]
     *   - tập [3 1 3 5] có các rank [2.5 1.0 4.0] (các phần tử có giá trị bằng nhau có rank
     *     được tính bằng trung bình các chỉ số của các phần tử trong tập dữ liệu, chỉ sổ bắt
     *     đầu là 1)
     * @return
     */
    public double[] rank() {
        MyVector[] target = sortNorm(true);

        Map<Double, Double> rankMap = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            double value = target[i].norm();
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, (double) (i + 1));
            } else {
                double previousRank = rankMap.get(value);
                double currentRank = (previousRank + (double) (i + 1)) / 2.0;
                rankMap.put(value, currentRank);
            }
        }


        double[] result = new double[target.length];
        for (int i = 0; i < target.length; i++) {
            double value = vectors[i].norm();
            result[i] = rankMap.get(value);
        }

        return result;
    }
}
