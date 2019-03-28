package at.htl.klassestudent;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class KlasseStudentTest {

    @Test
    public void testA() {
        Student[] testArray = {
                new Student("Sepp", "Leberkäse"),
                new Student("Günther", "Specht"),
                new Student("Simon", "Leder"),
                new Student("Dante", "Tante"),
                new Student("Dr", "Gert"),
                new Student("Vorname", "Nachname"),
                new Student("Otto", "ottO"),
                new Student("Nudel", "Salat"),
                new Student("Random", "Name"),
                new Student("Soletti", "Pringles")
        };
        Student[] expected = testArray.clone();

        Klasse klasse = new Klasse(0, testArray);
        klasse.sortInsertion();

        Arrays.sort(expected);

        assertThat(klasse.getStudents(), is(expected));
    }

    @Test
    public void testB() {
        Student[] testArray = {
                new Student("Bernhard", "Ehrenmüller"),
                new Student("Bertl", "Frank"),
                new Student("Ohrenarzt", "Leimhofer"),
        };
        Student[] expected = testArray.clone();

        Klasse klasse = new Klasse(0, testArray);
        klasse.sortBubble();

        Arrays.sort(expected);

        assertThat(klasse.getStudents(), is(expected));
    }
}