/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.repository;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BarcodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Lucas51812876
 */
public class BoletoPDF {
    
    //Método Principal para gerar o boleto
    public void gerarBoleto(String filePath) {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
            //Adicionando título e cabeçalho
            adicionarCabecalho(document);
            
            //Informações do beneficiário e pagador
            adicionarInformacoes(document);
            
            //Informações do Boleto
            adicionarInformacoesBoleto(document);
            
            //Gera o código de barras
            BufferedImage codigoBarras = gerarCodigoDeBarras("34191.09008 12345.678901 12345.678904 1 12345678901234");
            adicionarCodigoDeBarras(document, writer, codigoBarras);
            
            //Gera o QR Code
            BufferedImage qrCodeImage = gerarQRCode("00020126480014BR.GOV.BCB.PIX0114+55119876543265802BR5925Fulano de Tal6009SAO PAULO62070503***6304B6D2", 200, 200);
            adicionarQRCode(document, qrCodeImage);
            
            document.close();
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    //Método para adicionar o cabeçalho
    private void adicionarCabecalho(Document document) throws DocumentException {
        Font titleFont = new Font(Font.HELVETICA, 14, Font.BOLD);
        Paragraph titulo = new Paragraph("BOLETO BÁNCARIO", titleFont);
        titulo.setAlignment(Element.ALIGN_CENTER);
        document.add(titulo);
        document.add(new Paragraph(" "));
    }
    
    //Método para adicionar as informações do boleto
    private void adicionarInformacoes(Document document/*, String nome, String cpf, String endereco*/) throws DocumentException {
        PdfPTable infoTable = new PdfPTable(2);
        infoTable.setWidthPercentage(100);
        infoTable.addCell("Beneficiário: Empresa Exemplo LTDA");
        infoTable.addCell("Pagador: João da Silva");
        infoTable.addCell("CPF/CNPJ: 00.000.000/0001-00");
        infoTable.addCell("CPF/CNPJ: 123.456.789-00");
        infoTable.addCell("Endereço: Rua Exemplo, 123, São Paulo - SP");
        infoTable.addCell("Endereço: Av. Teste, 456, Rio de Janeiro - RJ");
        document.add(infoTable);
        document.add(new Paragraph(" "));  
    }
    
    //Método para adicionar informações do boleto
    private void adicionarInformacoesBoleto(Document document) throws DocumentException {
        PdfPTable boletoTable = new PdfPTable(4);
        boletoTable.setWidthPercentage(100);
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        boletoTable.addCell("");
        
        document.add(boletoTable);
        document.add(new Paragraph(" "));
    }
    
    //Método para gerar o codigo de barras
    private BufferedImage gerarCodigoDeBarras(String dados) throws WriterException {
        BitMatrix bitMatrix = new com.google.zxing.BarcodeWriter.encode(dados, BarcodeFormat.CODE_128, 400, 50);
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}
