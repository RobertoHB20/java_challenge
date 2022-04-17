package Patterns.Behavior.Memento.Excecise;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RunMementoTest {

    Caretaker caretaker;
    Originator originator;
    @BeforeAll
    void setUp() {
        caretaker = new Caretaker();
        originator = new Originator("Roberto", "");
        caretaker.setMemeneto(originator.createMemento());
    }

    @Test
    @Order(1)
    @DisplayName("Verify memento was added to caretaker")
    public void TestMementoWasAdded(){
        assertTrue( 0 < caretaker.getMementosSize() );
    }

    @Test
    @Order(2)
    @DisplayName("Verify memento values are correct")
    public void TestToVerifyIntitalValuesAreStored(){
        Memento m = caretaker.getMemento(0);
        assertEquals( "Roberto ", m.getNombre() + " " + m.getApellido());
    }

    @Test
    @Order(3)
    @DisplayName("Verify new memento was added")
    public void TestNewMementoWasAdded(){
        originator.setApellido( originator.getApellido() + " Hernandez" );
        caretaker.setMemeneto( originator.createMemento() );
        Memento m = caretaker.getMemento(1);
        assertEquals( "Roberto Hernandez", m.getNombre() + m.getApellido() );
    }

    @Test
    @Order(4)
    @DisplayName("Test it can undo changes")
    public void TestRollBackMemento(){
        System.out.println(originator);
        originator.restoreMemento( caretaker.getMemento(0) );

        assertEquals( "Roberto", originator.getNombre() + originator.getApellido());
    }







}