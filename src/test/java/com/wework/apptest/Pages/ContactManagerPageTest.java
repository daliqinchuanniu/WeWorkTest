package com.wework.apptest.Pages;

import com.wework.apptest.TestCase.APPTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerPageTest extends APPTestCase {

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        String name = MainPage.getInstance().gotoContactPage().gotoCMPage().add("Demo6").back().get("Demo6");

    }
}