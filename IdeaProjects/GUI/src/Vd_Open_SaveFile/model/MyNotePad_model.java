package Vd_Open_SaveFile.model;

public class MyNotePad_model {
    private String file_Name;
    private String content;

    public MyNotePad_model() {
        this.file_Name = "";
        this.content = "" ;
    }

    public String getFile_Name() {
        return file_Name;
    }

    public void setFile_Name(String file_Name) {
        this.file_Name = file_Name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
