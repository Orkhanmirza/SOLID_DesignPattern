package design_pattern.abstract_factory.cybernet;

import design_pattern.abstract_factory.Director;

public class CybernetDirector implements Director {
    @Override
    public void getCompanyDirector() {
        System.out.println("Cybernet director");
    }
}
