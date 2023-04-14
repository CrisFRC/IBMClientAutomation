package utils;

public class StateOfMyExtraSession {
    private static boolean stateEmulator;
    private StateOfMyExtraSession(){
        throw new IllegalStateException("Utility class");
    }

    public static boolean isStateEmulator() {
        return stateEmulator;
    }

    public static void setStateEmulator(boolean stateEmulator) {
        StateOfMyExtraSession.stateEmulator = stateEmulator;
    }
}
