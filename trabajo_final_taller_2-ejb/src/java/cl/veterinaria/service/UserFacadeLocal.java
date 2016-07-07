package cl.veterinaria.service;

import cl.veterinaria.entity.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ignacio
 */
@Local
public interface UserFacadeLocal {

	void create(User user);

	void edit(User user);

	void remove(User user);

	User find(Object id);

	List<User> findAll();

	List<User> findRange(int[] range);

	int count();

	public User findByUserAndPass(String username, String password);

}
