package com.rad.njavaio.oconsole;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import java.io.Console;
@PrepareForTest({Console.class,System.class})
public class ConsoleExampleTest {

    @Test
    public void test() {
        System systemMock= PowerMockito.mock(System.class);
        final Console consoleMock = PowerMockito.mock(Console.class);
        new NonStrictExpectations() {
            {
                System.console();
                result = consoleMock;

                consoleMock.readLine(anyString);
                result = "aUsername";

                consoleMock.readPassword(anyString);
                result = "aPassword";
            }
        };

        ConsoleExample.main(null);
    }
}
