package design_pattern.abstract_factory.cybernet;

import design_pattern.abstract_factory.Auditor;
import design_pattern.abstract_factory.CompanyFactory;
import design_pattern.abstract_factory.Director;

public class CybernetFactory implements CompanyFactory {
    @Override
    public Director getDirector() {
        return new CybernetDirector();
    }

    @Override
    public Auditor getAuditor() {
        return new CybernetAuditor();
    }
}
