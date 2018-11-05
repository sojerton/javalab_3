public class Engineer implements Employable {

    public void getWork(){
        System.out.println("i working");
    }

    @Override
    public void working() {
        System.out.println("*clac* *clac*");
    }
}
