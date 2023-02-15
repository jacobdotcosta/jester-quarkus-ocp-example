package org.acme;

import io.jester.api.RunOnOpenShift;

@RunOnOpenShift(deleteProjectAfterAll = false)
public class GreetingResourceIT extends GreetingResourceTest {
    // Execute the same tests but in packaged mode.
}
