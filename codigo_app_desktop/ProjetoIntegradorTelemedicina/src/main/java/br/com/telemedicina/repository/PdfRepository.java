/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.repository;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas51812876
 */
public class PdfRepository {
    
    public void gerarPDF (String filePath) {
        Document boleto = new Document();
        try {
            PdfWriter.getInstance(boleto, new FileOutputStream(filePath));
            boleto.open();
            boleto.add(new Paragraph("Este é um boleto a ser pago."));
            boleto.close();
            JOptionPane.showMessageDialog(null, "PDF Gerado com sucesso!");
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
