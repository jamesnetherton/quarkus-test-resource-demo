package org.acme;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
@QuarkusTestResource(FtpTestResource.class)
public class FtpServerTest {

    @Test
    public void testSomething() {
        Assertions.assertTrue(true);
    }
}
