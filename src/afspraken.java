import java.util.*;

public class afspraken
{
    public static List<String> afspraken_String = new ArrayList<>();
    public static List<Integer> afspraken_dag = new ArrayList<>();
    public static List<Integer> afspraken_week = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

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

            System.out.println("de afspraak is nu toegevoegt");
        }
        public static void bewerken_afspraak()
        {
            int voorzetsel = 1;
            int int_index;
            int mini_me;
            String nieuwe_beschrijving;
            int nieuwe_dag;
            int nieuwe_week;

            System.out.println("Welke afspraak wilt u veranderen?");
            for (String x : afspraken_String)
            {
                System.out.println(voorzetsel + ". " + x);
                voorzetsel += 1;
            }

            int_index = input.nextInt();
            int_index -= 1;

            System.out.println("Wat wilt u veranderen aan de afspraak?" + "\n1. de beschrijving" + "\n2. de dag" + "\n3. de week");
            mini_me = input.nextInt();
            if(mini_me == 1)
            {
                System.out.println("type hier de nieuwe versie van de beschrijving");
                nieuwe_beschrijving = input.nextLine();
                afspraken_String.set(int_index, nieuwe_beschrijving);
            }
            if(mini_me == 2)
            {
                System.out.println("type hier de nieuwe dag van de afspraak");
                nieuwe_dag = input.nextInt();
                afspraken_dag.set(int_index, nieuwe_dag);
            }
            if(mini_me == 3)
            {
                System.out.println("type hier de nieuwe week van de afspraak");
                nieuwe_week = input.nextInt();
                afspraken_dag.set(int_index, nieuwe_week);
            }

            System.out.println("de afspraak is nu aangepast");
        }

        public static void verwijdern_afspraak()
        {
            int voorzetsel = 1;
            int int_index;

            System.out.println("Welke afspraak wilt u verwijderen?");
            for (String x : afspraken_String)
            {
                System.out.println(voorzetsel + ". " + x);
                voorzetsel += 1;
            }

            int_index = input.nextInt();
            int_index -= 1;

            afspraken_String.remove(int_index);
            afspraken_dag.remove(int_index);
            afspraken_week.remove(int_index);

            System.out.println("De afspraak is nu verwijderd");
        }
}
