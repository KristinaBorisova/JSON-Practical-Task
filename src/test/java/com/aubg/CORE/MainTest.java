package com.aubg.CORE;

import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void  testManagerInstanceOf() throws IOException, ParseException {
        Manager manager = new Manager ();
        assertTrue( manager instanceof  Manager);
    }
}