package arraylistschoolexample.codechallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MathsAndScience
{
    public static void main(String[] args)
    {

        ArrayList<String> maths = new ArrayList<>(Arrays.asList(new String[]{"Ram", "Tom", "Ravi", "Tamvi", "Vikas"}));
        ArrayList<String> science = new ArrayList<>(Arrays.asList(new String[]{"John", "Ravi", "Abhi", "Vikas", "Faisal"}));

        for (String math : maths) {
            for (String s : science) {
                if (Objects.equals(math, s)) {
                    System.out.println(math);
                }
            }
        }
    }
}
