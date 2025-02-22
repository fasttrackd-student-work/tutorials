package com.baeldung.asciiart;

import com.baeldung.asciiart.AsciiArt.Settings;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class AsciiArtIntegrationTest {

    @Test
    public void givenTextWithAsciiCharacterAndSettings_shouldPrintAsciiArt() {
        AsciiArt asciiArt = new AsciiArt();
        String text = "BAELDUNG";
        Settings settings = asciiArt.new Settings(new Font("SansSerif", Font.BOLD, 24), text.length() * 30, 30); // 30 pixel width per character

        asciiArt.drawString(text, "*", settings);
    }
}
