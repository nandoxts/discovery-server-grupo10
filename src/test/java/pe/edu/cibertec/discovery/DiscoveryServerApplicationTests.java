package pe.edu.cibertec.discovery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DiscoveryServerApplicationTests {

    @Test
    void clasePrincipalExiste() {
        // El servicio depende de Eureka/Config en ejecucion; aqui solo se valida la clase principal.
        assertNotNull(new DiscoveryServerApplication());
    }
}
