package tests;

import org.checkerframework.framework.test.DefaultCheckerTest;
import org.checkerframework.framework.test.TestUtilities;

import java.io.File;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

/**
 * Tests the ClassVal Checker.
 *
 * @author smillst
 *
 */
public class ClassValTest extends DefaultCheckerTest {

    public ClassValTest(File testFile) {
        super(testFile, org.checkerframework.common.reflection.ClassValChecker.class, "classval", "-Anomsgtext");
    }

    @Parameters
    public static Collection<Object[]> getTestFiles() {
        return TestUtilities.findNestedJavaTestFiles("classval");
    }
}
