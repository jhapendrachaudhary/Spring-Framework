package aopconcept.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(* aopconcept.services.PaymentServiceImpl.makePayment())")
    public void printBefore() {
        System.out.println("Amount Started.......");
    }
}
