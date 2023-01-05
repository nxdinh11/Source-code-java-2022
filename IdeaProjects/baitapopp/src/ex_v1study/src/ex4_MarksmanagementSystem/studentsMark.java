package ex4_MarksmanagementSystem;

public class studentsMark implements IStudentsMark{
    private String fullName;
    private int id;
    private String class1;
    private int semester;
    private float averageMark;
    int []subjectMarkList = new int[5];

    public studentsMark(){}
    public studentsMark(int id, String fullName, String class1, int semester, int []subjectMarkList){
        this.fullName = fullName;
        this.id = id;
        this.class1 = class1;
        this.semester = semester;
        this.subjectMarkList = subjectMarkList;
    }
    public void display(){
        System.out.println(" "+this.fullName);

        System.out.println(" "+this.id);

        System.out.println(" "+this.class1);

        System.out.println(" "+this.semester);

        System.out.println(" "+this.averageMark);

    }
    public int []getSubjectMarkLst(){
        return this.subjectMarkList;
    }
    public float aveCal(){
        for(int obj : subjectMarkList){
            this.averageMark += obj;
        }
        return this.averageMark/=subjectMarkList.length;
    }

}
