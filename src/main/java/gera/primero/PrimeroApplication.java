package gera.primero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class PrimeroApplication implements CommandLineRunner{
//@Autowired RepoUsuario repoU;
@Autowired RepoClienteexamen repoC;
    
	public static void main(String[] args) {
		SpringApplication.run(PrimeroApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
   //  Usuario u= new Usuario(1, "Humberto", "desarrollador jaja");
        //repoU.save(u);
        //repoU.deleteById(1);
       // System.out.println("Usuario guardado");
       /*    
     Direccion d=new Direccion("jajalpa", 97990, "Ecaterror");
  Cliente c= new Cliente(2, "JUCA", "juca@hotmail.com",d);
        repoC.save(c);
        System.out.println("Cliente guardado");
       
        for(Cliente cl:repoC.findAll())   {
            System.out.println(cl.getDireccion().getCalle()+" Nombre "+cl.getNombre());
        }
        
        //System.out.println(repoU.findById(1).get().getNombre());  
        */
       
      //  Tarjetaexamen d=new Tarjetaexamen("bancomer", 234567, (float) 25000.0);
    // Clienteexamen c= new Clienteexamen(8, "Carlos", (float) 21548,d);
     //   repoC.save(c);
      //  System.out.println("Cliente guardado");
       
    //    for(Clienteexamen cl:repoC.findAll())   {
            
         //   System.out.println(cl.getTarjetaexamen().getNombre()+" Nombre "+cl.getNombre());
      //  }
    }
}
