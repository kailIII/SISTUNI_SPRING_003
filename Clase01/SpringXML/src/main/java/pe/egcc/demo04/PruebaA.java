package pe.egcc.demo04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaA {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    // Levantando el contexto
    String fileXML = "/pe/egcc/demo04/demo04.xml"; 
    BeanFactory bf;
    bf= new ClassPathXmlApplicationContext(fileXML);
    
    // Acceso al objeto
    IMate bean;
    bean = bf.getBean(IMate.class);
    
    // Prueba
    System.out.println("7 + 3 = " + bean.sumar(7, 3));
    
    
  }
}
