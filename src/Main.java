public class Main {
    public static void main(String[] args) {
        int CurrentYear = 2022;

        Human maxim = new Human (35, "Максим","Минск","бренд-менеджер");
        Human anya = new Human (29,"Аня", "Москва", "методист образовательных программ");
        Human katya = new Human (28,"Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human (27, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.city + ". Я родился в " + (CurrentYear - maxim.age) + " году. Я работаю на должности " + maxim.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.city + ". Я родился в " + (CurrentYear - anya.age) + " году. Я работаю на должности " + anya.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.city + ". Я родился в " + (CurrentYear - katya.age) + " году. Я работаю на должности " + katya.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.city + ". Я родился в " + (CurrentYear - artem.age) + " году. Я работаю на должности " + artem.speciality + ". Будем знакомы!");
    }
}