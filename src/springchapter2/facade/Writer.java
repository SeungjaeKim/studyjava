package springchapter2.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s로 연결 합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s로 연결 종료 합니다.", fileName);
        System.out.println(msg);
    }

    public void write(){
        String msg = String.format("Writer %s로 파일쓰기 합니다.", fileName);
        System.out.println(msg);
    }
}
