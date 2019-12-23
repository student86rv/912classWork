package ua.epam.patternsTest.builderComm;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InvoiceGenerator {

    //<service, units>
    Invoice generateInvoice(Map <ServiceType, Integer> map) {
        Invoice invoice = new Invoice();

        invoice.setServices(new HashMap<>());

        Map<ServiceType, BigDecimal> total = new HashMap<>();

        map.keySet().forEach(serviceType -> invoice.getServices().put(serviceType, new BigDecimal( map.get(serviceType) * serviceType.getPrice())));

        return invoice;
    }
}
