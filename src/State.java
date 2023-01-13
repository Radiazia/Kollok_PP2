public abstract class State implements Comparable<State> {
    abstract public void Turn(Program program) throws Exception;
    abstract public void Open(Program program) throws Exception;
    abstract public void Close(Program program) throws Exception;
    abstract public boolean IsOpened();
    abstract public boolean IsTurned();
    abstract public boolean IsClosed();
    abstract public String DoThis();
}