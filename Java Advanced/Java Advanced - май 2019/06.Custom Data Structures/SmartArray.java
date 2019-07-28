import java.util.function.Consumer;

public class SmartArray {


    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity =  INITIAL_CAPACITY;
    }


    public void add(int element){
        if(this.size == this.capacity){
            this.resize();
        }
        this.data[this.size] = element;
        this.size++;
    }


    public void add(int index, int element){
        this.validIndex(index);
        if (this.size >= this.capacity) {
            this.resize();
        }
        size++;
        this.shiftRight(index);
        this.data[index] = element;
    }


    public int get(int index) {
        this.validIndex(index);
        return this.data[index];
    }


    public boolean contains(int element){
        for (int i = 0; i <this.size ; i++) {
            if (this.data[i] == element){
                return true;
            }
        }
        return false;
    }


    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i <this.size ; i++) {
            consumer.accept(this.data[i]);
        }
    }


    public int remove(int index){
        this.validIndex(index);
        
        int element = this.data[index];
        this.shiftLeft(index);
        this.size--;
        if(this.size <= capacity / 4){
            this.shrink();
        }
        return element;
    }


    private void shrink() {
        this.capacity /= 2;
        int[] newData = new int[this.capacity];
        System.arraycopy(this.data, 0, newData, 0, this.size);
        this.data = newData;
    }


    private void shiftRight(int index) {
        for (int i = this.size - 1; i < index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }


    private void shiftLeft(int index) {
        for (int i = index; i > this.size - 1 ; i++) {
            this.data[i] = this.data[i+1];
        }
        this.data[this.size - 1] = 0;
    }

  
    private void resize(){
        this.capacity *= 2;
        int[] newData = new int[this.capacity];
        System.arraycopy(this.data,0,newData,0,this.size);
        this.data = newData;
    }

    
    private void validIndex(int index){
        if(index < 0 || index >=this.size ){
            throw new IndexOutOfBoundsException("Wrong input!");
        }
    }
}
