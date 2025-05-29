
package abdconsumirapi;

import java.net.URI;
import org.springframework.web.client.RestTemplate;

public class PeticionesSql {

    public PeticionesSql() {
    }
    
    private RestTemplate restTemplate = new RestTemplate();
    private String baseUrl = "http://localhost:8080/api";

    public String crearBase(String nombre) throws Exception  {
        URI uri = new URI(baseUrl + "/crearBase?nombre=" + nombre);
        return restTemplate.postForObject(uri, null, String.class);
    }

    public String eliminarBase(String nombre) throws Exception {
        URI uri = new URI(baseUrl + "/eliminarBase?nombre=" + nombre);
        return restTemplate.postForObject(uri, null, String.class);
    }

    public String consultaBase(String nombre, String sql) throws Exception {
        URI uri = new URI(baseUrl + "/consultaBase?nombre=" + nombre + "&sql=" + sql);
        return restTemplate.postForObject(uri, null, String.class);
    }
}
