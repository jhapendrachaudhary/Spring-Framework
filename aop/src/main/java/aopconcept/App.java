package aopconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aopconcept.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("aopconcept/config.xml");
       
       PaymentService paymentService = (PaymentService) context.getBean("payment", PaymentService.class);
       
       paymentService.makePayment();
       
    }
}
