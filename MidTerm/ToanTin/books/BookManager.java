package oop.books;

public class BookManager {
    private MyList books;

    /**
     * Khởi tạo dữ liệu cho BookManager.
     */
    public BookManager(MyList data) {
        books = data;
    }

    /**
     * Lấy ra danh sách các sách được sắp xếp theo thứ tự title.
     * Chú ý, không thay đổi thứ tự sách trong danh sách gốc.
     *
     * @param order
     * @return danh sách các sách đã được sắp xếp.
     */
    public MyList sortByTitle(boolean order) {
        MyList sortedBooks = new MyArrayList();

        for (int i = 0; i < books.size(); i++) {
            sortedBooks.append(books.get(i));
        }


        for (int i = 0; i < sortedBooks.size() - 1; i++) {
            for (int j = i + 1; j < sortedBooks.size(); j++) {
                Book left = (Book) sortedBooks.get(i);
                Book right = (Book) sortedBooks.get(j);
                if (order) {
                    if (left.compareToByTittle(right) > 0) {
                        sortedBooks.set(right, i);
                        sortedBooks.set(left, j);
                    }
                } else {
                    if (left.compareToByTittle(right) < 0) {
                        sortedBooks.set(right, i);
                        sortedBooks.set(left, j);
                    }
                }
            }
        }

        return sortedBooks;
    }

    /**
     * Lấy ra danh sách các sách được sắp xếp theo pages.
     * Chú ý, không thay đổi thứ tự sách trong danh sách gốc.
     *
     * @param order
     * @return danh sách các sách đã được sắp xếp.
     */
    public MyList sortByPageNumber(boolean order) {
        MyList sortedBooks = books;

        for (int i = 0; i < sortedBooks.size(); i++) {
            for (int j = i + 1; j < sortedBooks.size(); j++) {
                Book left = (Book) sortedBooks.get(i);
                Book right = (Book) sortedBooks.get(j);
                if (left.compareToByPage(right) > 0 == order) {
                    sortedBooks.set(right, i);
                    sortedBooks.set(left, j);
                }
            }
        }
        return sortedBooks;
    }
}
