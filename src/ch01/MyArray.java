package ch01;

public class MyArray {
    int[] intArr; //int array
    int count;    //개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray(){
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num){
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }
}
