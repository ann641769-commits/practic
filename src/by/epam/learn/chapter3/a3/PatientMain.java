package by.epam.learn.chapter3.a3;

public class PatientMain {

    // a) список пациентов с заданным диагнозом
    public static void printByDiagnosis(Patient[] patients, String diagnosis) {
        System.out.println("Пациенты с диагнозом " + diagnosis + ":");
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals(diagnosis)) {
                System.out.println(patient);
            }
        }
    }

    // b) список пациентов, номер карты которых лежит в интервале [min, max]
    public static void printByCardNumber(Patient[] patients, int min, int max) {
        System.out.println("Пациенты с номером карты от " + min + " до " + max + ":");
        for (Patient patient : patients) {
            if (patient.getCardNumber() >= min && patient.getCardNumber() <= max) {
                System.out.println(patient);
            }
        }
    }

    public static void main(String[] args) {
        Patient[] patients = {
                new Patient(1, "Иванов", "Иван", "Иванович", "г. Москва, ул. Ленина, 5", "+79241234567", 1001, "Грипп"),
                new Patient(2, "Петров", "Петр", "Петрович", "г. Москва, ул. Мира, 10", "+79241234568", 1015, "Ангина"),
                new Patient(3, "Сидорова", "Анна", "Сергеевна", "г. Улан-Удэ, ул. Гоголя, 3", "+79241234569", 1022, "Грипп"),
                new Patient(4, "Козлов", "Олег", "Андреевич", "г. Иркутск, ул. Победы, 7", "+79241234560", 1040, "Гастрит"),
                new Patient(5, "Волков", "Дмитрий", "Игоревич", "г. Улан-Удэ, ул. Зеленая, 8", "+79241234562", 1067, "Грипп")
        };

        printByDiagnosis(patients, "Грипп");
        System.out.println();
        printByCardNumber(patients, 1010, 1050);
    }
}
