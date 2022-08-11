package learn_interface;

public interface FixedStack {
    void push(int item);
    int pop(int item);

}

class FixedStackImpl implements FixedStack {
    int[] stack;
    int[] result = new int[stack.length];
    int pointer;

    public FixedStackImpl(int size) {
        stack = new int[size];
        pointer=-1;
    }

    /**
     * @param item
     */
    @Override
    public void push(int item) {
        if(pointer == stack.length-1){
            int[] temp = new int[stack.length*2];
            for(int i=0; i<stack.length; i++)
                temp[i] = stack[i];
                stack = temp;
                stack[++pointer] = item;
        }
        else
            stack[++pointer] = item;
    }

    /**
     * @param item
     * @return
     */
    @Override
    public int pop(int item) {
        if(pointer<0) {
            System.out.println("Stack is underFlow");
            return 0;
        }
        return stack[pointer--];
    }
}

class TestImpl implements FixedStack{

    /**
     * @param item
     */
    @Override
    public void push(int item) {

    }

    /**
     * @param item
     * @return
     */
    @Override
    public int pop(int item) {
        return 0;
    }
}
class TestStack{
    public static void main(String[] args){
        FixedStack fixedStack = new FixedStackImpl(3);
        fixedStack.push(3);
        fixedStack.push(2);
        fixedStack.push(1);
        fixedStack.push(3);
        fixedStack.push(3);

    }
}
