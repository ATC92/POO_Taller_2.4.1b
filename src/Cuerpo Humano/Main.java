import java.util.ArrayList;

class CuerpoHumano {
    private Corazon corazon;
    private ArrayList<Pulmon> pulmones;
    private Higado higado;
    private Apendice apendice;

    // Constructor
    public CuerpoHumano(Corazon corazon, Higado higado, Apendice apendice) {
        this.corazon = corazon;
        this.higado = higado;
        this.apendice = apendice;
        this.pulmones = new ArrayList<Pulmon>();
    }

    // Métodos para agregar un pulmón
    public void agregarPulmon(Pulmon pulmon) {
        pulmones.add(pulmon);
    }

    // Getters
    public Corazon getCorazon() {
        return corazon;
    }

    public ArrayList<Pulmon> getPulmones() {
        return pulmones;
    }

    public Higado getHigado() {
        return higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    // Clase anidada Corazón
    class Corazon {
        private int frecuencia; // Frecuencia cardíaca

        // Constructor
        public Corazon(int frecuencia) {
            this.frecuencia = frecuencia;
        }

        // Getters y Setters
        public int getFrecuencia() {
            return frecuencia;
        }

        public void setFrecuencia(int frecuencia) {
            this.frecuencia = frecuencia;
        }
    }

    // Clase anidada Pulmón
    class Pulmon {
        private int capacidad; // Capacidad pulmonar en litros

        // Constructor
        public Pulmon(int capacidad) {
            this.capacidad = capacidad;
        }

        // Getters y Setters
        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }
    }

    // Clase anidada Hígado
    class Higado {
        private String funcionalidad; // Funcionalidad del hígado

        // Constructor
        public Higado(String funcionalidad) {
            this.funcionalidad = funcionalidad;
        }

        // Getters y Setters
        public String getFuncionalidad() {
            return funcionalidad;
        }

        public void setFuncionalidad(String funcionalidad) {
            this.funcionalidad = funcionalidad;
        }
    }

    // Clase anidada Apéndice
    class Apendice {
        private String estado; // Estado del apéndice (saludable, inflamado, etc.)

        // Constructor
        public Apendice(String estado) {
            this.estado = estado;
        }

        // Getters y Setters
        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }
}

// Programa para crear un objeto CuerpoHumano
public class Main {
    public static void main(String[] args) {
        // Crear componentes
        CuerpoHumano cuerpoHumano = new CuerpoHumano(null, null, null);
        CuerpoHumano.Corazon corazon = cuerpoHumano.new Corazon(80);
        CuerpoHumano.Higado higado = cuerpoHumano.new Higado("Funcionando");
        CuerpoHumano.Apendice apendice = cuerpoHumano.new Apendice("Correcto");

        cuerpoHumano = new CuerpoHumano(corazon, higado, apendice);

        // Agregar pulmones
        cuerpoHumano.agregarPulmon(cuerpoHumano.new Pulmon(6));
        cuerpoHumano.agregarPulmon(cuerpoHumano.new Pulmon(6));

        // Mostrar información del cuerpo humano
        System.out.println("Frecuencia del Corazón: " + cuerpoHumano.getCorazon().getFrecuencia() + " bpm");
        System.out.println("Funcionalidad del Hígado: " + cuerpoHumano.getHigado().getFuncionalidad());
        System.out.println("Estado del Apéndice: " + cuerpoHumano.getApendice().getEstado());

        // Mostrar información de los pulmones
        for (CuerpoHumano.Pulmon pulmon : cuerpoHumano.getPulmones()) {
            System.out.println("Capacidad del Pulmón: " + pulmon.getCapacidad() + " litros");
        }
    }
}
