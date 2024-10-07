import java.util.ArrayList;

class Bicicleta {
    private String marca;
    private String modelo;
    private ArrayList<Rueda> ruedas;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(String marca, String modelo, Cuadro cuadro) {
        this.marca = marca;
        this.modelo = modelo;
        this.cuadro = cuadro;
        this.ruedas = new ArrayList<Rueda>();
    }

    // Métodos para agregar una rueda
    public void agregarRueda(Rueda rueda) {
        ruedas.add(rueda);
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    // Clase anidada Rueda
    class Rueda {
        private String tamaño;
        private String tipo;
        private double presion;

        // Constructor
        public Rueda(String tamaño, String tipo, double presion) {
            this.tamaño = tamaño;
            this.tipo = tipo;
            this.presion = presion;
        }

        // Getters y Setters
        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getPresion() {
            return presion;
        }

        public void setPresion(double presion) {
            this.presion = presion;
        }
    }

    // Clase anidada Cuadro
    class Cuadro {
        private String material;
        private String color;
        private String tamaño;

        // Constructor
        public Cuadro(String material, String color, String tamaño) {
            this.material = material;
            this.color = color;
            this.tamaño = tamaño;
        }

        // Getters y Setters
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }
    }
}

// Programa para crear un objeto Bicicleta
public class Main {
    public static void main(String[] args) {
        // Crear una bicicleta primero
        Bicicleta bicicleta = new Bicicleta("Trek", "X-Caliber", null);

        // Crear un cuadro usando la instancia de Bicicleta
        Bicicleta.Cuadro cuadro = bicicleta.new Cuadro("Aluminio", "Rojo", "Mediano");

        // Establecer el cuadro en la bicicleta
        bicicleta = new Bicicleta("Trek", "X-Caliber", cuadro);

        // Agregar ruedas
        bicicleta.agregarRueda(bicicleta.new Rueda("29\"", "MTB", 2.0));
        bicicleta.agregarRueda(bicicleta.new Rueda("29\"", "MTB", 2.0));

        // Mostrar información de la bicicleta
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Cuadro: " + bicicleta.getCuadro().getColor() + " de " + bicicleta.getCuadro().getMaterial());
        
        // Mostrar información de las ruedas
        for (Bicicleta.Rueda rueda : bicicleta.getRuedas()) {
            System.out.println("Rueda: " + rueda.getTamaño() + ", Tipo: " + rueda.getTipo() + ", Presión: " + rueda.getPresion() + " bar");
        }
    }
}
