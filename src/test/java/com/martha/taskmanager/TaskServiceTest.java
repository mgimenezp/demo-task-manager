
package com.martha.taskmanager;

import com.martha.taskmanager.model.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    @Test
    public void testTaskCreation() {
        Task task = new Task("Aprender Jenkins");
        assertEquals("Aprender Jenkins", task.getDescription());
        assertFalse(task.isCompleted());
    }
}
