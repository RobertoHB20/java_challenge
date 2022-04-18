package Patterns.Behavior.Mediator.Exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ConcreteMediatorTest {

    ConcreteMediator mediator;
    Lampara lampara;
    Tele tv;

    @BeforeAll
    public void init(){
        mediator = new ConcreteMediator();
        lampara = new Lampara(mediator);
        tv = new Tele(mediator);

        mediator.setTv(tv);
        mediator.setLampara(lampara);
    }

    @Test
    @DisplayName("Test turn off tv")
    public void TestTurningOffTv(){
        assertEquals("TV apagada", tv.apagar());
    }

    @Test
    @DisplayName("Test turn on tv")
    public void TestTurningOnTv(){
        assertEquals( "TV encendida", tv.endender() );
    }

    @Test
    @DisplayName("Test turn off Lamp")
    public void TestTurningOffLamp(){
        assertEquals("Lampara apagada", lampara.apagar());
    }

    @Test
    @DisplayName("Test turn on Lamp")
    public void TestTurningOnLamp(){
        assertEquals( "Lampara encendida", lampara.endender() );
    }

}