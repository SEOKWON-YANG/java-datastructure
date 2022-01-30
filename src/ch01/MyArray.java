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

    public void insertElement(int position, int num){
        int i;

        if(count >= ARRAY_SIZE){ //꽉 찬 경우
            System.out.println("not enough memory");
            return;
        }

        if(position < 0 || position > count){  //index error
            System.out.println("insert Error");
            return;
        }

        for(i = count -1; i>= position ; i --){
            intArr[i+1] = intArr[i];       // 하나씩 이동
        }

        intArr[position] = num;
        count++;
    }
}
