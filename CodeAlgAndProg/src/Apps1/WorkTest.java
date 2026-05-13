package Apps1;

import GeneralClasses.Work;

public class WorkTest {

    public static void main(String[] args) {
        System.out.println("--- PRUEBAS DE CLASE WORK (OBRAS) ---");

        // Creamos una obra con técnica 'O' (Óleo) y dimensiones grandes
        // Parámetros: Autor, Obra, Técnica, PrecioBase, Alto, Ancho
        Work obra1 = new Work("Carlos Castillo", "Estudio en Aarhus", 'O', 2000.0, 50.0, 40.0);

        // Creamos otra obra con técnica 'G' (Grabado) y dimensiones pequeñas
        Work obra2 = new Work("Picasso", "Boceto 1", 'G', 1000.0, 10.0, 10.0);

        // 1. Probar toString
        System.out.println("Info Obra 1: " + obra1.toString());
        System.out.println("Info Obra 2: " + obra2.toString());

        // 2. Probar cálculo de precio final
        // Supongamos que el pintor que tiene descuento es "Carlos Castillo" con un 15%
        String pintorConDescuento = "Carlos Castillo";
        double descuento = 15.0;

        System.out.println("\n--- Cálculo de Precios Finales ---");
        System.out.println("Precio Final Obra 1: $" + obra1.calcPrecioFinal(pintorConDescuento, descuento));
        System.out.println("Precio Final Obra 2: $" + obra2.calcPrecioFinal(pintorConDescuento, descuento));

        // 3. Probar método equals
        Work obraDuplicada = new Work("Carlos Castillo", "Estudio en Aarhus");
        System.out.println("\n¿Es la obra 1 igual a la obra duplicada?: " + obra1.equals(obraDuplicada));
    }
}
