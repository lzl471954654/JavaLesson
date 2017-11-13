package Chapter2;

public class Run {
    public static void main(String[] args) {
        IntArray array = new IntArray();
        for(int i = 0;i<200;i++){
            array.add(i);
        }
        System.out.println(array.getLength());
    }
}

interface Array<T>{
    public void add(T data);
    public T get(int position);
    public int getLength();
    public void setElement(int position,T value);
}

class IntArray implements Array<Integer>{
    private static final int INITIAL_SIZE = 10;
    private int[] datas;
    private int next;
    public IntArray(){
        datas = new int[INITIAL_SIZE];
        next = 0;
    }
    @Override
    public void add(Integer data) {
        if(next==datas.length){
            int[] newData = new int[datas.length+datas.length/2];
            System.arraycopy(datas,0,newData,0,next);
            datas = newData;
            System.out.println("The array has already expanded,new size is "+datas.length);
        }
        datas[next] = data;
        next++;
    }

    @Override
    public void setElement(int position, Integer value) {
        checkOutOfBounds(position);
        datas[position] = value;
    }

    @Override
    public Integer get(int position) {
        checkOutOfBounds(position);
        return datas[position];
    }

    private void checkOutOfBounds(int position){
        if(position<0||position>datas.length-1)
            throw new ArrayIndexOutOfBoundsException("ArrayLength is "+datas.length+",position is "+position);
    }

    @Override
    public int getLength() {
        return next;
    }
}
