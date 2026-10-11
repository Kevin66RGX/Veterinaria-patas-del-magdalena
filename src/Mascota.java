public class Mascota {
    private String Nombre;
    private String Especie;
    private double Peso;
    private int Edad;

    public Mascota(String Nombre, String Especie, double Peso, int Edad) {
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Peso = Peso;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public double getPeso() {
        return Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setPeso(double NuevoPeso) {
        if (NuevoPeso <= 0) {
            System.out.println("EL PESO NO PUEDE SER 0 O MENOS");
            return;
        }
        this.Peso = NuevoPeso;
    }

    public void setEdad(int NuevaEdad) {
        if (NuevaEdad < 0) {
            System.out.println("LA EDAD NO PUEDE SER MENOR QUE 0");
            return;
        }
        this.Edad = NuevaEdad;
    }

    public int ValorConsulta() {
        int valor = 35000;

        if (Peso > 25) {
            valor = 55000;
        } else if (Peso > 10) {
            valor = 45000;
        }

        if (Edad >= 8) {
            valor += 12000;
        }
        return valor;
    }

    public String descripcion() {
        return Nombre + " (" + Especie + ", " + Peso + " kg, " + Edad + " años)";
    }

    public void consulta() {
        System.out.println(Nombre + ", " + Especie + ", " + Peso + " kg, " + Edad + " años");
    }

}