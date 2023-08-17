/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipc1practica1;
import java.util.Scanner;
/**
 *
 * @author romer
 */
public class IPC1Practica1 {

    public static void main(String[] args) {
        /* DECLARACION DE TODAS LA VARIABLES*/
        Scanner entrada1 = new Scanner(System.in);
        Scanner entradaCliente = new Scanner(System.in);
        Scanner ClienteNombre = new Scanner (System.in);
        Scanner ClienteApellido = new Scanner (System.in);
        Scanner ClienteNIT = new Scanner (System.in);
        Scanner AdminUSU = new Scanner (System.in);
        Scanner AdminCON = new Scanner (System.in);
        Scanner MenuAdmin = new Scanner (System.in);
        Scanner MarcaAG = new Scanner(System.in);
        Scanner ModeloAG = new Scanner(System.in);
        Scanner LineaAG = new Scanner(System.in);
        Scanner PlacaAG = new Scanner(System.in);
        Scanner CostoAG = new Scanner(System.in);
        Scanner NumDM = new Scanner (System.in);
        Scanner Desc = new Scanner(System.in);
        int compa1, MenuA, NumDiasM, DescuentoA;/* Primera Comparacion, Menu del Admin*/
        String ClienteN,ClienteA, ClienteNIN, ClienteNI,compaCliente, AdminU, AdminC, MarcaA, LineaA, ModeloA, PlacaA, CostoA;/*Nombre del Cliente, Apellido del Cliente, NIT del Cliente, Compracacio Cliente 
        Usuario del Admin, Contraña del Admin, Marca del Auto, Linea del Auto, Modelo del Auto, Placas del Auto, Costo del alquier del Auto*/
        String ClientNI = "12345";
        boolean LoginADMIN = false; 
        boolean Admin = true;
        boolean Menu = false;
        while (Menu == false){
        System.out.println("-----------------------------------------------");
        System.out.println("    PRESTAMO DE AUTOS 'LAS RUEDAS'");
        System.out.println("       Bienvenido a Las Ruedas\n ¿quien nos visita el dia de hoy?\n ");
        System.out.println("1) Cliente \n2) Administrador\n3) Salida");
        compa1 = entrada1.nextInt();
        switch (compa1){
            case 1 -> { 
                System.out.println("-----------------------------------------------");
                System.out.println("Bienvenido, inicia sesion o crea un nuevo usuario para\nque te enteres de todo los descuentos y promociones que tenemos");
                System.out.println("1)Crear cuenta\n2)Iniciar Sesion");
                compaCliente = entradaCliente.nextLine();
                if(compaCliente.equals("1")){
                        System.out.println("-----------------------------------------------");
                        System.out.println("Bienvenido cliente nuevo, porfavor brindenos\nsus datos para poder crear un nuevo usuario");
                        System.out.println("Nombres: ");
                        ClienteN = ClienteNombre.nextLine();
                        System.out.println("Apellidos: ");
                        ClienteA = ClienteApellido.nextLine();
                        System.out.println("NIT: ");
                        ClienteNIN = ClienteNIT.nextLine();
                        System.out.println("-----------------------------------------------");
                        System.out.println("Bienvenido " +ClienteN+ "" +ClienteA+ " para poder acceder como cliente\ndigite solamente su NIT "+ClienteNI);
                    }
                    else{
                        System.out.println("-----------------------------------------------");
                        System.out.println("Bienvenido de nuevo\nPorfavor digite si Usuario(NIT):");
                        ClienteNI = ClienteNIT.nextLine();
                        if () ){
                            System.out.println("Bienvenido"+ClienteN);
                        } else {
                            
                        }
                    }              
                }  
            case 2 -> {
                while(LoginADMIN == false){
                    System.out.println("Bienvenido Administrador, digita tus credenciales: ");
                    System.out.println("Usurario: ");
                    AdminU = AdminUSU.nextLine();
                    System.out.println("Contraseña");
                    AdminC = AdminCON.nextLine();
                     if("202201690".equals(AdminU) && "202201690".equals(AdminC)){
                         LoginADMIN = true;
                         while (Admin == true){
                            System.out.println("-----------------------------------------------");
                            System.out.println("Bienvenido Sebastian ¿que accion deseas realidad hoy?\n1)Agregar Vehiculo\n2)Agregar Descuento\n3)Realizar Reportes\n4)Mostrar Usuarios\n5)Regresar al menu.  ");
                            MenuA = MenuAdmin.nextInt();
                            switch(MenuA){
                                case 1 -> {
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Diguita los siguientes datos para el Vehiculo: ");
                                    System.out.println("La Marca: ");
                                    MarcaA = MarcaAG.nextLine();
                                    System.out.println("La Linea: ");
                                    LineaA = LineaAG.nextLine();
                                    System.out.println("El Modelo: ");
                                    ModeloA = ModeloAG.nextLine();
                                    System.out.println("La Placa: ");
                                    PlacaA = PlacaAG.nextLine();
                                    System.out.println("El costo de alquiler por dia: ");
                                    CostoA = CostoAG.nextLine();
                                    System.out.println("Agregado exitosamente");
                                }
                                case 2 ->{                                    
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Digite los dias minimos de alquiler:  ");
                                    NumDiasM = NumDM.nextInt(); 
                                    System.out.println("Digite el descuento que aplicara: ");
                                    DescuentoA = Desc.nextInt();
                                   }
                                case 3 ->{
                                }
                                case 4 -> { System.out.println("Clientes : ");
                                    System.out.println("NIT: "+ClienteNI+" Nombre: "+ClienteN+" Apellido: "+ClienteA);}
                                default ->{
                                }
                            }                            
                    }Admin = false;
                    }else {
                        System.out.println("Credenciales de Administrador incorrecto");
                    }
                }
                }
            default -> { 
            }
            }
        System.out.println("HOLA");
        }
        Menu = true;
 }          
}
