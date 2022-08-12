public class main{
//funcion = Se puede llamar normal
//Método  = Necesita ser llamado por un objeto
public static void main(String[] args){
    sumar(45,50);}                      //argumentos, cuando le damos un valor a ese parametro  
static int sumar(int a, int b){             //Parametros, cuando declaramos la variable
    return a+b;}
static int restar(int a, int b){             //Parametros, cuando declaramos la variable
        return a-b;}

public class main{
    public static void main(String[] args){
        saludar();                                      //utilizo la funcion         
        main elObjeto=new main();elObjeto.saludar();    //Utilizo el método
        }
    static void saludar(){                              //funcion
        System.println("Hola Mundo");}
    public void saludar(){                              //Metodo
        System.println("Hola Mundo");}
    }

static int sumar(int... numeros){
    int suma=0;
    for(int num:numeros){ //con parametros indefinidos le tiro los 3 puntos suspensivos
        suma+=num;
        return suma;
    }
}

}//cierre de clase

