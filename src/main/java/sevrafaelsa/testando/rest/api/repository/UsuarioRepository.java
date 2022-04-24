package sevrafaelsa.testando.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import sevrafaelsa.testando.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
