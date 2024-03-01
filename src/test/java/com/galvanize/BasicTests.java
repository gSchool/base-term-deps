package com.galvanize;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTests {
    @Test
    void colorizedOutput() {
        Basic basic = new Basic();
        String response = basic.blue("Hello");
        Assertions.assertEquals("\u001B[34mHello\u001B[0m", response);
    }
}
