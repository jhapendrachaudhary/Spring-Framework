package com.springboot.web;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepo;
import com.springboot.web.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootjpaexampleApplication.class, args);
	
	UserRepo userRepo=  context.getBean(UserRepo.class);
	
	//insert
//	User user = new User();
//	user.setName("Hello world");
//	user.setCity("Universe");
//	user.setStatus("Long time ago...........");
//	
//	User user1 = userRepo.save(user);
//	System.out.println(user1);
//	custom query..
//	List<User> users = userRepo.findByName("Hello World");
//	users.forEach(user->{System.out.println(user);});
	
	//JPQL
	List<User> users2 = userRepo.getAllName();
	users2.forEach(u->{System.out.println(u);System.out.println("_____________________");});
	
	List<User> users3 = userRepo.getAllByNameAndCity("Hello world", "Universe");
	users3.forEach(a->{System.out.println(a);System.out.println("__________________");});
	
	List<User> users4 = userRepo.getAllDataBySQL();
	users4.forEach(b->{System.out.println(b);});
	
	//update
//	User user = new User();
//	Optional<User> optional = userRepo.findById(1);
//	User user = optional.get();
//	user.setName("HI, world!");
//	
//	User user1 = userRepo.save(user);
//	System.out.println(user1);
	
	//read
//	Iterable<User> itr = userRepo.findAll();
//	itr.forEach(new Consumer<User>() {
//
//		@Override
//		public void accept(User t) {
//			
//			System.out.println(t);
//		}
//	});
	
//	itr.forEach(a->{System.out.println(a);});
//	
	

	//delete
//	userRepo.deleteById(1);
//	System.out.println("deleted");
	
	
	//custom jpa query
	
//	Distinct
//
//	findDistinctByLastnameAndFirstname
//
//	select distinct …​ where x.lastname = ?1 and x.firstname = ?2
//
//	And
//
//	findByLastnameAndFirstname
//
//	… where x.lastname = ?1 and x.firstname = ?2
//
//	Or
//
//	findByLastnameOrFirstname
//
//	… where x.lastname = ?1 or x.firstname = ?2
//
//	Is, Equals
//
//	findByFirstname,findByFirstnameIs,findByFirstnameEquals
//
//	… where x.firstname = ?1 (or … where x.firstname IS NULL if the argument is null)
//
//	Between
//
//	findByStartDateBetween
//
//	… where x.startDate between ?1 and ?2
//
//	LessThan
//
//	findByAgeLessThan
//
//	… where x.age < ?1
//
//	LessThanEqual
//
//	findByAgeLessThanEqual
//
//	… where x.age <= ?1
//
//	GreaterThan
//
//	findByAgeGreaterThan
//
//	… where x.age > ?1
//
//	GreaterThanEqual
//
//	findByAgeGreaterThanEqual
//
//	… where x.age >= ?1
//
//	After
//
//	findByStartDateAfter
//
//	… where x.startDate > ?1
//
//	Before
//
//	findByStartDateBefore
//
//	… where x.startDate < ?1
//
//	IsNull, Null
//
//	findByAge(Is)Null
//
//	… where x.age is null
//
//	IsNotNull, NotNull
//
//	findByAge(Is)NotNull
//
//	… where x.age is not null
//
//	Like
//
//	findByFirstnameLike
//
//	… where x.firstname like ?1
//
//	NotLike
//
//	findByFirstnameNotLike
//
//	… where x.firstname not like ?1
//
//	StartingWith
//
//	findByFirstnameStartingWith
//
//	… where x.firstname like ?1 (parameter bound with appended %)
//
//	EndingWith
//
//	findByFirstnameEndingWith
//
//	… where x.firstname like ?1 (parameter bound with prepended %)
//
//	Containing
//
//	findByFirstnameContaining
//
//	… where x.firstname like ?1 (parameter bound wrapped in %)
//
//	OrderBy
//
//	findByAgeOrderByLastnameDesc
//
//	… where x.age = ?1 order by x.lastname desc
//
//	Not
//
//	findByLastnameNot
//
//	… where x.lastname <> ?1
//
//	In
//
//	findByAgeIn(Collection<Age> ages)
//
//	… where x.age in ?1
//
//	NotIn
//
//	findByAgeNotIn(Collection<Age> ages)
//
//	… where x.age not in ?1
//
//	True
//
//	findByActiveTrue()
//
//	… where x.active = true
//
//	False
//
//	findByActiveFalse()
//
//	… where x.active = false
//
//	IgnoreCase
//
//	findByFirstnameIgnoreCase
//
//	… where UPPER(x.firstname) = UPPER(?1)
	
	}
}
