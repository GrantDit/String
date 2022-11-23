public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan"; // Храние имени
        String middleName = "Ivanovich";// Хранение отчества
        String lastName = "Ivanov"; // Храниние фамилии
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println();
        System.out.println("Задание 3");
        String firstName1 = "Семён"; //Хранение имени
        String middleName1 = "Семёнович"; // Хранение отчества
        String lastName1 = "Иванов"; // Хранение фамилии
        String fullName1 = firstName1 + " " + middleName1 + " " + lastName1;
        String newName = fullName1.replace('ё', 'е');
        System.out.println(firstName1 + " " + middleName1 + " " + lastName1); //До изменения
        System.out.println(newName); // После изменения "ё" на "е"
    }
}