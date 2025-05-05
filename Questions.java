import java.util.*;

public class Questions {

    String q,a1,a2,a3,a4;
    int ca;
    public Questions(String q, String a1, String a2, String a3, String a4, int ca) {
        this.q = q;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.ca=ca;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }
    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getCa() {
        return ca;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "q='" + q + '\'' +
                ", a1='" + a1 + '\'' +
                ", a2='" + a2 + '\'' +
                ", a3='" + a3 + '\'' +
                ", a4='" + a4 + '\'' +
                '}';
    }

    public static List<Questions> questions=new ArrayList<>(List.of
            (new Questions(" Who invented Java Programming?","Guido van Rossum","James Gosling","Dennis Ritchie", "Bjarne Stroustrup",2),
                    new Questions("Which one of the following is not a Java feature?","Object oriented","portable","use of pointers","Dynamic",3),
                    new Questions("Which component is used to compile, debug and execute the java programs?","jre","jdk","jvm","jit",2),
                    new Questions("What is the extension of java code files?",".java",".c",".c++",".js",1),
                    new Questions("Which of the following is not an OOPS concept in Java?","Polymorphism","Inheritance","Abstraction","Compilation",4)));

    public static void addQuestions(String q,String a1,String a2, String a3,String a4,int ca)
    {
        Questions question=new Questions(q,a1,a2,a3,a4,ca);
        questions.add(question);
    }

    public boolean isCorrect(int userAnswer)
    {
        return userAnswer==this.getCa();
    }


    public static void allQuestions() {
        int correctAnswers=0;
        int incorrectAnswers=0;
        int sizeOfList=questions.size();
        for (Questions item : questions) {
            System.out.println(item.q);
            System.out.println("1] "+item.getA1());
            System.out.println("2] "+item.getA2());
            System.out.println("3] "+item.getA3());
            System.out.println("4] "+item.getA4());
            System.out.print("Enter the number as an answer: ");


//            System.out.println(item.getCa());
            Scanner sc = new Scanner(System.in);
            int userAnswer=sc.nextInt();
            boolean ans= item.isCorrect(userAnswer);

            if(ans==true)
            {
                correctAnswers++;
            }
            else{
                incorrectAnswers++;
            }
        }
        System.out.println("Total correct answers="+correctAnswers);
        System.out.println("Total incorrect answers="+incorrectAnswers);
        double totalPercentage = ((double) correctAnswers / sizeOfList) * 100;
        System.out.printf("Total percentage = %.2f%%\n", totalPercentage);

        if(totalPercentage>0. && totalPercentage<30 )
        {
            System.out.println("You should study much harder");
        }
        else if(totalPercentage>31 && totalPercentage<60 )
        {
            System.out.println("You are studying good, need some more study");
        }
        if(totalPercentage>61 && totalPercentage<90 )
        {
            System.out.println("You are becoming topper and bit of extra efforts required");
        }
        if(totalPercentage>91 && totalPercentage<100 )
        {
            System.out.println("You are very good at concepts and being into top list");
        }
    }
}

class mainClass{
    public static void main(String[] args)
    {

        Questions.addQuestions(" Which of these are selection statements in Java?","break","continue","for()","if()",4);
        Questions.allQuestions();
    }
}

