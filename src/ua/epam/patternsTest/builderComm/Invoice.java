package ua.epam.patternsTest.builderComm;

import java.math.BigDecimal;
import java.util.Map;

public class Invoice {

    private Map<ServiceType, BigDecimal> services;

    public Map<ServiceType, BigDecimal> getServices() {
        return services;
    }

    public void setServices(Map<ServiceType, BigDecimal> services) {
        this.services = services;
    }
}
