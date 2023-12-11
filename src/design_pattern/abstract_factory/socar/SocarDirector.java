package design_pattern.abstract_factory.socar;

import design_pattern.abstract_factory.Director;

public class SocarDirector implements Director {
    @Override
    public void getCompanyDirector() {
        System.out.println("Soccar director");
    }
}
