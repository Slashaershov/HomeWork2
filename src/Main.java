public class Main
{
    public static void main(String[] args)
    {
        //exercise 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        //exercise 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        //exercise 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        //exercise 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        //exercise 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *=10;
        System.out.println("frog = " + frog);
        frog /=3.5;
        System.out.println("frog = " + frog);
        frog -=4;
        System.out.println("frog = " + frog);

        //exercise 6
        var mass1 = 78.2;
        var mass2 = 82.7;
        var summ = mass1 + mass2;
        System.out.println("sum mass = " + summ);
        var df = mass2 - mass1;
        System.out.println("df mass = " + df);

    }
}