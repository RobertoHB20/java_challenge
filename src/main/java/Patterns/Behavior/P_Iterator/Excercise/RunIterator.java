package Patterns.Behavior.P_Iterator.Excercise;

public class RunIterator {

    public static void main(String[] args) {
        Operations operation_1 = new Operations(" test * 45 + test2 * 16 + test3 * 2");
        Operations operation_2 = new Operations(" algo * 45 + algo2 * 16 + algo3 * 2");

        List list1 = new OperationsList(operation_1);
        List list2 = new OperationsList(operation_2);
        IIterator iterator1 = list1.iterator();
        IIterator iterator2 = list2.iterator();

        System.out.println("--------   PRIMERO    ------");
        while (iterator1.hasNext()){
            System.out.println( iterator1.next() );
        }

        System.out.println("\n--------   SEGUNDO    ------");
        while (iterator2.hasNext()){
            System.out.println( iterator2.next() );
        }

    }
}
