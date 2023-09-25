package kirill.zhdanov.redis;

import org.springframework.data.keyvalue.repository.KeyValueRepository;


public interface ModelRepository extends KeyValueRepository<Model,Integer> {

}
