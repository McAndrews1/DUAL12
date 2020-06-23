 
/**
 * Devuelve el contenido del archivo tras insertar la linea line en la 
 * linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
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
   
   
}