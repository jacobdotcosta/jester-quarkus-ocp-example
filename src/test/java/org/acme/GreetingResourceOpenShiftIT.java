package org.acme;

import io.jester.api.OpenShiftServiceConfiguration;
import io.jester.api.RunOnOpenShift;

@RunOnOpenShift
@OpenShiftServiceConfiguration(forService = "app", useInternalService = true)
public class GreetingResourceOpenShiftIT extends GreetingResourceIT {
}
