package Patterns.Behavior.P_Iterator.Excercise;

public class OperationsList implements List{

    private Operations operations;

    public OperationsList(Operations operations) {
        this.operations = operations;
    }

    @Override
    public IIterator iterator() {
        return new OperationsIterator(this.operations);
    }
}
