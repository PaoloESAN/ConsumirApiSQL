
package abdconsumirapi;

public class AbdConsumirApi {
    public static void main(String[] args) {
        PeticionesSql petSql = new PeticionesSql();
        try {
            petSql.crearBase("holamundo");
            System.out.println("Creado correctamente");
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        try {
            petSql.eliminarBase("holamundo");
            System.out.println("Eliminado correctamente");
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }

}
