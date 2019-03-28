package at.htl.klassestudent;

public class Klasse {
    private int klassenbezeichnung;
    private Student[] students;

    Klasse(int klassenbezeichnung, Student[] students) {
        this.klassenbezeichnung = klassenbezeichnung;
        this.students = students;
    }

    public void sortBubble() {
        for (int i = students.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void sortInsertion() {
        Student[] newArray = new Student[students.length];

        for (int i = 0; i < students.length; i++) {
            int j = i - 1;

            while (j >= 0 && newArray[j].compareTo(students[i]) > 0) {
                newArray[j + 1] = newArray[j];
                j--;
            }

            newArray[j + 1] = students[i];
        }

        students = newArray;
    }

    private void swap(int i, int j) {
        Student help = students[i];
        students[i] = students[j];
        students[j] = help;
    }

    public int getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public Student[] getStudents() {
        return students;
    }
}