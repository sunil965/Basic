package test;

import static java.lang.System.*;

enum ExpectedNumberOfTPM {
    BETWEEN_0_AND_20("Upto 20"),
    BETWEEN_21_AND_50("21-50"),
    MORE_THAN_50("More than 50");

    private final String expectedNoOfTPM;

    ExpectedNumberOfTPM(String tpm) {
        expectedNoOfTPM = tpm;
    }

    public String getExpectedNoOfTPM() {
        return this.expectedNoOfTPM;
    }
}

public class EnumTest {
    public static void main(String[] args){
        boolean b = "Upto 20".equalsIgnoreCase(ExpectedNumberOfTPM.BETWEEN_0_AND_20.getExpectedNoOfTPM());

        out.println(ExpectedNumberOfTPM.BETWEEN_0_AND_20);
        out.println(ExpectedNumberOfTPM.BETWEEN_0_AND_20.name());
        out.println(ExpectedNumberOfTPM.BETWEEN_0_AND_20.getExpectedNoOfTPM());
    }
}
