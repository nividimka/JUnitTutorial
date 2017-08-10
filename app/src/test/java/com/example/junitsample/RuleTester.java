package com.example.junitsample;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import org.junit.Rule;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by Tom on 10.08.2017.
 */

public class RuleTester {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    @Rule
    public CustomRule rule = new CustomRule();
    @Test
    public void testUsingTempFolder() throws IOException {
        File createdFolder = folder.newFolder("newfolder");
        File createdFile = folder.newFile("myfilefile.txt");
        assertTrue(createdFile.exists());
    }
}
