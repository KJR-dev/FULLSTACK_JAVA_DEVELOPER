package Question;

public class Question{
    private int queNo;
    private String que,opt1,opt2,opt3,opt4;
    private char ans;
    public void setProperty(int queNo,String qus,String opt1,String opt2,String opt3,String opt4,char ans){
        this.queNo=queNo;
        this.que=qus;
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
        this.opt4=opt4;
        this.ans=ans;
    }
    public void showProperty(){
        System.out.println("question No :- "+queNo);
        System.out.println("question :- "+que);
        System.out.println("opition 1 :- "+opt1);
        System.out.println("opition 2 :- "+opt2);
        System.out.println("opition 2 :- "+opt3);
        System.out.println("opition 3 :- "+opt4);
        System.out.println("answer :- "+ans);
    }
}