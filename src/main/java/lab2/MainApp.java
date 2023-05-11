package lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MainApp {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_lab1.xml");
        Vehicul v =(Vehicul)context.getBean("autoturism");
        System.out.print(v +"\n\n");

        Vehicul v2 =(Vehicul)context.getBean("auto_contrs");
        System.out.println(v2+"\n");

        Vehicul v3 = (Vehicul)context.getBean("motocicleta");
        System.out.println(v3);

        //context.registerShutdownHook();
        //context.close();
    }
}
