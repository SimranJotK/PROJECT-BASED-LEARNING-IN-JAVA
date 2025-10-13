package partc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import partc.config.AppConfig;
import partc.service.BankService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankService service = context.getBean(BankService.class);

        try {
            service.transferMoney(1, 2, 500);
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        context.close();
    }
}
