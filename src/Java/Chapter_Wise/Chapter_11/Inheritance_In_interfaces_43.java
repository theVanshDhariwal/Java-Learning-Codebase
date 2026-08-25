package Java.Chapter_Wise.Chapter_11;

interface SampleInterface {
    void meth1();

    void meth2();
}

interface ChildSampleINterface extends SampleInterface {
    void meth3();

    void meth4();
}

class MySampleInterface implements ChildSampleINterface {
    public void meth1() {
        System.out.println("This is meth1.");
    }

    public void meth2() {
        System.out.println("This is meth2.");
    }

    public void meth3() {
        System.out.println("This is meth3.");
    }

    public void meth4() {
        System.out.println("This is meth4.");
    }
}

public class Inheritance_In_interfaces_43 {
    public static void main(String[] args) {
        MySampleInterface msi = new MySampleInterface();
        msi.meth1();
        msi.meth2();
        msi.meth3();
        msi.meth4();
    }
}
