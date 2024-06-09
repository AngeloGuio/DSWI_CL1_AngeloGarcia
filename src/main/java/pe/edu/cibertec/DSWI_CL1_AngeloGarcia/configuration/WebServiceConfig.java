package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "obreros")
    public DefaultWsdl11Definition obreroWsdl11Definition(XsdSchema obreroSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ObrerosPort");
        wsdl11Definition.setLocationUri("/ws/obreros");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(obreroSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema obreroSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/obreros.xsd"));
    }
    @Bean(name = "practicas")
    public DefaultWsdl11Definition practicaWsdl11Definition(XsdSchema practicaSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PracticasPort");
        wsdl11Definition.setLocationUri("/ws/practicas");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(practicaSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema practicaSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/practicas.xsd"));
    }

    @Bean(name = "times")
    public DefaultWsdl11Definition timeWsdl11Definition(XsdSchema timeSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("TimesPort");
        wsdl11Definition.setLocationUri("/ws/times");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(timeSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema timeSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/time.xsd"));
    }
    @Bean(name = "calculations")
    public DefaultWsdl11Definition calculationsWsdl11Definition(XsdSchema calculationsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CalculationPort");
        wsdl11Definition.setLocationUri("/ws/calculations");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(calculationsSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema calculationsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/calculations.xsd"));
    }

    @Bean(name = "medicos")
    public DefaultWsdl11Definition medicoWsdl11Definition(XsdSchema medicoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MedicosPort");
        wsdl11Definition.setLocationUri("/ws/medicos");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(medicoSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema medicoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/medico.xsd"));
    }

}
