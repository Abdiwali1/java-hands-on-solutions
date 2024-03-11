package testbase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestBase {
    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    protected final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    public void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    /*
        we can add multiple inputs to the ByteArrayInputStream by giving a String with line breaks:
            "7\n10\n100" -> this input would give 3 inputs, which would provide inputs for 3 Scanner methods
        the below overloaded version with a var arg is to make it easier for us to use. Instead of writing the line breaks as we create the tests we just need to pass each test value as String array elements:
        we can use the below method like this:
            provideInput("7", "10", "100")

        * Note the datatypes don't seem to matter. Passing the numbers as Strings still satisfies a nextInt() call
        so if a task needs different types of inputs it will work the same way:
            provideInput("5", "hello", "world")
     */

    public void provideInput(String... arr) {
        provideInput(String.join("\n", arr));
    }

    /*
        simplifyOutput() will reduce the output of a program, removing everything before the defined text parameter benchmark
        This method is useful to test tasks with Scanner inputs. We don't need to match the questions being asking with Scanner and can instead focus on the output we expect

         See m10_string.Party for example use
         another example: m09_class_object.ComputerBuilder
    */
    public String simplifyOutput(String text){
        String output = outContent.toString().trim();
        return output.substring(output.indexOf(text));
    }

}
