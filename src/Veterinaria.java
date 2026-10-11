public class Veterinaria {
    public static void main(String[] args) {
        Mascota[] estante = new Mascota[4];

        estante[0] = new Mascota("Luna", "perro",28.5,9);
        estante[1] = new Mascota("Michi", "Gato", 4.2,3);
        estante[2] = new Mascota("Rocky", "Perro",12.0, 5);
        estante[3] = new Mascota("Pepa", "Conejo", 2.1,1);

        int totalRecaudado = 0;
        for (int i = 0; i < estante.length; i++) {
            Mascota p = estante[i];

            if (p != null) {
                System.out.println(p.descripcion() + "- valor consulta: " + p.ValorConsulta());
                totalRecaudado += p.ValorConsulta();
            }

        }

        System.out.println("TOTAL RECAUDADO: "+totalRecaudado);

        System.out.println("\n--- Probando el set de peso con Michi ---");
        estante[1].setPeso(-3);
        System.out.println(estante[1].descripcion());

   }
}

