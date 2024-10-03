/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.repository;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author Lucas51812876
 */
public class BoletoPDF {
    
    //Método Principal para gerar o boleto
    public void gerarBoleto(String filePath, String nome, String cpf, String endereco, String valor) throws WriterException, BarcodeException {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
            //Adicionando título e cabeçalho
            adicionarCabecalho(document);
            
            //Informações do beneficiário e pagador
            adicionarInformacoes(document, nome, cpf, endereco);
            
            //Calcula a data de vencimento (dois dias após a data atual)
            LocalDate dataAtual = LocalDate.now();
            LocalDate dataVencimento = dataAtual.plusDays(2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataVencimentoFormatada = dataVencimento.format(formatter);
            
            //Informações do Boleto com a data de vencimento calculada
            adicionarInformacoesBoleto(document, valor, dataVencimentoFormatada);
            
            //Gera o QR Code
            BufferedImage qrCodeImage = gerarQRCode("00020126480014BR.GOV.BCB.PIX0114+55119876543265802BR5925Fulano de Tal6009SAO PAULO62070503***6304B6D2", 200, 200);
            adicionarQRCode(document, qrCodeImage);
            
            //Gera o código de barras
            String codigoDeBarras = gerarCodigoDeBarrasAleatorio();
            BufferedImage codigoBarras = gerarCodigoDeBarras(codigoDeBarras);
            adicionarCodigoDeBarras(document, codigoBarras);
            
            document.close();
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    //Método para adicionar o cabeçalho
    private void adicionarCabecalho(Document document) throws DocumentException {
        Font titleFont = new Font(Font.HELVETICA, 14, Font.BOLD);
        Paragraph titulo = new Paragraph("BOLETO BANCÁRIO", titleFont);
        titulo.setAlignment(Element.ALIGN_CENTER);
        document.add(titulo);
        document.add(new Paragraph(" "));
    }
    
    //Método para adicionar as informações do boleto
    private void adicionarInformacoes(Document document, String nome, String cpf, String endereco) throws DocumentException {
        PdfPTable infoTable = new PdfPTable(2);
        infoTable.setWidthPercentage(100);
        infoTable.addCell("Beneficiário: Empresa Exemplo LTDA");
        infoTable.addCell("Pagador: " + nome);
        infoTable.addCell("CPF/CNPJ: 00.000.000/0001-00");
        infoTable.addCell("CPF/CNPJ: " + cpf);
        infoTable.addCell("Endereço: Rua Exemplo, 123, São Paulo - SP");
        infoTable.addCell("Endereço: " + endereco);
        document.add(infoTable);
        document.add(new Paragraph(" "));  
    }
    
    //Método para adicionar informações do boleto
    private void adicionarInformacoesBoleto(Document document, String valor, String dataVencimento) throws DocumentException {
        PdfPTable boletoTable = new PdfPTable(4);
        boletoTable.setWidthPercentage(100);
        boletoTable.addCell("Data de Vencimento: ");
        boletoTable.addCell(dataVencimento);
        boletoTable.addCell("Valor: ");
        boletoTable.addCell(valor);
        
        boletoTable.addCell("Agência/Código Beneficiário: ");
        boletoTable.addCell("1234/0000001");
        boletoTable.addCell("Nosso Número: ");
        boletoTable.addCell("12345678-9");
        
        boletoTable.addCell("Carteira: ");
        boletoTable.addCell("109");
        boletoTable.addCell("Número do Documento: ");
        boletoTable.addCell("0000012345");
        
        boletoTable.addCell("Espécie: ");
        boletoTable.addCell("R$ ");
        boletoTable.addCell("Quantidade: ");
        boletoTable.addCell("1");
        
        document.add(boletoTable);
        document.add(new Paragraph(" "));
    }
    
     //Método para gerar QR Code
    private BufferedImage gerarQRCode(String dados, int altura, int largura) throws WriterException {
        BitMatrix bitMatrix = new com.google.zxing.qrcode.QRCodeWriter().encode(dados, BarcodeFormat.QR_CODE, largura, altura);
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
    
    //Método para adicionar QR Code ao PDF
    private void adicionarQRCode(Document document, BufferedImage qrCodeImage) throws DocumentException, IOException {
        ImageIO.write(qrCodeImage, "png", new FileOutputStream("qrcode.png"));
        Paragraph qrCodeLabel = new Paragraph("QR Code");
        qrCodeLabel.setAlignment(Element.ALIGN_CENTER);
        document.add(qrCodeLabel);
        com.lowagie.text.Image img = com.lowagie.text.Image.getInstance("qrcode.png");
        img.setAlignment(Element.ALIGN_CENTER);
        document.add(img);
    }
    
    //Método para gerar o codigo de barras

    private BufferedImage gerarCodigoDeBarras(String dados) throws BarcodeException{
        try {
            //Cria o código de barras usando o formato Code128
            Barcode barcode = BarcodeFactory.createCode128(dados);
            
            //Define a altura e a largura das barras
            barcode.setBarHeight(60); //Altura das barras
            barcode.setBarWidth(2); //Largura das barras
            
            //Cria uma imagem com as dimensões corretas para o código de barras
            BufferedImage barcodeImage = new BufferedImage(barcode.getWidth(), barcode.getHeight(), BufferedImage.TYPE_INT_ARGB);
            
            //Obtem o objeto Graphics2D da imagem
            Graphics2D g2d = barcodeImage.createGraphics();
            
            //Desenha o código de barras na imagem
            barcode.draw(g2d, 0, 0);
            
            //libera o objeto Graphics2D após o uso
            g2d.dispose();
            
            //Retorna a imagem gerada
            return barcodeImage;
            
        } catch (OutputException | IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    //Método para adicionar o código de barras ao PDF
    private void adicionarCodigoDeBarras(Document document, BufferedImage codigoBarras) throws DocumentException, IOException {
        ImageIO.write(codigoBarras, "png", new FileOutputStream("codigo_barras.png"));
        Paragraph codigoBarrasLabel = new Paragraph("Código de barras: ");
        codigoBarrasLabel.setAlignment(Element.ALIGN_CENTER);
        document.add(codigoBarrasLabel);
        com.lowagie.text.Image img = com.lowagie.text.Image.getInstance("codigo_barras.png");
        img.setAlignment(Element.ALIGN_CENTER);
        document.add(img);
        document.add(new Paragraph(" "));
    }
    
    private String gerarCodigoDeBarrasAleatorio() {
        Random random = new Random();
        
        //Segmentos fixos (como o banco "341", etc.)
        String banco = "341"; //Código do banco, por exemplo, banco Itaú
        String moeda = "9"; //Moeda (geralmente 9 para real)
        String fatorVencimento = "09008"; //Pode ser relacionado à data de vencimento
        
        //Gerando segmentos aleatórios
        String segmento1 = String.format("%05d", random.nextInt(10000)); //Gera um número de 5 dígitos
        String segmento2 = String.format("%06d", random.nextInt(100000)); //Gera um número de 6 dígitos
        String segmento3 = String.format("%05d", random.nextInt(10000)); //Gera um número de 5 dígitos
        String segmento4 = String.format("%06d", random.nextInt(100000)); //Gera um número de 6 dígitos
        
        //Campo livre, dígito fixo e mais 14 digitos aleatórios
        String digitoVerificador = "1"; //Este é fixo em muitos casos
        String campoLivre = String.format("%014d", random.nextLong() % 10000000000000L); //14 dígitos aleatórios
        
        //Monta o código de barras completo
        return String.format("%s%s.%s %s.%s %s.%s %s %s",
                             banco, moeda, fatorVencimento,
                             segmento1, segmento2,
                             segmento3, segmento4,
                             digitoVerificador, campoLivre);
        
    }
}
