import java.util.Scanner;

public class Cocacola {
    public static void main(String[] args) {
        String nombre;
        int clave= 0, antiguedad= 0;
        Scanner im= new Scanner(System.in);
        System.out.println("Cual es el nombre del trabajador?");
        nombre=im.nextLine();
        System.out.println("Cuantos años de servicio tiene el trabajador?");
        antiguedad=im.nextInt();
        System.out.println("Cual es la clave de su departamento?");
        clave=im.nextInt();
    if (clave==1) {
        if (antiguedad==1) {
            System.out.println(nombre+" Derecho a 6 dias vacaciones "+" clave de departamento:" + clave);
            }
    
            else if (antiguedad>=2 && antiguedad<=6) {
                System.out.println(nombre+" Derecho a 14 dias vacaciones "+" clave de departamento:" + clave);
                }
                    if (antiguedad==7) {
                        System.out.println(nombre+" Derecho a 20 dias de vacaciones "+" clave de departamento:" + clave);
                    }
                    else if  (antiguedad>7){
                        System.out.println("No tiene derecho a vacaciones :C");

                    }
                            
                        }
    if (clave==2) {
        if (antiguedad==1) {
            System.out.println(nombre+" Derecho a 7 dias vacaciones "+" clave de departamento:" + clave);
            }
    
            else if (antiguedad>=2 && antiguedad<=6) {
                System.out.println(nombre+" Derecho a 15 dias vacaciones "+" clave de departamento:" + clave);
                }
                    if (antiguedad==7) {
                        System.out.println(nombre+" Derecho a 22 dias de vacaciones "+" clave de departamento:" + clave);
                    }
                    else if  (antiguedad>7){
                        System.out.println("No tiene derecho a vacaciones :C");

                    }
    }
    if (clave==3) {
        if (antiguedad==1) {
            System.out.println(nombre+" Derecho a 10 dias vacaciones "+" clave de departamento:" + clave);
            }
    
            else if (antiguedad>=2 && antiguedad<=6) {
                System.out.println(nombre+" Derecho a 20 dias vacaciones "+" clave de departamento:" + clave);
                }
                    if (antiguedad==7) {
                        System.out.println(nombre+" Derecho a 30 dias de vacaciones "+" clave de departamento:" + clave);
                    }
                    else if  (antiguedad>7){
                        System.out.println("No tiene derecho a vacaciones :C");

                    }
        
    }
        }

    }

