package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //应用上下文配置
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //DispatcherServlet 配置
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //DispatcherServlet 映射到 /
        return new String[] {"/"};
    }
}
