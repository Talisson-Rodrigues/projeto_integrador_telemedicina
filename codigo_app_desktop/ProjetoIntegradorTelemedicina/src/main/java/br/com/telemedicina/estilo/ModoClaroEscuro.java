/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.estilo;

import java.awt.Color;

/**
 *
 * @author Josue53508706
 */
public class ModoClaroEscuro {
    public static final Color darkBackground = new Color(54,54,54);
    public static final Color darkForeground = new Color(255,255,255);
   
    public static final Color lightBackground = new Color(255,255,255);
    public static final Color lightForeground = new Color(0,0,0);

    private static boolean isDarkMode = false;

    public static void setDarkMode(boolean darkMode) {
        isDarkMode = darkMode;
    }

    public static Color getBackgroundColor() {
        return isDarkMode ? darkBackground : lightBackground;
    }

    public static Color getForegroundColor() {
        return isDarkMode ? darkForeground : lightForeground;
    }
}
