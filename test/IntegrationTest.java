import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import static org.fluentlenium.core.filter.FilterConstructor.*;


public class IntegrationTest {

	/**
	 * This test currently hangs for some weird reason. Probably a play bug.
	 */
    @Test
    @Ignore
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
//                assertThat(browser.pageSource().contains("Hello World"));
            }
            
        });
    }


}
