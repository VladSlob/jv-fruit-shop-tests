package core.basesyntax.service.impl;

import core.basesyntax.service.ReportGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportGeneratorImplTest {
    private ReportGenerator reportGenerator;
    private Map<String, Integer> fruitStorage;

    @BeforeEach
    void setUp() {
        fruitStorage = new HashMap<>();
        reportGenerator = new ReportGeneratorImpl(fruitStorage);
    }

    @Test
    void createReport_validData_ok() {
        fruitStorage.put("banana", 100);
        fruitStorage.put("apple", 50);
        String expectedReport = "fruit,quantity\nbanana,100\napple,50\n";
        assertEquals(expectedReport, reportGenerator.createReport());
    }
}
