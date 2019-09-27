package guru.springframework.didemo.services;

public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primado";
    }
}
