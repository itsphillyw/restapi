package example.runner;

import example.amazon.RunAmazon;
import example.belly.RunBelly;
import example.browser.RunBrowser;
import example.resttesting.RunRESTtesting;
import example.wikipedia.RunWikipedia;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Suite;
import RESTTesting.PhilUtils;
import uk.gov.homeoffice.virtuoso.framework.runner.SuiteRunner;

import java.time.LocalDateTime;

@Suite.SuiteClasses({RunBelly.class, RunWikipedia.class, RunAmazon.class, RunBrowser.class, RunRESTtesting.class})
//, PhilUtils.class
public class RunAllExamples extends SuiteRunner{

    @BeforeClass
    public final static void setup() {
                registerRunID("Running example tests");
        System.out.println(LocalDateTime.now() + ": Testing starting");
    }

    @AfterClass
    public final static void tearDown() {
        System.out.println(LocalDateTime.now() + ": Testing completed");
    }
}
