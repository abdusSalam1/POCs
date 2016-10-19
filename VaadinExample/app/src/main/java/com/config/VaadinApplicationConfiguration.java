package com.config;

import com.ui.AppUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;
import org.springframework.context.annotation.Import;

import javax.servlet.annotation.WebServlet;

/**
 * Created by Abdus Salam on 9/12/2016.
 */

@WebServlet(value = "/*")
@VaadinServletConfiguration(productionMode = false, ui = AppUI.class)
@Import(AppConfiguration.class)
public class VaadinApplicationConfiguration extends VaadinServlet {

}
