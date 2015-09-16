package DailyProgrammer.Challenge219;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TaskListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testPrintList() throws Exception {
        TaskList testList = new TaskList();
        testList.printList();

        assertEquals("To Do List:\r\n", outContent.toString());
    }

    @Test
    public void testAddTask() throws Exception {
        TaskList testList = new TaskList();
        testList.add("Test");
        testList.printList();

        assertEquals("To Do List:\r\n" + "- Test\r\n", outContent.toString());
    }

    @Test
    public void testRemoveTask() throws Exception {
        TaskList testList = new TaskList();
        testList.add("Test");
        testList.add("Remove this");
        testList.remove("Remove this");
        testList.printList();

        assertEquals("To Do List:\r\n" + "- Test\r\n", outContent.toString());
    }

    @Test
    public void testRemoveTaskFromEmptyList() throws Exception {
        TaskList testList = new TaskList();
        testList.remove("Remove this");
        testList.printList();

        assertEquals("To Do List:\r\n", outContent.toString());
    }
}