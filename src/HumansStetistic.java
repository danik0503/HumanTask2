//класс отвечающий за формировании статистики
public class HumansStetistic {

    int [] getAgesStatistic(Human humans[]){
        int ages[] = new int [100];

        for (int i= 0; i< humans.length; i++){
            Human currentHuman = humans[i];
            int currentHumanAge = humans[i].getAge();
            ages[currentHumanAge]++;
        }
        return ages;
    }
}
