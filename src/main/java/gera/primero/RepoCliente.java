/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.primero;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author otros
 */

public interface RepoCliente extends MongoRepository<Cliente, Integer>{

    List<Cliente> findByDireccionCalle(String calle);
    List<Cliente>  findByNombre(String nombresin);
    List<Cliente>  findByMail(String correito);
    List<Cliente>  findByDireccionCp(Integer codpostal);
    List<Cliente>  findByDireccionMunicipio(String municipal);
}
