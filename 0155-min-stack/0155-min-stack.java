
class MinStack {
    Stack<Long> st = new Stack<>();
    long mini = Long.MAX_VALUE;

    public MinStack() {

    }

    public void push(int value) {
        long val = value;

        if (st.isEmpty()) {
            st.push(val);
            mini = val;
        }
        else {
            if (val > mini) {
                st.push(val);
            }
            else {
                st.push(2 * val - mini);
                mini = val;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();

        if (x < mini) {
            mini = 2 * mini - x;
        }

        if (st.isEmpty()) {
            mini = Long.MAX_VALUE;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();

        if (x < mini) {
            return (int) mini;
        }

        return (int) x;
    }

    public int getMin() {
        return (int) mini;
    }
}
