package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import um.fds.agl.ter24.entities.TERManager;
import um.fds.agl.ter24.entities.Teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class TeacherTest {


    TERManager manager = new TERManager();
    @Mock
    Teacher teacher = new Teacher("John","doe", manager);
    @BeforeEach
    void setUp() {

    }

    @Test
    void checkName(){
        when(teacher.getFirstName()).thenReturn("Bane");
        assertEquals("Bane",teacher.getFirstName());
    }
}
