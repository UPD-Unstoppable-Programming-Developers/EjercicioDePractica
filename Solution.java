public class main{
//funcion = Se puede llamar normal
//MÃ©todo  = Necesita ser llamado por un objeto
public static void main(String[] args){
    sumar(45,50);}                      //argumentos, cuando le damos un valor a ese parametro  
static int sumar(int a, int b){             //Parametros, cuando declaramos la variable
    return a+b;}
static int restar(int a, int b){             //Parametros, cuando declaramos la variable
        return a-b;}

public class main{
    public static void main(String[] args){
        saludar();                                      //utilizo la funcion         
        main elObjeto=new main();elObjeto.saludar();    //Utilizo el mÃ©todo
        }
    static void saludar(){                              //funcion
        System.println("Hola Mundo, ¿como estan?..");}
    public void saludar(){                              //Metodo
        System.println("Hola Mundo, ¿Como van?");}
    }

static int sumar(int... numeros){
    int suma=0;
    for(int num:numeros){ //con parametros indefinidos le tiro los 3 puntos suspensivos
        suma+=num;
        return suma;
    }
}

}//cierre de clase
//Hola y adios!!

