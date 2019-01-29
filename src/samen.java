import java.util.*;
import java.util.Calendar;

public class samen {

    private static Scanner input = new Scanner(System.in);

    // deze funtion weergeeft de afspraken en deadlines van een specifieke dag
    public static void weergeven_dag() {
        int vergelijken_dag;
        int dag_is;
        String String__afspraken_is;
        String String__deealines_is;
        String String__afspraken_tijd;
        String String__afspreken_locatie;
        String String__afspraken_deelnemers;
        int voorzetsel_1 = 1;
        int voorzetsel_2 = 1;

        System.out.println("van welke dag wilt u de afspraken en deadlines zien?");
        vergelijken_dag = input.nextInt();

        System.out.println("\nDe deealines voor deze dag zijn:\n");
        for (int i = 0; i < deadlines.deadline_dag.size(); i++) {
            dag_is = deadlines.deadline_dag.get(i);
            if (dag_is == vergelijken_dag) {
                String__deealines_is = deadlines.deadline_String.get(i);
                System.out.println(voorzetsel_1 + ". " + String__deealines_is);
            }
            voorzetsel_1 += 1;
        }

        System.out.println("\nDe afspraken voor deze dag zijn:\n");
        for (int i = 0; i < afspraken.afspraken_dag.size(); i++) {
            dag_is = afspraken.afspraken_dag.get(i);
            if (dag_is == vergelijken_dag) {
                String__afspraken_is = afspraken.afspraken_String.get(i);
                String__afspraken_tijd = afspraken.afspraken_tijd.get(i);
                String__afspreken_locatie = afspraken.afspraken_locatie.get(i);
                String__afspraken_deelnemers = afspraken.afspraken_deelnemers.get(i);
                System.out.println(voorzetsel_2 + ". " + String__afspraken_is + " Tijd: " + String__afspraken_tijd + " Locatie: " + String__afspreken_locatie + " Deelnemers: " + String__afspraken_deelnemers);
            }
            voorzetsel_2 += 1;
        }

    }
    // deze funtion geeft de afspraken en deadlines van deze dag weer
    public static void weergeven_deze_dag() {
        Calendar cal = Calendar.getInstance();
        int dag = cal.get(Calendar.DATE);
        int vergelijken_dag;
        String String__afspraken_is;
        String String__deealines_is;
        String String__afspraken_tijd;
        String String__afspreken_locatie;
        String String__afspraken_deelnemers;
        int voorzetsel_1 = 1;
        int voorzetsel_2 = 1;


        System.out.println("\nDe deealines voor vandaag zijn:\n");
        for (int i = 0; i < deadlines.deadline_dag.size(); i++) {
            vergelijken_dag = deadlines.deadline_dag.get(i);
            if (dag == vergelijken_dag) {
                String__deealines_is = deadlines.deadline_String.get(i);
                System.out.println(voorzetsel_1 + ". " + String__deealines_is);
            }
            voorzetsel_1 += 1;
        }

        System.out.println("\nDe afspraken voor vandaag zijn:\n");
        for (int i = 0; i < afspraken.afspraken_dag.size(); i++) {
            vergelijken_dag = afspraken.afspraken_dag.get(i);
            if (dag == vergelijken_dag) {
                String__afspraken_is = afspraken.afspraken_String.get(i);
                String__afspraken_tijd = afspraken.afspraken_tijd.get(i);
                String__afspreken_locatie = afspraken.afspraken_locatie.get(i);
                String__afspraken_deelnemers = afspraken.afspraken_deelnemers.get(i);
                System.out.println(voorzetsel_2 + ". " + String__afspraken_is + " Tijd: " + String__afspraken_tijd + " Locatie: " + String__afspreken_locatie + " Deelnemers: " + String__afspraken_deelnemers);
            }
            voorzetsel_2 += 1;
        }
    }
    // deze funtion geeft de afspraken en deadlines van een specifieke week weer
    public static void weergeven_week() {
        int vergelijken_week;
        int week_is;
        String String__afspraken_is;
        String String__deealines_is;
        String String__afspraken_tijd;
        String String__afspreken_locatie;
        String String__afspraken_deelnemers;
        int voorzetsel_1 = 1;
        int voorzetsel_2 = 1;

        System.out.println("van welke week wilt u de afspraken en deadlines zien?");
        vergelijken_week = input.nextInt();

        System.out.println("\nDe deealines voor deze week zijn:\n");
        for (int i = 0; i < deadlines.deadline_week.size(); i++) {
            week_is = deadlines.deadline_week.get(i);
            if (week_is == vergelijken_week) {
                String__deealines_is = deadlines.deadline_String.get(i);
                System.out.println(voorzetsel_1 + ". " + String__deealines_is);
            }
            voorzetsel_1 += 1;
        }

        System.out.println("\nDe afspraken voor deze week zijn:\n");
        for (int i = 0; i < afspraken.afspraken_week.size(); i++) {
            week_is = afspraken.afspraken_week.get(i);
            if (week_is == vergelijken_week) {
                String__afspraken_is = afspraken.afspraken_String.get(i);
                String__afspraken_tijd = afspraken.afspraken_tijd.get(i);
                String__afspreken_locatie = afspraken.afspraken_locatie.get(i);
                String__afspraken_deelnemers = afspraken.afspraken_deelnemers.get(i);
                System.out.println(voorzetsel_2 + ". " + String__afspraken_is + " Tijd: " + String__afspraken_tijd + " Locatie: " + String__afspreken_locatie + " Deelnemers: " + String__afspraken_deelnemers);
            }
            voorzetsel_2 += 1;
        }
    }
    // deze funtion geeft de afspraken en deadlines van deze week weer
    public static void weergeven_deze_week() {
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int vergelijken_week;
        String String__afspraken_is;
        String String__deealines_is;
        String String__afspraken_tijd;
        String String__afspreken_locatie;
        String String__afspraken_deelnemers;
        int voorzetsel_1 = 1;
        int voorzetsel_2 = 1;


        System.out.println("\nDe deealines voor deze week zijn:\n");
        for (int i = 0; i < deadlines.deadline_week.size(); i++) {
            vergelijken_week = deadlines.deadline_week.get(i);
            if (week == vergelijken_week) {
                String__deealines_is = deadlines.deadline_String.get(i);
                System.out.println(voorzetsel_1 + ". " + String__deealines_is);
            }
            voorzetsel_1 += 1;
        }

        System.out.println("\nDe afspraken voor deze week zijn:\n");
        for (int i = 0; i < afspraken.afspraken_week.size(); i++) {
            vergelijken_week = afspraken.afspraken_week.get(i);
            if (week == vergelijken_week) {
                String__afspraken_is = afspraken.afspraken_String.get(i);
                String__afspraken_tijd = afspraken.afspraken_tijd.get(i);
                String__afspreken_locatie = afspraken.afspraken_locatie.get(i);
                String__afspraken_deelnemers = afspraken.afspraken_deelnemers.get(i);
                System.out.println(voorzetsel_2 + ". " + String__afspraken_is + " Tijd: " + String__afspraken_tijd + " Locatie: " + String__afspreken_locatie + " Deelnemers: " + String__afspraken_deelnemers);
            }
            voorzetsel_2 += 1;
        }
    }
}