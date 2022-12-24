import java.util.Scanner;
import java.util.Stack;

public class StackSortOperation {

    public static void main(String[] args) {
        
        //declaration
        String stdName = "";
        String stdMatric ="";
        String stdGender = "";
        Double stdCgpa = 0.0;
        
        //stack declaration
        Stack<Student> stackAllStudent = new Stack<Student>();
        Stack<Student> stackExcelStd = new Stack<Student>();
        Stack<Student> stackWeakStd = new Stack<Student>();
        Stack<Student> tempStack = new Stack<Student>();
        Student tempStd;
        
        
        Scanner userInp = new Scanner(System.in);
        //get user input
        for(int i = 0; i < 2; i++) {
            
            System.out.println("Enter student name:");
            stdName = userInp.next();
            
            System.out.println("Enter student matric:");
            stdMatric = userInp.next();
            
            System.out.println("Enter student gender:");
            stdGender = userInp.next();
            
            System.out.println("Enter student CGPA:");
            stdCgpa = userInp.nextDouble();
            
            //create object student and push into stack stackAllStudent            
            stackAllStudent.push(new Student(stdName, stdMatric, stdGender, stdCgpa));
            
        }
        
        
        
        //sort student based on their cgpa
        while(!stackAllStudent.isEmpty()){
            
            //assign object to temp
            tempStd = stackAllStudent.pop();
            
            //push object based on cgpa
            if(tempStd.getCgpa() >= 3.0)
                stackExcelStd.push(tempStd);
            else
                stackWeakStd.push(tempStd);
                        
        }
        
        
        
        //sort Excel Student into temp stack
        while(!stackExcelStd.isEmpty()) {
            
            tempStd = stackExcelStd.pop();          
            
            while(!tempStack.isEmpty() && tempStd.getName().charAt(0) < tempStack.peek().getName().charAt(0)) {
                stackExcelStd.push(tempStack.pop());
            }
            
            tempStack.push(tempStd);
        }
        
        //move back Excel student from tempStack into stackExcelStd
        while(!tempStack.isEmpty()) {            
            stackExcelStd.push(tempStack.pop());
        }
        
        //display from stackExcelStd
        System.out.println("This is Excellent students:");
        while(!stackExcelStd.isEmpty()) {
            tempStd = stackExcelStd.pop();
            System.out.println(tempStd.getName() + " " +tempStd.getMatric() + " " +tempStd.getGender() + " " +tempStd.getCgpa() );
        }
    }
}
