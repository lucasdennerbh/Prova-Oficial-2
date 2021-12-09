package lucasdso.dao;

import org.springframework.stereotype.Repository;

import lucasdso.domain.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao {

}

