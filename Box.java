import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Box<T extends Fruit> {


    private List<T> fruits = new ArrayList<>(); // перелік фруктів в коробці

    //додати фрукт до коробки
    public void add(T fruit) {
        //якщо в коробці ще немає фруктів, додати фрукт без перевірки
        if (fruits.isEmpty()) {
            fruits.add(fruit);
        } else {
            //перевірити чи відповідає фрукт типу коробки
            if (fruit.getClass() == fruits.get(0).getClass()) {
                fruits.add(fruit);
            } else {
                System.out.println("Неможливо додати фрукт до коробки: типи не співпадають");
            }
        }
    }

    // додати кілька фруктів до коробки
    public void addall(List <T> Fruits ) {
        for (T fruit : fruits) {
            add (fruit);
        }
    }

    // вирахувати вагу коробки на підставі ваги одного фрукту та його кількості
    public float getWeight () {
        if (fruits.isEmpty()) {
            return 0.0f;
        } else {
            float weight = fruits.size() * getWeight();
            return weight;
        }
    }
    // порівняти поточну коробку з переданою
    public boolean compare (Box<?> box) {
        return Math.abs(getWeight() - box.getWeight()) <0.0001;
    }






}
