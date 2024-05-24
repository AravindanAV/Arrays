package Arrayzz.src.java9;

import java.util.Optional;

public class ProcessEX {
    public static void main(String[] args) {
        Optional<ProcessHandle> otp=ProcessHandle.of(8992);
        ProcessHandle hand = otp.get();
        ProcessHandle.Info info = hand.info();
        System.out.println(info.user().get());
    }
}
