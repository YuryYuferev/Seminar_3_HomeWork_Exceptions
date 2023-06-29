package Seminar_3_Homework_Exceptions;
public class PhoneException extends Exception {
    String data;

    public PhoneException(String inputData) {
        this.data = inputData;
    }

    @Override
    public String getMessage() {
        return "Не удалось преобразовать " + data + " в телефонный номер.\n" +
                "Формат ввода номера телефона - 10 цифр: 9997775533";
    }
}
