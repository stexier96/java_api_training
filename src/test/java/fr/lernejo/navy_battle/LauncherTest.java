package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LauncherTest {

    @Test
    void main() {
        Assertions.assertDoesNotThrow(() -> Launcher.main(new String[] { Integer.toString(8080) }));
    }
}
