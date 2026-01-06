package Sixth;

class CustomArrlist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    // constructor
    CustomArrlist() {
        this.data = new int[DEFAULT_SIZE];
    }

    // add element
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    // remove last element
    public int remove() {
        if (size == 0) {
            throw new RuntimeException("List is empty!");
        }
        int removed = data[--size];
        return removed;
    }

    // get element by index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    // set element at index
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        data[index] = value;
    }

    // return current size
    public int size() {
        return size;
    }

    // check if array is full
    private boolean isFull() {
        return size == data.length;
    }

    // resize internal array
    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < size; i++) { // copy only existing elements
            temp[i] = data[i];
        }
        data = temp; // update reference
    }

    // display all elements
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class CustomArrayList {
    public static void main(String[] args) {
        CustomArrlist list = new CustomArrlist();

        list.add(10);
        list.add(20);
        list.add(30);
        // list.add("Abc");

        System.out.println("Element at index 1: " + list.get(1)); // 20

        list.set(1, 200);
        System.out.println("After set: " + list.get(1)); // 200

        list.printList(); // 10 200 30 

        list.remove(); // removes last (30)
        list.printList(); // 10 200
    }
}
