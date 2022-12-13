package tests;

import domain.Cliente;
import execptions.ClienteException;

public class ClienteTeste {

    public static void main(String args[])
    {

        try {
            Cliente c1 = new Cliente("Daniel","190.737.607-04",20,"Sahy","23860000");
            System.out.println(c1);
        }
        catch (ClienteException e){
            System.out.println("[ERRO] " + e.getMessage());
        }

        try {
            Cliente c2 = new Cliente("Daniel","190.737.607-04",20,"","");
            System.out.println(c2);
        }
        catch (ClienteException e){
            System.out.println("[ERRO] " + e.getMessage());
        }

        try {
            Cliente c3 = new Cliente("","",20,"Sahy","23860000");
            System.out.println(c3);
        }
        catch (ClienteException e){
            System.out.println("[ERRO] " + e.getMessage());
        }




    }

}
