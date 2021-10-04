package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaChatTestSuite {

    @Test
    public void testKodilla(){

        //Given
        KodillaUser studentDawid  = new KodillaUser("Dawid");
        KodillaUser studentMarta = new KodillaUser("Marta");
        KodillaUser studentAnia = new KodillaUser("Ania");
        KodillaUser studentOla = new KodillaUser("Bartek");

        Mentor mentorAdrian = new Mentor("Adrian");
        Mentor mentorAnia= new Mentor( "Ania");
        Mentor mentorBartek = new Mentor( "Bartek");

        studentDawid.studentHasMentor(mentorAdrian);
        studentMarta.studentHasMentor(mentorAdrian);
        studentAnia.studentHasMentor(mentorAnia);
        studentOla.studentHasMentor(mentorBartek);

        //When
        studentDawid.addPostKodilla("Did I do good the task ?");
        studentMarta.addPostKodilla("I don't know it");
        studentAnia.addPostKodilla("Do I need this class ?");
        studentOla.addPostKodilla("I have done it");

        studentDawid.hasAcceptedTaskBy(mentorAdrian);
        studentMarta.hasUnacceptedTaskBy(mentorAdrian);
        studentOla.hasAcceptedTaskBy(mentorBartek);

        //Then
        assertEquals(2, mentorAdrian.getTasksUpdateCount());
        assertEquals(1, mentorAnia.getTasksUpdateCount());
        assertEquals(1, mentorBartek.getTasksUpdateCount());
    }
}
