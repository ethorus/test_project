/**
 * Created by Geruda on 02.11.2015.
 */
public class Coin {
    public double diameter; // нарушение инкапсуляции
    private double weight; // правильная инкапсуляция
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            diameter = 0.01; // значение по умолчанию
        }
    }
    public double takeWeight() { // некорректно: неправильное имя метода
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}
