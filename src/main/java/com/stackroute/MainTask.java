package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class MainTask {
    @Deprecated
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

       /* Movie movie= (Movie) beanFactory.getBean("movie");
        System.out.println("Actor1 information using bean factory:\n "+movie);
        Movie movie1= (Movie) beanFactory.getBean("movie1");
        System.out.println("Actor2 information using bean factory:\n "+movie1);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie mv=(Movie) applicationContext.getBean("movie");
        System.out.println("Actor information using application context:\n "+mv);*/


        //testing bean scope
        /*ApplicationContext application=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie) application.getBean("movie1");
        Movie movie4=(Movie) application.getBean("movie1");

        System.out.println(movie2==movie4);

        Movie movie = (Movie) application.getBean("movieA");
        System.out.println("changing the id of beans:"+ movie);*/

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        /*BeanLifecycleDemoBean beanLifecycleDemoBean=(BeanLifecycleDemoBean) context.getBean("beanLifeCycleDemoBean");*/
       /* Movie movie=(Movie) context.getBean("movie1");
        System.out.println("changing the id of beans" +movie);
*/



    }
}
