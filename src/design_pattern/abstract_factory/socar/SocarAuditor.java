package design_pattern.abstract_factory.socar;

import design_pattern.abstract_factory.Auditor;

public class SocarAuditor implements Auditor {
    @Override
    public void getCompanyAuditor() {
        System.out.println("Soccar auditor");
    }
}
