package Interface;

public class Okdone implements A, B
{

    @Override
    public void test() {

    }

    @Override
    public void ak() {

    }
}

interface A  {
    void test();
}

interface B extends A
{
    void ak();
}