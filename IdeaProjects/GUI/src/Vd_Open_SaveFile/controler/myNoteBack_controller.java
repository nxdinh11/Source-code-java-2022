package Vd_Open_SaveFile.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import Vd_Open_SaveFile.vieww.mYNotePadView;
import javax.swing.*;

public class myNoteBack_controller implements ActionListener {
    private mYNotePadView mYNotePadView;
    public myNoteBack_controller(mYNotePadView mYNotePadView){
        this.mYNotePadView = mYNotePadView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        JFileChooser fc  =new JFileChooser();
        if (command.equals("Open")){
            int returnVal = fc.showOpenDialog(this.mYNotePadView);
            if (returnVal == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();
                this.mYNotePadView.model.setFile_Name(file.getAbsolutePath());
                this.mYNotePadView.lblNewLabel.setText(this.mYNotePadView.model.getFile_Name());
                String fileName = file.getName();//nhận tên file
                if (fileName.endsWith(".txt")){
                    try {
                        List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
                        StringBuilder result = new StringBuilder();
                        for(String line : allText){
                            result.append(line); result.append("\n");

                        }
                        this.mYNotePadView.model.setContent(String.valueOf(result));
                        this.mYNotePadView.textArea.setText(this.mYNotePadView.model.getContent());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }else if(command.equals("Save")){
            if(this.mYNotePadView.model.getFile_Name().length()>0){
                try {
                    PrintWriter pw = new PrintWriter(this.mYNotePadView.model.getFile_Name());
                    String data = this.mYNotePadView.textArea.getText();
                    pw.print(data);
                    pw.flush();
                    pw.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }else{
                int returnVal = fc.showSaveDialog(this.mYNotePadView);
                File file = fc.getSelectedFile();
                if(returnVal == JFileChooser.APPROVE_OPTION){
                    try {

                        PrintWriter pw = new PrintWriter(file.getAbsolutePath());
                        String data =this.mYNotePadView.textArea.getText();
                        pw.print(data);
                        pw.flush();
                        pw.close();
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        } else if (command.equals("Exit")) {
            System.exit(0);
        }
    }
}
