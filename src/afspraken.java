import java.util.*;

public class afspraken
{
    static List<String> afspraken_String = new ArrayList<>();
    static List<Integer> afspraken_dag = new ArrayList<>();
    static List<Integer> afspraken_week = new ArrayList<>();

public static void toevoegen_afspraak()
        {
            String toevoegen_string_afspraak;
            int toevoegen_dag_afspraak;
            int toevoegen_week_afspraak;

            System.out.println("Type hier de beschrijving die u bij de afspraak wilt");
            Scanner input = new Scanner(System.in);
            toevoegen_string_afspraak = input.nextLine();

            System.out.println("Op welke dag moet de afspraak komen te staan?");
            toevoegen_dag_afspraak = input.nextInt();

            System.out.println("In welke week valt deze afspraak?");
            toevoegen_week_afspraak = input.nextInt();

            afspraken_String.add(toevoegen_string_afspraak);
            afspraken_dag.add(toevoegen_dag_afspraak);
            afspraken_week.add(toevoegen_week_afspraak);
        }
}
