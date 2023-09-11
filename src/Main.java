public class Main {
    public static void main(String[] args) {

        HumanGenerator generator = new HumanGenerator();
        HumansTablePrinter printer = new HumansTablePrinter();
        HumansStetistic statistic = new HumansStetistic();

        Human humans[] = generator.generate(1000);
        printer.printTable(humans);

        int ages[] = statistic.getAgesStatistic(humans);


        System.out.println();
        System.out.println();
        // сортировка подсчетом

        printer.printTable(ages);

    }
} 
