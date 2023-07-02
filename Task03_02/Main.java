public class Main {
    public static void main(String[] args) {
        /*Формируется сладкий подарок.
        - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
        - У каждой сладости есть название, вес, цена и свой уникальный параметр
        - Необходимо собрать подарок из сладостей
        - Найти общий вес подарка, общую стоимость подарка
        - Вывести на консоль информацию о всех сладостях в подарке*/
        int totalWeight = 0;
        int totalPrise = 0;
        Candy candy1 = new Candy("candyName1", 100, 200, "red");
        Candy candy2 = new Candy("candyName2", 200, 220, "blue");
        Candy candy3 = new Candy("candyName3", 300, 222, "green");
        Jellybean jellybean1 = new Jellybean("jellybeanName1", 400,20,true);
        Jellybean jellybean2 = new Jellybean("jellybeanName2", 500,22,false);
        Sweets[] present = {candy1, candy2, candy3, jellybean1, jellybean2};
        for (Sweets sweet : present) {
            System.out.println(sweet.toString());
            totalWeight += sweet.getWeight();
            totalPrise += sweet.getPrice();
        }
        System.out.println("Total weight = " + totalWeight +"; Total prise = " + totalPrise);
    }
}
