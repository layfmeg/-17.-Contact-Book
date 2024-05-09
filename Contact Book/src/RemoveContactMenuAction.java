import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {

    private ImMemoryContacts memoryContacts;
    private Scanner scanner;

    public RemoveContactMenuAction(ImMemoryContacts memoryContacts, Scanner scanner) {
        this.memoryContacts = memoryContacts;
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return "Видалити контакт";
    }

    @Override
    public void execute() {
        System.out.println("Введіть індекс контакту, який ви хочете видалити:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        memoryContacts.remove(index - 1);
        System.out.println("Контакт видалено успішно.");
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
