package chapter5.ch04;

import chapter5.ch02.MyArray;

public class MyArrayStack {
    MyArray arrayStack;
    int top;

    public MyArrayStack(){
        top=0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        top=0;
        arrayStack = new MyArray(size);
    }

    public void push(int data){
        if(isFull()){
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop(){
        if(isEmpty()){
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek(){
        if(isEmpty()){
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top-1);
    }

    public boolean isFull(){
        if(top == arrayStack.ARRAY_SIZE){
            System.out.println("stack is full");
            return true;
        }else{
            return false;
        }
    }

    public int getSize()
    {
        return top;
    }

    public boolean isEmpty(){
        if(top == 0){
            System.out.println("stack is empty!!");
            return true;
        }else{
            return false;
        }
    }

    public void printAll()
    {
        arrayStack.printAll();
    }
}

