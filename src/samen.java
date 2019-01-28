import java.util.*;
import java.util.Calendar;


public class samen
{
    public static void weergeven_dag()
    {
        int vergelijken_dag;
        int dag_is;
        int index = 0;
        int index_2 = 0;
        String String__afspraken_is;
        String String__deealines_is;
        int voorzetsel_1 = 1;
        int voorzetsel_2 = 1;

        System.out.println("van welke dag wilt u de afspraken en deadlines zien?");
        Scanner input = new Scanner(System.in);
        vergelijken_dag = input.nextInt();

        System.out.println("\nDe deealines voor deze dag zijn:\n");
        for (int i = 0; i < deadlines.deadline_dag.size() ; i++)
        {
            dag_is = deadlines.deadline_dag.get(index);
            if(dag_is == vergelijken_dag)
            {
                String__deealines_is = deadlines.deadline_String.get(index);
                System.out.println(voorzetsel_1 + ". " + String__deealines_is);
            }
            voorzetsel_1 += 1;
            index += 1;
        }

        System.out.println("\nDe afspraken voor deze dag zijn:\n");
        for (int i = 0; i < afspraken.afspraken_dag.size() ; i++)
        {
            dag_is = afspraken.afspraken_dag.get(index_2);
            if(dag_is == vergelijken_dag)
            {
                String__afspraken_is = afspraken.afspraken_String.get(index_2);
                System.out.println(voorzetsel_2 + ". " + String__afspraken_is);
            }
            voorzetsel_2 += 1;
            index_2 += 1;
        }

    }

    public static void weergeven_deze_dag()
    {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int vergelijken_dag;
        int index = 0;
        int index_2 = 0;
        String String__afspraken_is;
        String String__deealines_is;
        int voorzetsel_1 = 1;
        int voorzetsel_2 = 1;


        System.out.println("\nDe deealines vandaag dag zijn:\n");
        for (int i = 0; i < deadlines.deadline_dag.size() ; i++)
        {
            vergelijken_dag = deadlines.deadline_dag.get(index);
            if(day == vergelijken_dag)
            {
                String__deealines_is = deadlines.deadline_String.get(index);
                System.out.println(voorzetsel_1 + ". " + String__deealines_is);
            }
            voorzetsel_1 += 1;
            index += 1;
        }

        System.out.println("\nDe afspraken vandaag dag zijn:\n");
        for (int i = 0; i < afspraken.afspraken_dag.size() ; i++)
        {
            vergelijken_dag = afspraken.afspraken_dag.get(index_2);
            if(day == vergelijken_dag)
            {
                String__afspraken_is = afspraken.afspraken_String.get(index_2);
                System.out.println(voorzetsel_2 + ". " + String__afspraken_is);
            }
            voorzetsel_2 += 1;
            index_2 += 1;
        }
    }
}
