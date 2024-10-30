import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {
    @Test
    public void assertJTest() {
        String name1 = "이승아";
        String name2 = "이도경";
        String name3 = "김명진";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();
    }
}
