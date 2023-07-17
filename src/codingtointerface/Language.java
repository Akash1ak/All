package codingtointerface;



interface Coding
{
    void getCoding(String language);

}
public class Language implements Coding {

    @Override
    public void getCoding(String language) {
        System.out.println("the most powerfull language "+language);
    }
}

class study
{
    public static void main(String[] args) {
        Language language = new Language();
        language.getCoding(" java");
        language.getCoding("python");
    }
}
