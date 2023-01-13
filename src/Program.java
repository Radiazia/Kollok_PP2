public class Program {
    public State state;

    Program() {
        state = new State_Opened();
    }

    Program(State state1) {
        state = state1;
    }

    public void Turn() throws Exception {
        state.Turn(this);
    }

    public void Open() throws Exception {
        state.Open(this);
    }

    public void Close() throws Exception {
        state.Close(this);
    }

    public boolean IsOpened() {
        return state.IsOpened();
    }

    public boolean IsClosed() {
        return state.IsClosed();
    }

    public boolean IsTurned() {
        return state.IsTurned();
    }

    public void Do() {
        state.DoThis();
    }
}