import java.util.*;

public class deadlines
{
    static List<String> deadline_String = new ArrayList<>();
    static List<Integer> deadline_dag = new ArrayList<>();
    static List<Integer> deadline_week = new ArrayList<>();

    static List<Integer> deadline_int = new ArrayList<>();

    public static void toevoegen_deadline()
    {
        String toevoegen_string_deadline;
        int toevoegen_dag_deadline;
        int toevoegen_week_deadline;
        int mee_bezig = 1;

        //1 = mee bezig
        //2 = gehaald
        //3 = niet gehaald


        System.out.println("Type hier de beschrijving die u bij de deadline wilt");
        Scanner input = new Scanner(System.in);
        toevoegen_string_deadline = input.nextLine();

        System.out.println("Op welke dag moet de deadline komen te staan?");
        toevoegen_dag_deadline = input.nextInt();

        System.out.println("In welke week valt deze deadline?");
        toevoegen_week_deadline = input.nextInt();

        deadline_int.add(mee_bezig);
        deadline_String.add(toevoegen_string_deadline);
        deadline_dag.add(toevoegen_dag_deadline);
        deadline_week.add(toevoegen_week_deadline);

        System.out.println("De deadline is nu toegevoegt");
    }

    public static void deadline_aan_uit()
    {
        int voorzetsel = 1;
        int bool_index;
        int deadline_gehaald = 2;
        int deadline_niet_gehaald = 3;
        int mini_me;

        System.out.println("selecteer een door uw toegevoegde deadline waarin waarvan u de status wilt veranderen");

        for (String x : deadline_String)
        {
            System.out.println(voorzetsel + ". " + x);
            voorzetsel += 1;
        }
        System.out.println("\nKies nu de deadline die u aan wilt zetten");

        Scanner input = new Scanner(System.in);
        bool_index = input.nextInt();

        System.out.println("\nHeeft u de deadline gehaald?" + "\n1. ja" + "\n2. nee");
        mini_me = input.nextInt();

        if(mini_me == 1)
        {
            deadline_int.set(bool_index, deadline_gehaald);
        }
        if(mini_me == 2)
        {
            deadline_int.set(bool_index, deadline_niet_gehaald);
        }

        System.out.println("De status van de deadline is nu veranderd");

    }
}
