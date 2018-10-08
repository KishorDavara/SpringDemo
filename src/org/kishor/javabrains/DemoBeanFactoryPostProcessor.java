package org.kishor.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("restaurant");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		propertyValues.add("welcomeNote", "this is modified welcome note by BeanFactoryPostProcessor");
	}

}
