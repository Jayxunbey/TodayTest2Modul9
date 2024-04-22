package calculater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculaterAppTest {

    CalculaterApp calculaterApp;

    @BeforeEach
    void setUp() {
        calculaterApp = new CalculaterApp();
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 2, 6, 2, 6})
    void sum(int a) {
        Assertions.assertEquals(4,calculaterApp.sum(a,a));
    }

    @MethodSource("getStream")
    @ValueSource(ints = {4, 5, 6, 7, 6})
    void sum2(CalculaterApp.TestArguments testArguments) {
        Assertions.assertEquals(3,calculaterApp.sum(testArguments.a,testArguments.b));
    }



}