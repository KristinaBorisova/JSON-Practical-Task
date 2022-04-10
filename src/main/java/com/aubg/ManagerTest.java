package com.aubg;

import com.aubg.CORE.Manager;
import com.aubg.UI.ConsoleMessages;
import com.aubg.UI.UI_Manager;
import com.aubg.UI.UI_ManagerImplementation;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private UI_ManagerImplementation uiManager;
    private ConsoleMessages msgManager;

    @BeforeEach
    void setUp() throws IOException, ParseException {
        Manager manager = new Manager ();
        UI_ManagerImplementation uiManager = new UI_ManagerImplementation ();
    }


    @Test
    void demoTestMethod() {
        assertTrue (true);
    }

//    @Test
//    void testCorrectAbsoluteFilePath() {
//        String correctfilePath = "C:\\Users\\User\\Desktop\\Spring 2022 SENIOR YEAR\\Interviews\\Mentormate-Practical-Task\\target\\classes\\DataFile.json";
//        uiManager.getPath_JSON_File ();
//    }
}