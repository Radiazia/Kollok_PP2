public class State_Turned extends State {
    @Override
    public void Open(Program program) throws Exception {
        if (program == null) {
            throw new Exception("Program == null");
        }
        program.state = new State_Opened();
    }

    @Override
    public void Turn(Program program) throws Exception {
        if (program == null) {
            throw new Exception("Program == null");
        }
        return;
    }

    @Override
    public void Close(Program program) throws Exception {
        if (program == null) {
            throw new Exception("Program == null");
        }
        program.state = new State_Closed();
    }

    @Override
    public boolean IsOpened() {
        return false;
    }

    @Override
    public boolean IsTurned() {
        return true;
    }

    @Override
    public boolean IsClosed() {
        return false;
    }

    @Override
    public String DoThis() {
        String string = new String("Program is turned");
        System.out.println(string);
        return string;
    }

    @Override
    public int compareTo(State state) {
        if (state.IsTurned()) return 0;
        else return -1;
    }
}