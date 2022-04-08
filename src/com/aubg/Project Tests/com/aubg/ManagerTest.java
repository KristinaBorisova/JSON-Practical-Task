package com.aubg;

import com.aubg.CORE.Manager;
import com.aubg.UI.UI_Manager;
import com.aubg.UI.UI_ManagerImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private UI_Manager uiManager;

    @BeforeEach
    void setUp() {
        Manager manager = new Manager ();
        UI_ManagerImplementation uiManager = new UI_ManagerImplementation ();
    }


    @Test
    void demoTestMethod() {
        assertTrue(true);
    }

    @Test
    void testFileLocation() {
        assertEquals(":::::Mentormate Challenge::::::\n" +
                        "::Monthly Performance Reports::", uiManager.getJSON_DataFile_Path (),
                "Welcome Message should appear");
    }



}