package animals;

public class Main {
    public static void main(String[] args) {
        Animal gazel = new Herbivorous("Газель", 2, "наземное", 1, "трава");
        Animal giraffe = new Herbivorous("Жираф", 3, "саванна", 6, "листья");
        Animal horse = new Herbivorous("Лошадь", 4, "степь", 15, "овёс");
        Animal hyena = new Predators("Гиена", 2, "саванна", 10, "падаль");
        Animal tiger = new Predators("Тигр", 1, "тайга", 8, "мясо");
        Animal bear = new Predators("Медведь", 5, "лес", 5, "всеядный");
        Animal frog = new Amphibians("Лягушка", 1, "болото");
        Animal snake = new Amphibians("Уж пресноводный", 1, "побережье реки");
        Animal peacock = new Flightless("Ходящий", "Павлин", 2, "Джунгли");
        Animal penguin = new Flightless("Плавающий", "Пингвин", 3, "Антарктида");
        Animal dodo = new Flightless("Ходящий", "Птица Додо", 1, "Леса - степи");

        Animal[] animal = new Animal[]{gazel, giraffe, horse, hyena, tiger, bear, frog, snake, peacock, penguin, dodo};

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);
        }
    }



}