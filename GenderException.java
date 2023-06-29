package Seminar_3_Homework_Exceptions;
public class GenderException extends Exception {
    String data;

    public GenderException(String inputData) {
        this.data = inputData;
    }

    @Override
    public String getMessage() {
        return "Неправильно указан пол: '" + data + "'!\n" +
                "Формат ввода пола: m или f.";
    }

    public enum Gender {
        m,
        f

    }
}
