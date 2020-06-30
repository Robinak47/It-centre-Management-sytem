package interfaces;

import java.lang.*;
import entity.*;

public interface IUserRepo
{
	User getUser(String userId, String password);
	void insertUser(User u);
	void updateStatus(User u);
	void updatePassword(User u);
	
	void deleteUser(String userId);
}