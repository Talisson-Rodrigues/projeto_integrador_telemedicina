
import java.util.Date;

public class Programa{
    public static void main(String[] args) {
        System.out.println("--Testes--");
        System.out.println("");

        Endereco e = new Endereco("00000000000",new Date("2002/12/04"),"alex@email","M","Alexx","0000000",4562, "Ceilandia Sul", "72236-800", "Brasilia", "SHSN 10", "Distrito Federal");
        System.out.println(e.exibeDados());
        System.out.println("");

        Paciente p = new Paciente("poeira","nenhuma","nenhum",new Date(),"00000000000",new Date("2002/12/04"),"alex@email","M","Alexx","0000000",4562);
        System.out.println(p.exibeDados());

        Medico m = new Medico("000.000.000-00", new Date("1970/06/12"), "maria@gmail.com", "F","Maria da Silva", "0.000.000", 97474, new Date("2000/12/12"), new Date("2006/12/12"), "Certificada em Neurologia", "Trabalhou no HUB", "Neurologista", "Formada em Neurologia", "0000.0000");
        System.out.println(m.exibeDados());
        System.out.println("");

        Clinica cl = new Clinica("Clinica Boa Vida", "000.000.0000/01","SHSN 10", "929738290", "boavida@gmail.com");
        System.out.println(cl.exibeDados());
        System.out.println("");

        Consulta co = new Consulta(new Date(), "Presencial", "Maria", "Alexx", "Dinheiro", "Clinica Boa Vida", "000.000.0000/01","SHSN 10", "929738290", "boavida@gmail.com");
        System.out.println(co.exibeDados());
        System.out.println("");

        Prescricao pre = new Prescricao("Medica: Maria, Paciente: Alexx ", " 1 comprimido de Amoxilina de 12 em 12 horas por 7 dias","000.000.000-00", new Date("1970/06/12"), "maria@gmail.com", "F","Maria da Silva", "0.000.000", 97474, new Date("2000/12/12"), new Date("2006/12/12"), "Certificada em Neurologia", "Trabalhou no HUB", "Neurologista", "Formada em Neurologia", "0000.0000");
        System.out.println(pre.exibeDados());
    }
}