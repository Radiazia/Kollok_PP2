import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    void turn() throws Exception {
        assertThrows(Exception.class, () -> { new State_Turned().Close(null); });
        Program program = new Program();
        assertFalse(program.IsTurned());
        program.Turn();
        assertTrue(program.IsTurned());
    }

    @Test
    void open() throws Exception {
        Program program = new Program();
        assertThrows(Exception.class, () -> { new State_Opened().Open(null); });
        program.Close();
        assertFalse(program.IsOpened());
        program.Open();
        assertTrue(program.IsOpened());
    }

    @Test
    void close() throws Exception {
        assertThrows(Exception.class, () -> { new State_Closed().Close(null); });
        Program program = new Program();
        assertFalse(program.IsClosed());
        program.Close();
        assertTrue(program.IsClosed());
    }

    @Test
    void doThis() {
        State state_opened = new State_Opened();
        State state_turned = new State_Turned();
        State state_closed = new State_Closed();
        assertEquals("Program is opened", state_opened.DoThis());
        assertEquals("Program is turned", state_turned.DoThis());
        assertEquals("Program is closed", state_closed.DoThis());
    }

    @Test
    void isOpened() {
        assertTrue(new State_Opened().IsOpened());
        assertFalse(new State_Turned().IsOpened());
        assertFalse(new State_Closed().IsOpened());
    }

    @Test
    void isTurned() {
        assertFalse(new State_Opened().IsTurned());
        assertTrue(new State_Turned().IsTurned());
        assertFalse(new State_Closed().IsTurned());
    }

    @Test
    void isClosed() {
        assertFalse(new State_Opened().IsClosed());
        assertFalse(new State_Turned().IsClosed());
        assertTrue(new State_Closed().IsClosed());
    }
}