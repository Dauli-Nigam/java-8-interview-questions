package java_8_interview_programme;

public interface DemoInterface {

    public void m1();

    // Abstract method..

    default public void m2(){

        System.out.println("Great");


    }



}
