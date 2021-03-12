package chapter2.ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        //깊은 복사(각각의 객체를 다 새로 생성 한 후에 값을 복사. 기존 데이터가 변경 되어도 다른쪽이 변경 되지 않음)
        for(int i=0; i<copyLibrary.length; i++){
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        //얕은 복사 ( 주소값을 복사하여 실제 바라보는 데이터가 같음. 기존 데이터 하나를 수정하면 다른쪽도 함께 변경됨)
        //System.arraycopy(library,0, copyLibrary, 0, 5);
        library[0].setAuthor("박완서");
        library[0].setTitle("나목");
        System.out.println("========library=========");
        for(Book book : library){
            System.out.println(book);
        }

        System.out.println("========copy library=========");
        for(Book book : copyLibrary){
            System.out.println(book);
        }
    }

}
