package utils;

public class StateOfEmulatorSession {
    private static boolean stateEmulator;
    private StateOfEmulatorSession(){
        throw new IllegalStateException("Utility class");
    }

    public static boolean isStateEmulator() {
        return stateEmulator;
    }

    public static void setStateEmulator(boolean stateEmulator) {
        StateOfEmulatorSession.stateEmulator = stateEmulator;
    }
}
