package design_pattern.abstract_factory.cybernet;

import design_pattern.abstract_factory.Auditor;

public class CybernetAuditor implements Auditor {
    @Override
    public void getCompanyAuditor() {
        System.out.println("Cybernet auditor");
    }
}
