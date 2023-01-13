public class State_Closed extends State {

    @Override
    public void Turn(Program program) throws Exception {
        if (program == null) {
            throw new Exception("Program == null");
        }
        program.state = new State_Turned();
    }

    @Override
    public void Open(Program program) throws Exception {
        if (program == null) {
            throw new Exception("Program == null");
        }
        program.state = new State_Opened();
    }

    @Override
    public void Close(Program program) throws Exception {
        if (program == null) {
            throw new Exception("Program == null");
        }
        return;
    }

    @Override
    public boolean IsOpened() {
        return false;
    }

    @Override
    public boolean IsTurned() {
        return false;
    }

    @Override
    public boolean IsClosed() {
        return true;
    }

    @Override
    public String DoThis() {
        String string = new String("Program is closed");
        System.out.println(string);
        return string;
    }

    @Override
    public int compareTo(State state) {
        if (state.IsClosed()) return 0;
        return -1;
    }
}