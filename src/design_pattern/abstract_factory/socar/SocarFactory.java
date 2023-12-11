package design_pattern.abstract_factory.socar;

import design_pattern.abstract_factory.Auditor;
import design_pattern.abstract_factory.CompanyFactory;
import design_pattern.abstract_factory.Director;

public class SocarFactory implements CompanyFactory {
    @Override
    public Director getDirector() {
        return new SocarDirector();
    }

    @Override
    public Auditor getAuditor() {
        return new SocarAuditor();
    }
}
