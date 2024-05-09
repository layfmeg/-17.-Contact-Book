import java.util.Scanner;

public class EditPhoneNumberMenuAction implements MenuAction {

    private ImMemoryContacts memoryContacts;
    private Scanner scanner;

    public EditPhoneNumberMenuAction(ImMemoryContacts memoryContacts, Scanner scanner) {
        this.memoryContacts = memoryContacts;
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return "Редагувати номер телефону контакту";
    }

    @Override
    public void execute() {
        System.out.println("Введіть індекс контакту, номер якого ви хочете змінити:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.println("Введіть новий номер телефону:");
        String newPhoneNumber = scanner.nextLine();
        memoryContacts.getAll().get(index - 1).setPhoneNumber(newPhoneNumber);
        System.out.println("Номер телефону контакту відредаговано успішно.");
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}