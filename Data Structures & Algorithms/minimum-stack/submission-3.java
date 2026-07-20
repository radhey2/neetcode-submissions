class MinStack {
    int[] arr;
    int[] minArray;
    int n = 10;
    int size = 0;

    public MinStack() {
        this.arr = new int[n];
        this.minArray = new int[arr.length];
    }

    public void push(int val) {
        if (arr.length <= size) {
            int[] arr2 = new int[arr.length * 2];
            int[] arr3 = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
                arr3[i] = minArray[i];
            }
            arr = arr2;
            minArray = arr3;
        }
        int previousMin;
        arr[size] = val;
        if (size == 0) {
            minArray[size] = val;
            previousMin = val;
        } else {
            int newMin = Integer.MAX_VALUE;
            previousMin = minArray[size-1];

            if (previousMin > val) {
                newMin = Math.min(val, previousMin);
            }
            minArray[size] = Math.min(previousMin, val);
        }
        size++;
    }

    public void pop() {
        size--;
    }

    public int top() {
        return arr[size - 1];
    }

    public int getMin() {
        return minArray[size - 1];
    }
}
