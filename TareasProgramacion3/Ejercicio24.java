package TareasProgramacion3;

public class Ejercicio24 {
    public static void main(String[] args) {
        // Filas: Meses (12 meses), Columnas: Cereales (Arroz, Avena, Cebada, Trigo)
        double[][] produccion = {
            {120, 85, 90, 110}, // Enero
            {130, 80, 95, 105}, // Febrero
            {115, 90, 85, 100}, // Marzo
            {140, 95, 100, 120},// Abril
            {125, 88, 92, 115}, // Mayo
            {135, 92, 98, 125}, // Junio
            {150, 100, 105, 130},// Julio
            {145, 96, 102, 128},// Agosto
            {125, 85, 90, 110}, // Septiembre
            {130, 89, 94, 112}, // Octubre
            {160, 105, 110, 140},// Noviembre
            {155, 102, 108, 135} // Diciembre
        };

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        double sumaTotal = 0;
        int totalElementos = 0;
        double[] totalPorMes = new double[12];
        
        // Calcular sumas
        for (int i = 0; i < 12; i++) {
            double sumaMes = 0;
            for (int j = 0; j < 4; j++) {
                sumaMes += produccion[i][j];
                sumaTotal += produccion[i][j];
                totalElementos++;
            }
            totalPorMes[i] = sumaMes;
        }

        // a. Promedio anual de toneladas cosechadas (general por celda o mensual)
        double promedioGeneral = sumaTotal / totalElementos;
        double promedioMensual = sumaTotal / 12;

        System.out.println("a. Promedio anual (por registro): " + promedioGeneral + " | Promedio mensual total: " + promedioMensual);

        // b y c. Meses con cosecha superior e inferior al promedio mensual
        int superiores = 0, inferiores = 0;
        for (int i = 0; i < 12; i++) {
            if (totalPorMes[i] > promedioMensual) superiores++;
            else if (totalPorMes[i] < promedioMensual) inferiores++;
        }
        System.out.println("b. Meses con cosecha superior al promedio: " + superiores);
        System.out.println("c. Meses con cosecha inferior al promedio: " + inferiores);

        // d. Mes con mayor producción total
        int mesMayor = 0;
        double mayorProd = totalPorMes[0];
        for (int i = 1; i < 12; i++) {
            if (totalPorMes[i] > mayorProd) {
                mayorProd = totalPorMes[i];
                mesMayor = i;
            }
        }
        System.out.println("d. El mes con mayor número de toneladas producidas fue: " + meses[mesMayor] + " con " + mayorProd + " toneladas.");
    }
}