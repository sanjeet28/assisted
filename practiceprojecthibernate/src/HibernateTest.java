import org.hibernate.Session;

import com.domain.samples.Annotation;
import com.domain.samples.Employee;
import com.samples.utils.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

//		Employee e1 = new Employee(); 
//		e1.setId(0);
//		e1.setName("sanjeet");

		Annotation a1 = new Annotation();
		a1.setId(0);
		a1.setName("fgh");
		session.save(a1);

		session.getTransaction().commit();

		session.close();

	}



	}


