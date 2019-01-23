import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int menu;
        System.out.println("\nWelkom bij Teun's agenda, \n\n" +
                "in deze agenda kan je afspraken & deadlines  \n" +
                "door het de leter voor uw keuze te typen komt u op de bijbehorende plek\n\n" +
                "1. toevoegen afspraak\n" +
                "2. toevoegen deadline\n" +
                "3. bewerken afspraak\n" +
                "4. bewerken deadline\n" +
                "5. deadline gehaald / niet gehaald\n" +
                "6. verwijderen afspraak\n" +
                "7. verwijderen deadline\n" +
                "8. weergeven afspraken en deadlines van specifieke dag\n" +
                "9. weergeven afspraken en deadlines van vandaag\n" +
                "10. weergeven afspraken en deadlines van specifieke week\n" +
                "11. weergeven afspraken en deadlines van deze week");

        Scanner input = new Scanner(System.in);
        menu = input.nextInt();

        if (menu == 1)
        {
            afspraken.toevoegen_afspraak();
        }
        if (menu == 2)
        {
            deadlines.toevoegen_deadline();
        }
        if (menu == 3)
        {

        }
        if (menu == 4)
        {

        }
        if (menu == 5)
        {

        }
        if (menu == 6)
        {

        }
        if (menu == 7)
        {

        }
        if (menu == 8)
        {

        }
        if (menu == 9)
        {

        }
        if (menu == 10)
        {

        }
        if (menu == 11)
        {

        }


    }
}
