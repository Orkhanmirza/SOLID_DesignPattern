package design_pattern.abstract_factory;

import design_pattern.abstract_factory.cybernet.CybernetFactory;
import design_pattern.abstract_factory.socar.CompanyCategory;
import design_pattern.abstract_factory.socar.SocarFactory;

public class CompanyApp {
    public static void main(String[] args) {
      var companyFactory=getCompanyFactory(CompanyCategory.SOCAR);
      var auditor =companyFactory.getAuditor();
      var director=companyFactory.getDirector();

      auditor.getCompanyAuditor();
      director.getCompanyDirector();
    }

    private static CompanyFactory getCompanyFactory(CompanyCategory category){
        return switch (category){
            case SOCAR -> new SocarFactory();
            case CYBERNET -> new CybernetFactory();
        };
    }
}
