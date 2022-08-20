import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

    private boolean checkPassword() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter password: ");
            String enteredPassword = scan.nextLine();
            if(enteredPassword.equals(this.password)){
                System.out.println("Correct!");
                return true;
            } else {
                System.out.println("Wrong!");
            }
        }

        return false;
    }

    @Override
    public void createPage(String title, String text) {
        if (checkPassword()) {
            super.createPage(title, text);
        } else {
            System.out.println("Operation createPage WONT happen");
        }
    }

    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        if (checkPassword()) {
            super.replaceText(pageNumber, text);
        } else {
            System.out.println("Operation replaceText WONT happen");
        }
    }

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        if (checkPassword()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("Operation deleteText WONT happen");
        }
    }

    @Override
    public void previewAllPages() {
        if (checkPassword()) {
            super.previewAllPages();
        } else {
            System.out.println("Operation previewAllPages WONT happen");
        }
    }
}
