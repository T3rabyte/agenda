import java.util.*;

public class deadlines
{
    static List<String> deadline_String = new ArrayList<>();
    static List<Integer> deadline_dag = new ArrayList<>();
    static List<Integer> deadline_week = new ArrayList<>();

    public static void toevoegen_deadline()
    {
        String toevoegen_string_deadline;
        int toevoegen_dag_deadline;
        int toevoegen_week_deadline;

        System.out.println("Type hier de beschrijving die u bij de deadline wilt");
        Scanner input = new Scanner(System.in);
        toevoegen_string_deadline = input.nextLine();

        System.out.println("Op welke dag moet de deadline komen te staan?");
        toevoegen_dag_deadline = input.nextInt();

        System.out.println("In welke week valt deze deadline?");
        toevoegen_week_deadline = input.nextInt();

        deadline_String.add(toevoegen_string_deadline);
        deadline_dag.add(toevoegen_dag_deadline);
        deadline_week.add(toevoegen_week_deadline);
    }
}
