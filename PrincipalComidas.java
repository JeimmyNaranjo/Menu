
import java.util.Scanner;

/**
 * Programa para encontrar el valor a pagar con impuesto y descuentos    * 
 * @author Jeimmy Naranjo   
 * @version 1
 */
public class PrincipalComidas  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada
        int TipoComida;
        char Plato;
        int cantidad;
        

        // Datos de salida
        double Precio, PrecioIVA, Descuento;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese el tipo de comida que desea:\n(1 = Vegetariana, 2 = No vegetariana, 3 = Rapidas)\n");
        TipoComida = teclado.nextInt();//.charAt(0); //Leer el primer caracter
        
        

        if (TipoComida == 1)
        {
            System.out.print("Digite el tipo de plato:\n( A = Sopas de vegetales, B = Ensaladas, C = Jugos)\n");
            
            Plato = teclado.next().charAt(0);
            while (Plato != 65 && Plato != 66 && Plato != 67)
            {
                System.out.print(" Recuerde las opciones:\n( A = Sopas de vegetales, B = Ensaladas, C = Jugos)\n");
                Plato = teclado.next().charAt(0);
            }
            System.out.print("Ingrese la cantidad:");
            cantidad = teclado.nextInt();
            
            int ValorP = (int)Plato;
            
            if (Plato == 65)
            {
                int sopas = 10000 * cantidad;
                    Precio  = sopas;
                    PrecioIVA = Precio + (Precio * 0.19);
                    double Des = PrecioIVA * 0.20;
                    Descuento = PrecioIVA - Des;
                
                    int iPrecio = (int)Precio;
                    int iPrecioIVA = (int)PrecioIVA;
                    int iDes = (int)Des;
                    int iDescuento = (int)Descuento;
                    
                    System.out.print(" Precio a pagar: " + iPrecio + "\n");
                    System.out.print(" Precio mas IVA (19%): " + iPrecioIVA + "\n");
                    System.out.print(" Descuento (20%): " + iDes + "\n");
                    System.out.print(" Precio Neto a pagar: " + iDescuento + "\n");
                   
               
            }
            
            if (Plato == 66)
            {
                int ensaladas = 25000 * cantidad;
                    Precio  = ensaladas;
                    PrecioIVA = Precio + (Precio * 0.19); 
                    double Des = PrecioIVA * 0.20;
                    Descuento = PrecioIVA - Des;
                    
                    int iPrecio = (int)Precio;
                    int iPrecioIVA = (int)PrecioIVA;
                    int iDes = (int)Des;
                    int iDescuento = (int)Descuento;
                    
                    System.out.print(" Precio a pagar: " + Precio + "\n");
                    System.out.print(" Precio mas IVA (19%): " + PrecioIVA + "\n");
                    System.out.print(" Descuento (20%): " + iDes + "\n");
                    System.out.print(" Precio Neto a pagar: " + Descuento + "\n");
                   
               
            }
            
            if (Plato == 67)
            {
                int jugos = 5000 * cantidad;
                    Precio  = jugos;
                    PrecioIVA = Precio + (Precio * 0.19); 
                    double Des = PrecioIVA * 0.20;
                    Descuento = PrecioIVA - Des;
                    
                    int iPrecio = (int)Precio;
                    int iPrecioIVA = (int)PrecioIVA;
                    int iDes = (int)Des;
                    int iDescuento = (int)Descuento;
                    
                    System.out.print(" Precio a pagar: " + Precio + "\n");
                    System.out.print(" Precio mas IVA (19%): " + PrecioIVA + "\n");
                    System.out.print(" Descuento (20%): " + iDes + "\n");
                    System.out.print(" Precio Neto a pagar: " + Descuento + "\n");
                   
               
            }
            
            
        }
        
        if (TipoComida == 2)
        {
            System.out.print("Digite el tipo de plato:\n( A = Bandeja carne, B = Bandeja pollo)\n");
            
            Plato = teclado.next().charAt(0);
            while (Plato != 65 && Plato != 66)
            {
                System.out.print(" Recuerde las opciones:\n( A = Bandeja carne, B = Bandeja pollo)\n");
                Plato = teclado.next().charAt(0);
            }
            System.out.print("Ingrese la cantidad:");
            cantidad = teclado.nextInt();
            
            int ValorP = (int)Plato;
            
            if (Plato == 65)
            {
                int carne = 30000 * cantidad;
                    Precio  = carne;
                    PrecioIVA = Precio + (Precio * 0.19);
                    double Des = PrecioIVA * 0.10;
                    Descuento = PrecioIVA - Des;
                
                    int iPrecio = (int)Precio;
                    int iPrecioIVA = (int)PrecioIVA;
                    int iDes = (int)Des;
                    int iDescuento = (int)Descuento;
                    
                    System.out.print(" Precio a pagar: " + iPrecio + "\n");
                    System.out.print(" Precio mas IVA (19%): " + iPrecioIVA + "\n");
                    System.out.print(" Descuento (10%): " + iDes + "\n");
                    System.out.print(" Precio Neto a pagar: " + iDescuento + "\n");
                   
               
            }
            
            if (Plato == 66)
            {
                int pollo = 28000 * cantidad;
                    Precio  = pollo;
                    PrecioIVA = Precio + (Precio * 0.19);
                    double Des = PrecioIVA * 0.10;
                    Descuento = PrecioIVA - Des;
                
                    int iPrecio = (int)Precio;
                    int iPrecioIVA = (int)PrecioIVA;
                    int iDes = (int)Des;
                    int iDescuento = (int)Descuento;
                    
                    System.out.print(" Precio a pagar: " + iPrecio + "\n");
                    System.out.print(" Precio mas IVA (19%): " + iPrecioIVA + "\n");
                    System.out.print(" Descuento (10%): " + iDes + "\n");
                    System.out.print(" Precio Neto a pagar: " + iDescuento + "\n");
                   
               
            }
            
        }
        
        if(TipoComida == 3)
        {
            System.out.print("Digite el tipo de plato:\n( A = Perro caliente, B = Hamburguesa)\n");
            
            Plato = teclado.next().charAt(0);
            while (Plato != 65 && Plato != 66)
            {
                System.out.print(" Recuerde las opciones:\n( A = Perro caliente, B = Hamburguesa)\n");
                Plato = teclado.next().charAt(0);
            }
            System.out.print("Ingrese la cantidad:");
            cantidad = teclado.nextInt();
            
            int ValorP = (int)Plato;
            
            if (Plato == 65)
            {
                int hotdog = 5000 * cantidad;
                    Precio  = hotdog;
                    PrecioIVA = Precio + (Precio * 0.19);
         
                    int iPrecio = (int)Precio;
                    int iPrecioIVA = (int)PrecioIVA;
                    
                    System.out.print(" Precio a pagar: " + iPrecio + "\n");
                    System.out.print(" Precio mas IVA (19%): " + iPrecioIVA + "\n");
                       
            }
            
            if (Plato == 66)
            {
                int hamburguesa = 7000 * cantidad;
                    Precio  = hamburguesa;
                    PrecioIVA = Precio + (Precio * 0.19);
                                  
                    int iPrecio = (int)Precio;
                    int iPrecioIVA = (int)PrecioIVA;
                                       
                    System.out.print(" Precio a pagar: " + iPrecio + "\n");
                    System.out.print(" Precio mas IVA (19%): " + iPrecioIVA + "\n");
                            
            }
            
            
        }

        
        
    }
} 