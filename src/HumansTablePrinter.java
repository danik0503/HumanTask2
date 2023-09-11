// класс отвечающий  за вывод инормации в удобном виде
public class HumansTablePrinter {
    void printTable(Human humans[]){
        System.out.printf("|%10s|%15s|%3s|\n" , "First name", "Last name", "Age");
        System.out.println("--------------------------------");

        for (int i = 0;i < humans.length;i++){
            System.out.printf("|%10s|%15s|%3d|\n" , humans[i].firstName, humans[i].lastName, humans[i].age);
        }
    }
    void printTable(int ages[]){
        System.out.printf("|%10s|%22s|\n" , "Возраст", "Сколько раз встретилась ");
        System.out.println("--------------------------------");
        for (int i=0; i< ages.length; i++) {
            if (ages[i] != 0) {
                System.out.printf("|%10d|%22d|\n", i, ages[i]);
            }
        }
    }
}
