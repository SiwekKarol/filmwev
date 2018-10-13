import java.util.Scanner;

public class FilmwebController {

    private static final int ADD_MOVIE = 1;
    private static final int REMOVE_MOVIE = 2;
    private static final int SEARCH_MOVIE = 3;
    private static final int END = 4;

    private MovieDatabase database = new MovieDatabase();
    private UIService uiService = new UIService();
    private FileService fileService = new FileService()();

    void mainLoop() {
        int option;
        do {
            showOptions();
            option = readOption();
            executeOption(option);
        } while (option != END);
    }

    void showOptions() {
        System.out.println(ADD_MOVIE + " = Dodanie filmu");
        System.out.println(REMOVE_MOVIE + " = Usówanie filmu");
        System.out.println(SEARCH_MOVIE + " = Wyszukaj film");
        System.out.println(END + " = Koniec programu");
    }

    int readOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numer opcji");
        int optionNumber = scanner.nextInt();
        return optionNumber;
    }

    void executeOption(int opt) {
        switch (opt) {
            case ADD_MOVIE:
                addMovie();
                break;
            case REMOVE_MOVIE:
                removeMovie();
                break;
            case SEARCH_MOVIE:

                break;
            case END:
                exit();
                break;
            default:
                System.out.println("Nieznana opcja");
        }
    }

    void exit(){
        fileService.save
    }

    private void addMovie() {
        Movie movie = uiService.readMovie();
        try {
            database.add(movie);
        } catch (DuplicateMovieException e) {
            System.out.println("Nie można dodać filmu o takim samym Id");
        }
    }

    private void removeMovie() {
        int movieId = uiService.readMovieId();
        database.removeById(movieId);
    }
}
