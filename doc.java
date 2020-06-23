 
/**
 * Tiene dos metodos: para calcular el perimetro de una ciudad y otro para devolver contenido de un archivo 
 * despues de haber insertado lineas en un numero de linea determinado
 * 
 * @author (Mykola Oliinyk) 
 * @version (1.2)
 */
public interface doc
{
   
   // Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
   /**
    * Devuelve el contenido del archivo tras insertar la linea line en la 
    * linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
    * 
    * @param    x   numero de linea en la que se va a insertar line
    *           line    la cadena que contiene la iformacion que se insertará en la linea x
    *           file    el archivo en el que se insertaraá line
    */
   public abstract String escribirLinea(int x, String line, String file);
   
   /**
    * Devuelve el perimetro de una ciudad en kilometros cuadrados
    * 
    * @param    ancho   lo que mide la ciudad a lo ancho
    *           largo    lo que mide la ciudad a lo largo
    *           ciudad    nombre de la ciudad que se vaya a calcular el perimetro
    */
   public abstract int devolverPerimetro(int ancho, int largo, String ciudad);
   
   
}