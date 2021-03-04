public class Main {

public static void main(String[] args) {

        final String nombreEmpresa = "Distribuidora Tupperware";

        double costoUnitario = 10; // Q45.00
        int cantidadProducto = 100;
        double totalAPagar = costoUnitario*cantidadProducto; // Q
        final double precioDeVenta = 20;
             final double IVA = 0.12; // 12%
        double TotalIVAPorUnidad = precioDeVenta*IVA;
        
        System.out.println("Costo por unidad: Q"+costoUnitario);
        System.out.println("Cantidad de producto: "+cantidadProducto);
        System.out.println("-------------------------");
        System.out.println("Total: Q"+totalAPagar);
        
        System.out.println("Venderse a: Q"+precioDeVenta);
        System.out.println("Impuesto establecido: "+IVA);
        System.out.println("Impuesto por unidad: Q"+TotalIVAPorUnidad);

        
        int cantidadProductovendido = 1000;
        
        double totalcobradoSinDescuento = cantidadProductovendido * precioDeVenta;
        
        double totalConDescuento = 0;
        double tipoDeDescuento = 0;
        if(cantidadProductovendido>=50) {
        	tipoDeDescuento= 0.05;
         totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*0.05);
        }
        
        if(cantidadProductovendido>=100) {
        	tipoDeDescuento= 0.15;
            totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*0.15);
        }
        
        if(cantidadProductovendido>=1000) {
        	tipoDeDescuento= 0.25;
            totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*0.25);
        }
        
        
        
        double impuestototalDeclarar = totalConDescuento *IVA;
        
        double ganacias = (totalcobradoSinDescuento - (cantidadProductovendido*costoUnitario))-IVA;
        
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Cantidad Vendida: "+cantidadProductovendido + " unidades");
        System.out.println("Total sin descuento: Q"+totalcobradoSinDescuento);
        System.out.println("Total con descuento: Q"+totalConDescuento);
        System.out.println("IVA a declarar: Q"+impuestototalDeclarar);
        System.out.println("Tipo de descuento "+ tipoDeDescuento);
        System.out.println("Ganancia: Q"+ ganacias);
     }

     }

