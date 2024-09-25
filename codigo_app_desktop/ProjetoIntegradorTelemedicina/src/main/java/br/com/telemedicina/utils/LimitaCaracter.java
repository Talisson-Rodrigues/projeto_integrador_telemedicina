/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Lucas51812876
 */
public class LimitaCaracter extends PlainDocument {
    private int limite;

    //Construtor
    public LimitaCaracter(int limite) {
        super();
        this.limite = limite;
    }
    
    public void insertString (int ofs, String str, AttributeSet a) throws BadLocationException {
        if ((getLength() + str.length()) <= limite) {
            super.insertString(ofs, str, a);
        }
    }
}
