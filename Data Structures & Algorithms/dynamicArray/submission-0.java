class DynamicArray {
    int size = 0;
    int[] arr;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        int n1 = arr.length;
        if (n1 == size) {
            resize();
        }
        if (arr.length > size) {
            arr[size] = n;
            size++;
        }
    }

    public int popback() {
        int n = arr[size - 1];
        size--;
        return n;
    }

    private void resize() {
        int n1 = arr.length;
        int[] arr1 = new int[n1 * 2];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr = arr1;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
