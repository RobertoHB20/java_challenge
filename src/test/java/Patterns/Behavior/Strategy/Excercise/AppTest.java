package Patterns.Behavior.Strategy.Excercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AppTest {

    App appLogger;

    @Test
    @DisplayName("Test logger write on a file")
    public void TestLoggerWriteOnFile(){

        appLogger = new App( new FileLogger() );

        assertEquals( "Wrote on file: Test app logger", appLogger.run("Test app logger") );
    }

    @Test
    @DisplayName("Test logger write on console")
    public void TestLoggerWriteOnConsole(){
        appLogger = new App( new ConsoleLogger() );

        assertEquals( "Console: Test app console logger", appLogger.run( "Test app console logger" ) );
    }



}