package myapp.zcvv.demo.ms.repository;

import myapp.zcvv.demo.ms.document.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
    @Query("{user_folio:'?0'}")
    public User findNameByUser(String folio);
}
