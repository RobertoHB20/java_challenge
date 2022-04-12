package Patterns.Behavior.P_Iterator.Excercise;

public class OperationsIterator implements IIterator{

    private String[] operations;
    private int index;

    public OperationsIterator(Operations operations) {
        this.operations = operations.getOperations().split("\\+");
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(this.index < this.operations.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return operations[this.index++];
    }

    @Override
    public Object current() {
        return operations[this.index];
    }
}
