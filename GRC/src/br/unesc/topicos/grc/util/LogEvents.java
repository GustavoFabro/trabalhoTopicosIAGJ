package br.unesc.topicos.grc.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogEvents {
    private String log = "";
    
    private Date date = new Date();
    private DateFormat formattedDate = new SimpleDateFormat("[YYYY-MM-dd HH:mm:ss] ");
    
    public void gravarLog(String log) throws IOException {
        this.log = (formattedDate.format(date) + log + "\n");
        
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("log.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(this.log);
            bufferedWriter.flush();

            System.out.println("Log salvo com sucesso");
//        } catch (IOException ex) {
//            System.out.println("Erro ao salvar o log: " + ex.getMessage());
        } finally {
            if (bufferedWriter != null) {
//                try {
                    bufferedWriter.close();
//                } catch (IOException ex) {
//                    System.out.println("Erro ao salvar o log: "
//                            + ex.getMessage());
//                }
            }
            if (fileWriter != null) {
//                try {
                    fileWriter.close();
//                } catch (IOException ex) {
//                    System.out.println("Erro ao salvar o log: "
//                            + ex.getMessage());
//                }
            }
        }
    }

}
