package chapter5.ch02;

/**
 * 배열구현하기
 */
public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray(){
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num){
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num){
        int i;
        if(position < 0 || position > count){
            return;
        }
        if(count >= ARRAY_SIZE){
            return;
        }
        for( i = count -1; i>= position; i++){
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num;
        count++;
    }

    public int removeElement(int position){
        int ret = ERROR_NUM;
        if(isEmpty()){
            System.out.println("Array is Empty!!");
            return ret;
        }

        if( position < 0 || position > count-1 ){
            return ret;
        }
        ret = intArr[position];
        for(int i = position; i < count-1; i++){
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }

    public boolean isEmpty(){
        if(count == 0){
            return true;
        }else{
            return false;
        }
    }

}
