package Patterns.Behavior.Template.Excercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GameTest {

    Game chess;
    Game soccer;

    @BeforeAll
    public void init(){
        chess = new Chess();
        soccer = new Soccer();
    }

    @Test
    @DisplayName("Test soccer init")
    public void TestInitSoccer(){
        assertEquals( "Reune dos equipos de 11 jugadores", soccer.initialize() );
    }

    @Test
    @DisplayName("Test soccer start")
    public void TestSoccerStart(){
        assertEquals( "Se realiza un volado", soccer.start() );
    }

    @Test
    @DisplayName("Test soccer end")
    public void TestSoccerEnd(){
        assertEquals( "Gana el equipo con mas goles", soccer.end() );
    }

    @Test
    @DisplayName("Test soccer play")
    public void TestSoccerPlay(){
        assertEquals( "El ganador del volado, hace el primer movimiento", soccer.play() );
    }

    @Test
    @DisplayName("Test chess init")
    public void TestInitChess(){
        assertEquals( "Se reune dos personas", chess.initialize() );
    }

    @Test
    @DisplayName("Test chess start")
    public void TestChessStart(){
        assertEquals( "Se determina quien obtiene las piezas blancas", chess.start() );
    }

    @Test
    @DisplayName("Test chess end")
    public void TestChessEnd(){
        assertEquals( "Gana el que realice jaque mate", chess.end() );
    }

    @Test
    @DisplayName("Test chess play")
    public void TestChessPlay(){
        assertEquals( "Inicia el que tenga las piezas blancas", chess.play() );
    }

}