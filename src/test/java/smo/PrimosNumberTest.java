package smo;

import org.junit.Assert;
import org.junit.Test;

public class PrimosNumberTest {

    @Test
    public void numericPrintPrimosList() {
        int primo = PrimosNumber.getPrimoOnPositionInRangeZeroToMil(0);
        Assert.assertEquals(primo, 2);
    }
}
