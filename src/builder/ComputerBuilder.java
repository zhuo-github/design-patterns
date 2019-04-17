package builder;

public interface ComputerBuilder {
    void buildCPU();
    void buildGraphicsCard();
    Computer retrieveResult();
}
