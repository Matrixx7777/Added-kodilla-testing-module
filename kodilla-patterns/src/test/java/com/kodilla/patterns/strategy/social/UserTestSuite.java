package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User dawid = new Millenials("Dawid");
        User ania = new ZGeneration("Ania");
        User martyna = new YGeneration("Martyna");

        //When
        String dawidLogsIn = dawid.sharePost();
        System.out.println("Dawid\n" + dawidLogsIn + "\n");
        String aniaLogsIn = ania.sharePost();
        System.out.println("Ania\n" + aniaLogsIn + "\n");
        String martynaLogsIn = martyna.sharePost();
        System.out.println("Martyna\n" + martynaLogsIn + "\n");

        //Then
        assertEquals("FACEBOOK \n" +"login: \n" + "password:\n", dawidLogsIn);
        assertEquals("TWITTER \n" + "login: \n" + "password:\n", aniaLogsIn);
        assertEquals("SNAPCHAT \n" + "login: \n" + "password:\n", martynaLogsIn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User dawid = new ZGeneration("Dawid");

        //When
        dawid.setSocialPublisher(new TwitterPublisher());
        String dawidHasntTwitter = dawid.sharePost();
        System.out.println("Dawid hasn't Twitter\n" + dawidHasntTwitter);

        //Then
        assertEquals("TWITTER \n" + "login: \n" + "password:\n", dawidHasntTwitter);
    }
}
