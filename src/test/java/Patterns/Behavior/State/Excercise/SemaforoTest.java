package Patterns.Behavior.State.Excercise;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SemaforoTest {

    Semaforo semaforo;

    @BeforeAll
    public void setUp(){
        semaforo = new Semaforo();
    }

    @Test
    @DisplayName("Test semaforo is in green state")
    public void TestInitialStateIsGreen(){
        semaforo.setCurrentState( new EstadoVerde() );
        assertEquals("Puede avanzar", semaforo.mostrar());
    }

    @Test
    @DisplayName("Test semaforo is in yellow state")
    public void TestNewStateIsYellow(){
        semaforo.setCurrentState( new EstadoAmarillo() );
        assertEquals("Precaucion", semaforo.mostrar());
    }

    @Test
    @DisplayName("Test semaforo is in red state")
    public void TestNewStateIsRed(){
        semaforo.setCurrentState( new EstadoRojo() );
        assertEquals("¡Alto!", semaforo.mostrar());
    }


}