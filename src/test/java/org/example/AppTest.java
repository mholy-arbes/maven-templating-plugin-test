package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldMatchMavenProjectVersion() {
        assertEquals(MavenProps.PROJECT_VERSION, "1.0.0-SNAPSHOT");
    }
}
